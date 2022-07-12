package projetos.sistema_funcionario;
import java.io.IOException;
import projetos.sistema_funcionario.model.*;
import projetos.sistema_funcionario.presenter.Arquivo;
import projetos.sistema_funcionario.presenter.TelaPrincipalPresenter;


public class Sistema_funcionario {
    
    public static void seeds() throws IOException {
        //CRIA UM ARQUIVO
        Arquivo arq = new Arquivo();
        
        //CRIA UMA COLEÇÃO (LISTA) DE FUNCIONÁRIOS
        FuncionarioCollection funcionarios = new FuncionarioCollection();
        
        //CRIANDO UM FUNCIONÁRIO
        Salario salarioGabriel = new Salario("generoso", 5, 3, true, 1000);
        Funcionario Gabriel = new Funcionario("Gabriel", "Estagiario", 24, salarioGabriel);
        funcionarios.incluir(Gabriel);
        arq.salvar(Gabriel);

        //CRIANDO OUTRO FUNCIONÁRIO
        Salario salarioDanilo = new Salario("generoso", 2, 4, false, 1500);
        Funcionario Danilo = new Funcionario("Danilo", "Programador Jr", 26, salarioDanilo);
        funcionarios.incluir(Danilo);
        arq.salvar(Danilo);  
    }

    public static void main(String[] args) throws IOException {
//        seeds();
        
        new TelaPrincipalPresenter();
    }
}
