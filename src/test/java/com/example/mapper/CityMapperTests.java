package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;
import com.example.domain.Emp;
import com.example.exception.NotFoundRuntimeException;
import com.example.util.Pagination;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityMapperTests {

p;
 CityMapper mapper;
 
 @Test
 public void test01_confirmMapper(){
	 System.out.println("mapper="+mapper);
 }
 
 @Test
 public void test01_selectAll(){
	 List <City> list=mapper.selectAll();
	 
	 for(City c:list)
		 System.out.println(c);
 }
 
 
@Test
public void test01_selectAllWithCountry(){
	List<City> list=mapper.selectAllWithCountry();
	
	for(City city:list){
		System.out.println(city);
	}
}
 

@Test
public void test02_selectPage(){
	Pagination paging = new Pagination();
	paging.setTotalItem(mapper.selectTotalCount());
	paging.setPageNo(1000);
	List<City> list=mapper.selectPage(paging);
	
	for(City c:list){
		System.out.println(c);
	}
}

@Test
public void test02_selectPageWithCountry(){
	Pagination paging = new Pagination();
	paging.setTotalItem(mapper.selectTotalCount());
	paging.setPageNo(1000);
	List<City> list=mapper.selectPageWithCountry(paging);
	
	for(City c:list){
		System.out.println(c);
	}
}


@Test
public void test03_selectById(){
	City city =mapper.selectById(100000);
	
	if(city==null){
		throw new NotFoundRuntimeException("City정보가 없습니다.");
	}
	System.out.println(city);
	}

@Test
public void test03_selectByIdWithCountry(){
	City city =mapper.selectByIdWithCountry(1);
	
	if(city==null){
		throw new NotFoundRuntimeException("City정보가 없습니다.");
	}
	System.out.println(city);
	}
}
 

