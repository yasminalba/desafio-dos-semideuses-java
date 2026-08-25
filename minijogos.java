import java.util.Scanner;
import java.util.Random;

public class minijogos {
    public static void minijogoAnabaeth(){
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(10) + 1;
        int vida = 5;
        boolean acertou = false;
        System.out.println("\n------------------------------------------------------------");
        System.out.println("           DESAFIO DE ADIVINHAÇÃO             " );
        System.out.println("------------------------------------------------------------");
        System.out.println(" O inimigo do seu pai divino desafiou seu personagem!");
        System.out.println(" Descubra o número secreto que ele está escondendo.");
        System.out.println("------------------------------------------------------------\n");
        do {
            System.out.print( " Adivinhe o numero de 1 a 10: ");
            int numeroPersonagem = in.nextInt();
            if (numeroAleatorio == numeroPersonagem) {
                System.out.println(" Parabens voce Ganhou !!");
                acertou = true;
            } else if (numeroAleatorio < numeroPersonagem) {
                System.out.println(" Numero menor ");
                System.out.println(" Perdeu 1 vida");
                vida --;
                System.out.println( " Vida: " + vida + "/5");
            } else {
                System.out.println(" Numero maior ");
                System.out.println(" Perdeu 1 vida ");
                vida --;
                System.out.println( " Vida: " + vida + "/5");
            }
        } while ( vida > 0 && !acertou);
        if (!acertou){
            System.out.println("Suas vidas acabaram! O número secreto era: " + numeroAleatorio);
        }
    }
    public static void minijoguinhoPercy(){
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int n1 = gerador.nextInt(20)+1;
        int n2 = gerador.nextInt(20)+1;
        int resultadoCorreto = n1 + n2;
        System.out.println("\n------------------------------------------------------------");
        System.out.println("          DESAFIO DAS ÁGUAS DE POSEIDON                     ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" Calcule a pressão da água para invocar o furacão!");
        System.out.print(" Quanto é " + n1 + " + " + n2 + "? ");

        int resposta = in.nextInt();
        if (resposta == resultadoCorreto) {
            System.out.println(" Excelente! Você controlou o oceano com precisão!");
        } else {
            System.out.println("A correnteza falhou! O valor correto era: " + resultadoCorreto);
        }

    }
    public static void minijoguinhoNico(){
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int n1 = gerador.nextInt(9)+2;
        int n2 = gerador.nextInt(9)+2;
        int resultadoCorreto = n1 * n2;
        System.out.println("\n------------------------------------------------------------");
        System.out.println("          DESAFIO DO SUBMUNDO HADES                    ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" Multiplique a força das almas invocadas!");
        System.out.print(" Quanto é " + n1 + " x " + n2 + "? ");

        int resposta = in.nextInt();
        if (resposta == resultadoCorreto) {
            System.out.println("Exército de esqueletos invocado com sucesso!");
        } else {
            System.out.println("As sombras se espalharam... O resultado era: " + resultadoCorreto);
        }
    }
    public static void minijoguinhoThalia(){
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();
        int n1 = gerador.nextInt(30) + 10; // Número maior (entre 10 e 39)
        int n2 = gerador.nextInt(10) + 1;  // Número menor (entre 1 e 10)
        int resultadoCorreto = n1 - n2;

        System.out.println("\n------------------------------------------------------------");
        System.out.println("          DESAFIO DOS RAIOS DE ZEUS (THALIA)                ");
        System.out.println("------------------------------------------------------------");
        System.out.println(" Calcule quanta energia resta após disparar o raio!");
        System.out.print(" Quanto é " + n1 + " - " + n2 + "? ");

        int resposta = in.nextInt();

        if (resposta == resultadoCorreto) {
            System.out.println("Raio Mestre disparado com precisão! Você acertou o alvo!");
        } else {
            System.out.println("A carga do raio oscilou! O valor correto era: " + resultadoCorreto);
        }

    }


}
