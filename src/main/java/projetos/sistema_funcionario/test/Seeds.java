package projetos.sistema_funcionario.test;

import java.io.IOException;

import projetos.sistema_funcionario.model.Salario;

import projetos.sistema_funcionario.model.*;
import projetos.sistema_funcionario.dao.DAO;


public class Seeds {
    
    public static void seeds() {
        DAO arq = new DAO();
        FuncionarioCollection funcionarios = new FuncionarioCollection();
        
        //  Funcionario 1
        Salario salarioGabriel = new Salario("generoso", 5, 4, true, 1000);
        Funcionario Gabriel = new Funcionario("Gabriel", "Estagiario", 24, salarioGabriel);
        arq.salvarFuncionario(Gabriel);  

        // Funcionario 2
        Salario salarioDanilo = new Salario("generoso", 0, 0, false, 1500);
        Funcionario Danilo = new Funcionario("Danilo", "Programador Jr", 24, salarioDanilo);
        arq.salvarFuncionario(Danilo);  

        // CRUD
        funcionarios.incluir(Gabriel);
        funcionarios.incluir(Danilo);
        funcionarios.excluir(Gabriel);
        funcionarios.modificar(Danilo, "faltas", "10"); 
        // "idade", "nome", "cargo", "faltas", "funcionarioDoMes",
        // "tempoServico", "tipoBonusPadrao", "salarioBase"
        

        // Salário
        funcionarios.getFuncionario(Danilo).getSalario().calcularSalario();
        
        // Bonus
        funcionarios.getFuncionario(Danilo).getSalario().listaHistorico();
    }
    

    public static void main(String[] args) throws IOException {
        // seeds();
    }
}
