package exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorDiaria = 40;
        int taxaServico1 = 15;
        int taxaServico2 = 8;
        double totalConta = 0;
        double arrecadadoPousada = 0;

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe a quantidade de diárias: ");
        int quantidadeDias = sc.nextInt();

        while (true){
            if (quantidadeDias < 10){
                totalConta = (valorDiaria * quantidadeDias) + (taxaServico1 * quantidadeDias);
                System.out.println("O valor total da conta de " + nome + " é R$ " + totalConta);
            }else{
                totalConta = (valorDiaria * quantidadeDias) + (taxaServico2 * quantidadeDias);
                System.out.println("O valor total da conta de " + nome + " é R$ " + totalConta);
            }

            arrecadadoPousada += totalConta;
            System.out.println("O total arrecadado da pousada foi: R$ " + arrecadadoPousada);

            System.out.println("Digite 1 para inserir novos dados ou 2 para finalizar o programa: ");
            int escolha = sc.nextInt();

            if (escolha == 1){
                System.out.println("Informe seu nome: ");
                nome = sc.nextLine();
                sc.nextLine();

                System.out.println("Informe a quantidade de diárias: ");
                quantidadeDias = sc.nextInt();
            }else {
                System.out.println("Programa encerrado!");
                break;
            }



        }
    }
}
