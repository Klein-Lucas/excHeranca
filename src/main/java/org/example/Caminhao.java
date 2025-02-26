package org.example;

class Caminhao extends Veiculo {
    double capacidadeCarga;

    Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    double calcularAutonomia() {
        double consumo = 6;
        consumo -= consumo * 0.01 * capacidadeCarga;
        if (consumo < 6 * 0.75) {
            consumo = 6 * 0.75;
        }
        return 300 * consumo;
    }
}
