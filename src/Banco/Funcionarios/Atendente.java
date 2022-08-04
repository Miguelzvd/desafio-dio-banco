package Banco.Funcionarios;

public class Atendente extends Funcionario{
    public Atendente(String nome,String funcao , String escolaridade, Integer idade) {
        super(nome, funcao, escolaridade, idade);
    }

    public void Atender(){
        System.out.println("Atendendo!");
    }
}
