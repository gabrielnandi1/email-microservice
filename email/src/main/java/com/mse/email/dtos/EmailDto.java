package com.mse.email.dtos;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {

    //Atributos que o usuario vai receber, no caso enviar um post para esse servico enviar o email
    
  
     // para fazer a validaçao se é um objeto valido e se tiver algum campo faltando vai mandar uma badRequest
    private long emailID;
    @NotBlank 
    private String ownerRef;
    @NotBlank 
    @Email //Verificar se é um email valido
    private String emailFrom;
    @NotBlank 
    @Email
    private String emailTo;
    @NotBlank 
    private String subject;
    @NotBlank 
    private String text;
   
   
}