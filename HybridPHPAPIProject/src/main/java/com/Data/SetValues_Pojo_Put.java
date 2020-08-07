package com.Data;

import com.Pojo.PojoClass;

public class SetValues_Pojo_Put {
	public PojoClass putvalues() {
		PojoClass p=new PojoClass();
		
		p.setAuthor("kavi1");
		
		p.setId("937");
		
		return p;
	}

	public PojoClass putvalues(String author,String id) {
	PojoClass p= new PojoClass(); 
		
		p.setAuthor(author);
		p.setId(id);
	return p;
	
	

	
}
	
}	

