package com.example.domain;

import java.math.BigDecimal;

import org.junit.Test;
//Bigsal은 값을 무한대로 넣을수 있다. 
public class EmpTests {
	@Test
	public void test01_setSal(){
		Emp e =new Emp();
		BigDecimal sal1=new BigDecimal("100000000000000000000000.0012");
		BigDecimal sal2=new BigDecimal("200000000000000000000000.0012");
		BigDecimal sal=sal1.add(sal2);
		
		e.setSal(sal);
		System.out.println("sal="+e.getSal());
	}
	
	@Test
	public void test01_toString(){
		Emp e= new Emp();
		e.setEmpno(1000);
		e.setEname("홍길동");
		
		System.out.println(e);
	}
}
