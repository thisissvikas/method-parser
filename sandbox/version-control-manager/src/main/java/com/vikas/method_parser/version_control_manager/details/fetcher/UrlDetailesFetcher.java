package com.vikas.method_parser.version_control_manager.details.fetcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class UrlDetailesFetcher {

	//Calling client using URLConnection
    public static void getRepo(URL orgUrl) throws IOException {
    	try {
			URLConnection yc = orgUrl.openConnection();
			BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                    yc.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) 
			System.out.println(inputLine);
			in.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
 
    //Calling client using Jersey
    public static String getURL() {
    	String output = null;
    	try {
    		Client client = Client.create();
    		WebResource webResource = client
    		   .resource("https://github.cerner.com/api/v3/orgs/Smart-IDE/repos");
    		ClientResponse response = webResource.accept("application/json")
                       .get(ClientResponse.class);
    		if (response.getStatus() != 200) {
    		   throw new RuntimeException("Failed : HTTP error code : "
    			+ response.getStatus());
    		}
    		output = response.getEntity(String.class);

    	  } catch (Exception e) {
    		e.printStackTrace();
    	  }
    	return output;
    }
    
    public static void main(String args[]) {
    	System.out.println(getURL());
    }
    
}
