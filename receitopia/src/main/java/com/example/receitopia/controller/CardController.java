package com.example.receitopia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.receitopia.entities.Card;
import com.example.receitopia.service.CardService;

@RestController
@RequestMapping("/receitopia")
public class CardController {
    private CardService cardService;
    
    public CardController(CardService cardService){
        this.cardService = cardService;   
    }

    @PostMapping
    List<Card> createCard(@RequestBody Card card){
        return cardService.createCard(card);
    }

    @GetMapping
    List<Card> listCard(Card card){
        return cardService.listCard();
    }
    
    @PutMapping
    List<Card> updateCard(@RequestBody Card card){
        return cardService.updateCard(card);
    }

    @DeleteMapping("{id}")
    List<Card> deleteCard(@PathVariable("id") Long id){
        return cardService.deleteCard(id);
    }
}
