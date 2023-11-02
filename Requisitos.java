public class Requisitos {
    private String RG;
    private String nome;
    private int idade;
    private String email;

    public Requisitos(String rG, String nome, int idade, String email) {
        this.RG = rG;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
