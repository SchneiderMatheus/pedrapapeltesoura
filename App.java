import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println();
            System.out.println("Deseja jogar Pedra, Papel e Tesoura? (s/n) ");
            opcao = sc.next();

            if (opcao.equalsIgnoreCase("s")) {
                System.out.printf("\n======MENU======");
                System.out.printf("\n1 - Pedra");
                System.out.printf("\n2 - Papel");
                System.out.printf("\n3 - Tesoura");
                System.out.printf("\n0 - Voltar ao menu");
                System.out.printf("\nEscolha: ");

                while (!sc.hasNextInt()) {
                    System.out.println("Por favor, digite uma escolha válida");
                    sc.next();
                }
                int escolhaUsuario = sc.nextInt();

                if (escolhaUsuario == 0) {
                    continue; // volta ao menu principal
                }

                Random gerador = new Random();
                int escolhaComputador = gerador.nextInt(3) + 1;

                switch (escolhaUsuario) {
                    case 1: // Pedra
                        if (escolhaComputador == 1){ 
                            System.out.println("Empate");
                            System.out.println("Computador escolheu: Pedra");
                            System.out.println("O v.s O");
                        }
                        else if (escolhaComputador == 2){ 
                            System.out.println("Você perdeu");
                            System.out.println("Computador escolheu: Papel");
                            System.out.println("O v.s ██");
                        }
                        else{ 
                            System.out.println("Você venceu");
                            System.out.println("Computador escolheu: Tesoura");
                            System.out.println("O v.s X");
                        }
                            break;
                    case 2: // Papel
                        if (escolhaComputador == 1){ 
                            System.out.println("Você venceu");
                            System.out.println("Computador escolheu: Pedra");
                            System.out.println("██ v.s O");
                        }
                        else if (escolhaComputador == 2){ 
                            System.out.println("Empate");
                            System.out.println("Computador escolheu: Papel");
                            System.out.println("██ v.s ██");
                        }
                        else{ 
                            System.out.println("Você perdeu");
                            System.out.println("Computador escolheu: Tesoura");
                            System.out.println("██ v.s X");
                        }
                            break;
                    case 3: // Tesoura
                        if (escolhaComputador == 1){ 
                            System.out.println("Você perdeu");
                            System.out.println("Computador escolheu: Pedra");
                            System.out.println("X v.s O");
                        }
                        else if (escolhaComputador == 2){ 
                            System.out.println("Você venceu");
                            System.out.println("Computador escolheu: Papel");
                            System.out.println("O v.s ██");
                        }
                        else{ 
                            System.out.println("Empate");
                            System.out.println("Computador escolheu: Tesoura");
                            System.out.println("X v.s X");
                        }
                            break;
                    default:
                        System.out.println("Opção inválida! Escolha 1, 2, 3 ou 0");
                }
            } else if (opcao.equalsIgnoreCase("n")) {
                System.out.println("Ok, programa encerrado");
                break;
            } else {
                System.out.println("Por favor, digite s para sim ou n para não");
            }

        } while (true);

        sc.close();
    }
}
