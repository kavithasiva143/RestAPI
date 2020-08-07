package com.Data;

import com.Pojo.PojoClass;

public class SetValues_Pojo_Delete {
	public PojoClass deletevalues() {
		PojoClass p=new PojoClass();
		p.setId("466");
		return p;
		
	}
public PojoClass deletevalues(String id) {
	PojoClass p= new PojoClass();
	p.setId(id);
	return p;
	
}

}
