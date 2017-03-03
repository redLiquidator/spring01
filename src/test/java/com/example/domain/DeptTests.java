package com.example.domain;

import org.junit.Test;

public class DeptTests {
	@Test
	public void test01_toString(){
		Dept d =new Dept();
		d.setDeptno(10);
		d.setDname("총무부");
		
	}
}
