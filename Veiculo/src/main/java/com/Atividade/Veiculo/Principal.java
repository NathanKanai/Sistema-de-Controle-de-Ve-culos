package com.Atividade.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Argo", 2022, 5, "Gasolina", "Hatch");
        Caminhao caminhao = new Caminhao("Mercedes", "Actros", 2020, 2, "Diesel", 12);
        Onibus onibus = new Onibus("Volkswagen", "Marcopolo", 2021, 40, "Diesel", 7);
        CarroEletrico carroEletrico = new CarroEletrico("Nissan", "Leaf", 2023, 5, "Elétrico", "Hatch", 40);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Volvo", "FH16", 2019, 2, "Diesel", 10, -18);

        System.out.println("\n== RESULTADO DOS TESTES ==");
        carro.mostrarInfo();
        caminhao.mostrarInfo();
        onibus.mostrarInfo();
        carroEletrico.mostrarInfo();
        caminhaoRefrigerado.mostrarInfo();
    }
}