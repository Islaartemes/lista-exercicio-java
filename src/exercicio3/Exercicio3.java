package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeFuncionario = "";
        while (!nomeFuncionario.equalsIgnoreCase("fim")){
            System.out.println("Informe seu nome: ");
            nomeFuncionario = sc.nextLine();
            if (nomeFuncionario.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Informe seu salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();

            if (salario<500){
                double aumento = 0.2;
                double novoSalario = salario*aumento + salario;
                System.out.println("O salário reajustado é: R$ " + novoSalario);

            } else{
                System.out.println("Você não tem direito a reajuste.");
            }
        }

        System.out.println("Programa encerrado!");

    }
}
