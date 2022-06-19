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
        valorPesquisa = new javax.swing.JTextField();
        botaoBuscarFuncionario = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoEditar = new javax.swing.JButton();
        jNovoCadastro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manter funcionários");

        tituloJanela.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tituloJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloJanela.setText("BUSCA DE FUNCIONÁRIOS");

        labelNome.setText("Nome:");

        valorPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorPesquisaActionPerformed(evt);
            }
        });

        botaoBuscarFuncionario.setText("Buscar");
        botaoBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarFuncionarioActionPerformed(evt);
            }
        });

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

        TabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cargo", "Idade", "Faltas", "Funcionário do Mês", "Tempo de serviço", "Tipo de bônus", "Salário base"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaFuncionarios);
        if (TabelaFuncionarios.getColumnModel().getColumnCount() > 0) {
            TabelaFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(20);
            TabelaFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(20);
            TabelaFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(20);
            TabelaFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(20);
            TabelaFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(100);
            TabelaFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(100);
            TabelaFuncionarios.getColumnModel().getColumn(7).setPreferredWidth(100);
            TabelaFuncionarios.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        javax.swing.GroupLayout painelBuscarFuncionarioLayout = new javax.swing.GroupLayout(painelBuscarFuncionario);
        painelBuscarFuncionario.setLayout(painelBuscarFuncionarioLayout);
        painelBuscarFuncionarioLayout.setHorizontalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarFuncionarioLayout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(tituloJanela))
                            .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addGap(18, 18, 18)
                                .addComponent(valorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(botaoBuscarFuncionario)))
                        .addGap(301, 301, 301))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBuscarFuncionarioLayout.createSequentialGroup()
                        .addComponent(botaoCancelar)
                        .addGap(225, 225, 225)
                        .addComponent(botaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jNovoCadastro)
                        .addGap(311, 311, 311))))
        );
        painelBuscarFuncionarioLayout.setVerticalGroup(
            painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBuscarFuncionarioLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(tituloJanela)
                .addGap(38, 38, 38)
                .addGroup(painelBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(valorPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscarFuncionario))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(painelBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoBuscarFuncionarioActionPerformed

    private void valorPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPesquisaActionPerformed

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
    
    public JTable getTabelaFuncionarios() {
        return this.TabelaFuncionarios;
    }
    
    public String getValorPesquisa() {
        return this.valorPesquisa.getText();
    }
    
    public JButton getBotaoBuscarFuncionario() {
        return this.botaoBuscarFuncionario;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaFuncionarios;
    private javax.swing.JButton botaoBuscarFuncionario;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton jNovoCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JPanel painelBuscarFuncionario;
    private javax.swing.JLabel tituloJanela;
    private javax.swing.JTextField valorPesquisa;
    // End of variables declaration//GEN-END:variables
}
