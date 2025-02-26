package org.example;

class Carro extends Veiculo {
    String tipoCarro;

    Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    double calcularAutonomia() {
        return 50 * 12;
    }
}

