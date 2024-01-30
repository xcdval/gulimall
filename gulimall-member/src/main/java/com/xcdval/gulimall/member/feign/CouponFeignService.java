package com.xcdval.gulimall.member.feign;

import com.xcdval.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 这是一个声明式的远程调用**/
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercouppons();
}
