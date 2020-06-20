package com.ghl.gulimall.member.feign;

import com.ghl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@FeignClient("gulimall-coupon")
public interface CouponfeignService {

    @RequestMapping("/coupon/coupon/123/test")
    public R testfeign();
}
