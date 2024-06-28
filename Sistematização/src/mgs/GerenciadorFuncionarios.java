package mgs;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorFuncionarios {
    private Map<String, Funcionario> funcionarios;

    public GerenciadorFuncionarios() {
        this.funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getIdentificador(), funcionario);
    }

    public Funcionario buscarFuncionario(String identificador) {
        return funcionarios.get(identificador);
    }
}