package com.vikas.method_parser.version_control_manager.details.fetcher.util;

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
     * To make a HTTP GET request and get ClientResponse as output.
     * @param uri : 
     * 		     URI of the GET service.
     * @return response of the REST call.
     */
    public static ClientResponse makeGETCall(String uri) {
    	if(uri == null || uri.isEmpty()) {
    		System.out.println("URI cannot be null or empty for a REST call.");
    	}
		Client client = Client.create();
		WebResource webResource = client
		   .resource(uri);
		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);
    	return response;
    }
    
    /**
     * To make a HTTP POST request and get ClientResponse as output.
     * @param uri : 
     * 		     URI of the POST service.
     * @param formParams : 
     * 			Input to be uploaded.
     * @return response of the REST call.
     */
    public static ClientResponse makePOSTCall(String uri, MultivaluedMap<String, String> formParams) {
    	if(uri == null || uri.isEmpty() || formParams == null || formParams.isEmpty()) {
    		System.out.println("URI or parameters cannot be null or empty for a POST REST call.");
    	}
		Client client = Client.create();
		WebResource webResource = client
		   .resource(uri);
		ClientResponse response = webResource.accept("application/json")
                   .post(ClientResponse.class, formParams);
    	return response;
    }
    
}
