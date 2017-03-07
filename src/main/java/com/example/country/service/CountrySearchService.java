package com.example.country.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Country;
import com.example.mapper.CountryMapper;
import com.example.util.Pagination;

@Service
public class CountrySearchService {
 
  
  @Autowired
  CountryMapper countryMapper;
  
  public List<Country> getList(){
	 
	 return getList(false);
  }

  public List<Country> getList(boolean withCity){
	  List<Country> list=null;
	  if(withCity)
		  list=countryMapper.selectAllWithCity();
	  else
		  list=countryMapper.selectAll();
	  return list;
  }
	
  
  public Map<String,Object> getPage(int pageNo){
	  return getPage(pageNo,false);
  }
  
  public Map<String,Object> getPage(int pageNo,boolean withCity){
	 Pagination paging=new Pagination();
	 paging.setTotalItem(countryMapper.selectTotalCount());
	 paging.setPageNo(pageNo);
	 
	  List<Country> list=null;
	  if(withCity)
		  list=countryMapper.selectPageWithCity(paging);
	  else
		  list=countryMapper.selectPage(paging);
	  Map<String,Object> map=new HashMap<>();
	  map.put("countries",list);
	  map.put("paging", paging);
	  
	  return map;
  }
  public Country getCountryByCode(String code){
	  return getCountryByCode(code,false);
  }
  
  public Country getCountryByCode(String code,boolean withCity){
	
	Country c=null;
	if(withCity)
		c=countryMapper.selectByCodeWithCity(code);
	else
		c=countryMapper.selectByCode(code);
	return c;
  }
}
