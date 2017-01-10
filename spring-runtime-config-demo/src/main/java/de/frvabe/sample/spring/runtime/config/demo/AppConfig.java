package de.frvabe.sample.spring.runtime.config.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Core Application Configuration.
 *
 * @author Franz
 */
@Configuration
@PropertySource("${myAppProperties:classpath:myApp.properties}")
public class AppConfig {

  @Bean
  public SampleBean sampleBean(@Value("${httpProxy:}") String httpProxy,
          @Value("${httpProxyPort:0}") int httpProxyPort,
          @Value("${httpConnectionTimeout:30000}") int httpConnectionTimeout,
          @Value("${httpReceiveTimeout:60000}") int httpReceiveTimeout,
          @Value("${targetServiceUrl}") String targetServiceUrl) {
    return new SampleBean(httpProxy, httpProxyPort, httpConnectionTimeout,
            httpReceiveTimeout, targetServiceUrl);
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
    pspc.setNullValue(""); // handle empty Strings as null value
    return pspc;
  }

}