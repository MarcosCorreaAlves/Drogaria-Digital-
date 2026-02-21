package Classes;

public class Pagamento {
    private double valor;
    private String formaPagamento;

    // Construtor
    public Pagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    // Exibir detalhes do pagamento
    public void exibirInfo() {
        System.out.println("Valor pago: R$ " + String.format("%.2f", valor));
        System.out.println("Forma de pagamento: " + formaPagamento);
    }
}
