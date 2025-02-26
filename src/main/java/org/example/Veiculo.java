package org.example;

abstract class Veiculo {
    String marca;
    String modelo;
    int ano;
    int capacidadePassageiros;
    String combustivel;


    Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }


    abstract double calcularAutonomia();


    void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Combustível: " + combustivel);
    }
}
