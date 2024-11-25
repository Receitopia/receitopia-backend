package com.example.receitopia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * esta classe representa a entidade de Usuários. 
 * é mapeada para a tabela "users" no banco de dados e utiliza anotações JPA para configuração.
 */

@Getter
@Setter
@Entity
@Table(name = "users") 
public class Users {
    /**
     * Identificador único do usuário.
     * Mapeado como chave primária com geração automática do valor.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}
