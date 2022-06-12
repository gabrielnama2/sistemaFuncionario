package projetos.sistema_funcionario.presenter;

import projetos.sistema_funcionario.view.TelaBuscarFuncionario;

public class TelaBuscarFuncionarioPresenter {
    private TelaBuscarFuncionario view; 
    
    public void show() {
       this.view.setVisible(true);
    }
    
    public TelaBuscarFuncionarioPresenter() {
        this.view = new TelaBuscarFuncionario();
        
        this.view.getCancelar().addActionListener((e) -> {
            this.view.setVisible(false);
            new TelaPrincipalPresenter();
        });
        
        this.view.getNovoCadastro().addActionListener((e) -> {
            new TelaManterFuncionarioPresenter();
        });
    }
}
