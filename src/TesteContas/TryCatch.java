package TesteConta;

import java.util.InputMismatchException;
import java.util.Scanner;
import Contas.Conta;
import java.util.Random;

public class TryCatch{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		Random gerador = new Random();
		try{
			String nconta = gerador.nextInt();
			System.out.print("Escreva o nome do usuário da Conta:");
			String nome = sc.next();
			Conta a = new ContaCorrente();
			System.out.print("Quanto deseja sacar:");
			double saque = sc.nextDouble();
			a.sacar(sc);
		}
		catch (InputMistachException erro1){
			System.err.print("Não é permitido colocar letra nessa local")
			sc.nextLine();
		}
		catch (AritmeticException){
			System.err.print("Você não tem um saldo positivo para sacar");
		}
}

}