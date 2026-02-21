import java.util.Scanner;
import Classes.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drogaria drogaria = new Drogaria ("Drogaria Amazon");

        int opcao;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Farmacêutico");
            System.out.println("3 - Mostrar Estoque");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Listar Farmacêuticos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do usuário: ");
                    String nomeU = scanner.nextLine();
                    System.out.print("CPF do usuário: ");
                    String cpf = scanner.nextLine();
                    Usuario novoUsuario = new Usuario(nomeU, cpf);
                    drogaria.cadastrarUsuario(novoUsuario);
                    break;
                case 2:
                    System.out.print("Nome do farmacêutico: ");
                    String nomeF = scanner.nextLine();
                    System.out.print("CRF: ");
                    String crf = scanner.nextLine();
                    Farmaceutico novoFarma = new Farmaceutico(nomeF, crf);
                    drogaria.cadastrarFarmaceutico(novoFarma);
                    break;
                case 3:
                    drogaria.mostrarEstoque();
                    break;
                case 4:
                    drogaria.listarUsuarios();
                    break;
                case 5:
                    drogaria.listarFarmaceuticos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema... Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}