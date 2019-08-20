package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class BuscaDadosControle extends javax.swing.JFrame {
    
    Connection conn = null;
    Controle fControle = null;

    public BuscaDadosControle() {
        initComponents();
    }
    
    public BuscaDadosControle(Connection conn, Controle fControle, String pesquisa, String NumeroTermo) {
        initComponents();
        
        this.conn = conn;
        this.fControle = fControle;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaDados.getModel();

        while(TConsultaDados.getRowCount()>0){
             m.removeRow(0);
        }
        
         try{            
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT Estagiario,  "
                    + "CursoEstag,  "
                    + "Concedente, "
                    + "NumTermo "
                    + "FROM TermoObrigatorio "
                    + "WHERE Estagiario "
                    + "LIKE '%"+pesquisa+"%' OR '%"+NumeroTermo+"%' "
                    + "ORDER BY Estagiario");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Curso = rs.getString("CursoEstag");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumTermo");
                
                m.addRow(new Object[] {Estagiario, Curso, Concedente, NumTermo});
            }
            rs.close();
            
                                  
        }catch(SQLException e){
            System.out.println("Erro ao consultar Controle!\n"+e.getMessage());
           
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaDados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharBuscarDados = new javax.swing.JButton();
        BSelecionarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Estagiário", "Curso", "Concedente", "Número do Termo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaDados);
        if (TConsultaDados.getColumnModel().getColumnCount() > 0) {
            TConsultaDados.getColumnModel().getColumn(0).setResizable(false);
            TConsultaDados.getColumnModel().getColumn(1).setResizable(false);
            TConsultaDados.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Dados Estagiário");

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

        BFecharBuscarDados.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharBuscarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharBuscarDados.setText("Voltar");
        BFecharBuscarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharBuscarDadosActionPerformed(evt);
            }
        });

        BSelecionarDados.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarDados.setText("Selecionar");
        BSelecionarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarDadosActionPerformed(evt);
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
                        .addComponent(BSelecionarDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharBuscarDados))
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
                    .addComponent(BSelecionarDados)
                    .addComponent(BFecharBuscarDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharBuscarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharBuscarDadosActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharBuscarDadosActionPerformed

    private void BSelecionarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarDadosActionPerformed
        if(TConsultaDados.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaDados.getValueAt(TConsultaDados.getSelectedRow(), 0).toString();
            String Curso = TConsultaDados.getValueAt(TConsultaDados.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM TermoObrigatorio WHERE Estagiario LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){
                   
                    String Estagiario = rs.getString("Estagiario");
                    String NumTermo = rs.getString("NumTermo");
                    String CursoEstag = rs.getString("CursoEstag");
                    String Concedente = rs.getString("Concedente");
                    
                    fControle.TFNomeAluno.setText(Estagiario);
                    fControle.TFNumeroTCE.setText(NumTermo);
                    fControle.TFCurso.setText(CursoEstag);
                    fControle.TFConcedente.setText(Concedente);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle1!\n"+e.getMessage());
            }
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Aluno WHERE nome LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){
                   
                    String Semestre = rs.getString("SemestreIngresso");
                    String Ano = rs.getString("AnoIngresso");
                    
                    fControle.TFSemestre.setText(Semestre);
                    fControle.TFAno.setText(Ano);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle2!\n"+e.getMessage());
            }
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Curso WHERE nome LIKE '%"+Curso+"%'");
                
                while(rs.next()){
                   
                    String CargaHorariaEstagio = rs.getString("CargaHorariaEstagio");
                    
                    fControle.TFHorasEstagio.setText(CargaHorariaEstagio);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle3!\n"+e.getMessage());
            }
            
                          
        fControle.BAtualizarControle.setEnabled(false);
         fControle.BCadastrarControle.setEnabled(true);
          fControle.BExcluirControle.setEnabled(false);
           fControle.BLimparControle.setEnabled(true);
           
            fControle.TFHorasEstagioConcluidas.setEnabled(true);
         fControle.TFHorasEstagioPendentes.setEnabled(true);
          fControle.TFInicioEstagio.setEnabled(true);
           fControle.TFTerminoEstagio.setEnabled(true);
            fControle.TFProfessorOrientador.setEnabled(true);
            
            
            this.dispose();
            
        } 
        
    }//GEN-LAST:event_BSelecionarDadosActionPerformed

    private void TConsultaDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaDadosMouseClicked
 
        if (evt.getClickCount() == 2) {

             if(TConsultaDados.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaDados.getValueAt(TConsultaDados.getSelectedRow(), 0).toString();
            String Curso = TConsultaDados.getValueAt(TConsultaDados.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM TermoObrigatorio WHERE Estagiario LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){
                   
                    String Estagiario = rs.getString("Estagiario");
                    String NumTermo = rs.getString("NumTermo");
                    String CursoEstag = rs.getString("CursoEstag");
                    String Concedente = rs.getString("Concedente");
                    
                    fControle.TFNomeAluno.setText(Estagiario);
                    fControle.TFNumeroTCE.setText(NumTermo);
                    fControle.TFCurso.setText(CursoEstag);
                    fControle.TFConcedente.setText(Concedente);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle1!\n"+e.getMessage());
            }
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Aluno WHERE nome LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){
                   
                    String Semestre = rs.getString("SemestreIngresso");
                    String Ano = rs.getString("AnoIngresso");
                    
                    fControle.TFSemestre.setText(Semestre);
                    fControle.TFAno.setText(Ano);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle2!\n"+e.getMessage());
            }
            
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Curso WHERE nome LIKE '%"+Curso+"%'");
                
                while(rs.next()){
                   
                    String CargaHorariaEstagio = rs.getString("CargaHorariaEstagio");
                    
                    fControle.TFHorasEstagio.setText(CargaHorariaEstagio);
                                         
                }
                
               rs.close();

            }catch(SQLException e){
                System.out.println("Erro ao consultar Dados Controle3!\n"+e.getMessage());
            }
            
                          
        fControle.BAtualizarControle.setEnabled(false);
         fControle.BCadastrarControle.setEnabled(true);
          fControle.BExcluirControle.setEnabled(false);
           fControle.BLimparControle.setEnabled(true);
           
            fControle.TFHorasEstagioConcluidas.setEnabled(true);
         fControle.TFHorasEstagioPendentes.setEnabled(true);
          fControle.TFInicioEstagio.setEnabled(true);
           fControle.TFTerminoEstagio.setEnabled(true);
            fControle.TFProfessorOrientador.setEnabled(true);
            
            
            this.dispose();
            
        } 
        }  
        
    }//GEN-LAST:event_TConsultaDadosMouseClicked

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
            java.util.logging.Logger.getLogger(BuscaDadosControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaDadosControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaDadosControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaDadosControle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaDadosControle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharBuscarDados;
    private javax.swing.JButton BSelecionarDados;
    private javax.swing.JTable TConsultaDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
