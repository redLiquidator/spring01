package com.example.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class CountryMapperTests {

}

	@SpringBootTest
	@RunWith(SpringRunner.class)
	public class CountryMapperTests {
		@Autowired
		EmpMapper mapper;
		
		@Test
		public void test01_confirmMapper(){
			System.out.println("mapper="+mapper);
		}
}
