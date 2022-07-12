package projetos.sistema_funcionario.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import projetos.sistema_funcionario.model.Salario;

import projetos.sistema_funcionario.model.*;

public class Seeds {
    public static void seeds() {
        FuncionarioCollection funcionarios = new FuncionarioCollection();

        //  Funcionario 1
        Salario salarioGabriel = new Salario("generoso", 5, 4, true, 1000);
        Funcionario Gabriel = new Funcionario("Gabriel", "Estagiario", 24, salarioGabriel);
        funcionarios.incluir(Gabriel);

        //  Funcionario 2
        Salario salarioDanilo = new Salario("generoso", 5, 4, true, 1000);
        Funcionario Danilo = new Funcionario("Danilo", "Estagiario", 24, salarioDanilo);
        funcionarios.incluir(Danilo);

        // Modificar funcionários
        funcionarios.modificar(funcionarios.getFuncionarioByName("Gabriel"), "faltas", "1");
        funcionarios.modificar(funcionarios.getFuncionarioByName("Danilo"), "funcionarioDoMes", "false");
            // "idade", "nome", "cargo", "faltas", "funcionarioDoMes",
            // "tempoServico", "tipoBonusPadrao", "salarioBase"

        // Calcular salário de funcionários
        List<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(funcionarios.getFuncionarioByName("Gabriel"));
        funcs.add(funcionarios.getFuncionarioByName("Danilo"));
        funcionarios.calcularSalarios(funcs);
    }
    

    public static void main(String[] args) throws IOException {
        seeds();
    }
}
