package org.example.route;

import org.apache.camel.builder.RouteBuilder;

public class cxfDemoRB extends RouteBuilder {
	    
	
	public void configure() {
	    	from("cxfrs:bean:restServiceEndPoint")
	    	.routeId("helloRestRoute")
	    	.to("bean:test?method=restImpl").end();
	    	
	    }

}

