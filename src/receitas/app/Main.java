package receitas.app;

import receitas.base.Receita;
import receitas.studioGhibli.Lamen;
import receitas.studioGhibli.Onigiri;
import receitas.studioGhibli.OvosComBacon;
import receitas.genshin.Clorinde;
import receitas.genshin.Arlecchino;
import receitas.genshin.Kirara;
import receitas.base.Exibivel;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Genshin Impact");
            System.out.println("2. Studio Ghibli");
            System.out.println("3. Sair");
            System.out.println("Escolha: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirReceitasGenshin(scanner);
                    break;
                case 2:
                    exibirReceitasStudioGhibli(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada invalida. Por favor insira um numero.");
            scanner.nextLine();
        }
    }
}

    private static void exibirReceitasGenshin(Scanner scanner) {
        Exibivel[] genshin = {new Arlecchino(), new Clorinde(), new Kirara()};

        while(true) {
            try {
                System.out.println("Receitas de Genshin Impact:");
                for (int i = 0; i < genshin.length; i++) {
                    System.out.println((i + 1) + ". " + genshin[i].getNome());
                }
                System.out.println("Escolha uma das receitas ou digite 0 para voltar ao menu: ");
                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    return; //volta para o menu
                } else if (escolha > 0 && escolha <= genshin.length) {
                    genshin[escolha - 1].exibirDetalhes();
                    exibirRetorno(scanner);
                    return;
                } else {
                    System.out.println("Opção inválida. Digite novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Por favor insira um número.");
                scanner.nextLine();
            }
        }
    }

    private static void exibirReceitasStudioGhibli(Scanner scanner) {
        Exibivel[] studioGhibli = {new Onigiri(), new OvosComBacon(), new Lamen()};

        while(true) {
            try {
                System.out.println("Receitas do Studio Ghibli:");
                for (int i = 0; i < studioGhibli.length; i++) {
                    System.out.println((i + 1) + ". " + studioGhibli[i].getNome());
                }
                System.out.println("Escolha uma das receitas ou digite 0 para voltar ao menu: ");
                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    return; //volta para o menu
                } else if (escolha > 0 && escolha <= studioGhibli.length) {
                    studioGhibli[escolha - 1].exibirDetalhes();
                    exibirRetorno(scanner);
                    return;
                } else {
                    System.out.println("Opção inválida. Digite novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Por favor insira um número.");
                scanner.nextLine();
            }
        }
    }

    private static void exibirRetorno(Scanner scanner) {
        while (true){
            try {
                System.out.println("\nO que deseja fazer agora?");
                System.out.println("1. Voltar ao Menu Principal");
                System.out.println("2. Sair");
                System.out.println("Escolha: ");
                int opcao = scanner.nextInt();

                if (opcao == 1) {
                    return; 
                } else if (opcao == 2) {
                    System.out.println("Saindo...");
                    System.exit(0); //Termina o programa
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Por favor insira um número.");
                scanner.nextLine();
            }
        }
    }
}
