package com.aula04.banco.banco.dto;


import com.aula04.banco.banco.model.Conta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class RequestCliente {

    private String nome;
    private String email;
    private String senha;
    private Integer agencia;

}
