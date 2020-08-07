package com.Data;



public class payloadsdetails {
	
	public static String postpayload() {
		return "{\r\n" + 
				"         \"title\": \"a3\",\r\n" + 
				"        \"body\": \"b3\",\r\n" + 
				"        \"author\": \"c2\"\r\n" + 
				"    }";	
}
	public static String putpayload() {
		return "{\"id\":85,\r\n" + 
				"\"author\":\"Trisha\"\r\n" + 
				"}";
	}
	public static String deletepayload() {
		return "{\"id\":82}";
	}
}


