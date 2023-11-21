package caixaEletronico;
import java.util.Scanner;
public class CaixaEletronico {
	public static void main(String[] args) {
		int totalCaixa=1000,totalConta=500;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Caixa Eletrônico\n");
			System.out.println("Escolha 1 para depositar");
			System.out.println("Escolha 2 para sacar");
			System.out.println("Escolha 3 para ver o saldo");
			System.out.println("Escolha 4 para SAIR");
			int escolha=sc.nextInt();
			switch(escolha) {
			case 1:
				System.out.println("Digite a quantia a ser depositada: ");
				int depositar=sc.nextInt();
				totalConta=totalConta+depositar;
				totalCaixa=totalCaixa+depositar;
				System.out.println("Seu dinheiro foi depositado!");
			break;
			case 2:
				System.out.println("Digite a quantia a ser sacada: ");
				int sacar=sc.nextInt();
				if(totalCaixa>=sacar&&totalConta>=sacar) {
					totalCaixa=totalCaixa-sacar;
					totalConta=totalConta-sacar;
				}
				else if(totalCaixa<=sacar&&totalConta<=sacar) {
					System.out.println("Saldo da conta indisponível.");
				}
				else {
					System.out.println("Valor em caixa indisponível.");
				}
			break;
			case 3:
				System.out.println("Saldo da conta: "+totalConta);
			break;
			case 4:
				System.exit(0);
			}
			
		}
	}

}
