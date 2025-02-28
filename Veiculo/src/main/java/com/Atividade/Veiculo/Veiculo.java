package com.Atividade.Veiculo;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int capacidade;
    private String tipoCombustivel;

    public Veiculo(String marca, String modelo, int anoFabricacao, int capacidade, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
        this.tipoCombustivel = tipoCombustivel;
    }

    public abstract double calcularAutonomia();

    public void mostrarInfo() {
        System.out.println("========== DADOS DO VEÍCULO ==========");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoFabricacao);
        System.out.println("Capacidade: " + capacidade + " passageiros");
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
        System.out.println("======================================");
    }
}