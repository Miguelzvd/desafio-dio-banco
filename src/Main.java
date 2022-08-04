import Banco.Banco;
import Banco.Cliente;
import Banco.Conta.Conta;
import Banco.Conta.ContaCorrente;
import Banco.Conta.ContaPoupanca;
import Banco.Funcionarios.Atendente;
import Banco.Funcionarios.Funcionario;
import Banco.Funcionarios.Seguranca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("===Exemplo contas===");

        //Instanciando os clientes:
        Cliente miguel = new Cliente();
        miguel.setNome("Miguel");

        Cliente joao = new Cliente();
        joao.setNome("Joao");

        //Instanciando as contas:
        Conta contaJoao = new ContaPoupanca(joao);

        Conta contaMiguel = new ContaCorrente(miguel);

        contaMiguel.depositar(100);

        contaMiguel.transferir(100, contaJoao);

        System.out.println("\nImprimindo extrato da conta corrente:");
        contaMiguel.imprimirExtrato();

        System.out.println("\nImprimindo extrato da conta poupança:");
        contaJoao.imprimirExtrato();


        //Exemplo funcionarios:
        System.out.println("\n-------------------------------------------");
        System.out.println("\n===Exemplo funcionarios=== \n");

        Atendente atendente = new Atendente("Pedro", "Atendente", "Ensino Superior", 21);
        Seguranca seguranca = new Seguranca("Andre", "Segurança", "Ensino Médio", 30);

        System.out.println("Exemplo com atendente: \n");
        System.out.println("Utilizando o metodo atender:");
        atendente.Atender();
        System.out.println("\nExibindo caracteristicas do funcionario:");
        System.out.println(atendente.getEscolaridade());
        System.out.println(atendente.getNome());
        System.out.println(atendente.getIdade());

        System.out.println("\nExemplo com segurança: \n");
        System.out.println("Utilizando o metodo vigiar:");
        seguranca.Vigiar();
        System.out.println("\nExibindo caracteristicas do funcionario:");
        System.out.println(seguranca.getEscolaridade());
        System.out.println(seguranca.getNome());
        System.out.println(seguranca.getIdade());

        System.out.println("\n-------------------------------------------");

        //Instanciando banco:
        Banco banco = new Banco();

        //Atribuindo as consta criadas anteriormente:
        List<Conta> contas = new ArrayList<>();
        contas.add(contaJoao);
        contas.add(contaMiguel);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(atendente);
        funcionarios.add(seguranca);

        banco.setContas(contas);
        System.out.println("\n===Exibindo contas do banco=== \n");
        banco.getContas();

        banco.setFuncionarios(funcionarios);
        System.out.println("\n===Exibindo funcionarios do banco=== \n");
        banco.getFuncionarios();
    }
}
