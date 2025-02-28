package com.Atividade.Veiculo;

public class Carro extends Veiculo {
    private String categoria;
    private static final int TAMANHO_TANQUE = 50;
    private static final double CONSUMO_POR_LITRO = 12.0;

    public Carro(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel, String categoria) {
        super(marca, modelo, anoFabricacao, capacidade, tipoCombustivel);
        this.categoria = categoria;
    }

    @Override
    public double calcularAutonomia() {
        return TAMANHO_TANQUE * CONSUMO_POR_LITRO;
    }
}