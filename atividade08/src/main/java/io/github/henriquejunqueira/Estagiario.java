package io.github.henriquejunqueira;

import java.util.ArrayList;
import java.util.List;

class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(){
        return salario * 0.05;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está aprendendo");
    }
}

class SistemaGestaoFuncionarios{
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios(){
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void calcularFolhaPagamento(){
        double totalSalarios = 0;
        double totalBonus = 0;

        for(Funcionario funcionario : funcionarios){
            totalSalarios += funcionario.salario;
            totalBonus += funcionario.calcularBonus();
        }
        System.out.println("Total de salários: " + totalSalarios);
        System.out.println("Total de bônus: " + totalBonus);
    }

    public void promoverFuncionario(int index, String novoTipo){
        Funcionario funcionario = funcionarios.get(index);

        if(novoTipo.equals("Gerente")){
            funcionarios.set(index, new Gerente(funcionario.nome, funcionario.salario));
        }else if(novoTipo.equals("Desenvolvedor")){
            funcionarios.set(index, new Desenvolvedor(funcionario.nome, funcionario.salario));
        }
    }
}

