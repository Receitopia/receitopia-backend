package com.example.receitopia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.receitopia.entities.Users;

/**
 * Interface de repositório para a entidade {@link Users}.
 * 
 * Estende a interface {@link JpaRepository}, proporcionando métodos prontos para operações CRUD (criar, ler, atualizar e deletar) 
 * no banco de dados, relacionados à entidade {@link Users}. 
 * Além disso, define um método adicional para buscar usuários por nome de usuário.
 */
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}

