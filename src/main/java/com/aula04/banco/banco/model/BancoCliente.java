package com.aula04.banco.banco.model;

import com.aula04.banco.banco.dto.RequestCliente;
import com.aula04.banco.banco.dto.RequestDeposito;

import java.util.*;

public class BancoCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    public void adicionar(Cliente cliente) {
        BancoCliente.clientes.add(cliente);
    }

    public List<Cliente> buscarClientes(){
        return BancoCliente.clientes;
    }

    public Cliente detalhesCliente(UUID id) throws Exception{
        Optional<Cliente> resulCliente =
                BancoCliente.clientes.stream().filter(cliente -> Objects.equals(cliente.getId(), id)).findAny();
        if (resulCliente.isPresent()) {
            return resulCliente.get();
        } else {
            throw new Exception("Usuário não encontrado");
        }
    }

    public Cliente atualizaCliente(UUID id, RequestCliente requestCliente) throws Exception{
        BancoCliente.clientes.stream().filter(cliente -> Objects.equals(cliente.getId(), id))
            .forEach(cliente -> {
                cliente.setNome(requestCliente.getNome());
                cliente.setEmail(requestCliente.getEmail());
                cliente.setSenha(requestCliente.getSenha());
            });
        return detalhesCliente(id);
    }

    public void deletarCliente(UUID id) throws Exception {
        Cliente cliente = detalhesCliente(id);
        BancoCliente.clientes.remove(cliente);
    }

//    public Double depositar(UUID id, RequestDeposito requestDeposito) throws Exception {
//        BancoCliente.clientes.stream().filter(cliente -> Objects.equals(cliente.getId(), id))
//                .forEach(cliente -> {
//                    Optional<Conta> resultConta = cliente.getConta().stream().filter(conta -> Objects.equals(conta.getId(), requestDeposito.getId())).findAny();
//                    if(!resultConta.isPresent()){
//                        Double novosaldo = resultConta.get().getSaldo() + requestDeposito.
//                    }
//                    Double novoSaldo = cliente.getConta().
//                    cliente.setNome(requestCliente.getNome());
//
//                });
//    }

}
