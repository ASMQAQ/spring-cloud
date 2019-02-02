package com.asm.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name") String name);

}
