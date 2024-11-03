package com.example.receitopia.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.receitopia.entities.Card;
import com.example.receitopia.repository.CardRepository;

@Service 
public class CardService {
    private CardRepository cardRepository;

    public CardService(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }

    public List<Card> createCard(Card card) {
        cardRepository.save(card);
        return listCard();
    }

    public List<Card> listCard() {
        return cardRepository.findAll();
    }

    public List<Card> updateCard(Card card){
        cardRepository.save(card);
        return listCard();   
    }

    public List<Card> deleteCard(Long id){
        cardRepository.deleteById(id);
        return listCard();
    }
}
