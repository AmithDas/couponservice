package com.amith.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amith.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

}