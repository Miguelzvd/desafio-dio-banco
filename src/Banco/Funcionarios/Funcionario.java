package Banco.Funcionarios;

public abstract class Funcionario {
    String nome;
    String escolaridade;
    String funcao;
    Integer idade;

    protected Funcionario(String nome, String escolaridade,String funcao, Integer idade) {
        this.nome = nome;
        this.funcao = funcao;
        this.escolaridade = escolaridade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "nome='" + nome + '\'' +
                ", escolaridade='" + escolaridade + '\'' +
                ", funcao='" + funcao + '\'' +
                ", idade=" + idade +
                '}';
    }
}
