package com.example.receitopia.entities;

import org.springframework.web.bind.annotation.CrossOrigin;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa a entidade de Cartões de Receita no sistema.
 * 
 * A classe é mapeada para a tabela "cards" no banco de dados e contém informações como imagem, título, ingredientes e passos de uma receita.
 * Inclui suporte a CORS para permitir requisições do frontend hospedado em "http://localhost:3000" sem bloqueios.
 */
@Getter
@Setter
@Entity
@Table(name = "cards")
@CrossOrigin(origins = "http://localhost:3000")
public class Card {

    /**
     * Identificador único do cartão de receita.
     * Mapeado como chave primária com geração automática do valor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * URL da imagem associada à receita.
     */
    private String image;

    /**
     * Título da receita.
     */
    private String title;

    /**
     * Lista de ingredientes da receita.
     */
    private String ingredients;

    /**
     * Passos necessários para preparar a receita.
     */
    private String steps;
}
