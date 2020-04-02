package com.vikas.method_parser.version_control_manager.details.fetcher;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Used to make Rest Service calls.
 *
 */
public class RESTCallHandler {

    /**
     * To make a HTTP GET request and get String as output.
     * @param uri : 
     * 		     URI of the GET service.
     * @return output of the REST call.
     */
    public static String makeGETCall(String uri) {
    	if(uri == null || uri.isEmpty()) {
    		System.out.println("URI cannot be null or empty for a REST call.");
    	}
    	String output = null;
		Client client = Client.create();
		WebResource webResource = client
		   .resource(uri);
		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}
		output = response.getEntity(String.class);
    	return output;
    }
    
    /**
     * To make a HTTP POST request and get String as output.
     * @param uri : 
     * 		     URI of the POST service.
     * @param formParams : 
     * 			Input to be uploaded.
     * @return output of the REST call.
     */
    public static String makePOSTCall(String uri, MultivaluedMap<String, String> formParams) {
    	if(uri == null || uri.isEmpty()) {
    		System.out.println("URI cannot be null or empty for a REST call.");
    	}
    	String output = null;
		Client client = Client.create();
		WebResource webResource = client
		   .resource(uri);
		ClientResponse response = webResource.accept("application/json")
                   .post(ClientResponse.class, formParams);
		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}
		output = response.getEntity(String.class);
    	return output;
    }
        
}
