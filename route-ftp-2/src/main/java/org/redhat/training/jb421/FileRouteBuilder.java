package org.redhat.training.jb421;
import org.apache.camel.builder.RouteBuilder;

public class FileRouteBuilder extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		try {
			from("file:orders/incoming?include=order.*xml")
		    	.to("file:orders/outgoing?fileExist=Fail") ;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
