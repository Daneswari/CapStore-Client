package com.cg.capstoreapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {


	@RequestMapping(value="/status")
	public String statusUpdate() {
		return "status";
	}
	@RequestMapping(value="/customer")
	public String customerStatusCheck() {
		return "customer";
	}
}
