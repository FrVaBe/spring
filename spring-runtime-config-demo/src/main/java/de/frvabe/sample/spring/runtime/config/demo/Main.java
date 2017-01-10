package de.frvabe.sample.spring.runtime.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

/**
 * The main class to start the application.
 *
 * @author Franz van Betteraey
 */
public class Main {

  /**
   * Start the application. This will just configure the Spring Application
   * Context and print the runtime configuration setting.
   *
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(AppConfig.class);
    app.setShowBanner(false);
    ApplicationContext ctx = app.run(args);

    SampleBean sampleBean = ctx.getBean(SampleBean.class);
    System.out.println(sampleBean.toString());
  }
}
