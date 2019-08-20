package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaControle extends javax.swing.JFrame {
    
    Connection conn;
    Controle fControle;

    public ConsultaControle() {
        initComponents();
    }
    
    public ConsultaControle(Connection conn, Controle fControle, String pesquisa) {
        initComponents();
        
        this.conn = conn;
        this.fControle = fControle;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaControle.getModel();

        while(TConsultaControle.getRowCount()>0){
             m.removeRow(0);
        }
        
         try{
             
           if (pesquisa == "Nome Estagiário")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT NomeAluno,  "
                    + "NumeroTCE,  "
                    + "Concedente "
                    + "FROM Controle "
                    + "WHERE  NomeAluno "
                    + "LIKE '%"+pesquisa+"%' "
                    + "ORDER BY NomeAluno");

            while(rs.next()){
                String NomeAluno = rs.getString("NomeAluno");
                String NumeroTCE = rs.getString("NumeroTCE");
                String Concedente = rs.getString("Concedente");
                
                m.addRow(new Object[] {NomeAluno, NumeroTCE, Concedente});
            }
            rs.close();
            }
           
           if (pesquisa == "Número TCE")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT NomeAluno,  "
                    + "NumeroTCE,  "
                    + "Concedente "
                    + "FROM Controle "
                    + "WHERE  NomeAluno "
                    + "LIKE '%"+pesquisa+"%' "
                    + "ORDER BY NomeAluno");

            while(rs.next()){
                String NomeAluno = rs.getString("NomeAluno");
                String NumeroTCE = rs.getString("NumeroTCE");
                String Concedente = rs.getString("Concedente");
                
                m.addRow(new Object[] {NomeAluno, NumeroTCE, Concedente});
            }
            rs.close();
            }
           
        }catch(SQLException e){
            System.out.println("Erro ao consultar Controle!\n"+e.getMessage());
           
        }
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaControle = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharConsultaControle = new javax.swing.JButton();
        BSelecionarControle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaControle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Estagiário", "Número TCE", "Concedente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaControleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaControle);
        if (TConsultaControle.getColumnModel().getColumnCount() > 0) {
            TConsultaControle.getColumnModel().getColumn(0).setResizable(false);
            TConsultaControle.getColumnModel().getColumn(1).setResizable(false);
            TConsultaControle.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Controle");

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

        BFecharConsultaControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharConsultaControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharConsultaControle.setText("Voltar");
        BFecharConsultaControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharConsultaControleActionPerformed(evt);
            }
        });

        BSelecionarControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarControle.setText("Selecionar");
        BSelecionarControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarControleActionPerformed(evt);
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
                        .addComponent(BSelecionarControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharConsultaControle))
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
                    .addComponent(BSelecionarControle)
                    .addComponent(BFecharConsultaControle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharConsultaControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharConsultaControleActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharConsultaControleActionPerformed

    private void BSelecionarControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarControleActionPerformed
       
        
        if(TConsultaControle.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaControle.getValueAt(TConsultaControle.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM controle WHERE NomeAluno LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        String NomeAluno = rs.getString("NomeAluno");
        String NumTCE = rs.getString("NumeroTCE");
        String Curso = rs.getString("Curso");
        String Semestre = rs.getString("Semestre");
        String Ano = rs.getString("Ano");
        String Concedente = rs.getString("Concedente");
        String DataInicioEstagio = rs.getString("DataInicio");
        String DataTerminoEstagio = rs.getString("DataTermino");
        String HorasEstagio = rs.getString("HoraEstagio");
        String HorasestagioConcluido = rs.getString("HoraConcluida");
        String HoraEstagioPendente = rs.getString("HoraPendente"); 
        String ProfessorOrientador = rs.getString("ProfessorOrientador");
        String TipoEstagio = rs.getString("TipoEstagio");
        String DeclaracaoNormal = rs.getString("DeclaracaoEstNormal");
        String FrequanciaNormal = rs.getString("FrequenciaEstNormal");
        String AvaliacaoNormal = rs.getString("AvaliacaoEstNormal");
        String TCENormal = rs.getString("TCEEstNormal");
        String RelatorioNormal = rs.getString("RelatorioEstNormal");
        String TCEEmprego = rs.getString("TCEEstNormal");
        String DeclaracaoEmprego = rs.getString("DeclaracaoEmprego");
        String FrequenciaEmprego = rs.getString("FrequenciaEmprego");
        String AvaliacaoEmprego = rs.getString("AvaliacaoEmprego");
        String RelatorioEmprego = rs.getString("RelatorioEmprego");
        String CarteiraTrabalho = rs.getString("CopiaCarteira");
        String RealizadonoIFSul = rs.getString("RealizadnoIFSul");
        int CodControle = rs.getInt("codigo");
                    
        fControle.TFProfessorOrientador.setText(""+CodControle);
        fControle.TFNomeAluno.setText(NomeAluno);
        fControle.TFNumeroTCE.setText(NumTCE);
        fControle.TFCurso.setText(Curso);
        fControle.TFSemestre.setText(Semestre);
        fControle.TFAno.setText(Ano);
        fControle.TFConcedente.setText(Concedente);
        fControle.TFInicioEstagio.setText(DataInicioEstagio);
        fControle.TFTerminoEstagio.setText(DataTerminoEstagio);
        fControle.TFHorasEstagio.setText(HorasEstagio);
        fControle.TFHorasEstagioConcluidas.setText(HorasestagioConcluido);
        fControle.TFHorasEstagioPendentes.setText(HoraEstagioPendente);    
        fControle.TFProfessorOrientador.setText(ProfessorOrientador);
        if(TipoEstagio.equals("Estágio Normal"))
            fControle.RBEstagioNormal.setSelected(true);
        else
            fControle.RBestagioEmprego.setSelected(true);
        
        if(DeclaracaoNormal.equals("OK"))
            fControle.RBDeclaracaoNormal.setSelected(true);
        else
            fControle.RBDeclaracaoNormal.setSelected(false);
        
        if(FrequanciaNormal.equals("OK"))
            fControle.RBFrequenciaNormal.setSelected(true);
        else
            fControle.RBFrequenciaNormal.setSelected(false);
        
        if(AvaliacaoNormal.equals("OK"))
            fControle.RBAvaliacaoSupervisorNormal.setSelected(true);
        else
            fControle.RBAvaliacaoSupervisorNormal.setSelected(false);
        
        if(TCENormal.equals("OK"))
            fControle.RBTCENormal1.setSelected(true);
        else
            fControle.RBTCENormal1.setSelected(false);
        
        if(RelatorioNormal.equals("OK"))
            fControle.RBRelatorioNormal.setSelected(true);
        else
            fControle.RBRelatorioNormal.setSelected(false);
        
        if(TCEEmprego.equals("OK"))
            fControle.RBTCEEmprego.setSelected(true);
        else
            fControle.RBTCEEmprego.setSelected(false);
        
        if(DeclaracaoEmprego.equals("OK"))
            fControle.RBDeclaracaoAtribuicaoEmprego.setSelected(true);
        else
            fControle.RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        
        if(FrequenciaEmprego.equals("OK"))
            fControle.RBFrequenciaEmprego.setSelected(true);
        else
            fControle.RBFrequenciaEmprego.setSelected(false);
        
        if(AvaliacaoEmprego.equals("OK"))
            fControle.RBAvaliacaoEmprego.setSelected(true);
        else
            fControle.RBAvaliacaoEmprego.setSelected(false);
        
         if(RelatorioEmprego.equals("OK"))
            fControle.RBRelatorioEmprego.setSelected(true);
        else
            fControle.RBRelatorioEmprego.setSelected(false);
         
          if(CarteiraTrabalho.equals("OK"))
            fControle.RBCarteiraEmprego.setSelected(true);
        else
            fControle.RBCarteiraEmprego.setSelected(false);
          
           if(RealizadonoIFSul.equals("Sim"))
            fControle.RBSim.setSelected(true);
        else
            fControle.RBNao.setSelected(true);
                     
                }
               rs.close();
               
        fControle.BAtualizarControle.setEnabled(true);
         fControle.BCadastrarControle.setEnabled(false);
          fControle.BExcluirControle.setEnabled(true);
           fControle.BLimparControle.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
        } 
    }//GEN-LAST:event_BSelecionarControleActionPerformed

    private void TConsultaControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaControleMouseClicked
 
        if (evt.getClickCount() == 2) {

              if(TConsultaControle.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaControle.getValueAt(TConsultaControle.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM controle WHERE NomeAluno LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        String NomeAluno = rs.getString("NomeAluno");
        String NumTCE = rs.getString("NumeroTCE");
        String Curso = rs.getString("Curso");
        String Semestre = rs.getString("Semestre");
        String Ano = rs.getString("Ano");
        String Concedente = rs.getString("Concedente");
        String DataInicioEstagio = rs.getString("DataInicio");
        String DataTerminoEstagio = rs.getString("DataTermino");
        String HorasEstagio = rs.getString("HoraEstagio");
        String HorasestagioConcluido = rs.getString("HoraConcluida");
        String HoraEstagioPendente = rs.getString("HoraPendente"); 
        String ProfessorOrientador = rs.getString("ProfessorOrientador");
        String TipoEstagio = rs.getString("TipoEstagio");
        String DeclaracaoNormal = rs.getString("DeclaracaoEstNormal");
        String FrequanciaNormal = rs.getString("FrequenciaEstNormal");
        String AvaliacaoNormal = rs.getString("AvaliacaoEstNormal");
        String TCENormal = rs.getString("TCEEstNormal");
        String RelatorioNormal = rs.getString("RelatorioEstNormal");
        String TCEEmprego = rs.getString("TCEEstNormal");
        String DeclaracaoEmprego = rs.getString("DeclaracaoEmprego");
        String FrequenciaEmprego = rs.getString("FrequenciaEmprego");
        String AvaliacaoEmprego = rs.getString("AvaliacaoEmprego");
        String RelatorioEmprego = rs.getString("RelatorioEmprego");
        String CarteiraTrabalho = rs.getString("CopiaCarteira");
        String RealizadonoIFSul = rs.getString("RealizadnoIFSul");
        int CodControle = rs.getInt("codigo");
                    
        fControle.TFProfessorOrientador.setText(""+CodControle);
        fControle.TFNomeAluno.setText(NomeAluno);
        fControle.TFNumeroTCE.setText(NumTCE);
        fControle.TFCurso.setText(Curso);
        fControle.TFSemestre.setText(Semestre);
        fControle.TFAno.setText(Ano);
        fControle.TFConcedente.setText(Concedente);
        fControle.TFInicioEstagio.setText(DataInicioEstagio);
        fControle.TFTerminoEstagio.setText(DataTerminoEstagio);
        fControle.TFHorasEstagio.setText(HorasEstagio);
        fControle.TFHorasEstagioConcluidas.setText(HorasestagioConcluido);
        fControle.TFHorasEstagioPendentes.setText(HoraEstagioPendente);    
        fControle.TFProfessorOrientador.setText(ProfessorOrientador);
        if(TipoEstagio.equals("Estágio Normal"))
            fControle.RBEstagioNormal.setSelected(true);
        else
            fControle.RBestagioEmprego.setSelected(true);
        
        if(DeclaracaoNormal.equals("OK"))
            fControle.RBDeclaracaoNormal.setSelected(true);
        else
            fControle.RBDeclaracaoNormal.setSelected(false);
        
        if(FrequanciaNormal.equals("OK"))
            fControle.RBFrequenciaNormal.setSelected(true);
        else
            fControle.RBFrequenciaNormal.setSelected(false);
        
        if(AvaliacaoNormal.equals("OK"))
            fControle.RBAvaliacaoSupervisorNormal.setSelected(true);
        else
            fControle.RBAvaliacaoSupervisorNormal.setSelected(false);
        
        if(TCENormal.equals("OK"))
            fControle.RBTCENormal1.setSelected(true);
        else
            fControle.RBTCENormal1.setSelected(false);
        
        if(RelatorioNormal.equals("OK"))
            fControle.RBRelatorioNormal.setSelected(true);
        else
            fControle.RBRelatorioNormal.setSelected(false);
        
        if(TCEEmprego.equals("OK"))
            fControle.RBTCEEmprego.setSelected(true);
        else
            fControle.RBTCEEmprego.setSelected(false);
        
        if(DeclaracaoEmprego.equals("OK"))
            fControle.RBDeclaracaoAtribuicaoEmprego.setSelected(true);
        else
            fControle.RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        
        if(FrequenciaEmprego.equals("OK"))
            fControle.RBFrequenciaEmprego.setSelected(true);
        else
            fControle.RBFrequenciaEmprego.setSelected(false);
        
        if(AvaliacaoEmprego.equals("OK"))
            fControle.RBAvaliacaoEmprego.setSelected(true);
        else
            fControle.RBAvaliacaoEmprego.setSelected(false);
        
         if(RelatorioEmprego.equals("OK"))
            fControle.RBRelatorioEmprego.setSelected(true);
        else
            fControle.RBRelatorioEmprego.setSelected(false);
         
          if(CarteiraTrabalho.equals("OK"))
            fControle.RBCarteiraEmprego.setSelected(true);
        else
            fControle.RBCarteiraEmprego.setSelected(false);
          
           if(RealizadonoIFSul.equals("Sim"))
            fControle.RBSim.setSelected(true);
        else
            fControle.RBNao.setSelected(true);
                     
                }
               rs.close();
               
        fControle.BAtualizarControle.setEnabled(true);
         fControle.BCadastrarControle.setEnabled(false);
          fControle.BExcluirControle.setEnabled(true);
           fControle.BLimparControle.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
        }  
        
        }  
        
    }//GEN-LAST:event_TConsultaControleMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaControle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharConsultaControle;
    private javax.swing.JButton BSelecionarControle;
    private javax.swing.JTable TConsultaControle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
