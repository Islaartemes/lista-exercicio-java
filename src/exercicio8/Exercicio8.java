package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String nome = "";
        int quantidadePacienteMulher = 0;
        int quantidadeMulherAlturaPeso = 0;
        int quantidadePacienteHomem= 0;
        int idadeHomens = 0;
        int mediaIdadeHomens = 0;
        int quantidadePessoas = 0;
        int quantidadePaciente = 0;
        int quantidadePessoasIdade = 0;




        while (!nome.equalsIgnoreCase("fim")){

            System.out.println();
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.print("Informe o seu sexo (feminino ou masculino): ");
            String sexo = sc.nextLine();
            if (sexo.equalsIgnoreCase("feminino")){
                quantidadePacienteMulher++;
                System.out.print("Informe seu peso: ");
                double peso = sc.nextDouble();

                System.out.print("Informe sua idade: ");
                int idade = sc.nextInt();
                if (idade >= 18 && idade <= 25){
                    quantidadePessoasIdade++;
                }

                System.out.print("Informe sua altura: ");
                double altura = sc.nextDouble();
                if (altura >= 1.60 && altura <= 1.70 && peso > 70){
                    quantidadeMulherAlturaPeso++;
                }
                sc.nextLine();
            } else if (sexo.equalsIgnoreCase("masculino")) {
                quantidadePacienteHomem++;
                System.out.print("Informe seu peso: ");
                double peso = sc.nextDouble();

                System.out.print("Informe sua idade: ");
                int idade = sc.nextInt();
                if (idade >= 18 && idade <= 25){
                    quantidadePessoasIdade++;
                }
                idadeHomens += idade;

                System.out.print("Informe sua altura: ");
                double altura = sc.nextDouble();
                sc.nextLine();
            }
        }
        quantidadePaciente = quantidadePacienteHomem + quantidadePacienteMulher;
        mediaIdadeHomens = idadeHomens / quantidadePacienteHomem;

        System.out.println();
        System.out.println("Quantidade de pacientes: " + quantidadePaciente);
        System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        System.out.println("Mulheres entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulherAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoasIdade);

    }
}
