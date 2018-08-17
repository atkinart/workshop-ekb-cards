package ru.alfabank.workshop.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppleService {
    
    public List<Card> getCardsForUser(String userId){
        Card card1 = Card.builder()
                .expire("10/22")
                .number("0000-0000-0000-0000")
                .owner("Ivan Ivanov")
                .build();
        
        Card card2 = new Card("10/22", "0000-0000-0000-0000", "Test");
        
        List<Card> cards = new ArrayList<>(2);
        cards.add(card1);
        cards.add(card2);
        
        return cards;
    }
}
