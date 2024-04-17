package com.br.helpdesk.domain;

import java.util.List;

import com.br.helpdesk.Chamado;

public class Cliente extends Pessoa {

    private List<Chamado> chamados = new ArrayListr<>();
    

    public Cliente(){
        super();
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha){
        super(id, nome, cpf, email, senha);
    }

    public void setChamados(List<Chamado> chamados){
            this.chamados = chamados;
   }
}