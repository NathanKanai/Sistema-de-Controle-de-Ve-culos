package com.Atividade.Veiculo;

public class Caminhao extends Veiculo {
    private double cargaMaxima;
    private static final int TANQUE_DIESEL = 300;
    private static final double CONSUMO_PADRAO = 6.0;

    public Caminhao(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel, double cargaMaxima) {
        super(marca, modelo, anoFabricacao, capacidade, tipoCombustivel);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public double calcularAutonomia() {
        double reducaoConsumo = Math.min(cargaMaxima * 0.01, 0.25);
        double eficiencia = CONSUMO_PADRAO * (1 - reducaoConsumo);
        return TANQUE_DIESEL * eficiencia;
    }
}