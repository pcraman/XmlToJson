package com.xml.converter;

import java.io.IOException;

import org.json.JSONObject;
import org.json.XML;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ToJsonFromString {
	
	public String xmlToJson(String xml) throws IOException {
		
		JSONObject jsonObject = XML.toJSONObject(xml);
		ObjectMapper mapper = new ObjectMapper();
		Object json = mapper.readValue(jsonObject.toString(), Object.class);
		String jsonString = mapper.writeValueAsString(json);
		return jsonString;
	}
	
}
