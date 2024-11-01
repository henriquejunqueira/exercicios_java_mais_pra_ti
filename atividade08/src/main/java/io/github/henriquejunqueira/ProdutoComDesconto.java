package io.github.henriquejunqueira;

public class ProdutoComDesconto extends Produto{

    public ProdutoComDesconto(String nome, double preco, int quantidadeEstoque) {
        super(nome, preco, quantidadeEstoque);
    }

    public void aplicarDesconto(double porcentagem){
        if(porcentagem < 0 || porcentagem > 50){
            throw new IllegalArgumentException("O desconto deve ser entre 0 e 50%.");
        }

        double novoPreco = getPreco() - (getPreco() * (porcentagem / 100));
        setPreco(novoPreco);
    }
}
