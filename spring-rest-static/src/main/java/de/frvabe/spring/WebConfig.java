package de.frvabe.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Configuration to serve static web content.
 * <p>
 * This also is a build in Spring Boot Feature, but it needs to be disabled to provide the
 * possibility to have a custom controller error handler. Thus it is reconfigured here manually.
 * </p>
 *
 * @see <a href="http://stackoverflow.com/a/30193013/367285">StackOverflow</a>
 * @see <a href="https://github.com/spring-projects/spring-boot/issues/3980">Spring Boot #3980</a>
 *      DispatcherServlet#setThrowExceptionIfNoHandlerFound doesn't work for REST application
 */
//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        // add resource handler for Camunda applications
        registry.addResourceHandler("/app/**").addResourceLocations("classpath:/app/");
        // add resource handler for other static content
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/index.html");
        super.addViewControllers(registry);
    }

}
