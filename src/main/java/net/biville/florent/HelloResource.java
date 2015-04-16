package net.biville.florent;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/api")
public class HelloResource {


  @Path("/hello")
  @GET
  public Response hello() {
    return Response.ok("<h1>hello</h1>", MediaType.TEXT_HTML_TYPE).build();
  }
}
