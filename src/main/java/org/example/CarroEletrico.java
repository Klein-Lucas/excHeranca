package org.example;

class CarroEletrico extends Carro {
    double bateriaKWh;

    CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    double calcularAutonomia() {
        return bateriaKWh * 5;
    }
}

class CaminhaoRefrigerado extends Caminhao {
    double temperaturaMinima;

    CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    double calcularAutonomia() {
        return super.calcularAutonomia() * 0.90;
    }
}
