package model;

import util.NaoInformado;

import java.util.Scanner;

public class PetAdress {

    private String rua;
    private String cidade;
    private String numeroDaCasa;

    public PetAdress(String rua, String cidade, String numeroDaCasa) {
        this.rua = rua;
        this.cidade = cidade;
        this.numeroDaCasa = numeroDaCasa;
    }

    @Override
    public String toString() {
        return STR."rua= \{rua}, cidade= \{cidade} , numeroDaCasa= \{numeroDaCasa} ";
    }

    public static PetAdress criarEndereço(Scanner scanner){
        System.out.println("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite o nome da rua: ");
        String rua = scanner.nextLine();

        System.out.println("Digite o numero da casa: ");
        String numeroCasa = scanner.nextLine();
        numeroCasa = NaoInformado.textoInformado(numeroCasa);

        return new PetAdress(rua,cidade,numeroCasa);
    }
}
