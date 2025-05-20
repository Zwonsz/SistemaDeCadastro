package services;

import Exceptions.GeneroInvalidoException;
import Exceptions.NomeInvalidoException;
import Exceptions.TipoInvalidoException;
import model.Pet;
import model.PetAdress;
import model.PetGender;
import model.PetType;
import repository.SalvarPet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CadastrarPet {


    public static void cadastroPet() {
        String path = "C:\\Users\\Pedro\\SistemaDeCadastro\\formulario.txt";
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);


        String question1 = GetSpecificLine.GetLine(path, 1);
        System.out.println(question1);
        String petNome = scanner.nextLine();
        pet.setNome(petNome);
        Pattern pattern = Pattern.compile("^[A-Za-zÀ-ÿ]+(?:\\s[A-Za-zÀ-ÿ]+)+$");
        Matcher matcher = pattern.matcher(petNome);
        if (matcher.find()) {
            pet.setNome(petNome);
        }else {
            throw new NomeInvalidoException("É preciso ter nome e sobrenome. Nenhum cacter especial é válido");
        }

        String question2 = GetSpecificLine.GetLine(path, 2);
        System.out.println(question2);
        String tipo = scanner.nextLine();
        if (tipo.equalsIgnoreCase("Cachorro")) {
            pet.setTipo(PetType.CACHORRO);
        } else if (tipo.equalsIgnoreCase("gato")) {
            pet.setTipo(PetType.GATO);
        } else {
            throw new TipoInvalidoException();
        }

        String question3 = GetSpecificLine.GetLine(path, 3);
        System.out.println(question3);
        String gender = scanner.nextLine();
        if (gender.equalsIgnoreCase("Macho")) {
            pet.setSexo(PetGender.MACHO);
        } else if (gender.equalsIgnoreCase("Femea")) {
            pet.setSexo(PetGender.FEMEA);
        } else {
            throw new GeneroInvalidoException();
        }
        String question4 = GetSpecificLine.GetLine(path, 4);
        System.out.println(question4);
        System.out.println("Numero da casa: ");
        String numeroCasa = scanner.nextLine();
        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Rua: ");
        String rua = scanner.nextLine();
        PetAdress adress = new PetAdress(rua, cidade, numeroCasa);
        pet.setEndereco(adress);

        String question5 = GetSpecificLine.GetLine(path, 5);
        System.out.println(question5);
        double idadeAprox = scanner.nextDouble();
        pet.setIdade(idadeAprox);

        String question6 = GetSpecificLine.GetLine(path, 6);
        System.out.println(question6);
        double pesoAprox = scanner.nextDouble();
        scanner.nextLine();
        pet.setPeso(pesoAprox);

        String question7 = GetSpecificLine.GetLine(path, 7);
        System.out.println(question7);
        String raca = scanner.nextLine();
        pet.setRaca(raca);

        scanner.close();
        SalvarPet.Salvar(pet);


    }


}
