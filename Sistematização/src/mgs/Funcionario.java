package mgs;

public class Funcionario {
     String nome;
     String identificador;
     String alergias;
     String problemasMedicos;
     String telefone;
     String email;


    // Construtor para inicializar os atributos
    public Funcionario(String nome, String identificador, String alergias, String problemasMedicos, String telefone, String email) {
        this.nome = nome;
        this.identificador = identificador;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }

    // Método para retornar o identificador
    public String getIdentificador() {
        return identificador;
    }

    // Método para formatar a saída das informações do funcionário
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Identificador: " + identificador + "\n" +
               "Alergias: " + alergias + "\n" +
               "Problemas Médicos: " + problemasMedicos + "\n" +
               "Telefone: " + telefone + "\n" +
               "Email: " + email + "\n";
    } 
}
