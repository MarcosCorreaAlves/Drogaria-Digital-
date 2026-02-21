package Classes;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int id;
    private List<Medicamento> medicamentos;
    private Pagamento pagamento;

    // Construtor
    public Compra(int id) {
        this.id = id;
        this.medicamentos = new ArrayList<>();
        this.pagamento = null;  // Pode ser definido depois
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    // Adiciona um medicamento à compra
    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    // Exibe os itens da compra
    public void exibirCompra() {
        System.out.println("Compra ID: " + id);
        System.out.println("Medicamentos:");
        for (Medicamento m : medicamentos) {
            m.exibirInfo();
            System.out.println("---");
        }
        if (pagamento != null) {
            System.out.println("Pagamento:");
            pagamento.exibirInfo();
        } else {
            System.out.println("Pagamento ainda não registrado.");
        }
    }
}