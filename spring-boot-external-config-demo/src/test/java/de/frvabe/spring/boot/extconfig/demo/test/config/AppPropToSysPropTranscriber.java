package de.frvabe.spring.boot.extconfig.demo.test.config;

import java.util.Arrays;
import java.util.Properties;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.MutablePropertySources;

/**
 * Copies application properties to system properties.
 * <p>
 * Taken from
 * <a href="https://gist.github.com/michael-simons/51efbe97a422b9aebc80f480307254bd">here</a>.
 * Thanks to <a href="https://twitter.com/springbootbuch">SpringBootBuch</a>.
 */
@TestConfiguration
public class AppPropToSysPropTranscriber {

    final ConfigurableEnvironment environment;

    public AppPropToSysPropTranscriber(ConfigurableEnvironment environment) {
        this.environment = environment;
    }

    @Bean
    @SuppressWarnings("rawtypes")
    public MethodInvokingFactoryBean f() {
        Properties props = new Properties();
        MutablePropertySources propSrcs = environment.getPropertySources();
        StreamSupport.stream(propSrcs.spliterator(), false)
                .filter(ps -> ps instanceof EnumerablePropertySource)
                .map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
                .flatMap(Arrays::<String>stream).forEach(
                        propName -> props.setProperty(propName, environment.getProperty(propName)));

        MethodInvokingFactoryBean f = new MethodInvokingFactoryBean();
        f.setTargetObject(System.getProperties());
        f.setTargetMethod("putAll");
        f.setArguments(new Object[] {props});
        return f;
    }

}
