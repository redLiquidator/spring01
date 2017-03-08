package com.example.country;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryRegisterController {
	
	@GetMapping("/yyy")
//	@ResponseBody
	public void yyy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("yyyyyyyyyyyyyyyy");
		
		RequestDispatcher d =  request.getRequestDispatcher("/WEB-INF/views/country/list.jsp");
		d.forward(request, response);
		
//		return "yyy";
		
	}

}
