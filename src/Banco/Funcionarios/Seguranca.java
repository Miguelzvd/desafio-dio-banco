package Banco.Funcionarios;

public class Seguranca extends Funcionario{
    public Seguranca(String nome,String funcao , String escolaridade, Integer idade) {
        super(nome, funcao, escolaridade, idade);
    }

    public void Vigiar(){
        System.out.println("Vigiando!");
    }
}
