package com.amith.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:/coupon-service-test.properties")
class CouponserviceApplicationTests {

	@Test
	void contextLoads() {
	}

}
