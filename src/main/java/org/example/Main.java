package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Scania", "R500", 2021, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes-Benz", "OF1721", 2020, 50, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2022, 5, "Eletricidade", "Sedan", 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Volvo", "FH", 2021, 2, "Diesel", 10, -20);

        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");

        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");

        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");

        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km\n");

        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km\n");
    }
}
