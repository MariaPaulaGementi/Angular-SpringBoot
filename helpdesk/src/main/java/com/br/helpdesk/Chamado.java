package com.br.helpdesk.domain;

import java.time.LocalDate;

import com.br.helpdesk.domain.Cliente;
import com.br.helpdesk.domain.Tecnico;
import com.br.helpdesk.domain.enums.Prioridade;
import com.br.helpdesk.domain.enums.Status;


public class Chamado {

    private Integer id;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private Prioridade prioridade;
    private Status status;
    private String titulo;
    private String observacoes;

    private Tecnico tecnico;
    private Cliente cliente;

    public Chamado(){
        super();
    }

    public Chamado(Integer id, Prioridade prioridade, String status, String titulo, String observacoes, Tecnico tecnico, Cliente cliente){
        super();
        this.id = id;
        this.prioridade = prioridade;
        this.status = status;
        this.titulo = titulo;
        this.observacoes = observacoes;
        this.tecnico = tecnico;
        this.cliente = cliente;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getObservacoes(){
        return observacoes;
    }

    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }

    public Tecnico getTecnico(){
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public LocalDate getDataAbertura(){
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFechamento(){
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento){
        this.dataFechamento = dataFechamento;
    }

    @Override
public int hasCode(){
    final int prime = 3l;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
}
@Override
public boolean equals(Objecto obj){
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Chamado other = (Chamado) obj;
    if (id == null) {
        if (other.id != null) {
            return false;
        }
    }else if (!id.equals(other.id)) {
        return false;
    }
    return true;
}

}