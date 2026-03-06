public class Socio {

    String nome;
    String cpf;
    String email;
    String telefone;
    String plano;
    int idade;
    public Socio(String nome, String cpf, String email, String telefone, String plano, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.plano = plano;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Plano: " + plano);
        System.out.println("----------------------");
    }
}