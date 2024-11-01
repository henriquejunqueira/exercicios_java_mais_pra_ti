package io.github.henriquejunqueira;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProdutoComDesconto produto1 = new ProdutoComDesconto("Produto A", 100.0, 10);
        produto1.aplicarDesconto(10);

        System.out.println("*** Dados produtos ***");
        System.out.println("Preços após desconto: " + produto1.getPreco());

        Funcionario funcionario1 = new Gerente("Carlos", 8000);
        Funcionario funcionario2 = new Desenvolvedor("Ana", 6000);
        Funcionario funcionario3 = new Estagiario("Lucas", 2000);

        SistemaGestaoFuncionarios sistemaGestaoFuncionarios = new SistemaGestaoFuncionarios();
        sistemaGestaoFuncionarios.adicionarFuncionario(funcionario1);
        sistemaGestaoFuncionarios.adicionarFuncionario(funcionario2);
        sistemaGestaoFuncionarios.adicionarFuncionario(funcionario3);

        sistemaGestaoFuncionarios.calcularFolhaPagamento();

        System.out.println("\n*** Dados transporte ***");

        IMeioTransporte[] meiosTransportes = {
                new Carro(),
                new Bicicleta(),
                new Trem()
        };

        for (IMeioTransporte transporte : meiosTransportes){
            transporte.acelerar();
            transporte.frear();
        }

        System.out.println("\n*** Dados animais ***");

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for (Animal animal : animais){
            animal.emitirSom();
        }
    }
}