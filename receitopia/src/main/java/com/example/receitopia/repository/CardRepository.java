package com.example.receitopia.repository;

import com.example.receitopia.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface de repositório para a entidade {@link Card}.
 * 
 * Extende a interface {@link JpaRepository}, proporcionando métodos prontos
 * para operações CRUD (criar, ler, atualizar e deletar) no banco de dados,
 * relacionados à entidade {@link Card}.
 */
public interface CardRepository extends JpaRepository<Card, Long>{
    
}