import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jogarNovamente;
        do {
            semideuses filho1 = new semideuses();
            System.out.println(" Saiba um pouco sobre cada Semideus: ");
            System.out.println(" Semideuses: ");
            System.out.println(" 1 - Percy (Jogo de Adição)");
            System.out.println(" 2 - Anabeth ( Jogo de adivinhar os números) ");
            System.out.println(" 3 - Nico di Angelo (Jogo de Multiplicação) ");
            System.out.println(" 4 - Thalita (Jogo de Subtração)");
            System.out.print(" Insira o semideus escolhido:");

            int escolha = in.nextInt();
            filho1.setEscolha(escolha);
            switch (escolha) {
                case 1:

                    System.out.println("------------------ FICHA TECNICA ------------------------");
                    System.out.println(" O semideus escolhido foi: Percy Jackson");
                    filho1.setPoder(" Poder: Controle a água e terremotos");
                    System.out.println(filho1.getPoder());
                    filho1.setNomedoPai(" Pai Divino : Poseidon");
                    System.out.println(filho1.getNomedoPai());
                    filho1.setInimigo(" Inimigo do Pai: Cronos ");
                    filho1.setObjetodePoder(" Objeto de Poder: Tridente");
                    System.out.println(filho1.getObjetodePoder());
                    filho1.setEfeitoColateral(" Doença: Deslexia e TDAH");
                    System.out.println(filho1.getEfeitoColateral());
                    break;
                case 2:

                    System.out.println("------------------ FICHA TECNICA ------------------------");
                    System.out.println(" O semideus escolhido foi: Anabeth Case");
                    filho1.setPoder(" Poder: Estrategia de combate e Inteligencia tatica");
                    System.out.println(filho1.getPoder());
                    filho1.setNomedoPai(" Mãe Divina: Atena");
                    System.out.println(filho1.getNomedoPai());
                    filho1.setInimigo(" Inimigo da Mãe: Aracne");
                    filho1.setObjetodePoder(" Objeto de Poder: Égide ");
                    System.out.println(filho1.getObjetodePoder());
                    filho1.setEfeitoColateral(" Doença: Deslexia e TDAH");
                    System.out.println(filho1.getEfeitoColateral());

                    break;
                case 3:
                    System.out.println("------------------ FICHA TECNICA ------------------------");
                    System.out.println(" O semideus escolhido foi: Nico di Angelo");
                    filho1.setPoder(" Poder: Estrategia de combate e Inteligencia tatica");
                    System.out.println(filho1.getPoder());
                    filho1.setNomedoPai(" Pai Divino : Hades");
                    System.out.println(filho1.getNomedoPai());
                    filho1.setInimigo(" Inimigo do Pai: Titãs/Cronos e Gaia ");
                    filho1.setObjetodePoder(" Objeto de Poder: Capacete da Invisibilidade");
                    System.out.println(filho1.getObjetodePoder());
                    filho1.setEfeitoColateral(" Doença: Deslexia e TDAH");
                    System.out.println(filho1.getEfeitoColateral());
                    break;
                case 4:

                    System.out.println(" O semideus escolhido foi: Thalita");
                    System.out.println("------------------ FICHA TECNICA ------------------------");
                    filho1.setPoder(" Poder: Eletrocinese, voo ou saltos potencializados por correntes de ar, e forte resistência física");
                    System.out.println(filho1.getPoder());
                    filho1.setNomedoPai(" Pai Divino : Zeus");
                    System.out.println(filho1.getNomedoPai());
                    filho1.setInimigo(" Inimigo do Pai: Cronos e Gaia ");
                    System.out.println(filho1.getInimigo());
                    filho1.setObjetodePoder(" Objeto de Poder: Raios Mestres");
                    System.out.println(filho1.getObjetodePoder());
                    filho1.setEfeitoColateral(" Doença: Deslexia e TDAH");
                    System.out.println(filho1.getEfeitoColateral());
                    break;
                default:
                    System.out.println("\n Semideus não encontrado =(");
                    break;
            }
            
            System.out.print("\nDeseja jogar novamente? (s/n): ");
            jogarNovamente = in.next();

        } while (jogarNovamente.equalsIgnoreCase("s"));

        System.out.println("\nObrigado por jogar! Até a próxima, semideus! ");

        in.close();
    }
}
