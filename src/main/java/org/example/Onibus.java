package org.example;

class Onibus extends Veiculo {
    int quantidadeEixos;

    Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    double calcularAutonomia() {
        return 200 * 5; //
    }
}
