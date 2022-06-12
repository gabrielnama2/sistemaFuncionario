package projetos.sistema_funcionario;

import java.io.IOException;

import projetos.sistema_funcionario.model.Salario;

import projetos.sistema_funcionario.model.*;
import projetos.sistema_funcionario.persistencia_dados.Arquivo;
import projetos.sistema_funcionario.presenter.TelaManterFuncionarioPresenter;


public class Sistema_funcionario {
    
    public static void seeds() throws IOException {
        Arquivo arq = new Arquivo();
        FuncionarioCollection funcionarios = new FuncionarioCollection();
        
        //  Funcionario 1
        Salario salarioGabriel = new Salario("generoso", 5, 4, true, 1000);
        Funcionario Gabriel = new Funcionario("Gabriel", "Estagiario", 24, salarioGabriel);

        // Funcionario 2
        Salario salarioDanilo = new Salario("generoso", 0, 0, false, 1500);
        Funcionario Danilo = new Funcionario("Danilo", "Programador Jr", 24, salarioDanilo);

        // CRUD
        funcionarios.incluir(Gabriel);
        funcionarios.incluir(Danilo);
        funcionarios.excluir(Gabriel);
        funcionarios.modificar(Danilo, "faltas", "10"); 
        // "idade", "nome", "cargo", "faltas", "funcionarioDoMes",
        // "tempoServico", "tipoBonusPadrao", "salarioBase"
        
        arq.salvar(funcionarios);  

        // Salário
        funcionarios.getFuncionario(Danilo).getSalario().calcularSalario();
        
        // Bonus
        funcionarios.getFuncionario(Danilo).getSalario().listaHistorico();
    }
    

    public static void main(String[] args) throws IOException {
        // seeds();
    }
}
