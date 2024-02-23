import java.util.Scanner;

public class Estadistica {
	//definiendo atributos
	private int n;
	private int[] v = new int[50];
	
	//definir metodos
	//constructor
	
	public Estadistica(int nroElem){
		this.n = nroElem;
	}
	
	public void llenar(){
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr, datos");
		for (int i = 0; i < this.n; i++) {
			this.v[i] = lee.nextInt();
		}
	}
	
	public void mostrar(){
		for(int i = 0; i < this.n; i++) {
			System.out.println(this.v[i] + " ");
		}
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getV() {
		return v;
	}

	public void setV(int[] v) {
		this.v = v;
	}
	
	public double media() {
		int sum = 0;
		for (int i = 0; i < this.n; i++) {
			sum = sum + this.v[i];
		}
		
		return (double)sum/this.n;
	}
	
	public double desv() {
		double prom = this.media();
		double sum = 0;
		
		for (int i = 0; i < this.n; i++) {
			sum = sum + Math.pow(this.v[i] - prom, 2);
		}
		
		return Math.sqrt(sum)/this.n;
	}
	
	
}
