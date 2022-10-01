package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=10; i++ ){
            System.out.print("Informe um número: ");
            int numeros = sc.nextInt();


            if (numeros%2 == 0 ){
                System.out.println("O número informado é par.");
                System.out.println();
            }
            else {
                System.out.println("O número informado é impar.");
                System.out.println();

            }
        }
    }
}
