package Classes;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Medicamento> medicamentos;

    // Construtor
    public Estoque() {
        this.medicamentos = new ArrayList<>();
    }

    // Adiciona um novo medicamento ao estoque
    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    // Remove um medicamento pelo ID
    public void removerMedicamentoPorId(int id) {
        medicamentos.removeIf(m -> m.getId() == id);
    }

    // Busca um medicamento pelo ID
    public Medicamento buscarPorId(int id) {
        for (Medicamento m : medicamentos) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    // Exibe todos os medicamentos no estoque
    public void exibirEstoque() {
        if (medicamentos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Medicamento m : medicamentos) {
                m.exibirInfo();
                System.out.println("-----");
            }
        }
    }

    // Verifica se um medicamento exige receita
    public boolean exigeReceita(int id) {
        Medicamento m = buscarPorId(id);
        if (m != null) {
            return m.isExigeReceita();
        }
        return false;
    }
}