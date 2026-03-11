import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaSocios sistema = new SistemaSocios();

        int opcao;

        do {

            System.out.println("\n=== Sistema de Gestão de Sócios ===");
            System.out.println("1 - Cadastrar sócio");
            System.out.println("2 - Listar sócios");
            System.out.println("3 - Buscar sócio por ID");
            System.out.println("4 - Atualizar sócio");
            System.out.println("5 - Remover sócio");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Plano: ");
                    String plano = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    sistema.cadastrarSocio(nome, cpf, email, telefone, plano, idade);
                    break;

                case 2:

                    sistema.listarSocios();
                    break;

                case 3:

                    System.out.print("Digite o ID do sócio: ");
                    int idBusca = scanner.nextInt();

                    Socio socio = sistema.buscarSocioPorId(idBusca);

                    if (socio != null) {
                        socio.exibirDados();
                    } else {
                        System.out.println("Sócio não encontrado.");
                    }

                    break;

                case 4:

                    System.out.print("Digite o ID do sócio: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();

                    System.out.print("Novo telefone: ");
                    String novoTelefone = scanner.nextLine();

                    System.out.print("Novo plano: ");
                    String novoPlano = scanner.nextLine();

                    sistema.atualizarSocio(idAtualizar, novoEmail, novoTelefone, novoPlano);
                    break;

                case 5:

                    System.out.print("Digite o ID do sócio para remover: ");
                    int idRemover = scanner.nextInt();

                    sistema.removerSocio(idRemover);
                    break;

                case 0:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}