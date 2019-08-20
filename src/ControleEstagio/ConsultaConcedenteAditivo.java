package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaConcedenteAditivo extends javax.swing.JFrame {
    
    Connection conn = null;
    TermoAditivo fTermoAditivo = null;

    public ConsultaConcedenteAditivo() {
        initComponents();
    }
    
     public ConsultaConcedenteAditivo(Connection conn, TermoAditivo fTermoAditivo, String Concedente) {
        initComponents();
        
        this.conn = conn;
        this.fTermoAditivo = fTermoAditivo;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaConc.getModel();

        while(TConsultaConc.getRowCount()>0){
             m.removeRow(0);
        }
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nomeFantasia, cnpj FROM empresa WHERE nomeFantasia LIKE '%"+Concedente+"%' ORDER BY nomeFantasia");

            while(rs.next()){
                String NomeFantasia = rs.getString("nomeFantasia");
                String CNPJ = rs.getString("cnpj");

                m.addRow(new Object[] {NomeFantasia, CNPJ});
            }
            rs.close();
            
        }catch(SQLException e){
            System.out.println("Erro ao consultar Concedente!\n"+e.getMessage());
        }
        
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaConc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BSelecionarAluno = new javax.swing.JButton();
        BFecharAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaConc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Concedente", "CNPJ"
            }
        ));
        TConsultaConc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaConcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaConc);

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Concedente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 434, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        BSelecionarAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarAluno.setText("Selecionar");
        BSelecionarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarAlunoActionPerformed(evt);
            }
        });

        BFecharAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharAluno.setText("Voltar");
        BFecharAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharAlunoActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BSelecionarAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BFecharAluno))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BSelecionarAluno)
                    .addComponent(BFecharAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarAlunoActionPerformed

        if(TConsultaConc.getSelectedRowCount() == 1){

            String nomeSelecionado = TConsultaConc.getValueAt(TConsultaConc.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empresa WHERE cnpj like '%"+nomeSelecionado+"%'");

                while(rs.next()){

                    String NomeConc = rs.getString("razaosocial");
                    String RepConc = rs.getString("representante");
                    String CPFRepConc = rs.getString("CPF");
                    String CargoConc = rs.getString("cargo");

                    fTermoAditivo.TFNomeConcAditivo.setText(NomeConc);
                    fTermoAditivo.TFRepConcAditivo.setText(RepConc);
                    fTermoAditivo.TFCPFRepConcAditivo.setText(CPFRepConc);
                    fTermoAditivo.TFCargoRepConcAditivo.setText(CargoConc);

                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Concedente!\n"+e.getMessage());
            }

            this.dispose();

        }
    }//GEN-LAST:event_BSelecionarAlunoActionPerformed

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void TConsultaConcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaConcMouseClicked

         if (evt.getClickCount() == 2) {
        
          if(TConsultaConc.getSelectedRowCount() == 1){

            String nomeSelecionado = TConsultaConc.getValueAt(TConsultaConc.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empresa WHERE cnpj like '%"+nomeSelecionado+"%'");

                while(rs.next()){

                    String NomeConc = rs.getString("razaosocial");
                    String RepConc = rs.getString("representante");
                    String CPFRepConc = rs.getString("CPF");
                    String CargoConc = rs.getString("cargo");

                    fTermoAditivo.TFNomeConcAditivo.setText(NomeConc);
                    fTermoAditivo.TFRepConcAditivo.setText(RepConc);
                    fTermoAditivo.TFCPFRepConcAditivo.setText(CPFRepConc);
                    fTermoAditivo.TFCargoRepConcAditivo.setText(CargoConc);

                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Concedente!\n"+e.getMessage());
            }

            this.dispose();

        }
         }     
    }//GEN-LAST:event_TConsultaConcMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaConcedenteAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaConcedenteAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaConcedenteAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaConcedenteAditivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaConcedenteAditivo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarAluno;
    private javax.swing.JTable TConsultaConc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
