package com.example.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.beans.OrderBean;
import com.cg.capstore.beans.ProductBean;

@RestController
public class FrontentController {

	@RequestMapping("/")
	public String consume() {
		return "REST Consumer";
	}

	@RequestMapping(value = "/forgot")
	public String forgotPassword(String email) {
		RestTemplate restTemplate = new RestTemplate();
		String password = restTemplate.getForObject("http://localhost:9090/fetchPassword?email=" + email, String.class);
		return password;
	}

	@RequestMapping(value = "/sortByBestSeller")
	public List<ProductBean> productSortingByBestSeller() {

		RestTemplate restTemplate = new RestTemplate();
		List<ProductBean> products = restTemplate.getForObject("http://localhost:9090//sortByBestSeller", List.class);
		return products;
	}

	@RequestMapping("/getSortListHighToLow")
	public ModelAndView getSortListHighToLow(String category) {

		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();

		category = "electronics";
		List<ProductBean> response = restTemplate
				.getForObject("http://localhost:9090//sortHighToLow?category=" + category, List.class);
		System.out.println("***************" + response);
		mav.addObject("product", response);
		mav.setViewName("displaySortingDetails");
		return mav;
	}

	@RequestMapping("/getSortListLowToHigh")
	public ModelAndView getTransaction(String category) {
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();

		category = "electronics";
		List<ProductBean> response = restTemplate
				.getForObject("http://localhost:9090//sortLowToHigh?category=" + category, List.class);
		System.out.println("***************" + response);
		mav.addObject("product", response);
		mav.setViewName("displaySortingDetails");
		return mav;
	}

	@RequestMapping("/getSortListByRange")
	public ModelAndView getSortListByRange(Double min, Double max, String category) {

		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		category = "electronics";
		map.add("min", min);
		map.add("max", max);
		map.add("category", category);

		List<ProductBean> products = restTemplate.postForObject("http://localhost:9090/rangesort", map, List.class);

		mav.addObject("product", products);
		mav.setViewName("displaySortingDetails");
		return mav;
	}

	@RequestMapping("/getSortListByMostViewed")
	public ModelAndView getSortListByMostViewed(String category) {
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
		category = "electronics";
		List<ProductBean> products = restTemplate
				.getForObject("http://localhost:9090//sortByMostViewed?category=" + category, List.class);
		mav.addObject("product", products);
		mav.setViewName("displaySortingDetails");
		return mav;
	}

	@RequestMapping("/getTransactionalDetails")
	public ModelAndView getTransactionDetails(String orderId) {
		System.out.println("***********" + orderId);
		ModelAndView mav1 = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();

		OrderBean response = restTemplate
				.getForObject("http://localhost:9090/getTransactionalDetails?orderId=" + orderId, OrderBean.class);
		mav1.addObject("order", response);
		System.out.println(response);
		mav1.setViewName("getTransactionalDetails");
		return mav1;
	}

	@RequestMapping("/statusCheck")
	public ModelAndView updateStatus(OrderBean order,Model model) {
		
		ModelAndView mav = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();
		model.addAttribute("order",order);
		/*MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("orderId", orderId);
		map.add("orderStatus", orderStatus);
		System.out.println(map);*/
		OrderBean response = restTemplate.postForObject("http://localhost:9090/statusUpdate", order, OrderBean.class);
		mav.addObject("customer", response);
		mav.setViewName("statusCheck");
		return mav;
	}

	@RequestMapping("/customerStatusCheck")
	public ModelAndView checkStatus(String orderId) {
	
		ModelAndView mav1 = new ModelAndView();
		RestTemplate restTemplate = new RestTemplate();

		OrderBean response = restTemplate.getForObject("http://localhost:9090/getTransactionalDetails?orderId=" + orderId,
				OrderBean.class);
		mav1.addObject("customer", response);
		System.out.println(response);
		mav1.setViewName("customerStatusCheck");
		return mav1;
	}
	@RequestMapping("/refund")
	public String refund(String orderId) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:9090/refund?orderId="+orderId, String.class);
		
	}
	@RequestMapping("/rating")
	public String refund() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:9090/Avg", String.class);
		
	}
	@RequestMapping("/promos")
	public String promo(String customerEmail) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://localhost:9090/sendPromo?email="+customerEmail, String.class);
		
	}


}
