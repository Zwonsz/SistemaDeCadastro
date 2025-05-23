package services;

import Exceptions.*;
import model.Pet;
import model.PetAdress;
import model.PetGender;
import model.PetType;
import repository.SalvarPet;
import util.NaoInformado;
import util.ValidadorInator;

import java.util.Scanner;

public class CadastrarPet {

    public static String naoInfo = NaoInformado.NAO_INFORMADO;

    public static void cadastroPet() {
        String path = "C:\\Users\\Pedro\\SistemaDeCadastro\\formulario.txt";
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);

        //NOME
        GetSpecificLine.GetLine(path, 1);
        String petNome = scanner.nextLine();
        try {
            String nome = NaoInformado.textoInformado(petNome);
            ValidadorInator.nomeValidator(nome);
            pet.setNome(nome);
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }


        //TIPO
        GetSpecificLine.GetLine(path, 2);
        String tipo = scanner.nextLine();
       try {
          PetType type = ValidadorInator.tipoValidator(tipo);
           pet.setTipo(type);
       } catch (TipoInvalidoException e) {
           System.out.println(e.getMessage());
       }

        //SEXO
        GetSpecificLine.GetLine(path, 3);
        String genero = scanner.nextLine();
       try{
           PetGender gender = ValidadorInator.genderValidator(genero);
           pet.setSexo(gender);
       } catch (GeneroInvalidoException e) {
           System.out.println(e.getMessage());
       }

        //ENDERECO
        GetSpecificLine.GetLine(path, 4);
        PetAdress petAdress = PetAdress.criarEndereço(scanner);
        pet.setEndereco(petAdress);

        //IDADE
        GetSpecificLine.GetLine(path, 5);
        String idadeAprox = scanner.nextLine();
        try{
            String idade = ValidadorInator.numeroENaoInformado(idadeAprox);
            ValidadorInator.validarIdade(idade);
            pet.setIdade(idade);
        }
        catch (NumeroInvalidoException | IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        //PESO
        GetSpecificLine.GetLine(path, 6);
        String pesoAprox = scanner.nextLine();
        try{
            String peso = ValidadorInator.numeroENaoInformado(pesoAprox);
            ValidadorInator.validarPeso(peso);
            pet.setPeso(peso);
        } catch (NumeroInvalidoException | PesoInvalidaException e) {
            System.out.println(e.getMessage());
        }

        //RAÇA
        GetSpecificLine.GetLine(path, 7);
        String raca = scanner.nextLine();
        pet.setRaca(NaoInformado.textoInformado(raca));

        scanner.close();
        SalvarPet.Salvar(pet);


    }

}
