package net.biville.florent;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig() {
    packages("net.biville.florent");
    property(ServletProperties.FILTER_STATIC_CONTENT_REGEX, "/.*\\.html");
  }
}
