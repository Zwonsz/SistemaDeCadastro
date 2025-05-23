package model;

public class Pet {


    private String nome;
    private Enum tipo;
    private Enum sexo;
    private PetAdress endereco;
    private String idade;
    private String peso;
    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(PetAdress endereco) {
        this.endereco = endereco;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }

    public Enum getTipo() {
        return tipo;
    }

    public Enum getSexo() {
        return sexo;
    }

    public PetAdress getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return STR."Pet{endereco=\{endereco}}";
    }

    public String getIdade() {
        return idade;
    }

    public String getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }
}


