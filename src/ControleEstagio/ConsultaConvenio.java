package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaConvenio extends javax.swing.JFrame {
    
    Connection conn = null;
    Convenio fConvenio = null;

    public ConsultaConvenio() {
        initComponents();
    }
    
    public ConsultaConvenio(Connection conn, Convenio fConvenio, String pesquisa, String valor) {
        initComponents();
        
        this.conn = conn;
        this.fConvenio = fConvenio;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaConvenio.getModel();

        while(TConsultaConvenio.getRowCount()>0){
             m.removeRow(0);
        }
        
         try{
             
           if (pesquisa == "Razão Social")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT e.razaoSocial,  "
                    + "e.nomeFantasia,  "
                    + "e.cnpj "
                    + "FROM empresa e "
                    + "WHERE  e.Razaosocial "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY e.razaoSocial");

            while(rs.next()){
                String RazaoSocial = rs.getString("e.RazaoSocial");
                String NomeFantasia = rs.getString("e.NomeFantasia");
                String cnpj = rs.getString("e.cnpj");
                
                m.addRow(new Object[] {RazaoSocial, NomeFantasia, cnpj});
            }
            rs.close();
            }
           
           if (pesquisa == "Nome Fantasia")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT e.razaoSocial,  "
                    + "e.nomeFantasia,  "
                    + "e.cnpj "
                    + "FROM empresa e "
                    + "WHERE  e.nomeFantasia "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY e.nomeFantasia");

            while(rs.next()){
                String RazaoSocial = rs.getString("e.RazaoSocial");
                String NomeFantasia = rs.getString("e.NomeFantasia");
                String cnpj = rs.getString("e.cnpj");

                m.addRow(new Object[] {RazaoSocial, NomeFantasia, cnpj});
            }
            rs.close();
            }
           
        }catch(SQLException e){
            System.out.println("Erro ao consultar Convenio1!\n"+e.getMessage());
           
        }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaConvenio = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharAluno = new javax.swing.JButton();
        BSelecionarAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaConvenio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razão social", "Nome Fantasia", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaConvenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaConvenioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaConvenio);
        if (TConsultaConvenio.getColumnModel().getColumnCount() > 0) {
            TConsultaConvenio.getColumnModel().getColumn(0).setResizable(false);
            TConsultaConvenio.getColumnModel().getColumn(1).setResizable(false);
            TConsultaConvenio.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Convênio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 282, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BSelecionarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
        if(TConsultaConvenio.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaConvenio.getValueAt(TConsultaConvenio.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empresa WHERE razaoSocial LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

                    
                    String RazaoSocial = rs.getString("RazaoSocial");
                    String NomeFantasia = rs.getString("NomeFantasia");
                    String AreaAtuacao = rs.getString("AreaAtuacao");
                    String CNPJ = rs.getString("CNPJ");
                    String InscricaoEstadual = rs.getString("InsEstadual");
                    String EndConvenio = rs.getString("endereco");
                    String NumEndConvenio = rs.getString("Numero");
                    String BairroConvenio = rs.getString("Bairro");
                    String CidadeConvenio = rs.getString("Cidade");
                    String EstadoConvenio = rs.getString("UF");
                    String CEPConvenio = rs.getString("CEP");
                    String TelConvenio = rs.getString("Telefone");
                    String FaxConvenio = rs.getString("Fax");
                    String EmailConvenio = rs.getString("Email");
                    String EndCorrespConvenio = rs.getString("enderecocorresp");
                    String NumEndCorrespConvenio = rs.getString("NumCorresp");
                    String BairroCorrespConvenio = rs.getString("BairroCorresp");
                    String CEPCorrespConvenio = rs.getString("CEPCorresp");
                    String CidadeCorrespConvenio = rs.getString("CidadeCorresp");
                    String EstadoCorrespConvenio = rs.getString("UFCorresp");
                    String FaxCorrespConvenio = rs.getString("FaxCorresp");
                    String NomeRepConvenio = rs.getString("Representante");                    
                    String SexoRepConvenio = rs.getString("Sexo");
                    String CargoRepConvenio = rs.getString("Cargo");
                    String CPFRepConvenio = rs.getString("CPF");
                    String RGRepConvenio = rs.getString("RG");
                    String CelRepConvenio = rs.getString("Celular");
                    String TelRepConvenio = rs.getString("TelRepresentante");
                    String EndRepConvenio = rs.getString("EnderecoRep");
                    String NumEndRepConvenio = rs.getString("NumRep");
                    String BairroRepConvenio = rs.getString("BairroRep");                   
                    String CidadeRepConvenio = rs.getString("CidadeRep");
                    String CEPRepConvenio = rs.getString("CEPRep");
                    String EstadoRepConvenio = rs.getString("UFRep");
                    String FormacaoRepConvenio = rs.getString("formacao");
                    String EstCivilRepConvenio = rs.getString("EstadoCivil");
                    int CodConvenio = rs.getInt("codigo");

                    fConvenio.TFRazaoSocial.setText(RazaoSocial);
                    fConvenio.TFNomeFantasiaConvenio.setText(NomeFantasia);
                    fConvenio.TFAreaAtuacao.setText(AreaAtuacao);
                    fConvenio.TFCNPJConvenio.setText(CNPJ);
                    fConvenio.TFInscEstadualConvenio.setText(InscricaoEstadual);
                    fConvenio.TFEndConvenio.setText(EndConvenio);
                    fConvenio.TFNumEndConvenio.setText(NumEndConvenio);
                    fConvenio.TFBairroConvenio.setText(BairroConvenio);
                    fConvenio.TFCidadeConvenio.setText(CidadeConvenio);
                    fConvenio.CBEstadoConvenio.setSelectedItem(EstadoConvenio);
                    fConvenio.TFCEPConvenio.setText(CEPConvenio);
                    fConvenio.TFTelConvenio.setText(TelConvenio);
                    fConvenio.TFFaxConvenio.setText(FaxConvenio);
                    fConvenio.TFEmailConvenio.setText(EmailConvenio);
                    fConvenio.TFEndCorrespConvenio .setText(EndCorrespConvenio);
                    fConvenio.TFNumCorrespConvenio.setText(NumEndCorrespConvenio);
                    fConvenio.TFBairroCorrespConvenio.setText(BairroCorrespConvenio);
                    fConvenio.TFCEPCorrespConvenio.setText(CEPCorrespConvenio);
                    fConvenio.TFCidadeCorrespConvenio.setText(CidadeCorrespConvenio);
                    fConvenio.CBEstadoCorrespConvenio.setSelectedItem(EstadoCorrespConvenio);
                    fConvenio.TFFaxCorrespConvenio.setText(FaxCorrespConvenio);
                    fConvenio.TFNomeRepConvenio.setText(NomeRepConvenio);
                    if(SexoRepConvenio.equals("M"))
                        fConvenio.RBSexoMascRepConvenio.setSelected(true);
                    else
                        fConvenio.RBSexoFemRepConvenio.setSelected(true);
                    fConvenio.TFCargoRepConvenio.setText(CargoRepConvenio);
                    fConvenio.TFCPFRepConvenio.setText(CPFRepConvenio);
                    fConvenio.TFRGRepConvenio.setText(RGRepConvenio);
                    fConvenio.TFCelularRepConvenio.setText(CelRepConvenio);
                    fConvenio.TFTelRepConvenio.setText(TelRepConvenio);
                    fConvenio.TFEndRepConvenio.setText(EndRepConvenio);
                    fConvenio.TFNumEndRepConvenio.setText(NumEndRepConvenio);
                    fConvenio.TFBairroRepConvenio.setText(BairroRepConvenio);
                    fConvenio.TFCidadeRepConvenio.setText(CidadeRepConvenio);
                    fConvenio.TFCEPRepConvenio.setText(CEPRepConvenio);
                    fConvenio.CBEstadoRepConvenio.setSelectedItem(EstadoRepConvenio);
                    fConvenio.CBEstadoCivilRepConvenio.setSelectedItem(EstCivilRepConvenio);
                    fConvenio.TFFormacaoRepConvenio.setText(FormacaoRepConvenio);
                    fConvenio.TFCodigoConvenio.setText(CodConvenio+"");
                     
                }
               rs.close();
               
       fConvenio.TFPesqConvenio.setEnabled(false);
        fConvenio.BAtualizarConvenio.setEnabled(true);
         fConvenio.BCadastrarConvenio.setEnabled(false);
          fConvenio.BExcluirConvenio.setEnabled(true);
           fConvenio.BLimparConvenio.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
        } 
    }//GEN-LAST:event_BSelecionarAlunoActionPerformed

    private void TConsultaConvenioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaConvenioMouseClicked
 
        if (evt.getClickCount() == 2) {

        if(TConsultaConvenio.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaConvenio.getValueAt(TConsultaConvenio.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM empresa WHERE razaoSocial LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

                    String RazaoSocial = rs.getString("RazaoSocial");
                    String NomeFantasia = rs.getString("NomeFantasia");
                    String AreaAtuacao = rs.getString("AreaAtuacao");
                    String CNPJ = rs.getString("CNPJ");
                    String InscricaoEstadual = rs.getString("InsEstadual");
                    String EndConvenio = rs.getString("endereco");
                    String NumEndConvenio = rs.getString("Numero");
                    String BairroConvenio = rs.getString("Bairro");
                    String CidadeConvenio = rs.getString("Cidade");
                    String EstadoConvenio = rs.getString("UF");
                    String CEPConvenio = rs.getString("CEP");
                    String TelConvenio = rs.getString("Telefone");
                    String FaxConvenio = rs.getString("Fax");
                    String EmailConvenio = rs.getString("Email");
                    String EndCorrespConvenio = rs.getString("enderecocorresp");
                    String NumEndCorrespConvenio = rs.getString("NumCorresp");
                    String BairroCorrespConvenio = rs.getString("BairroCorresp");
                    String CEPCorrespConvenio = rs.getString("CEPCorresp");
                    String CidadeCorrespConvenio = rs.getString("CidadeCorresp");
                    String EstadoCorrespConvenio = rs.getString("UFCorresp");
                    String FaxCorrespConvenio = rs.getString("FaxCorresp");
                    String NomeRepConvenio = rs.getString("Representante");                    
                    String SexoRepConvenio = rs.getString("Sexo");
                    String CargoRepConvenio = rs.getString("Cargo");
                    String CPFRepConvenio = rs.getString("CPF");
                    String RGRepConvenio = rs.getString("RG");
                    String CelRepConvenio = rs.getString("Celular");
                    String TelRepConvenio = rs.getString("TelRepresentante");
                    String EndRepConvenio = rs.getString("EnderecoRep");
                    String NumEndRepConvenio = rs.getString("NumRep");
                    String BairroRepConvenio = rs.getString("BairroRep");                   
                    String CidadeRepConvenio = rs.getString("CidadeRep");
                    String CEPRepConvenio = rs.getString("CEPRep");
                    String EstadoRepConvenio = rs.getString("UFRep");
                    String FormacaoRepConvenio = rs.getString("formacao");
                    String EstCivilRepConvenio = rs.getString("EstadoCivil");
                    int CodConvenio = rs.getInt("codigo");

                    fConvenio.TFRazaoSocial.setText(RazaoSocial);
                    fConvenio.TFNomeFantasiaConvenio.setText(NomeFantasia);
                    fConvenio.TFAreaAtuacao.setText(AreaAtuacao);
                    fConvenio.TFCNPJConvenio.setText(CNPJ);
                    fConvenio.TFInscEstadualConvenio.setText(InscricaoEstadual);
                    fConvenio.TFEndConvenio.setText(EndConvenio);
                    fConvenio.TFNumEndConvenio.setText(NumEndConvenio);
                    fConvenio.TFBairroConvenio.setText(BairroConvenio);
                    fConvenio.TFCidadeConvenio.setText(CidadeConvenio);
                    fConvenio.CBEstadoConvenio.setSelectedItem(EstadoConvenio);
                    fConvenio.TFCEPConvenio.setText(CEPConvenio);
                    fConvenio.TFTelConvenio.setText(TelConvenio);
                    fConvenio.TFFaxConvenio.setText(FaxConvenio);
                    fConvenio.TFEmailConvenio.setText(EmailConvenio);
                    fConvenio.TFEndCorrespConvenio .setText(EndCorrespConvenio);
                    fConvenio.TFNumCorrespConvenio.setText(NumEndCorrespConvenio);
                    fConvenio.TFBairroCorrespConvenio.setText(BairroCorrespConvenio);
                    fConvenio.TFCEPCorrespConvenio.setText(CEPCorrespConvenio);
                    fConvenio.TFCidadeCorrespConvenio.setText(CidadeCorrespConvenio);
                    fConvenio.CBEstadoCorrespConvenio.setSelectedItem(EstadoCorrespConvenio);
                    fConvenio.TFFaxCorrespConvenio.setText(FaxCorrespConvenio);
                    fConvenio.TFNomeRepConvenio.setText(NomeRepConvenio);
                    if(SexoRepConvenio.equals("M"))
                        fConvenio.RBSexoMascRepConvenio.setSelected(true);
                    else
                        fConvenio.RBSexoFemRepConvenio.setSelected(true);
                    fConvenio.TFCargoRepConvenio.setText(CargoRepConvenio);
                    fConvenio.TFCPFRepConvenio.setText(CPFRepConvenio);
                    fConvenio.TFRGRepConvenio.setText(RGRepConvenio);
                    fConvenio.TFCelularRepConvenio.setText(CelRepConvenio);
                    fConvenio.TFTelRepConvenio.setText(TelRepConvenio);
                    fConvenio.TFEndRepConvenio.setText(EndRepConvenio);
                    fConvenio.TFNumEndRepConvenio.setText(NumEndRepConvenio);
                    fConvenio.TFBairroRepConvenio.setText(BairroRepConvenio);
                    fConvenio.TFCidadeRepConvenio.setText(CidadeRepConvenio);
                    fConvenio.TFCEPRepConvenio.setText(CEPRepConvenio);
                    fConvenio.CBEstadoRepConvenio.setSelectedItem(EstadoRepConvenio);
                    fConvenio.CBEstadoCivilRepConvenio.setSelectedItem(EstCivilRepConvenio);
                    fConvenio.TFFormacaoRepConvenio.setText(FormacaoRepConvenio);
                    fConvenio.TFCodigoConvenio.setText(CodConvenio+"");
                     
                }
               rs.close();
               
       fConvenio.TFPesqConvenio.setEnabled(false);
        fConvenio.BAtualizarConvenio.setEnabled(true);
         fConvenio.BCadastrarConvenio.setEnabled(false);
          fConvenio.BExcluirConvenio.setEnabled(true);
           fConvenio.BLimparConvenio.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
            }  
        
        }  
        
    }//GEN-LAST:event_TConsultaConvenioMouseClicked

    public static void main(String args[]) {
 
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
            java.util.logging.Logger.getLogger(ConsultaConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaConvenio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarAluno;
    private javax.swing.JTable TConsultaConvenio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
