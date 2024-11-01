package io.github.henriquejunqueira;

abstract class Animal {

    public abstract void emitirSom();

}

class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: au au!");
    }
}

class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("O gato faz: miau!");
    }
}

class Vaca extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("A vaca faz: muuu!");
    }
}
