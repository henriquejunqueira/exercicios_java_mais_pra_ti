package io.github.henriquejunqueira;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setPreco(double preco){
        if(preco < 0){
            throw new IllegalArgumentException(("O preço não pode ser negativo!"));
        }

        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {

        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa!");
        }

        this.quantidadeEstoque = quantidadeEstoque;
    }
}
