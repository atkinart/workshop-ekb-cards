package ru.alfabank.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.alfabank.workshop.client.ApplePayClient;

@RestController
public class CardController {
    
    @Autowired
    ApplePayClient client;
    
    @GetMapping(path = "cards/{userId}")
    public String getCards(@PathVariable("userId") String userId) {
        
        return client.getAppleCards(userId);
    }
    
}
