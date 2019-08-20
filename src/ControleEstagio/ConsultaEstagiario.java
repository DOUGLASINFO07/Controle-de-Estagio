package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaEstagiario extends javax.swing.JFrame {
    
    Connection conn = null;
    TermoCompromisso fTermoCompromisso = null;

    public ConsultaEstagiario() {
        initComponents();
    }
    
     public ConsultaEstagiario(Connection conn, TermoCompromisso fTermoCompromisso, String Estagiario) {
        initComponents();
        
        this.conn = conn;
        this.fTermoCompromisso = fTermoCompromisso;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaEst.getModel();

        while(TConsultaEst.getRowCount()>0){
             m.removeRow(0);
        }
        
                try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome, cpf FROM aluno WHERE nome LIKE '%"+Estagiario+"%' ORDER BY nome");

            while(rs.next()){
                String NomeFantasia = rs.getString("nome");
                String CNPJ = rs.getString("cpf");

                m.addRow(new Object[] {NomeFantasia, CNPJ});
            }
            rs.close();
            
        }catch(SQLException e){
            System.out.println("Erro ao consultar Estagiário!\n"+e.getMessage());
        }

      
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaEst = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharAluno = new javax.swing.JButton();
        BSelecionarAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaEst.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estagiário", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaEstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaEst);

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Estagiário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 331, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        BFecharAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharAluno.setText("Voltar");
        BFecharAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharAlunoActionPerformed(evt);
            }
        });

        BSelecionarAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarAluno.setText("Selecionar");
        BSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(BSelecionarAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BFecharAluno))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSelecionarAluno)
                    .addComponent(BFecharAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void BSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarAlunoActionPerformed
  if(TConsultaEst.getSelectedRowCount() == 1){

            String Estagiario = fTermoCompromisso.TFNomeEst.getText();
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE nome like '%"+Estagiario+"%' ORDER BY nome");

                while(rs.next()){
                    
        String NomeEst = rs.getString("nome");
        String CPFEst = rs.getString("cpf");
        String DataNasc = rs.getString("dtNasc");
        String Endereco = rs.getString("endereco");
        String NumEndEst = rs.getString("numEnd");
        String BairroEst = rs.getString("bairro");
        String CidadeEst = rs.getString("cidade");
        String EstadoEst = rs.getString("estado");
        String CEPEst = rs.getString("cep");    
        String TelEst = rs.getString("telResidencial");
        String CursoEst = rs.getString("CursoAluno");
        String EmailEst = rs.getString("Email");
        String AnoIngresso = rs.getString("AnoIngresso");
        String SemIngresso = rs.getString("SemestreIngresso");
        
              
        fTermoCompromisso.TFNomeEst.setText(NomeEst);
        fTermoCompromisso.TFCPFEst.setText(CPFEst);
        fTermoCompromisso.TFDataNascEst.setText(DataNasc);
        fTermoCompromisso.TFEndEst.setText(Endereco);
        fTermoCompromisso.TFNumEndEst.setText(NumEndEst);
        fTermoCompromisso.TFBairroEst.setText(BairroEst);
        fTermoCompromisso.TFCidadeEst.setText(CidadeEst);
        fTermoCompromisso.TFEstadoEst.setText(EstadoEst);
        fTermoCompromisso.TFCEPEst.setText(CEPEst);    
        fTermoCompromisso.TFTelEst.setText(TelEst);
        fTermoCompromisso.TFCursoEst.setText(CursoEst);
        fTermoCompromisso.TFEmailEst.setText(EmailEst);
        fTermoCompromisso.TFAnoEngresso.setText(AnoIngresso);
        fTermoCompromisso.TFSemestreEngresso.setText(SemIngresso );
        
                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Estagiário\n"+e.getMessage());
            }

            this.dispose();

        }
    }//GEN-LAST:event_BSelecionarAlunoActionPerformed

    private void TConsultaEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaEstMouseClicked
  
         if (evt.getClickCount() == 2) {
        
          if(TConsultaEst.getSelectedRowCount() == 1){

            String Estagiario = fTermoCompromisso.TFNomeEst.getText();
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE nome like '%"+Estagiario+"%' ORDER BY nome");

                while(rs.next()){
                    
        String NomeEst = rs.getString("nome");
        String CPFEst = rs.getString("cpf");
        String DataNasc = rs.getString("dtNasc");
        String Endereco = rs.getString("endereco");
        String NumEndEst = rs.getString("numEnd");
        String BairroEst = rs.getString("bairro");
        String CidadeEst = rs.getString("cidade");
        String EstadoEst = rs.getString("estado");
        String CEPEst = rs.getString("cep");    
        String TelEst = rs.getString("telResidencial");
        String CursoEst = rs.getString("CursoAluno");
        String EmailEst = rs.getString("Email");
        String AnoIngresso = rs.getString("AnoIngresso");
        String SemIngresso = rs.getString("SemestreIngresso");
        
              
        fTermoCompromisso.TFNomeEst.setText(NomeEst);
        fTermoCompromisso.TFCPFEst.setText(CPFEst);
        fTermoCompromisso.TFDataNascEst.setText(DataNasc);
        fTermoCompromisso.TFEndEst.setText(Endereco);
        fTermoCompromisso.TFNumEndEst.setText(NumEndEst);
        fTermoCompromisso.TFBairroEst.setText(BairroEst);
        fTermoCompromisso.TFCidadeEst.setText(CidadeEst);
        fTermoCompromisso.TFEstadoEst.setText(EstadoEst);
        fTermoCompromisso.TFCEPEst.setText(CEPEst);    
        fTermoCompromisso.TFTelEst.setText(TelEst);
        fTermoCompromisso.TFCursoEst.setText(CursoEst);
        fTermoCompromisso.TFEmailEst.setText(EmailEst);
        fTermoCompromisso.TFAnoEngresso.setText(AnoIngresso);
        fTermoCompromisso.TFSemestreEngresso.setText(SemIngresso );
        
                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Estagiário\n"+e.getMessage());
            }

            this.dispose();

        }    
         }
    }//GEN-LAST:event_TConsultaEstMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEstagiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaEstagiario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarAluno;
    private javax.swing.JTable TConsultaEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
