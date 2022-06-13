package projetos.sistema_funcionario.view;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import projetos.sistema_funcionario.model.Funcionario;
import projetos.sistema_funcionario.model.FuncionarioCollection;

public class TelaBuscarFuncionario extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    
    public TelaBuscarFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBuscarFuncionario = new javax.swing.JPanel();
        tituloJanela = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        campoTextoNome = new javax.swing.JTextField();
        botaoBuscarFuncionario = new javax.swing.JButton();
        tituloJanela1 = new javax.swing.JLabel();
        botaoCancelar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jNovoCadastro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter funcionários");

        tituloJanela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela.setText("BUSCA DE FUNCIONÁRIOS");

        labelNome.setText("Nome:");

        campoTextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoNomeActionPerformed(evt);
            }
        });

        botaoBuscarFuncionario.setText("Buscar");
        botaoBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarFuncionarioActionPerformed(evt);
            }
        });

        tituloJanela1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela1.setText("Funcionários:");

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        jNovoCadastro.setText("Novo ");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabela);

        javax.swing.GroupLayout painelBuscarFuncionarioLayout = new javax.swing.GroupLayout(painelBuscarFuncionario);
        painelBuscarFuncionario.setLayout(painelBuscarFuncionarioLayout);
        painelBuscarFuncionarioLayout.setHorizontalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarFuncionarioLayout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(tituloJanela))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(225, 225, 225)
                        .addComponent(botaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jNovoCadastro))
                    .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                            .addComponent(labelNome)
                            .addGap(18, 18, 18)
                            .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(botaoBuscarFuncionario)))
                    .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(tituloJanela1)))
                .addGap(212, 212, 212))
        );
        painelBuscarFuncionarioLayout.setVerticalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloJanela)
                .addGap(38, 38, 38)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(campoTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscarFuncionario))
                .addGap(21, 21, 21)
                .addComponent(tituloJanela1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoEditar)
                    .addComponent(jNovoCadastro))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(painelBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoBuscarFuncionarioActionPerformed

    private void campoTextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTextoNomeActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscarFuncionario().setVisible(true);
            }
        });
    }
    
    public DefaultTableModel getTableModel() {
        return this.tableModel;
    }
    
    public JButton getCancelar() {
        return botaoCancelar;
    }
    
    public JButton getNovoCadastro() {
        return jNovoCadastro;
    }
    
    public JTable getTabela() {
        return this.Tabela;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton botaoBuscarFuncionario;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JTextField campoTextoNome;
    private javax.swing.JButton jNovoCadastro;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelBuscarFuncionario;
    private javax.swing.JLabel tituloJanela;
    private javax.swing.JLabel tituloJanela1;
    // End of variables declaration//GEN-END:variables
}
