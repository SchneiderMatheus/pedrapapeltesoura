import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int opcao;


        String pedra =  " _____ " + "\n" +
                        "---' ____) " + "\n" +
                        " (_____) " + "\n" +
                        " (_____) " + "\n" +
                        " (____) " + "\n" +
                        " (___) ";

        String pedraX = " \\ ____/__ " + "\n" +
                        "---\\ /___) " + "\n" +
                        " \\ /_____) " + "\n" +
                        " X(_____) " + "\n" +
                        " / \\____) " + "\n" +
                        "---/__(\\___) " + "\n" +
                        " / \\ ";

        String papel =  " _______ " + "\n" +
                        "---' ____)____ " + "\n" +
                        " ______) " + "\n" +
                        " _______) " + "\n" +
                        " _______) " + "\n" +
                        "---.__________) ";

        String papelX = " \\_____/_ " + "\n" +
                        "---'\\ /___)____ " + "\n" +
                        " \\ / ______) " + "\n" +
                        " X _______) " + "\n" +
                        " / \\ _______) " + "\n" +
                        "---./___\\_____) " + "\n" +
                        " / \\ ";

        String tesoura = " _______ " + "\n" +
                         "---' ____)____ " + "\n" +
                         " ______) " + "\n" +
                         " __________)" + "\n" +
                         " (____) " + "\n" +
                         "---.__(___) ";

        String tesouraX = " \\_____/_ " + "\n" +
                          "---'\\ _/__)____ " + "\n" +
                          " \\ / ______) " + "\n" +
                          " X__________)" + "\n" +
                          " /(\\___) " + "\n" +
                          "---./_(_\\_) " + "\n" +
                          " / \\ ";

        System.out.println("Vamos jogar pedra, papel e tesoura?");
        String resposta = sc.next();
        boolean isVerdadeiro = "sim".equalsIgnoreCase(resposta);


        if (isVerdadeiro == true) {

            System.out.println("LETS PLAY A GAME");

            do {
                System.out.println("--- MENU DE OPÇOES ---");
                System.out.println("1 - Pedra");
                System.out.println("2 - Papel");
                System.out.println("3 - Tesoura");
                System.out.println("0 - Sair");

                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, digite um número válido");
                    return;
                }
                opcao = sc.nextInt();
            }   while(opcao !=0);

            switch (opcao) {
                case 1:
                    //pedra
                    break;
                case 2:
                    //papel
                    break;
                case 3:
                    //tesoura
                    break;
                case 0:
                    System.out.println("Fechando o programa..."); 
                    break;
            
                default:
                    System.out.println("Opção inválida! Escolha 1, 2, 3 ou 0");
                    return;
            }

            









            
        } else {
            System.out.println("po que vacilo");
            System.exit(0);
        }

    }
}
