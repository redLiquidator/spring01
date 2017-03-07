package com.example.city.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.City;
import com.example.mapper.CityMapper;

@Service
public class CitySearchService {
	static Log log=LogFactory.getLog(CitySearchService.class);
	
	@Autowired
	CityMapper cityMapper;
	
	public List<City> getListAll(){
		log.info("getListAll()");
		return getListAll(false);
	}
	
	public List<City> getListAll(boolean withCountry){
		log.info("getListAll("+withCountry+")");
		List<City> list=null;
		if(withCountry)
			list=cityMapper.selectAllWithCountry();
		else
			list=cityMapper.selectAll();
		
		return list;
	}
	public City getCityById(int id){
		log.info("getCityById("+id+")");
		return getCityById(id,false);
	}
	
	public City getCityById(int id,boolean withCountry){
		log.info("getCityById("+id+","+withCountry+")");
		City city=null;
		if(withCountry)
			cityMapper.selectByIdWithCountry(id);
		else
			city=cityMapper.selectById(id);
		return city;
		
	}
}
