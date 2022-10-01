package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor dos créditos galácticos: ");
        double creditosGalacticos = sc.nextDouble();

        System.out.println("Informe o percentual de aumento: ");
        double percentualAumento = sc.nextDouble();

        percentualAumento = percentualAumento/100;

        double novoValor = creditosGalacticos*percentualAumento + creditosGalacticos;

        System.out.println("O novo valor é: " + novoValor);

    }

}
