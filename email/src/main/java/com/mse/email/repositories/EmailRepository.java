package com.mse.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mse.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}