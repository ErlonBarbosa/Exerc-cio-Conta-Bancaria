package Aplicação;

import java.util.Locale;
import java.util.Scanner;

import Entidade.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria x;
		
		System.out.println("Número da conta: ");
		int conta = sc.nextInt();
		System.out.println("Informe seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("\nDeseja realizar um déposito inicial (S/N): ");
		char y = sc.next().toUpperCase().charAt(0);
		
		if(y == 'S') {
			
			
		System.out.println("Deposito inicial: ");
		double depositoI = sc.nextDouble();
		x = new ContaBancaria(conta, nome, depositoI);
		System.out.println();
		System.out.println("Informações da conta:");
		System.out.println(x.toString());
		System.out.println();

	}
		else {
			
			
		System.out.println("Informações da conta:");
		x = new ContaBancaria(conta, nome);
		System.out.println(x.toString());
		System.out.println();
			
			
		}
		
		
		System.out.println("Deposito: ");
		double deposito = sc.nextDouble();
		x.addValor(deposito);
		System.out.println("Informações da conta:");
		System.out.println(x.toString());
		System.out.println();
		
		
		System.out.println();
		System.out.println("Saque: ");
		double saque = sc.nextDouble();
		x.removerValor(saque);
		System.out.println("Informações da conta:");
		System.out.println(x.toString());
		
		
		
		sc.close();
}

}