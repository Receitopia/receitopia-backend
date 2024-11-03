package com.example.receitopia.repository;

import com.example.receitopia.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long>{
    
}