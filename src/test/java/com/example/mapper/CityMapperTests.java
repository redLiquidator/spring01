package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;
import com.example.domain.Emp;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityMapperTests {
 @Autowired
 CityMapper mapper;
 
 @Test
 public void test01_confirmMapper(){
	 System.out.println("mapper="+mapper);
 }
 
 @Test
 public void test01_selectAll(){
	 List <City> city=mapper.selectAll();
	 
	 for(City c:city)
		 System.out.println(c);
 }
@Test
public void test01_selectAllWithDept(){
	List<City> list=mapper.selectAllWithCountry();
	
	for(City city:list){
		System.out.println(city);
	}
}
 
}
