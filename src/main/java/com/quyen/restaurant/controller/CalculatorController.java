package com.quyen.restaurant.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/calculator")
public class CalculatorController {
	@GetMapping
    public String get() {
        return "calculator"; 
    }
	
//	@PostMapping("/calculator")
//    public String post(HttpServletRequest request) {
//		String strNumber1 = request.getParameter("number1");
//		String strNumber2 = request.getParameter("number2");
//		int number1 = Integer.parseInt(strNumber1);
//		int number2 = Integer.parseInt(strNumber2);
//		int tong = number1 + number2;
//		request.setAttribute("tong", tong);
//        return "calculator"; 
//    }
	
	@PostMapping
    public String post(HttpServletRequest request, ModelMap model) {
		String strNumber1 = request.getParameter("number1");
		String strNumber2 = request.getParameter("number2");
		int number1 = Integer.parseInt(strNumber1);
		int number2 = Integer.parseInt(strNumber2);
		int tong = number1 + number2;
//		request.setAttribute("tong", tong);
		model.addAttribute("tong", tong);
        return "calculator"; 
    }
}
