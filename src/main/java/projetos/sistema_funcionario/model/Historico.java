package projetos.sistema_funcionario.model;
import java.time.LocalDate; 

// HistoricoCollection
public class Historico {
    private LocalDate data;
    private double bonus;
    
    public Historico(double bonusAbsoluto) {
        this.setBonus(bonusAbsoluto);
        this.setData(LocalDate.now());
    }
    
    @Override
    public String toString() {
       return "Data: " + this.getData().getDayOfMonth() + "/" + this.getData().getMonthValue() + "/" + this.getData().getYear() + "\n" + "Valor do bonus: " + this.getBonus() + "\n";
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
