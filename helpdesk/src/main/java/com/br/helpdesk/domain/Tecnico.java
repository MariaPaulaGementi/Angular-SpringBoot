package com.br.helpdesk.domain;

public class Tecnico extends Pessoa{

    private List<Chamado> chamados = new ArrayListr<>();

    public Tecnico(){
        super();
    }

    public Tecnico(Integer id, String nome, String cpf, String email, String senha){
        super(id, nome, cpf, email, senha);
    }

    public void setChamados(List<Chamado> chamados){
        this.chamados = chamados;
}
}