package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.domain.Country;
import com.example.exception.NotFoundRuntimeException;
import com.example.util.Pagination;

	@SpringBootTest
	@RunWith(SpringRunner.class)
	public class CountryMapperTests {
		@Autowired
		CountryMapper mapper;
		
		
		@Test
		public void test00_confirmMapper(){
			System.out.println("mapper="+mapper);
		}
		
		@Test
		public void test00_selectTotalCount(){
			System.out.println("totalCount="+mapper.selectTotalCount());
		}
		
		@Test
		public void test00_selectAll(){
			List<Country> list =mapper.selectAll();
			
			for(Country c: list)
				System.out.println(c);
		}
		

		@Test
		public void test01_selectAllWithCity(){
			List<Country> list=mapper.selectAllWithCity();
			
			for(Country c:list)
				System.out.println(c);
		}
		
		
		@Test
		public void test01_selectPage(){
			
			Pagination paging=new Pagination();
			paging.setTotalItem(mapper.selectTotalCount());
			paging.setPageNo(20);
			
			List<Country> list =mapper.selectPage(paging);
			for(Country c: list)
				System.out.println(c);
			
		}
		
		@Test
		public void test02_selectPageWithCity(){
			
		}
		
		@Test
		public void test03_selectByCode(){
			Country country=mapper.selectByCode("xxx");
			if(country==null)
				throw new NotFoundRuntimeException("country 가 없습니다.");
			
			System.out.println(country);
		}
		

		@Test
		public void test03_selectByCodeWithCity(){
//			City city =mapper.selectByCodeWithCity("STP");
//			
//			if(city==null){
//				throw new NotFoundRuntimeException("City정보가 없습니다.");
//			}
//			System.out.println(city);
			}
}
