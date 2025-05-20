package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GetSpecificLine {

    public static String GetLine(String filePath, int lineNumber) {
        String line = null;
        int linhaAtual = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Pedro\\SistemaDeCadastro\\formulario.txt"))) {
            while ((line = br.readLine()) != null) {
                linhaAtual++;
                if (linhaAtual == lineNumber) {
                    return line;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }


}

