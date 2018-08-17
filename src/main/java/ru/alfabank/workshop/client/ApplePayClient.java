package ru.alfabank.workshop.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "apple-pay", url = "localhost:8080/")
public interface ApplePayClient {
    
    @GetMapping(path = "/apple/cards/{userId}")
    String getAppleCards(@PathVariable("userId") String userId);
}
