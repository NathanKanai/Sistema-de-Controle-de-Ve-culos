package com.Atividade.Veiculo;

public class CarroEletrico extends Carro {
    private double capacidadeBateria;
    private static final double CONSUMO_KWH = 5.0;

    public CarroEletrico(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel, String categoria, double capacidadeBateria) {
        super(marca, modelo, anoFabricacao, capacidade, tipoCombustivel, categoria);
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularAutonomia() {
        return capacidadeBateria * CONSUMO_KWH;
    }
}