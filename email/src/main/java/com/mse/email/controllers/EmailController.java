package com.mse.email.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mse.email.dtos.EmailDto;
import com.mse.email.models.EmailModel;
import com.mse.email.services.EmailService;

import jakarta.validation.Valid;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("/sending-email")// Requisicao, para o metodo sendingEmail
    public ResponseEntity<EmailModel>sendingEmail(@RequestBody @Valid EmailDto emailDto){
        EmailModel emailModel = new EmailModel();// Instancia de email- model
        // e dps passa o email model no metodo copyProperties, ele vai fazer a conversao de dto pra model
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

}