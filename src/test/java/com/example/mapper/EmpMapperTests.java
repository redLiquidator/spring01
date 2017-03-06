package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;
import com.example.domain.Dept;
import com.example.domain.Emp;
import com.example.util.Pagination;


	@SpringBootTest
	@RunWith(SpringRunner.class)
	public class EmpMapperTests {
		@Autowired
		EmpMapper mapper;
		
		@Test
		public void test01_confirmMapper(){
			System.out.println("mapper="+mapper);
		}
		
		@Test
		public void test01_selectAll(){
			List <Emp> emps =mapper.selectAll();
			
			for(Emp e:emps)
			System.out.println(e);
		}
		
		@Test
		public void test01_selectAllWithDept(){
			
		List<Emp> list = mapper.selectAllWithEmp();
		
		for(Emp emp:list){
			System.out.println(emp);
		}}
		
		@Test
		public void test02_selectPage(){
			Pagination paging=new Pagination();
			paging.setTotalItem(mapper.selectTotalCount());
			paging.setPageNo(1);
			List<Emp> list=mapper.selectPage(paging);
			for(Emp e:list){
				System.out.println(e);
			}
		}
		
	
		
	}
		
