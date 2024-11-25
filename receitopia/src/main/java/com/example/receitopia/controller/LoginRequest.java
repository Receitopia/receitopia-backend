package com.example.receitopia.controller;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa a requisição de login enviada pelo cliente.
 * 
 * Contém os campos necessários para autenticação, como nome de usuário e senha.
 * Os métodos getter e setter estao sendo gerados automaticamente pela library Lombok a fim de diminuir linhas de codigo e visar rapidez. 
 */
@Getter
@Setter
public class LoginRequest {
    private String username;
    private String password;
}
