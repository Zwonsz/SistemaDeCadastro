package repository;

import model.Pet;

import java.io.*;

public class SalvarPet {
    Pet pet;

    public static void Salvar(Pet pet) {
        File file = new File("C:\\Users\\Pedro\\SistemaDeCadastro\\src\\main\\java\\data", pet.getNome() + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
        bw.write(STR."Nome: \{pet.getNome()}");
        bw.newLine();
        bw.write(STR."Tipo: \{pet.getTipo()}");
        bw.newLine();
        bw.write(STR. "Sexo:  \{pet.getSexo()}");
        bw.newLine();
        bw.write(STR."Endereço: \{pet.getEndereco()}");
        bw.newLine();
        bw.write(STR."Idade: \{pet.getIdade()}");
        bw.newLine();
        bw.write(STR."Peso: \{pet.getPeso()}");
        bw.newLine();
        bw.write(STR."Raça: \{pet.getRaca()}");

        } catch (IOException e) {
            System.out.println(STR."Erro ao cadastrar pet: \{e.getMessage()}");
        }
    }
}