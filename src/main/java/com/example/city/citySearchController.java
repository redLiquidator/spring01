package com.example.city;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CitySearchService;
import com.example.domain.City;
import com.example.exception.NotFoundRuntimeException;

@Controller
@RequestMapping("/city")
public class citySearchController {
//	static Log log=LogFactory.getLog(CitySearchController.class);
	@Autowired
	CitySearchService citySearchService;
	
	@GetMapping("/list")
	public String getList(Model model){
//		log.info("getList()");
		List<City> list=citySearchService.getListAll(true);
		model.addAttribute("cities",list);
		
		return "city/list";
	}
	
	@GetMapping("/page/{pageNo}")
	public String getPage(@PathVariable int pageNo,Model model){
//		log.info("getPage("+pageNo+")");
		Map<String,Object> page= citySearchService.getPage(pageNo);
		model.addAttribute("page",page);
		return "city/page";
	}
	
	@GetMapping("/item/{id}")
	public String getItemById(@PathVariable int id, Model model){
//		log.info("getItem("+id+")");
		try{City city=citySearchService.getCityById(id,true);
		model.addAttribute("city",city);} catch(NotFoundRuntimeException e){
			model.addAttribute("error",e.getMessage());
			
		}
		return "city/item";
	}
	
}
