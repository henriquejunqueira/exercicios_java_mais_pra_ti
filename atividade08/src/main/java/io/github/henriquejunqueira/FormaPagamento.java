package io.github.henriquejunqueira;

abstract class FormaPagamento {

    public abstract void processarPagamento(double valor);
    public abstract boolean validarPagamento();

}

class CartaoCredito extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via cartão de crédito.");
    }

    @Override
    public boolean validarPagamento() {
        return true;
    }
}

class Boleto extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via boleto.");
    }

    @Override
    public boolean validarPagamento() {
        return true;
    }
}

class Pix extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via Pix.");
    }

    @Override
    public boolean validarPagamento() {
        return true;
    }
}
