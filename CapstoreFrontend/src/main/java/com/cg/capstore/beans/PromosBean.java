package com.cg.capstore.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PromosBean {

	private String promoCode;

	private Integer discount;

	private Date timePeriod;

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Date getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(Date timePeriod) {
		this.timePeriod = timePeriod;
	}

	@Override
	public String toString() {
		return "PromosBean [promoCode=" + promoCode + ", discount=" + discount + ", timePeriod=" + timePeriod + "]";
	}

	public PromosBean(String promoCode, Integer discount, Date timePeriod) {
		super();
		this.promoCode = promoCode;
		this.discount = discount;
		this.timePeriod = timePeriod;
	}

	public PromosBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}