package com.Atividade.Veiculo;

public class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaInterna;
    private static final double PERDA_EFICIENCIA = 0.10;

    public CaminhaoRefrigerado(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel, double cargaMaxima, double temperaturaInterna) {
        super(marca, modelo, anoFabricacao, capacidade, tipoCombustivel, cargaMaxima);
        this.temperaturaInterna = temperaturaInterna;
    }

    @Override
    public double calcularAutonomia() {
        return super.calcularAutonomia() * (1 - PERDA_EFICIENCIA);
    }
}