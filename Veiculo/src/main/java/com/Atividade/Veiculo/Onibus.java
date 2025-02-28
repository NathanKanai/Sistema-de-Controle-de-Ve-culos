package com.Atividade.Veiculo;

public class Onibus extends Veiculo {
    private int eixos;
    private static final int TANQUE_ONIBUS = 200;
    private static final double CONSUMO_ONIBUS = 5.0;

    public Onibus(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel, int eixos) {
        super(marca, modelo, anoFabricacao, capacidade, tipoCombustivel);
        if (eixos < 6 || eixos > 8) {
            throw new IllegalArgumentException("Número de eixos inválido! Deve estar entre 6 e 8.");
        }
        this.eixos = eixos;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE_ONIBUS * CONSUMO_ONIBUS;
    }
}