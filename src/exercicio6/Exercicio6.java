package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaClasse = 0;

        for (int i=0; i<6; i++){

            System.out.println("Informe a primeira nota do aluno " + (i+1) + ": ");
            double nota1 = sc.nextDouble();

            System.out.println("Informe a segunda nota do aluno " + (i+1) + ": ");
            double nota2 = sc.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaClasse += media;
            System.out.println("Média aluno " + (i+1) + ": " + media);

            if (media < 3.0){
                System.out.println("REPROVADO");
                totalReprovados ++;
            } else if (media <= 7.0) {
                System.out.println("EXAME");
                totalExame ++;
            } else {
                System.out.println("APROVADO");
                totalAprovados ++;
            }

        }

        double mediaClasse = somaClasse / 6;

        System.out.println("TOTAL APROVADOS: " + totalAprovados);
        System.out.println("TOTAL EXAME: " + totalExame);
        System.out.println("TOTAL REPROVADOS: " + totalReprovados);
        System.out.println("MEDIA DA CLASSE: " + mediaClasse);

    }
}
