package Classes;

public class Farmaceutico {
    private String nome;
    private String crf; // Cadastro do Conselho Regional de Farmácia

    // Construtor
    public Farmaceutico(String nome, String crf) {
        this.nome = nome;
        this.crf = crf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    // Verifica se o medicamento exige receita
    public void validarReceita(Medicamento medicamento, boolean receitaApresentada) {
        if (medicamento.isExigeReceita()) {
            if (receitaApresentada) {
                System.out.println("Receita apresentada. Medicamento liberado.");
            } else {
                System.out.println("Receita obrigatória não apresentada. Venda bloqueada.");
            }
        } else {
            System.out.println("Medicamento não exige receita. Venda liberada.");
        }
    }

    // Exibir informações do farmacêutico
    public void exibirInfo() {
        System.out.println("Farmacêutico: " + nome);
        System.out.println("CRF: " + crf);
    }
}