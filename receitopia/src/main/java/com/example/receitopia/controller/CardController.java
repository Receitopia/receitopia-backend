package com.example.receitopia.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.receitopia.entities.Card;
import com.example.receitopia.service.CardService;

/*
 * Essa classe permite realizar chamadas ao BD por meio dos comandos CRUD, permitindo chamadas do front através da habilitação do Cors, 
 * e o caminho da rota para acessar os dados .
 */
@RestController
@RequestMapping("/receitopia") 
@CrossOrigin(origins = "http://localhost:3000") 
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    /*
     * cria um novo card
     */
    @PostMapping("/cards")
    public Card createCard(@RequestBody Card card) {
        return cardService.createCard(card);
    }

    /*
     * @param lista e retorna todos os cards 
     */
    @GetMapping("/cards") 
    public List<Card> listCard() {
        return cardService.listCard(); 
    }

    /* 
     *  @param retorna uma receita específica por ID
     */
    @GetMapping("/cards/{id}") 
    public Card getCardById(@PathVariable Long id) {
         return cardService.getCardById(id);
    }

    /*
     * @param atualiza as informações de um cartão existente.
     */
    @PutMapping("/cards/{id}")
    public Card updateCard(@PathVariable("id") Long id, @RequestBody Card card) {
        return cardService.updateCard(id, card);  
    }
    
    /*
     * deleta card por ID
     */
    @DeleteMapping("/cards/{id}")
    public List<Card> deleteCard(@PathVariable("id") Long id){
        return cardService.deleteCard(id);
    }
}
