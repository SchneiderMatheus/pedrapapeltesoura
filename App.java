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
        Random gerador = new Random();
        int escolhaComputador = gerador.nextInt(3) + 1;
        


        if (isVerdadeiro == true) {

            System.out.println("LETS PLAY A GAME");

            
                System.out.println("--- MENU DE OPÇOES ---");
                System.out.println("1 - Pedra");
                System.out.println("2 - Papel");
                System.out.println("3 - Tesoura");
                System.out.println("0 - Sair");

                
                opcao = sc.nextInt();
               

            switch (opcao) {
                case 1:
                    if (escolhaComputador ==1) {
                        System.out.println("Sua escolha: Pedra "+ pedra);
                        System.out.println("Escolha do computador: Pedra "+ pedra);
                        System.out.println(">>>>>>Empate<<<<<<");
                    }
                    if (escolhaComputador ==2) {
                        System.out.println("Sua escolha: Pedra "+ pedraX);
                        System.out.println("Escolha do computador: Papel "+ papel);
                        System.out.println(">>>>>>Computador ganhou<<<<<<");
                    }
                    if (escolhaComputador ==3) {
                        System.out.println("Sua escolha: Pedra "+ pedra);
                        System.out.println("Escolha do computador: Tesoura "+ tesouraX);
                        System.out.println(">>>>>>Você ganhou<<<<<<");
                        
                    }
                    
                    break;
                case 2:
                    if (escolhaComputador ==1) {
                        System.out.println("Sua escolha: Papel "+ papel);
                        System.out.println("Escolha do computador: Pedra "+ pedraX);
                        System.out.println(">>>>>>Você Ganhou<<<<<<");
                    }
                    if (escolhaComputador ==2) {
                        System.out.println("Sua escolha: Papel "+ papel);
                        System.out.println("Escolha do computador: Papel "+ papel);
                        System.out.println(">>>>>>Empate<<<<<<");
                    }
                    if (escolhaComputador ==3) {
                        System.out.println("Sua escolha: Papel "+ papelX);
                        System.out.println("Escolha do computador: Tesoura "+ tesoura);
                        System.out.println(">>>>>>Você perdeu<<<<<<");
                        
                    }
                    break;
                case 3:
                    if (escolhaComputador ==1) {
                        System.out.println("Sua escolha: Tesoura "+ tesouraX);
                        System.out.println("Escolha do computador: Pedra "+ pedra);
                        System.out.println(">>>>>>Você Perdeu<<<<<<");
                    }
                    if (escolhaComputador ==2) {
                        System.out.println("Sua escolha: Tesoura "+ tesoura);
                        System.out.println("Escolha do computador: Papel "+ papelX);
                        System.out.println(">>>>>>Você Ganhou<<<<<<");
                    }
                    if (escolhaComputador ==3) {
                        System.out.println("Sua escolha: Tesoura "+ tesoura);
                        System.out.println("Escolha do computador: Tesoura "+ tesoura);
                        System.out.println(">>>>>>Empate<<<<<<");
                    }
                    break;
                case 0:
                    System.out.println("Fechando o programa..."); 
                    break;
            
                default:
                    System.out.println("Opção inválida! Escolha 1, 2, 3 ou 0");
                    break;
            }

        } else{
            System.out.println("Que pena! Outra hora então");

        }
        sc.close();
    }


}
