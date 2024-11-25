package com.example.receitopia.controller;

import com.example.receitopia.entities.Users;
import com.example.receitopia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Essa classe permite realizar chamadas ao BD por meio dos comandos CRUD, permitindo chamadas do front através da habilitação do Cors e 
 * o caminho da rota para acessar os dados.
 */
@RestController
@RequestMapping("/receitopia")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * Validando se o usuario e senha do administrador esta no banco de fato, com alguns testes para verificar se a requisição esta funcionando. 
     */
    @PostMapping("/users")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        System.out.println("Usuário enviado: " + loginRequest.getUsername());
        System.out.println("Senha enviada: " + loginRequest.getPassword());
        System.out.println("Tentando autenticar o usuário: " + loginRequest.getUsername());
    
        Users users = userRepository.findByUsername(loginRequest.getUsername());


        /**
         * log para verificar o usuário retornado
         */
        if (users != null) {
            System.out.println("Usuário encontrado: " + users.getUsername());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    
        if (users != null && users.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login bem-sucedido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
        }
    }
}
