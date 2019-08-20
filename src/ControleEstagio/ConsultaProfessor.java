package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ConsultaProfessor extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    
    Connection conn = null;
    Professor fProfessor = null;

    public ConsultaProfessor() {
        initComponents();
    }

    public ConsultaProfessor(Connection conn, Professor fProfessor, String valor) {
        initComponents();
        
        this.conn = conn;
        this.fProfessor = fProfessor;
        
        
        
           Calendar c = Calendar.getInstance();   
            Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
        
           
           
        DefaultTableModel m = (DefaultTableModel) TConsultaProfessor.getModel();

        while(TConsultaProfessor.getRowCount()>0){
             m.removeRow(0);
        }
        
        try{
            Statement stmt = conn.createStatement();
            try (ResultSet rs = stmt.executeQuery("SELECT p.nome, "
                    + "p.CursoProfessor FROM professor p WHERE p.nome LIKE '%"+valor+"%' ORDER BY p.nome")) {
                while(rs.next()){
                    String NomeProfessor = rs.getString("p.nome");
                    String NomeCurso = rs.getString("p.CursoProfessor");
                    
                    
                    m.addRow(new Object[] {NomeProfessor, NomeCurso});
                }
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao consultar Professor!\n"+e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaProfessor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BSelecionarProfessor = new javax.swing.JButton();
        BFecharCurso = new javax.swing.JButton();
        Data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaProfessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaProfessor);
        if (TConsultaProfessor.getColumnModel().getColumnCount() > 0) {
            TConsultaProfessor.getColumnModel().getColumn(0).setResizable(false);
            TConsultaProfessor.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Professor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        BSelecionarProfessor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarProfessor.setText("Selecionar");
        BSelecionarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarProfessorActionPerformed(evt);
            }
        });

        BFecharCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharCurso.setText("Voltar");
        BFecharCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharCursoActionPerformed(evt);
            }
        });

        Data.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BSelecionarProfessor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BFecharCurso))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Data, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BFecharCurso)
                    .addComponent(BSelecionarProfessor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecionarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarProfessorActionPerformed
       
        if(TConsultaProfessor.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaProfessor.getValueAt(TConsultaProfessor.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT p.* FROM professor p WHERE p.nome = '"+nomeSelecionado+"' ORDER BY p.nome")) {
                    while(rs.next()){
                        
                        String NomeProf = rs.getString("p.nome");
                        String SexoProf = rs.getString("p.sexo");
                        String CelularProf = rs.getString("p.celular");
                        String Telefone = rs.getString("p.telefone");
                        String Email = rs.getString("p.email");
                        String Curso = rs.getString("p.CursoProfessor");
                        int Codigo = rs.getInt("p.Codigo");
                        
                        
                        fProfessor.TFNomeProf.setText(NomeProf);
                        
                        if(SexoProf.equals("M")) {
                            fProfessor.RBSexoMascProf.setSelected(true);
                        } else {
                            fProfessor.RBFem.setSelected(true);
                        }
                        
                        fProfessor.TFCelularProf.setText(CelularProf);
                        fProfessor.TFTelProf.setText(Telefone);
                        fProfessor.TFEmailProf.setText(Email);
                        fProfessor.CBCursoProf.setText(Curso);
                        fProfessor.TFCodigoProfessor.setText(""+Codigo);
                        
                        
                    }
                }
                
                fProfessor.BAtualizarProfessor.setEnabled(true);
                fProfessor.BExcluirProfessor.setEnabled(true);
                fProfessor.BLimparProfessor.setEnabled(true);
                fProfessor.BCadastrarProfessor.setEnabled(false);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Professor!\n"+e.getMessage());
            }
            
            this.dispose();
            
        }

    }//GEN-LAST:event_BSelecionarProfessorActionPerformed

    private void BFecharCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharCursoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharCursoActionPerformed

    private void TConsultaProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaProfessorMouseClicked
       
        
        if (evt.getClickCount() == 2) {
        
       if(TConsultaProfessor.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaProfessor.getValueAt(TConsultaProfessor.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT p.* FROM professor p WHERE p.nome = '"+nomeSelecionado+"' ORDER BY p.nome")) {
                    while(rs.next()){
                        
                        String NomeProf = rs.getString("p.nome");
                        String SexoProf = rs.getString("p.sexo");
                        String CelularProf = rs.getString("p.celular");
                        String Telefone = rs.getString("p.telefone");
                        String Email = rs.getString("p.email");
                        String Curso = rs.getString("p.CursoProfessor");
                        int Codigo = rs.getInt("p.Codigo");
                        
                        
                        fProfessor.TFNomeProf.setText(NomeProf);
                        
                        if(SexoProf.equals("M"))
                            fProfessor.RBSexoMascProf.setSelected(true);
                        else
                            fProfessor.RBFem.setSelected(true);
                        
                        fProfessor.TFCelularProf.setText(CelularProf);
                        fProfessor.TFTelProf.setText(Telefone);
                        fProfessor.TFEmailProf.setText(Email);
                        fProfessor.CBCursoProf.setText(Curso);
                        fProfessor.TFCodigoProfessor.setText(""+Codigo);
                        
                        
                    }
                }
                
                fProfessor.BAtualizarProfessor.setEnabled(true);
                fProfessor.BExcluirProfessor.setEnabled(true);
                fProfessor.BLimparProfessor.setEnabled(true);
                fProfessor.BCadastrarProfessor.setEnabled(false);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Professor!\n"+e.getMessage());
            }
            
            this.dispose();
            
        }
        }
    }//GEN-LAST:event_TConsultaProfessorMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProfessor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharCurso;
    private javax.swing.JButton BSelecionarProfessor;
    private javax.swing.JLabel Data;
    private javax.swing.JTable TConsultaProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
