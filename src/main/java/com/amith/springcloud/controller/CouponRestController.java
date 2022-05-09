package com.amith.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amith.springcloud.model.Coupon;
import com.amith.springcloud.repos.CouponRepo;

@RestController
@RequestMapping(value = "/couponapi")
public class CouponRestController {
	
	@Autowired
	private CouponRepo couponRepo;
	
	@PostMapping(value = "/coupons")
	public Coupon create(@RequestBody Coupon coupon) {
		return couponRepo.save(coupon);		
	}
	
	@GetMapping(value = "/coupons/{code}")
	public Coupon getString(@PathVariable("code") String code) {
		return couponRepo.findByCode(code);
	}

}
