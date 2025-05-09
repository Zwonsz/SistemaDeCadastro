package Menu;

import java.util.Scanner;

public class Menu {

    public static void chamarMenu(){

        int opcao = -1;
        while  (opcao != 6){
            System.out.println("""
                1. Cadastrar um novo pet
                2. Alterar os dados do pet cadastrado
                3. Deletar um pet cadastrado
                4. Listar todos os pets cadastrados
                5. Listar pets por algum critério (idade, nome, raça)
                6. Sair
                """);
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("opcao 1 selecionada\n");
                    break;
                case 2:
                    System.out.println("opcao 2 selecionada\n");
                    break;
                case 3:
                    System.out.println("opcao 3 selecionada\n");
                    break;
                case 4:
                    System.out.println("opcao 4 selecionada\n");
                    break;
                case 5:
                    System.out.println("opcao 5 selecionada\n");
                    break;
                case 6:
                    System.out.println("opcao 6 selecionada\n");
                    break;
                default:
                    System.out.println("Opcao invalida, escolha uma opção válida abaixo\n");

            }

        }
    }
}
