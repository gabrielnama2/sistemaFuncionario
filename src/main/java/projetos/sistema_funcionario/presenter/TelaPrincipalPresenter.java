package projetos.sistema_funcionario.presenter;

import projetos.sistema_funcionario.view.TelaPrincipal;

public class TelaPrincipalPresenter {
    private TelaPrincipal view; 
    
    public TelaPrincipalPresenter() {
        this.view = new TelaPrincipal();
        
        this.view.getBotaoAcessarFuncionarios().addActionListener((e) -> {
            this.view.setVisible(false);
            
            new TelaBuscarFuncionarioPresenter().show();
        });
        
        this.view.getBotaoAcessarSalarios().addActionListener((e) -> {
            this.view.setVisible(false);
            
            new TelaCalcularSalarioPresenter().show();
        });
        
        this.view.setVisible(true);
    }
}
