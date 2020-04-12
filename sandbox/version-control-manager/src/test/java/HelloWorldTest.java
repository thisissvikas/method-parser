import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import com.vikas.method_parser.version_control_manager.details.fetcher.util.RESTCallHandler;

public class HelloWorldTest extends JerseyTest {

	 @Override
	 public Application configure() {
		 enable(TestProperties.LOG_TRAFFIC);
		 enable(TestProperties.DUMP_ENTITY);
		 return new ResourceConfig(RESTCallHandler.class);
	 }
	
	 @Test
	 public void testMakeGETCall() {
		 Response response = target("/RESTCallHandler").queryParam("uri", "https://api.github.com/users/krvikas1011/repos").request( MediaType.APPLICATION_JSON).get();
		 assertEquals("Http Response should be 200", 200, response.getStatus());
		 assertEquals("Http Content-Type should be json", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
		 assertNotNull("Should return repo object as json", response.getEntity());
		 System.out.println(response.getStatus());
		 System.out.println(response.readEntity(String.class));
	}
}
