package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu salário: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Informe o valor da prestação: R$ ");
        double valorPrestacao = sc.nextDouble();

        double trintaPorCentoSalario = salario*0.3;

        if (valorPrestacao>trintaPorCentoSalario){
            System.out.println("Empréstimo não concedido, parcela acima do permitido. ");
        }else{
            System.out.println("Empréstimo concedido.");
        }
    }
}
