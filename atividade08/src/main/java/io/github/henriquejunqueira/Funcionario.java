package io.github.henriquejunqueira;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
        return 0;
    }

    public void trabalhar(){
        System.out.println(nome + " está trabalhando!");
    }
}

class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.20;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está gerenciando a equipe.");
    }
}

class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.10;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está desenvolvendo software.");
    }
}
