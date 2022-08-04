package Banco;

import Banco.Conta.Conta;
import Banco.Funcionarios.Funcionario;

import java.util.List;

public class Banco {

    public String nome;
    List<Conta> contas; // Tipo de composicao

    List<Funcionario> funcionarios;

    public void getFuncionarios() {
        System.out.println(funcionarios);
    }

    public void getContas() {
        System.out.println(contas);
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
