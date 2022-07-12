package projetos.sistema_funcionario.model;
import java.time.LocalDate; 

// HistoricoCollection
public class Historico {
    private LocalDate data;
    private double bonus;
    
    public Historico(double bonusAbsoluto, LocalDate data) {
        this.setBonus(bonusAbsoluto);
        this.setData(data);
    }
    
    @Override
    public String toString() {
       return "\n--\nData: " + data.toString() + "\n" + "Valor do bonus: " + this.getBonus() + "\n--\n@splitHistorico";
    }
    
    // gets e sets
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double d) {
        this.bonus = d;
    }
}
