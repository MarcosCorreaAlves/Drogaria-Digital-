package Classes;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPagamento {
    private List<Compra> comprasFinalizadas;

    // Construtor
    public HistoricoPagamento() {
        this.comprasFinalizadas = new ArrayList<>();
    }

    // Adiciona uma compra ao histórico
    public void registrarCompra(Compra compra) {
        comprasFinalizadas.add(compra);
    }

    // Retorna todas as compras
    public List<Compra> getComprasFinalizadas() {
        return comprasFinalizadas;
    }

    // Exibe todas as compras e pagamentos associados
    public void exibirHistorico() {
        if (comprasFinalizadas.isEmpty()) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            System.out.println("Histórico de compras:");
            for (Compra c : comprasFinalizadas) {
                c.exibirCompra();
                System.out.println("=====");
            }
        }
    }
}