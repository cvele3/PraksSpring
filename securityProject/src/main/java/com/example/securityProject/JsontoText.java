package com.example.securityProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



public class JsontoText {


	public void probna() {
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\JSONFiles\\limeniEntry.json"));
			
			String line;  
			StringBuilder sbuilderObj = new StringBuilder();
			while((line=br.readLine()) !=null){
				sbuilderObj.append(line);
			}
			
		       JsonElement elem = JsonParser.parseString(sbuilderObj.toString());
		       
		       Gson gson = new Gson();
		       JsonObject obj = elem.getAsJsonObject(); 
		       JsonElement messageElement = obj.get("message");
		       JsonElement passwordElement = obj.get("password");
		       JsonElement nameElement = obj.get("name");
		       
		       System.out.println(nameElement.getAsString());

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
