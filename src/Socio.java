public class Socio {

    private final int id;
    private final String nome;
    private final String cpf;
    private String email;
    private String telefone;
    private String plano;
    private final int idade;

    public Socio(int id, String nome, String cpf, String email, String telefone, String plano, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.plano = plano;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public void exibirDados() {

        System.out.println("\n----- Dados do Sócio -----");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Plano: " + plano);
        System.out.println("Idade: " + idade);
        System.out.println("--------------------------");
    }
}