package formularios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorFormulario {


    public static void chamarFomularioInicial() {
        {
            try (FileReader fr = new FileReader("formulario.txt");
                 BufferedReader bufReader = new BufferedReader(fr)) {

                String linha;
                while ((linha = bufReader.readLine()) != null) {
                    System.out.println(linha);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}