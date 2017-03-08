package com.example.country;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.country.service.CountrySearchService;
import com.example.domain.Country;
import com.example.exception.NotFoundRuntimeException;
//웹의 요청을 받아서 요청에 맞는 처리, 즉 db에 맞는 데이터를 가져온다. (forward)
@Controller
@RequestMapping("/country")
public class CountrySearchController {
	static Log log=LogFactory.getLog(CountrySearchController.class);
	
	@Autowired 
	CountrySearchService countrySearchService;
	
	@GetMapping("/list")
	public String test01_getList(Model model){
		log.info("getList()");
		List<Country> list= countrySearchService.getList();
		model.addAttribute("list",list);
		return "country/list";	
	}
	
	@GetMapping("/page/{pageNo}")
	public String test02_getPage(@PathVariable int pageNo,Model model){
		log.info("getPage("+pageNo+")");
		
		Map<String,Object> page=countrySearchService.getPage(pageNo);
		model.addAttribute("page",page);
		return "country/page";
	}
	
	@GetMapping("/item/{code}")
	public String test03_getItem(Model model, @PathVariable String code,  HttpServletResponse res, HttpServletRequest req, ModelMap map){
		System.out.println("req ===>"+req);
		System.out.println("res ===>"+res);
		System.out.println("map ===>"+map);
		
		log.info("getItem("+code+")");
		try{Country c =countrySearchService.getCountryByCode(code);
		model.addAttribute("country",c);}
		catch(NotFoundRuntimeException e){
			model.addAttribute("error",e.getMessage());
		}
		
		return "country/item";
	}
	

	
	
}
