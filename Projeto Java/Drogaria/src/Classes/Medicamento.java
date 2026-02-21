package Classes;

public class Medicamento {
    private int id;
    private String nome;
    private String bula;
    private boolean exigeReceita;

    // Construtor
    public Medicamento(int id, String nome, String bula, boolean exigeReceita) {
        this.id = id;
        this.nome = nome;
        this.bula = bula;
        this.exigeReceita = exigeReceita;
    }


    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBula() {
        return bula;
    }

    public void setBula(String bula) {
        this.bula = bula;
    }

    public boolean isExigeReceita() {
        return exigeReceita;
    }

    public void setExigeReceita(boolean exigeReceita) {
        this.exigeReceita = exigeReceita;
    }

    // Exibir informações do medicamento
    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Bula: " + bula);
        System.out.println("Exige Receita: " + (exigeReceita ? "Sim" : "Não"));
    }
}