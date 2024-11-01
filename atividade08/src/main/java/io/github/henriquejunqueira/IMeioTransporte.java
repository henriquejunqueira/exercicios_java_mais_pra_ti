package io.github.henriquejunqueira;

interface IMeioTransporte {
    void acelerar();
    void frear();
}

class Carro implements IMeioTransporte{

    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando...");
    }

    @Override
    public void frear(){
        System.out.println("O carro está freando...");
    }
}

class Bicicleta implements IMeioTransporte{
    @Override
    public void acelerar(){
        System.out.println("A bicicleta está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando...");
    }
}

class Trem implements IMeioTransporte{

    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando...");
    }
}
