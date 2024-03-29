package ex8;

import java.util.Scanner;

public class Carro extends Veiculo{

	
	private double km;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, double preco, double km) {
		super(modelo, preco);
		this.km = km;
	}
	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public String getTipo() {
		return "Carro...";
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\n" + " KMs rodados: " + km;
	}
	
	public void mostrarDados() {
		String carro = getTipo() + "\n" + getDetalhes();
		System.out.println(carro);
	}
	
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("KMs: ");
		double k = sc.nextDouble();
		
		setKm(k);
	}
	
}
