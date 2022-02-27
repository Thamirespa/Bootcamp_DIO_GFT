package desafiobanco;

import java.util.Scanner;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaComercial conta = new ContaComercial();
		
		int numero = sc.nextInt();
		String titular = sc.next();
		double saldo = sc.nextDouble();
		double limiteEmprestimo = sc.nextDouble();
		double deposito = sc.nextDouble();
		double saque = sc.nextDouble();
		
		conta.setNumero(numero);
		conta.setTitular(titular);
		conta.setSaldo(saldo);
		conta.setLimiteEmprestimo(limiteEmprestimo);
		conta.deposito(deposito);
		conta.saque(saque);
			
		System.out.println("Numero da conta: " + conta.getNumero());
		System.out.println("Titular: " + conta.getTitular());
		System.out.println("Saldo: " + conta.getSaldo());
	
	}
		
	
		
}
	
	
	

