package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class consultaCurso extends javax.swing.JFrame {

    Connection conn;
    Curso fCurso;

    public consultaCurso() {
        initComponents();
    }
    
    public consultaCurso(Connection conn, 
            Curso fCurso, 
            String pesquisa, 
            String valor) 
    {
        initComponents();
        
        this.conn = conn;
        this.fCurso = fCurso;
        
        Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));

        DefaultTableModel m = (DefaultTableModel) TConsultaCurso.getModel();

        while(TConsultaCurso.getRowCount()>0){
             m.removeRow(0);
        }
        
        try{
            
            if (pesquisa == "Nome do Coordenador do Curso")
            {
            
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT nome, "
                    + "Coordenador, "
                    + "cargaHorariaEstagio "
                    + "     FROM curso"
                    + "     WHERE Coordenador "
                    + "     LIKE '%"+valor+"%' "
                    + "     ORDER BY Coordenador");
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String coordenador = rs.getString("Coordenador");
                int ch = rs.getInt("cargaHorariaEstagio");
                m.addRow(new Object[] {nome, coordenador, ch});
            }
            rs.close();
            }
            
            else if ("Nome do Curso".equals(pesquisa))
            {
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome, "
                    + "Coordenador, "
                    + "cargaHorariaEstagio "
                    + "     FROM curso "
                    + "     WHERE nome "
                    + "     LIKE '%"+valor+"%' "
                    + "     ORDER BY nome");
            
            while(rs.next()){
                String nome = rs.getString("nome");
                String coordenador = rs.getString("Coordenador");
                int ch = rs.getInt("cargaHorariaEstagio");
                m.addRow(new Object[] {nome, coordenador, ch});
            }
            rs.close();
            
            }
        }catch(SQLException e){
            System.out.println("Erro ao consultar Curso!\n"+e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaCurso = new javax.swing.JTable();
        BSelecionarCurso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BFecharCurso = new javax.swing.JButton();
        Data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Curso", "Coordenador", "Carga Horária Estágio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaCurso.getTableHeader().setReorderingAllowed(false);
        TConsultaCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaCursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaCurso);
        if (TConsultaCurso.getColumnModel().getColumnCount() > 0) {
            TConsultaCurso.getColumnModel().getColumn(0).setResizable(false);
            TConsultaCurso.getColumnModel().getColumn(1).setResizable(false);
        }

        BSelecionarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarCurso.setText("Selecionar");
        BSelecionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarCursoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Consulta Curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BSelecionarCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharCurso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Data)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSelecionarCurso)
                    .addComponent(BFecharCurso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarCursoActionPerformed
              
        if(TConsultaCurso.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaCurso.getValueAt(TConsultaCurso.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM curso "
                        + "     WHERE nome = '"+nomeSelecionado+"' "
                        + "     ORDER BY nome");

                while(rs.next()){
                    String nome = rs.getString("nome");
                    int qtdPeriodos = rs.getInt("qtdPeriodos");
                    String coordenador = rs.getString("Coordenador");
                    int chEstagio = rs.getInt("cargaHorariaEstagio");
                    int maxChPeriodo = rs.getInt("maxHorasPeriodo");
                    int CodigoCurso = rs.getInt("codigo");
                    
                    fCurso.TFNomeCurso.setText(nome);
                    fCurso.TFHoraEstagio.setText(chEstagio+"");
                    fCurso.TFHoraEstagioPeriodo.setText(maxChPeriodo+"");
                    fCurso.TFQuantPeriodo.setText(qtdPeriodos+"");
                    fCurso.CBCoordCurso.setText(coordenador);
                    fCurso.TFCodigoCurso.setText(CodigoCurso+"");
                    
                }
                
                
                rs.close();
                
                fCurso.BAtualizarCurso.setEnabled(true);
                fCurso.BExcluirCurso.setEnabled(true);
                fCurso.BLimparCurso.setEnabled(true);
                fCurso.BCadastrarCurso.setEnabled(false);
 
            }catch(SQLException e){
                System.out.println("Erro ao consultar Curso!\n"+e.getMessage());
            }
   
            this.dispose();
        }     
        
    }//GEN-LAST:event_BSelecionarCursoActionPerformed

    private void TConsultaCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaCursoMouseClicked
         
        if (evt.getClickCount() == 2) {
            
        if(TConsultaCurso.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaCurso.getValueAt(TConsultaCurso.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT *"
                        + "     FROM curso "
                        + "     WHERE nome = '"+nomeSelecionado+"' "
                        + "     ORDER BY nome");

                while(rs.next()){
                    String nome = rs.getString("nome");
                    int qtdPeriodos = rs.getInt("qtdPeriodos");
                    String coordenador = rs.getString("Coordenador");
                    int chEstagio = rs.getInt("cargaHorariaEstagio");
                    int maxChPeriodo = rs.getInt("maxHorasPeriodo");
                    int CodigoCurso = rs.getInt("codigo");
                    
                    fCurso.TFNomeCurso.setText(nome);
                    fCurso.TFHoraEstagio.setText(chEstagio+"");
                    fCurso.TFHoraEstagioPeriodo.setText(maxChPeriodo+"");
                    fCurso.TFQuantPeriodo.setText(qtdPeriodos+"");
                    fCurso.CBCoordCurso.setText(coordenador);
                    fCurso.TFCodigoCurso.setText(CodigoCurso+"");
                    
                }
                
                
                rs.close();
                
                fCurso.BAtualizarCurso.setEnabled(true);
                fCurso.BExcluirCurso.setEnabled(true);
                fCurso.BLimparCurso.setEnabled(true);
                fCurso.BCadastrarCurso.setEnabled(false);
 
            }catch(SQLException e){
                System.out.println("Erro ao consultar professor!\n"+e.getMessage());
            }
   
            this.dispose();
        }   
        } 
    }//GEN-LAST:event_TConsultaCursoMouseClicked

    private void BFecharCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharCursoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharCursoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new consultaCurso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharCurso;
    private javax.swing.JButton BSelecionarCurso;
    private javax.swing.JLabel Data;
    private javax.swing.JTable TConsultaCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
