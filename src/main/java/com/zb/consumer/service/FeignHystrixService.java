package com.zb.consumer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class FeignHystrixService implements FeignService{

    @Override
    public String shopping() {
        return "sorry,服务不可用";
    }

    @Override
    public List<Map> search() {
        return null;
    }

}
