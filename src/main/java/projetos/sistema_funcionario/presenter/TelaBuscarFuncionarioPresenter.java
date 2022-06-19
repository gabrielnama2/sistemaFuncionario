package projetos.sistema_funcionario.presenter;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projetos.sistema_funcionario.model.Funcionario;
import projetos.sistema_funcionario.model.FuncionarioCollection;
import projetos.sistema_funcionario.view.TelaBuscarFuncionario;

public class TelaBuscarFuncionarioPresenter {
    private static final Logger LOGGER = LoggerFactory.getLogger(FuncionarioCollection.class);

    private JTable tabela;
    private TelaBuscarFuncionario view; 

    public TelaBuscarFuncionarioPresenter() {
        this.view = new TelaBuscarFuncionario();
        this.tabela = this.view.getTabelaFuncionarios();
        this.atualizaTabela();
        
        this.view.getBotaoBuscarFuncionario().addActionListener((e) -> {
            this.pesquisar();
        });
        
        this.view.getCancelar().addActionListener((e) -> {
            this.view.setVisible(false);
            new TelaPrincipalPresenter();
        });
        
        this.view.getNovoCadastro().addActionListener((e) -> {
            new TelaManterFuncionarioPresenter(this);
        });
    }
    
    public void show() {
       this.view.setVisible(true);
    }
    
    private void pesquisar() {
        if(this.view.getValorPesquisa().isEmpty()) {
            atualizaTabela();
            return;
        } 
        
        try {
            DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
            modelo.setNumRows(0);

            for(Funcionario func: new FuncionarioCollection().getFuncionariosByName(this.view.getValorPesquisa())) {
                modelo.addRow(new Object[]{
                    func.getNome(),
                    func.getIdade(),
                    func.getCargo(),
                    String.format("%.2f", func.getSalario().getSalarioBase())
                });
            }
        } catch(RuntimeException e) {
            LOGGER.info("Erro ao atualizar tabela: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela: " + e);
        }
    }
    
    public void atualizaTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) this.tabela.getModel();
            modelo.setNumRows(0);

            int id = 0;
            for(Funcionario func: new FuncionarioCollection().getFuncionarios()) {
                System.out.println(func.toString());
                id += 1;
                modelo.addRow(new Object[]{
                    Integer.toString(id),
                    func.getNome(),
                    func.getCargo(),
                    func.getIdade(),
                    func.getSalario().getFaltas(),
                    func.getSalario().getFuncionarioDoMes(),
                    Integer.toString(func.getSalario().getTempoServico()) + " meses",
                    "R$ " + String.format("%.2f", func.getSalario().getSalarioBase())
                });
            }
        } catch(RuntimeException e) {
            LOGGER.info("Erro ao atualizar tabela: " + e);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela: " + e);
        }
    }
}
