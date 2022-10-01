package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double refrigerante = 3.00;
        double gasolina = 2.50;

        System.out.println("Informe a quantidade de litros para abastecer: ");
        double quantidadeLitros = sc.nextDouble();

        double totalConta = 2*refrigerante + gasolina*quantidadeLitros;
        System.out.println("O valor total da conta é: R$ " + totalConta);

    }
}
