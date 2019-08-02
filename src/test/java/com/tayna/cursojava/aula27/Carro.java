package com.tayna.cursojava.aula27;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");	
	}
	
	double obterAutnomia() {
		System.out.println("Método obter autonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}
