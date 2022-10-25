import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //primeira interação
        String continuar;
        System.out.println(" Bem vindo, vamos calcular seu IMC ? Digite qualquer tecla para continuar:");
        Scanner primeiro = new Scanner(System.in);
        continuar = primeiro.next();

        //pedir o peso

        double peso;
        do {
            System.out.println("Digite o seu peso em kg:");
            Scanner segundo = new Scanner(System.in);
            peso = segundo.nextDouble();
            if(peso<0) {
                System.out.println("Peso negativo não pode, tente novamente:");
            }
        }while(peso<0);


        //pedir a altura
        double altura;
        do {
            System.out.println("informe sua altura em metros:");
            Scanner terceiro = new Scanner(System.in);
            altura = terceiro.nextDouble();
            if(altura<0){
                System.out.println("Altura negativa não pode,tente novamente: ");
            }
        }while(altura<0);

        //Preparando o usúario
        String conferindo;
        System.out.println(" Já estamos com seu IMC, Digite qualquer tecla para continuar:");
        Scanner quarto = new Scanner(System.in);
        conferindo = quarto.next();

        double IMC;

        IMC = peso / (Math.pow(altura, 2)); // ou apenas IMC = peso/(altura*altura);


        if (IMC >= 0 && IMC <= 16) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza grave, coma mais.");

        } else if (IMC > 16 && IMC <= 17) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza moderada, como mais um pouco.");

        } else if (IMC > 17 && IMC <= 18.5) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com magreza Leve, como só mais um pouco.");

        } else if (IMC > 18.5 && IMC <= 25) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta saudável, continue assim.");

        } else if (IMC > 25 && IMC <= 30) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com Sobrepeso, tenta dar uma maneirada.");

        } else if (IMC > 30 && IMC <= 35) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com obesidade grau 1, faz uma dieta.");

        } else if (IMC > 35 && IMC <= 40) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println("Você ta com obesidade grau 2, faz uma dieta e exércicios fisícos.");

        } else if (IMC > 40) {
            System.out.println("Seu IMC é de:" + "" + IMC);
            System.out.println(" Você ta com obesidade grau 3, faz uma dieta rigida e exércicios fisícos diariamente.");
        }


          String averigue;
          System.out.println("Para qualquer dúvida, digite qualquer tela para conferir a tabela do IMC");
          Scanner quinto = new Scanner(System.in);
          averigue = quinto.next();

              System.out.println("IMC menor que 16, Magreza Grave.");
              System.out.println("IMC entre 16 e 17, Magreza Moderada.");
              System.out.println("IMC entre 17 e 18.5, Magreza Leve.");
              System.out.println("IMC entre 18.5 e 25, Saudável.");
              System.out.println("IMC entre 25 e 30, Sobrepeso.");
              System.out.println("IMC entre 30 e 35, Obesidade Grau 1.");
              System.out.println("IMC entre 35 e 40, Obesidade Grau 2(severa).");
              System.out.println("IMC maior que 40, Obesidade Grau 3(mórbida).");


    }


}