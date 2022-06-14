package projetos.sistema_funcionario.model;

import projetos.sistema_funcionario.model.Historico;

import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Salario {
    private static final Logger LOGGER = LoggerFactory.getLogger(Salario.class);
    
    private List<Historico> historico = new ArrayList<Historico>();
    
    private String tipoBonusPadrao;
    private double bonusPadrao;
    
    private int faltas;
    private double bonusFaltas;
    
    private int tempoServico;
    private double bonusTempoServico;
    
    private boolean funcionarioMes;
    private double bonusFuncionarioMes;
    
    private double salarioBase;
    private double salarioFinal;
    
    private double bonusAbsoluto;
    private double bonusRelativo;
    
    //CONSTRUTOR
    public Salario(String tipoBonusPadrao, int faltas, int tempoServico, boolean funcionarioMes, double salarioBase) {    
        this.setTipoBonusPadrao(tipoBonusPadrao);
        this.setFaltas(faltas);
        this.setTempoServico(tempoServico);
        this.setFuncionarioMes(funcionarioMes);
        this.setSalarioBase(salarioBase);
    }
    
    public void calcularSalario(){
        this.setBonus();
        double bonusAbsoluto = this.getBonusAbsoluto();
        this.setSalarioFinal(salarioBase + bonusAbsoluto);
        this.incluiHistorico(bonusAbsoluto);
    }
    
    //IMPRIME O SALÁRIO FINAL
    public void imprimeSalarioFinal(){
        System.out.println("\n-- Calculando salario final...\n\nSalario Final: " + this.getSalarioFinal());
    }
    
    @Override
    public String toString() {
        return "\n\nBONUS DO FUNCIONARIO\n" +
            "\nBonus padrão: " + tipoBonusPadrao +
            "\nFaltas: " + faltas  +
            "\nTempo de serviço: " + tempoServico + 
            "\nFuncionario do mes: " + funcionarioMes +
            "\n\n------------------------------------------ //\n" + "@split\n";
    }
    
    // HISTORICO
    public void listaHistorico() {
        for (Historico h: this.getHistorico()) {
            System.out.println(h.toString());
        }
    }
    
    public void incluiHistorico(double d) {
        Historico novoHistorico = new Historico(d);
        this.getHistorico().add(novoHistorico);
    }
    
    public double getBonusByDate(LocalDate data) {
        double returnBonus = 0;
        boolean achouBonus = false;
        try {
            for (Historico h: this.getHistorico()) {
                if (h.getData().isEqual(data)) {
                    returnBonus = h.getBonus();
                }
            }
            if (!achouBonus) {
                throw new RuntimeException("Funcionario não existente");
            }
        } catch(Exception e) {
            LOGGER.info("Erro: " + e);
        } 
        return returnBonus;
    }
    
    public List<Historico> getHistorico() {
        return this.historico;
    }
    
    public void setHistorico(List<Historico> h) {
        this.historico = h;
    }
    
    //BÔNUS PADRÃO
    public String getTipoBonusPadrao() {
        return tipoBonusPadrao;
    }
    public void setTipoBonusPadrao(String tipoBonusPadrao) {
        this.tipoBonusPadrao = tipoBonusPadrao;
        if(this.tipoBonusPadrao == "normal"){
            this.bonusPadrao = 0.05;
        }
        if(this.tipoBonusPadrao == "generoso"){
            this.bonusPadrao = 0.10;
        }
    }
    public double getBonusPadrao() {
        return bonusPadrao;
    }
   
    //BÔNUS POR FALTAS
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
        if(this.faltas == 0){
            this.bonusFaltas = 0.10;
        }
        if(this.faltas >=1 && this.faltas<=3){
            this.bonusFaltas = 0.05;
        }
        if(this.faltas >=4){
            this.bonusFaltas = 0.01;
        }
    }
    public double getBonusFaltas() {
        return bonusFaltas;
    }

    //BÔNUS POR TEMPO DE SERVIÇO
    public int getTempoServico() {
        return tempoServico;
    }
    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
        if(this.tempoServico == 0){
            this.bonusTempoServico = 0;
        }
        if(this.tempoServico >= 1 && this.tempoServico <= 5){
            this.bonusTempoServico = 0.02;
        }
        if(this.tempoServico >= 6 && this.tempoServico <= 10){
            this.bonusTempoServico = 0.03;
        }
        if(this.tempoServico >= 11 && this.tempoServico <= 15){
            this.bonusTempoServico = 0.08;
        }
        if(this.tempoServico >= 16 && this.tempoServico <= 20){
            this.bonusTempoServico = 0.10;
        }
        if(this.tempoServico >20){
            this.bonusTempoServico = 0.15;
        }
    }
    public double getBonusTempoServico() {
        return bonusTempoServico;
    }
    
    //BÔNUS FUNCIONÁRIO DO MÊS
    public boolean isFuncionarioMes() {
        return funcionarioMes;
    }
    public void setFuncionarioMes(boolean funcionarioMes) {
        this.funcionarioMes = funcionarioMes;
        if(this.funcionarioMes){
            this.bonusFuncionarioMes = 0.20;
        }
    }
    public double getBonusFuncionarioMes() {
        return bonusFuncionarioMes;
    }
    
    //SALÁRIO BASE
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    //SALÁRIO FINAL
    public double getSalarioFinal() {
        return salarioFinal;
    }
    
    public void setSalarioFinal(double d) {
        this.salarioFinal = d;
    }
    
    // BONUS 
    public double getBonusAbsoluto() {
        return this.bonusAbsoluto;
    }
    
    public void setBonus() {
        double bRelativo = this.getBonusPadrao()+this.getBonusFaltas()+this.getBonusTempoServico()+this.getBonusFuncionarioMes();
        double bAbsoluto = this.getSalarioBase() * bRelativo;
        this.bonusAbsoluto = bAbsoluto;
        this.bonusRelativo = bRelativo;
    }
    
    public double getBonusRelativo() {
        return bonusRelativo;
    }
}
