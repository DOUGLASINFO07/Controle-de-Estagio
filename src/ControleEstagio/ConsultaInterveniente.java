package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaInterveniente extends javax.swing.JFrame {
    
    Connection conn = null;
    TermoCompromisso fTermoObrigatorio = null;

    public ConsultaInterveniente() {
        initComponents();
    }
    
    public ConsultaInterveniente(Connection conn, TermoCompromisso fTermoObrigatorio, String Interveniente) {
        initComponents();
        
        this.conn = conn;
        this.fTermoObrigatorio = fTermoObrigatorio;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaInterv.getModel();

        while(TConsultaInterv.getRowCount()>0){
             m.removeRow(0);
        }

        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nomeFantasia, cnpj FROM empresa WHERE nomeFantasia LIKE '%"+Interveniente+"%' ORDER BY nomeFantasia");

            while(rs.next()){
                String NomeFantasia = rs.getString("nomeFantasia");
                String CNPJ = rs.getString("cnpj");

                m.addRow(new Object[] {NomeFantasia, CNPJ});
            }
            rs.close();
            
        }catch(SQLException e){
            System.out.println("Erro ao consultar Interveniente!\n"+e.getMessage());
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaInterv = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharAluno = new javax.swing.JButton();
        BSelecionarAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaInterv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Interveniente", "CNPJ"
            }
        ));
        TConsultaInterv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaIntervMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaInterv);

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Interveniente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BSelecionarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharAluno)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BFecharAluno)
                    .addComponent(BSelecionarAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void BSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarAlunoActionPerformed
        if(TConsultaInterv.getSelectedRowCount() == 1){

            String Interveniente = TConsultaInterv.getValueAt(TConsultaInterv.getSelectedRow(), 0).toString();
 
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empresa WHERE nomeFantasia like '%"+Interveniente+"%' ORDER BY nomefantasia");

                while(rs.next()){

        int codigo = rs.getInt("codigo");
        String RazaoSocial = rs.getString("razaosocial");
        String CNPJ = rs.getString("cnpj");
        String EndInterv = rs.getString("endereco");
        String NumEndInterv = rs.getString("numero");
        String BairroInterv = rs.getString("bairro");
        String CidadeInterv = rs.getString("cidade");
        String Estadointerv = rs.getString("uf");
        String CEPInterv = rs.getString("cep");    
        String TelInterv = rs.getString("telefone");
        String NomeRepInterv = rs.getString("representante");
        String CargoRepInterv = rs.getString("cargo");
        
        fTermoObrigatorio.interveniente = codigo;
        fTermoObrigatorio.TFNomeInterv.setText(RazaoSocial);
        fTermoObrigatorio.TFCNPJInterv.setText(CNPJ);
        fTermoObrigatorio.TFEndInterv.setText(EndInterv);
        fTermoObrigatorio.TFNumEndInterv.setText(NumEndInterv);
        fTermoObrigatorio.TFBairroInterv.setText(BairroInterv);
        fTermoObrigatorio.TFCidadeInterv.setText(CidadeInterv);
        fTermoObrigatorio.TFEstadoInterv.setText(Estadointerv);
        fTermoObrigatorio.TFCEPInterv.setText(CEPInterv);    
        fTermoObrigatorio.TFTelInterv.setText(TelInterv);
        fTermoObrigatorio.TFRepInterv.setText(NomeRepInterv);
        fTermoObrigatorio.TFCargoRepInterv.setText(CargoRepInterv);
        fTermoObrigatorio.TFRespInterv.setEditable(true);
        fTermoObrigatorio.TFCargoRespInterv.setEditable(true);

                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Interveniente!\n"+e.getMessage());
            }

            this.dispose();

        }
    }//GEN-LAST:event_BSelecionarAlunoActionPerformed

    private void TConsultaIntervMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaIntervMouseClicked
        
         if (evt.getClickCount() == 2) {
        
         if(TConsultaInterv.getSelectedRowCount() == 1){

            String Interveniente = TConsultaInterv.getValueAt(TConsultaInterv.getSelectedRow(), 0).toString();
 
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * "
                        + "FROM empresa "
                        + "WHERE nomeFantasia "
                        + "like '%"+Interveniente+"%' "
                        + "ORDER BY nomefantasia");

                while(rs.next()){

        int codigo = rs.getInt("codigo");
        String RazaoSocial = rs.getString("razaosocial");
        String CNPJ = rs.getString("cnpj");
        String EndInterv = rs.getString("endereco");
        String NumEndInterv = rs.getString("numero");
        String BairroInterv = rs.getString("bairro");
        String CidadeInterv = rs.getString("cidade");
        String Estadointerv = rs.getString("uf");
        String CEPInterv = rs.getString("cep");    
        String TelInterv = rs.getString("telefone");
        String NomeRepInterv = rs.getString("representante");
        String CargoRepInterv = rs.getString("cargo");
        
        //fTermoObrigatorio.interveniente.setText(codigo+"");
        fTermoObrigatorio.TFNomeInterv.setText(RazaoSocial);
        fTermoObrigatorio.TFCNPJInterv.setText(CNPJ);
        fTermoObrigatorio.TFEndInterv.setText(EndInterv);
        fTermoObrigatorio.TFNumEndInterv.setText(NumEndInterv);
        fTermoObrigatorio.TFBairroInterv.setText(BairroInterv);
        fTermoObrigatorio.TFCidadeInterv.setText(CidadeInterv);
        fTermoObrigatorio.TFEstadoInterv.setText(Estadointerv);
        fTermoObrigatorio.TFCEPInterv.setText(CEPInterv);    
        fTermoObrigatorio.TFTelInterv.setText(TelInterv);
        fTermoObrigatorio.TFRepInterv.setText(NomeRepInterv);
        fTermoObrigatorio.TFCargoRepInterv.setText(CargoRepInterv);
        fTermoObrigatorio.TFRespInterv.setEditable(true);
        fTermoObrigatorio.TFCargoRespInterv.setEditable(true);

                }
                rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Interveniente!\n"+e.getMessage());
            }

            this.dispose();

        }
         }
    }//GEN-LAST:event_TConsultaIntervMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaInterveniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaInterveniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaInterveniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaInterveniente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsultaInterveniente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarAluno;
    private javax.swing.JTable TConsultaInterv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
