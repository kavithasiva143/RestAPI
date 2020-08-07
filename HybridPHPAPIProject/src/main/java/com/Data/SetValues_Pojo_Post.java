package com.Data;

import com.Pojo.PojoClass;

public class SetValues_Pojo_Post {
	
	public PojoClass setvalues() {
		PojoClass p=new PojoClass();
		p.setTitle("roti");
		p.setAuthor("kavi");
		p.setBody("chapathi");
		
		return p;
		
	
	}
	public PojoClass setvalues_post(String Title,String body,String author) {
		PojoClass p=new PojoClass();
		p.setTitle(Title);
		p.setBody(body);
		p.setAuthor(author);
		
		return p;
		
	
	}
	
	}


