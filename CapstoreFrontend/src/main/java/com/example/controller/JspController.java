package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	
	@RequestMapping(value = "/sorting")
	public String wel( ModelMap model) {
		/*RestTemplate restTemplate = new RestTemplate();
	Message message = restTemplate.getForObject("http://localhost:9090/getmessage?id=13", Message.class);
	model.put("message", message);*/
	return "sorting";
	}
	@RequestMapping(value = "/forgotPassword")
	public String password(ModelMap model) {
		return "forgotpass";
	}
	@RequestMapping(value="/pay")
	public String payy() {
		return "pay";
	}

	@RequestMapping(value="/status")
	public String statusUpdate() {
		return "status";
	}
	
	@RequestMapping(value="/customer")
	public String customerStatusCheck() {
		return "customer";
	}

	@RequestMapping(value="/AdminPromo")
	public String sendingPromo() {
		return "AdminPromo";
	}

	@RequestMapping(value="/AdminRefund")
	public String refund() {
		return "AdminRefund";
	}
}
