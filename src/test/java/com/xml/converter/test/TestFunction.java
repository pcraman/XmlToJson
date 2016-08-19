package com.xml.converter.test;
import java.io.IOException;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import com.xml.converter.ToJsonFromString;

public class TestFunction {
	
	@Test
	public void TestForXmlToJson() {
		ToJsonFromString obj = new ToJsonFromString();
		String json = "";
		try {
			json = obj.xmlToJson("<?xml version=\"1.0\"?><catalog><book id=\"bk101\">"
					+ "<author>Gambardella, Matthew</author>"
					+ "<title>XML Developer's Guide</title>"
					+ "<genre>Computer</genre><price>44.95</price>"
					+ "<publish_date>2000-10-01</publish_date>"
					+ "<description>An in-depth look at creating applications with XML.</description>"
					+ "</book></catalog>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONObject catalogDetails = new JSONObject(json);
		JSONObject bookDetails    = (JSONObject) catalogDetails.get("catalog");
		JSONObject authorDetails  = (JSONObject) bookDetails.get("book");

		Assert.assertEquals(authorDetails.get("author"), "Gambardella, Matthew");
		Assert.assertEquals(authorDetails.get("title"), "XML Developer's Guide");
		Assert.assertEquals(authorDetails.get("genre"), "Computer");
		Assert.assertEquals(authorDetails.get("price"), 44.95);
		Assert.assertEquals(authorDetails.get("publish_date"), "2000-10-01");
		
	}
}
