<h1 align="center">
    Sistema de gestão de funcionários
</h1>

<p align="center">
  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/gabrielnama2/sistema_funcionario">

  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/gabrielnama2/sistema_funcionario">
  
  <a href="https://img.shields.io/github/repo-size/gabrielnama2/sistema_funcionario/commits/master">
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/gabrielnama2/sistema_funcionario">
  </a>
  
  <img alt="Repository forks" src="https://img.shields.io/github/forks/gabrielnama2/sistema_funcionario">
  
  <img alt="Repository stars" src="https://img.shields.io/github/stars/gabrielnama2/sistema_funcionario">
</p>

<h4 align="center">
  Trabalho desenvolvido para a disciplina de Projetos de Sistemas de Software.
</h4>

</br>

<p align="center" direction="row">
  <a href="#information_source-primeiros-passos">Primeiros passos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#rocket-sobre-o-projeto">Sobre o projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-licença">Licença</a>
</p>


## :information_source: Primeiros passos
1 - Clone este projeto 

```
Git clone https://github.com/gabrielnama2/sistema_funcionario.git
```

2 - Importe o projeto no Netbenas e assinale a classe raiz, escolhendo o caminho da mesma clique com o botão direito no projeto: Proprerties > Run -> Main class -> Escolha o caminho da classe raiz

Para testes com a inteface gráfica, utilize o caminho

```
projetos.sistema_funcionario.presenter.Index
```

Para testes de funcionalidade, utilize o caminho das seeds

```
projetos.sistema_funcionario.teste.Seeds
```

O arquivo [Seeds.Java](https://github.com/gabrielnama2/sistema_funcionario/blob/danilo/src/main/java/projetos/sistema_funcionario/test/Seeds.java) possui exemplos de testes
```
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
```
</br>

## :rocket: Sobre o projeto
Um sistema simples de funcionário, com possibilidade de adicionar, remover, modificar e gerar bônus dos mesmos.
</br>

## :memo: Licença
Este projeto está sobre a licença MIT. Veja [LICENSE](https://github.com/Danilo-Js/Repo-Searcher/blob/master/LICENSE) para mais informações.

---

#### Feito por: Danilo José e Gabriel Namã
#### 

<h5 align="center">
Universidade Federal do Espírito Santo - Campus Alegre | COD_ATIVIDADE = SGF_2022_1
</h5>
