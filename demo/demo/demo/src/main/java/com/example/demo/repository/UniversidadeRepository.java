package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.model.Universidade;

@Repository
public interface UniversidadeRepository extends JpaRepository<Universidade, Long>{

}

