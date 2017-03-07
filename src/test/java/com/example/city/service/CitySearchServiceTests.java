package com.example.city.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CitySearchServiceTests {
	@Autowired
	CitySearchService service;

	@Test
	public void test00_confirmService(){
		System.out.println("service"+service);
	}
	
	@Test
	public void test01_getListAll(){
		List<City> list=service.getListAll();
		for(City c:list)
			System.out.println(c);
	}
	
	@Test
	public void test01_getListAll_withCountry(){
		List<City> list=service.getListAll(true);
		for(City c:list)
			System.out.println(c);
	}
	

	@Test
	public void test02_getCityById(){
		City c=service.getCityById(1);
			System.out.println(c);
	}
	
	@Test
	public void test02_getCityById_withCountry(){
		City c=service.getCityById(1,true);
		System.out.println(c);
	}
}
