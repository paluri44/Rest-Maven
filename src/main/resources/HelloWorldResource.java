import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import main.HelloWorld;

@Path("hello")
public class HelloWorldResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() {
		HelloWorld h=new HelloWorld("Hi");
		return Response.ok(h).build();		
		return Response.
		
	}
	

}
