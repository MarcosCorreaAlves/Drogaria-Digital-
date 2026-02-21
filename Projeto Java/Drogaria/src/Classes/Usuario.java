package Classes;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    private List<Compra> compras;  // Histórico de compras do usuário

    // Construtor
    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    // Adicionar uma compra ao histórico
    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    // Exibir informações básicas do usuário
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Total de compras: " + compras.size());
    }
}