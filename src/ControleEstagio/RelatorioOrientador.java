package ControleEstagio;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("serial")
public class RelatorioOrientador extends javax.swing.JFrame {

    private Connection conn = null;

    public RelatorioOrientador() {
        initComponents();
        
    }
    
    public RelatorioOrientador(Connection conn) {
        initComponents();
        
        this.conn = conn;             
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel26 = new javax.swing.JLabel();
        BLimparRelatorioAluno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFFiltroPorAluno = new javax.swing.JTextField();
        TFFiltroDataInicial = new javax.swing.JTextField();
        TFFiltroDataFinal = new javax.swing.JTextField();
        RBEstagioNaoConcluido = new javax.swing.JRadioButton();
        RBEstagioConcluido = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BBuscarDadoasRelatorioAluno = new javax.swing.JButton();
        BFecharRelatorioAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TRelatorioAluno = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        BImprimirRelatorioAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Verm_RELATORIO_ORIENTADOR.png"))); // NOI18N

        BLimparRelatorioAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparRelatorioAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparRelatorioAluno.setText("Limpar");
        BLimparRelatorioAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparRelatorioAlunoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FILTRO DE RELATÓRIO");

        TFFiltroPorAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFFiltroPorAlunoActionPerformed(evt);
            }
        });
        TFFiltroPorAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFFiltroPorAlunoKeyPressed(evt);
            }
        });

        TFFiltroDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFFiltroDataInicialActionPerformed(evt);
            }
        });
        TFFiltroDataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFFiltroDataInicialKeyPressed(evt);
            }
        });

        TFFiltroDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFFiltroDataFinalActionPerformed(evt);
            }
        });
        TFFiltroDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFFiltroDataFinalKeyPressed(evt);
            }
        });

        RBEstagioNaoConcluido.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        RBEstagioNaoConcluido.setText("Estágio Não Concluído");

        RBEstagioConcluido.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        RBEstagioConcluido.setText("Estágio Concluído");
        RBEstagioConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBEstagioConcluidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Professor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Período");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("Situação");

        BBuscarDadoasRelatorioAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarDadoasRelatorioAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BBuscarDadoasRelatorioAluno.setText("BUSCAR");
        BBuscarDadoasRelatorioAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDadoasRelatorioAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TFFiltroDataFinal))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(RBEstagioConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBEstagioNaoConcluido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(175, 175, 175)
                                .addComponent(BBuscarDadoasRelatorioAluno))
                            .addComponent(TFFiltroPorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFFiltroPorAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFFiltroDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFFiltroDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RBEstagioConcluido)
                            .addComponent(RBEstagioNaoConcluido)
                            .addComponent(jLabel6)))
                    .addComponent(BBuscarDadoasRelatorioAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        BFecharRelatorioAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharRelatorioAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharRelatorioAluno.setText("Sair");
        BFecharRelatorioAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharRelatorioAlunoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        TRelatorioAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estagiário", "Curso", "Concedente", "Numero TCE", "Data Inicio", "Data Termino", "Horas de estágio", "Horas Pendentes", "Situação do Estágio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TRelatorioAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRelatorioAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TRelatorioAluno);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RELATÓRIO");

        BImprimirRelatorioAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BImprimirRelatorioAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Printer-icon.png"))); // NOI18N
        BImprimirRelatorioAluno.setText("Imprimir");
        BImprimirRelatorioAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirRelatorioAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BFecharRelatorioAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BLimparRelatorioAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BImprimirRelatorioAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BImprimirRelatorioAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BLimparRelatorioAluno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BFecharRelatorioAluno))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BBuscarDadoasRelatorioAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDadoasRelatorioAlunoActionPerformed
   
                         
    }//GEN-LAST:event_BBuscarDadoasRelatorioAlunoActionPerformed

    private void BFecharRelatorioAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharRelatorioAlunoActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharRelatorioAlunoActionPerformed

    private void BLimparRelatorioAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparRelatorioAlunoActionPerformed

       
           
    }//GEN-LAST:event_BLimparRelatorioAlunoActionPerformed

    private void TFFiltroPorAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFiltroPorAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFiltroPorAlunoActionPerformed

    private void TFFiltroPorAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFFiltroPorAlunoKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){

        }
    }//GEN-LAST:event_TFFiltroPorAlunoKeyPressed

    private void TRelatorioAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRelatorioAlunoMouseClicked

        if (evt.getClickCount() == 2) {

        }
    }//GEN-LAST:event_TRelatorioAlunoMouseClicked

    private void RBEstagioConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBEstagioConcluidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBEstagioConcluidoActionPerformed

    private void TFFiltroDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFiltroDataInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFiltroDataInicialActionPerformed

    private void TFFiltroDataInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFFiltroDataInicialKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFiltroDataInicialKeyPressed

    private void TFFiltroDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFiltroDataFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFiltroDataFinalActionPerformed

    private void TFFiltroDataFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFFiltroDataFinalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFiltroDataFinalKeyPressed

    private void BImprimirRelatorioAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirRelatorioAlunoActionPerformed

  
    }//GEN-LAST:event_BImprimirRelatorioAlunoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioOrientador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelatorioOrientador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BBuscarDadoasRelatorioAluno;
    public javax.swing.JButton BFecharRelatorioAluno;
    public javax.swing.JButton BImprimirRelatorioAluno;
    public javax.swing.JButton BLimparRelatorioAluno;
    private javax.swing.JRadioButton RBEstagioConcluido;
    private javax.swing.JRadioButton RBEstagioNaoConcluido;
    public javax.swing.JTextField TFFiltroDataFinal;
    public javax.swing.JTextField TFFiltroDataInicial;
    public javax.swing.JTextField TFFiltroPorAluno;
    private javax.swing.JTable TRelatorioAluno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
