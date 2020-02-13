package com.zb.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "SERVICE-PROVIDER",fallback = FeignHystrixService.class)
public interface FeignService {

    @RequestMapping("/buy")
    public String shopping();

    @RequestMapping("/search")
    public List<Map> search();

}
