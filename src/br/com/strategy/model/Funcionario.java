package br.com.strategy.model;

public class Funcionario {

    private String nome;
    private String cpf;
    private Regiao regiao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Regiao getRegiao() {
        return regiao;
    }
    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
