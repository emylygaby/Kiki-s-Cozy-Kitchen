package receitas.app;

import receitas.base.Receita;
import receitas.studioGhibli.Lamen;
import receitas.studioGhibli.Onigiri;
import receitas.studioGhibli.OvosComBacon;
import receitas.genshin.Clorinde;
import receitas.genshin.Arlecchino;
import receitas.genshin.Kirara;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
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
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    private static void exibirReceitasGenshin(Scanner scanner) {
        Receita[] genshin = {new Arlecchino(), new Clorinde(), new Kirara()};

        System.out.println("Receitas de Genshin Impact:");
        for (int i = 0; i < genshin.length; i++) {
            System.out.println((i + 1) + ". " + genshin[i].getNome());
        }
        System.out.println("Escolha uma das receitas ou digite 0 para voltar ao menu: ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= genshin.length) {
            genshin[escolha - 1].exibirDetalhes();
            exibirRetorno(scanner);
        } else if (escolha == 0) {
            //volta para o menu
        } else {
            System.out.println("Opção inválida! Voltando para o menu...");
        }
    }

    private static void exibirReceitasStudioGhibli(Scanner scanner) {
        Receita[] studioGhibli = {new Onigiri(), new OvosComBacon(), new Lamen()};

        System.out.println("Receitas de Studio Ghibli:");
        for (int i = 0; i < studioGhibli.length; i++) {
            System.out.println((i + 1) + ". " + studioGhibli[i].getNome());
        }

        System.out.println("Escolha uma das receitas ou digite 0 para voltar ao menu: ");
        int escolha = scanner.nextInt();

        if (escolha > 0 && escolha <= studioGhibli.length) {
            studioGhibli[escolha - 1].exibirDetalhes();
            exibirRetorno(scanner);
        } else if (escolha == 0) {
            //volta para o menu
        } else {
            System.out.println("Opção inválida! Voltando para o menu...");
        }
    }

    private static void exibirRetorno(Scanner scanner) {
        System.out.println("\nO que deseja fazer agora?");
        System.out.println("1. Voltar ao Menu Principal");
        System.out.println("2. Sair");
        System.out.println("Escolha: ");
        int opcao = scanner.nextInt();

        if (opcao == 2) {
            System.out.println("Saindo...");
            System.exit(0);
        } else if (opcao == 1) {
            System.out.println("Voltando para o menu...");
        }
    }
}
