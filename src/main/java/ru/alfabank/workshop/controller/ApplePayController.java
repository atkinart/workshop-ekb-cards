package ru.alfabank.workshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.alfabank.workshop.service.AppleService;
import ru.alfabank.workshop.service.Card;

import java.util.List;

import static java.util.stream.Collectors.joining;

@RestController
public class ApplePayController {
    
    @Autowired
    AppleService appleService;
    
    @GetMapping(path = "/apple/cards/{userId}")
    public String getCards(@PathVariable("userId") String userId) {
        
        List<Card> cards = appleService.getCardsForUser(userId);
        
        String c = cards.stream().map(Card::getNumber).collect(joining("\",\""));
        
        return "{\"cards\":[\"" + c + "\"]}";
    }
    
}
