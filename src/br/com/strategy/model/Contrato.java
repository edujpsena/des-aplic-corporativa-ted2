package br.com.strategy.model;

public class Contrato {

    private Funcionario funcionario;

    public Contrato(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String alocacaoFuncionario() {
        return funcionario.getRegiao().definirAlocacaoFuncionario();
    }
}
