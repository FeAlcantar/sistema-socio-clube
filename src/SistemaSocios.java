import java.util.ArrayList;
import java.util.List;

public class SistemaSocios {

    private final List<Socio> socios = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarSocio(String nome, String cpf, String email, String telefone, String plano, int idade) {

        Socio socio = new Socio(proximoId, nome, cpf, email, telefone, plano, idade);
        socios.add(socio);

        System.out.println("Sócio cadastrado com sucesso! ID: " + proximoId);

        proximoId++;
    }

    public void listarSocios() {

        if (socios.isEmpty()) {
            System.out.println("Nenhum sócio cadastrado.");
            return;
        }

        for (Socio s : socios) {
            s.exibirDados();
        }
    }

    public Socio buscarSocioPorId(int id) {

        for (Socio s : socios) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public void removerSocio(int id) {

        Socio socioRemover = null;

        for (Socio s : socios) {
            if (s.getId() == id) {
                socioRemover = s;
                break;
            }
        }

        if (socioRemover != null) {
            socios.remove(socioRemover);
            System.out.println("Sócio removido com sucesso.");
        } else {
            System.out.println("Sócio não encontrado.");
        }
    }

    public void atualizarSocio(int id, String novoEmail, String novoTelefone, String novoPlano) {

        Socio socio = buscarSocioPorId(id);

        if (socio != null) {

            socio.setEmail(novoEmail);
            socio.setTelefone(novoTelefone);
            socio.setPlano(novoPlano);

            System.out.println("Dados atualizados com sucesso!");

        } else {
            System.out.println("Sócio não encontrado.");
        }
    }
}