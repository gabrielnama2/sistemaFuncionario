package projetos.sistema_funcionario.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Funcionario {
    private static final Logger LOGGER = LoggerFactory.getLogger(Funcionario.class);
    
    private String nome, cargo;
    private int idade;
    private Salario salario;
    
    public Funcionario(String nome, String cargo, int idade, Salario salario){
        this.setNome(nome);
        this.setCargo(cargo);
        this.setIdade(idade);
        this.setSalario(salario);
    }
    
    public void consultaBonus() {
        System.out.println(this.getSalario().getBonusAbsoluto());
        LOGGER.info("Bônus consultado: " + this.getNome());
    }
    
    public void calculaSalario() {
        this.getSalario().calcularSalario();
        LOGGER.info("Salário calculado: " + this.getNome());
    }
    
    public void imprime(){
        System.out.println(this.toString());
    }
    
     @Override
    public String toString() {
        return "\n\n// ------------------------------------------\n" +
                "\nDADOS DO FUNCIONARIO\n" + 
                "\nNome: " + this.getNome() + 
                "\nCargo: " + this.getCargo() + 
                "\nIdade: " + this.getIdade() + 
                "\nSalario: " + this.getSalario().getSalarioBase()+
                salario.toString();
    }
    
    //GETS E SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Salario getSalario() {
        return salario;
    }
    public void setSalario(Salario salario) {
        this.salario = salario;
    }
}
