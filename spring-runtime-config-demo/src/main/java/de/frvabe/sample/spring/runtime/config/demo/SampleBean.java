package de.frvabe.sample.spring.runtime.config.demo;

/**
 * A sample bean that needs some runtime configuration.
 *
 * @author Franz
 */
public class SampleBean {

  private final String httpProxy; // optional
  private final int httpProxyPort; // optional 
  private final int httpConnectionTimeout; // optional 
  private final int httpReceiveTimeout; // optional 

  private final String targetServiceUrl; // required

  /**
   * Full value constructor.
   */
  public SampleBean(final String httpProxy, final int httpProxyPort,
          final int httpConnectionTimeout, final int httpReceiveTimeout,
          final String targetServiceUrl) {
    this.httpProxy = httpProxy;
    this.httpProxyPort = httpProxyPort;
    this.httpConnectionTimeout = httpConnectionTimeout;
    this.httpReceiveTimeout = httpReceiveTimeout;
    this.targetServiceUrl = targetServiceUrl;
  }

  @Override
  public String toString() {
    return "SampleBean{" + "httpProxy=" + httpProxy
            + ", httpProxyPort=" + httpProxyPort
            + ", httpConnectionTimeout=" + httpConnectionTimeout
            + ", httpReceiveTimeout=" + httpReceiveTimeout
            + ", targetServiceUrl=" + targetServiceUrl + '}';
  }

}
