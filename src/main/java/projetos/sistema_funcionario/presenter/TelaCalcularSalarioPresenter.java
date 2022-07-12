package projetos.sistema_funcionario.presenter;

import projetos.sistema_funcionario.view.TelaCalcularSalario;

public class TelaCalcularSalarioPresenter {
    private TelaCalcularSalario view; 
    
    public void show() {
       this.view.setVisible(true);
    }
    
    public TelaCalcularSalarioPresenter() {
        this.view = new TelaCalcularSalario();
        
        this.view.getCancelar().addActionListener((e) -> {
            this.view.setVisible(false);
            new TelaPrincipalPresenter();
        });
    }
    
}
