package com.example.receitopia.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.receitopia.entities.Card;
import com.example.receitopia.repository.CardRepository;

@Service
public class CardService {

    private final CardRepository cardRepository;

    /**
     * Construtor para inicializar o serviço com o repositório de cartões.
     *
     * @param cardRepository repositório de cartões
     */
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    /**
     * Cria um novo cartão e o salva no banco de dados.
     *
     * @param card o objeto {@link Card} a ser criado
     * @return o objeto {@link Card} criado
     */
    public Card createCard(Card card) {
        return cardRepository.save(card);  
    }

    /**
     * Retorna a lista de todos os cartões no banco de dados.
     *
     * @return uma lista de objetos {@link Card}
     */
    public List<Card> listCard() {
        return cardRepository.findAll();  
    }

    /**
     * Atualiza os dados de um cartão existente.
     *
     * @param id identificador do cartão a ser atualizado
     * @param updatedCard objeto {@link Card} contendo os novos dados
     * @return objeto {@link Card} atualizado
     * @throws RuntimeException se o cartão com o ID especificado não for encontrado
     */
    public Card updateCard(Long id, Card updatedCard) {
        Card existingCard = cardRepository.findById(id) // busca a receita existente pelo id
            .orElseThrow(() -> new RuntimeException("Receita não encontrada"));
    
        existingCard.setTitle(updatedCard.getTitle()); // atualizar os campos da receita existente com os novos valores
        existingCard.setImage(updatedCard.getImage());
        existingCard.setIngredients(updatedCard.getIngredients());
        existingCard.setSteps(updatedCard.getSteps());
    
        return cardRepository.save(existingCard); //salva no banco
    }

    /**
     * Salva um cartão e retorna a lista atualizada de cartões.
     *
     * @param card o objeto {@link Card} a ser salvo
     * @return a lista atualizada de objetos {@link Card}
     */
    public List<Card> updateCard(Card card) {
        cardRepository.save(card);  
        return listCard();  
    }

    /**
     * Retorna um cartão específico pelo ID.
     *
     * @param id o identificador do cartão
     * @return o objeto {@link Card} correspondente ao ID
     * @throws RuntimeException se o cartão com o ID especificado não for encontrado
     */
    public Card getCardById(Long id) {
        return cardRepository.findById(id).orElseThrow(() -> new RuntimeException("Receita não encontrada"));
    }

    /**
     * Remove um cartão do banco de dados e retorna a lista atualizada de cartões.
     *
     * @param id o identificador do cartão a ser removido
     * @return a lista atualizada de objetos {@link Card}
     */
    public List<Card> deleteCard(Long id) {
        cardRepository.deleteById(id); 
        return listCard();  
    }
}