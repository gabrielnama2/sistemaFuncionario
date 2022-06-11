/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetos.sistema_funcionario.view;

/**
 *
 * @author Gabriel Namã
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaManterFuncionario
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelManterFuncionario = new javax.swing.JPanel();
        tituloJanela = new javax.swing.JLabel();
        labelBoasVindas = new javax.swing.JLabel();
        labelFuncionario = new javax.swing.JLabel();
        labelSalarios = new javax.swing.JLabel();
        botaoAcessarFuncionarios = new javax.swing.JButton();
        botaoAcessarSalarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter funcionários");

        tituloJanela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela.setText("SISTEMA DE FUNCIONÁRIOS");

        labelBoasVindas.setText("Bem-vindo!");

        labelFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFuncionario.setText("Funcionários:");

        labelSalarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSalarios.setText("Salários");

        botaoAcessarFuncionarios.setText("Acessar");

        botaoAcessarSalarios.setText("Acessar");

        javax.swing.GroupLayout painelManterFuncionarioLayout = new javax.swing.GroupLayout(painelManterFuncionario);
        painelManterFuncionario.setLayout(painelManterFuncionarioLayout);
        painelManterFuncionarioLayout.setHorizontalGroup(
            painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelManterFuncionarioLayout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addGroup(painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFuncionario)
                    .addComponent(botaoAcessarFuncionarios))
                .addGap(129, 129, 129)
                .addGroup(painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoAcessarSalarios)
                    .addComponent(labelSalarios))
                .addGap(0, 291, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelManterFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelManterFuncionarioLayout.createSequentialGroup()
                        .addComponent(tituloJanela)
                        .addGap(339, 339, 339))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelManterFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelBoasVindas)
                        .addGap(406, 406, 406))))
        );
        painelManterFuncionarioLayout.setVerticalGroup(
            painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelManterFuncionarioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(tituloJanela)
                .addGap(55, 55, 55)
                .addComponent(labelBoasVindas)
                .addGap(71, 71, 71)
                .addGroup(painelManterFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelManterFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelFuncionario)
                        .addGap(30, 30, 30)
                        .addComponent(botaoAcessarFuncionarios))
                    .addGroup(painelManterFuncionarioLayout.createSequentialGroup()
                        .addComponent(labelSalarios)
                        .addGap(30, 30, 30)
                        .addComponent(botaoAcessarSalarios)))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelManterFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(painelManterFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAcessarFuncionarios;
    private javax.swing.JButton botaoAcessarSalarios;
    private javax.swing.JLabel labelBoasVindas;
    private javax.swing.JLabel labelFuncionario;
    private javax.swing.JLabel labelSalarios;
    private javax.swing.JPanel painelManterFuncionario;
    private javax.swing.JLabel tituloJanela;
    // End of variables declaration//GEN-END:variables
}
