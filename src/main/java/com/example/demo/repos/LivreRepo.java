package com.example.demo.repos;


import com.example.demo.entities.Livre;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LivreRepo extends JpaRepository<Livre, Long> {
	
}