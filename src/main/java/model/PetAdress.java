package model;

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
}
