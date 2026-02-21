package Classes;

import java.util.ArrayList;
import java.util.List;

public class Drogaria {
    private String nome;
    private Estoque estoque;
    private List<Usuario> usuarios;
    private List<Farmaceutico> farmacêuticos;

    // Construtor
    public Drogaria(String nome) {
        this.nome = nome;
        this.estoque = new Estoque();
        this.usuarios = new ArrayList<>();
        this.farmacêuticos = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Farmaceutico> getFarmaceuticos() {
        return farmacêuticos;
    }

    // Adiciona um novo usuário
    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());
    }

    // Adiciona um farmacêutico à equipe
    public void cadastrarFarmaceutico(Farmaceutico farmaceutico) {
        farmacêuticos.add(farmaceutico);
        System.out.println("Farmacêutico cadastrado: " + farmaceutico.getNome());
    }

    // Exibe todos os medicamentos do estoque
    public void mostrarEstoque() {
        System.out.println("Medicamentos disponíveis na drogaria " + nome + ":");
        estoque.exibirEstoque();
    }

    // Exibe usuários cadastrados
    public void listarUsuarios() {
        System.out.println("Clientes da drogaria:");
        for (Usuario u : usuarios) {
            u.exibirInfo();
            System.out.println("-----");
        }
    }

    // Exibe farmacêuticos cadastrados
    public void listarFarmaceuticos() {
        System.out.println("Equipe de farmacêuticos:");
        for (Farmaceutico f : farmacêuticos) {
            f.exibirInfo();
            System.out.println("-----");
        }
    }
}