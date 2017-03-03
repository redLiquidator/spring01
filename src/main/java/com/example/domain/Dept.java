package com.example.domain;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Dept {

	private int deptno;
	private String dname;
	private String loc;

	private List<Emp> emps;
	
	
	
	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Dept() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		String str=null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			str =mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	
	/**
	 * @return the deptno
	 */
	public int getDeptno() {
		return deptno;
	}

	/**
	 * @param value the deptno to set
	 */
	public Dept setDeptno(final int value) {
		deptno = value;
		return this;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param value the dname to set
	 */
	public Dept setDname(final String value) {
		dname = value;
		return this;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param value the loc to set
	 */
	public Dept setLoc(final String value) {
		loc = value;
		return this;
	}

}
