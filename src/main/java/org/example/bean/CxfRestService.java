package org.example.bean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Exchange;
@Path("rest")
public class CxfRestService {	
		@GET
		@Path("/restHello")
		@Produces(MediaType.TEXT_PLAIN)
		public String helloRestService(){
			return null;
		}
		
		public String restImpl(Exchange exchange)
		{
			return "hello from rest";
		}
}
