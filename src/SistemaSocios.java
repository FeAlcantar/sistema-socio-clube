import java.util.ArrayList;

public class SistemaSocios {

    ArrayList<Socio> socios = new ArrayList<>();

    public void cadastrarSocio(Socio socio) {
        socios.add(socio);
        System.out.println("Sócio cadastrado com sucesso!");
    }

    public void listarSocios() {

        if (socios.isEmpty()) {
            System.out.println("Nenhum sócio cadastrado.");
            return;
        }

        for (Socio s : socios) {
            System.out.println("Nome: " + s.nome);
            System.out.println("Idade: " + s.idade);
            System.out.println("CPF: " + s.cpf);
            System.out.println("Plano: " + s.plano);
            s.exibirDados();
        }
    }
    public void removerSocio(String cpf){
        for (Socio s : socios) {
            if (s.cpf.equals(cpf)) {
        socios.remove(s);
        System.out.println("Sócio removido. ");
        return;
            }
        }
        System.out.println("Sócio não encontrado.");
    }
    public void  buscarSocio(String cpf) {
        for (Socio s : socios) {
            if (s.cpf.equals(cpf)) {
                System.out.println("Sócio Encontrado:");
                System.out.println("Nome: " + s.nome);
                System.out.println("Plano: " + s.plano);
                System.out.println("Email: " + s.email);
                return;
            }
        }
        System.out.println("Sócio não encontrado.");
    }
}