package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaAluno extends javax.swing.JFrame {
    
    Connection conn = null;
    Aluno fAluno = null;


    public ConsultaAluno() {
        initComponents();
    }
    
    public ConsultaAluno(Connection conn, 
            Aluno fAluno, 
            String pesquisa, 
            String valor) 
    {
        initComponents();
        
        this.conn = conn;
        this.fAluno = fAluno;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaAluno.getModel();

        while(TConsultaAluno.getRowCount()>0){
             m.removeRow(0);
        }
        
         try{
             
             if (pesquisa == "Nome do Aluno")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
                 rs = stmt.executeQuery("SELECT nome,  "
                    + "CursoAluno,  "
                    + "CPF, "
                    + "rg, "
                    + "matricula "
                    + "FROM aluno "
                    + "WHERE  nome "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY nome");
            
            while(rs.next()){
                String NomeAluno = rs.getString("nome");
                String NomeCurso = rs.getString("CursoAluno");
                String CPF = rs.getString("cpf");
                String Matricula = rs.getString("matricula");
                String RG = rs.getString("rg");

                m.addRow(new Object[] {Matricula, NomeAluno, NomeCurso, CPF, RG});
            }
            rs.close();
            }
             
                         
             if (pesquisa == "Matrícula")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
                    rs = stmt.executeQuery("SELECT nome,  "
                    + "CursoAluno,  "
                    + "CPF, "
                    + "rg, "
                    + "matricula "
                    + "FROM aluno "
                    + "WHERE  matricula "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY nome");

            while(rs.next()){
                String NomeAluno = rs.getString("nome");
                String NomeCurso = rs.getString("CursoAluno");
                String CPF = rs.getString("cpf");
                String Matricula = rs.getString("matricula");
                String RG = rs.getString("rg");

                m.addRow(new Object[] {Matricula, NomeAluno, NomeCurso, CPF, RG});
            }
            rs.close();
            }
             
             if (pesquisa == "Número do RG")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
                    rs = stmt.executeQuery("SELECT nome,  "
                    + "CursoAluno,  "
                    + "CPF, "
                    + "rg, "
                    + "matricula "
                    + "FROM aluno "
                    + "WHERE  rg "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY nome");

            while(rs.next()){
                String NomeAluno = rs.getString("nome");
                String NomeCurso = rs.getString("CursoAluno");
                String CPF = rs.getString("cpf");
                String Matricula = rs.getString("matricula");
                String RG = rs.getString("rg");

                m.addRow(new Object[] {Matricula, NomeAluno, NomeCurso, CPF, RG});
            }
            rs.close();
            }
             
             
        }catch(SQLException e){
            System.out.println("Erro ao consultar Aluno56!\n"+e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaAluno = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BSelecionarAluno = new javax.swing.JButton();
        BFecharAluno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Curso", "CPF", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaAluno);
        if (TConsultaAluno.getColumnModel().getColumnCount() > 0) {
            TConsultaAluno.getColumnModel().getColumn(0).setResizable(false);
            TConsultaAluno.getColumnModel().getColumn(1).setResizable(false);
            TConsultaAluno.getColumnModel().getColumn(2).setResizable(false);
            TConsultaAluno.getColumnModel().getColumn(3).setResizable(false);
            TConsultaAluno.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Aluno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 519, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BSelecionarAluno)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BFecharAluno)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSelecionarAluno)
                    .addComponent(BFecharAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSelecionarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarAlunoActionPerformed
       if(TConsultaAluno.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaAluno.getValueAt(TConsultaAluno.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT * FROM aluno "
                        + "     WHERE nome = '"+nomeSelecionado+"' "
                        + "     ORDER BY nome");

                while(rs.next()){
                    String MatriculaAluno = rs.getString("matricula");
                    String NomeAluno = rs.getString("nome");
                    String EndAluno = rs.getString("endereco");
                    String BairroAluno = rs.getString("bairro");
                    String CEPAluno = rs.getString("cep");
                    String NumEnd = rs.getString("NumEnd");
                    String CidadeAluno = rs.getString("cidade");
                    String Estado = rs.getString("Estado");
                    String CelularAluno = rs.getString("telCelular");
                    String TelAluno = rs.getString("telResidencial");
                    String EmailAluno = rs.getString("email");
                    String NascAluno = rs.getString("dtNasc");
                    String CPFAluno = rs.getString("cpf");
                    String RGAluno = rs.getString("rg");
                    String SexoAluno = rs.getString("sexo");
                    int CodigoAluno = rs.getInt("codigo");
                    
                    if(SexoAluno.equals("M"))
                        fAluno.RBSexoMascAluno.setSelected(true);
                    else
                        fAluno.RBSexoFemAluno.setSelected(true);
                    
                    String CursoAluno = rs.getString("CursoAluno");
                    int IngressoAluno = rs.getInt("anoIngresso");
                    String SemIngressoAluno = rs.getString("semestreIngresso");
                    
                    if(SemIngressoAluno.equals("1º"))
                        fAluno.RBPrimeiroSemestreAluno.setSelected(true);
                    else
                        fAluno.RBSegundoSemestreAluno.setSelected(true);

                    
                    
                    
                    fAluno.TFMatriculaAluno.setText(MatriculaAluno);
                    fAluno.TFNomeAluno.setText(NomeAluno);
                    fAluno.TFEndAluno.setText(EndAluno);
                    fAluno.TFBairroAluno.setText(BairroAluno);
                    fAluno.TFCEPAluno.setText(CEPAluno);
                    fAluno.TFNumEndAluno.setText(NumEnd);
                    fAluno.TFCidadeAluno.setText(CidadeAluno);
                    fAluno.CBEstadoAluno.setSelectedItem(Estado);
                    fAluno.TFCelularAluno.setText(CelularAluno);    
                    fAluno.TFTelAluno.setText(TelAluno);
                    fAluno.TFEmailAluno.setText(EmailAluno);
                    fAluno.TFNascAluno.setText(NascAluno);
                    fAluno.TFCPFAluno.setText(CPFAluno);
                    fAluno.TFRGAluno.setText(RGAluno);
                    fAluno.CBCursoAluno.setSelectedItem(CursoAluno);
                    fAluno.TFAnoIngressoAluno.setText(IngressoAluno+"");
                    fAluno.TFCodigoAluno.setText(CodigoAluno+"");
                   
                    }
                rs.close();
                
                fAluno.BCadastrarAluno.setEnabled(false);
                fAluno.BAtualizarAluno.setEnabled(true);
                fAluno.BExcluirAluno.setEnabled(true);
                fAluno.BLimparAluno.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Aluno!\n"+e.getMessage());
            }
            
            this.dispose();
            
        } 

    }//GEN-LAST:event_BSelecionarAlunoActionPerformed

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void TConsultaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaAlunoMouseClicked
        
        if (evt.getClickCount() == 2) {
        
        if(TConsultaAluno.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaAluno.getValueAt(TConsultaAluno.getSelectedRow(), 1).toString();
            try{
                Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery("SELECT * FROM aluno "
                        + "     WHERE nome = '"+nomeSelecionado+"' "
                        + "     ORDER BY nome");

                while(rs.next()){
                    String MatriculaAluno = rs.getString("matricula");
                    String NomeAluno = rs.getString("nome");
                    String EndAluno = rs.getString("endereco");
                    String BairroAluno = rs.getString("bairro");
                    String CEPAluno = rs.getString("cep");
                    String NumEnd = rs.getString("NumEnd");
                    String CidadeAluno = rs.getString("cidade");
                    String Estado = rs.getString("Estado");
                    String CelularAluno = rs.getString("telCelular");
                    String TelAluno = rs.getString("telResidencial");
                    String EmailAluno = rs.getString("email");
                    String NascAluno = rs.getString("dtNasc");
                    String CPFAluno = rs.getString("cpf");
                    String RGAluno = rs.getString("rg");
                    String SexoAluno = rs.getString("sexo");
                    int CodigoAluno = rs.getInt("codigo");
                    
                    if(SexoAluno.equals("M"))
                        fAluno.RBSexoMascAluno.setSelected(true);
                    else
                        fAluno.RBSexoFemAluno.setSelected(true);
                    
                    String CursoAluno = rs.getString("CursoAluno");
                    int IngressoAluno = rs.getInt("anoIngresso");
                    String SemIngressoAluno = rs.getString("semestreIngresso");
                    
                    if(SemIngressoAluno.equals("1º"))
                        fAluno.RBPrimeiroSemestreAluno.setSelected(true);
                    else
                        fAluno.RBSegundoSemestreAluno.setSelected(true);
  
                    fAluno.TFMatriculaAluno.setText(MatriculaAluno);
                    fAluno.TFNomeAluno.setText(NomeAluno);
                    fAluno.TFEndAluno.setText(EndAluno);
                    fAluno.TFBairroAluno.setText(BairroAluno);
                    fAluno.TFCEPAluno.setText(CEPAluno);
                    fAluno.TFNumEndAluno.setText(NumEnd);
                    fAluno.TFCidadeAluno.setText(CidadeAluno);
                    fAluno.CBEstadoAluno.setSelectedItem(Estado);
                    fAluno.TFCelularAluno.setText(CelularAluno);    
                    fAluno.TFTelAluno.setText(TelAluno);
                    fAluno.TFEmailAluno.setText(EmailAluno);
                    fAluno.TFNascAluno.setText(NascAluno);
                    fAluno.TFCPFAluno.setText(CPFAluno);
                    fAluno.TFRGAluno.setText(RGAluno);
                    fAluno.CBCursoAluno.setSelectedItem(CursoAluno);
                    fAluno.TFAnoIngressoAluno.setText(IngressoAluno+"");
                    fAluno.TFCodigoAluno.setText(CodigoAluno+"");
                   
                    }
                rs.close();
                
                fAluno.BCadastrarAluno.setEnabled(false);
                fAluno.BAtualizarAluno.setEnabled(true);
                fAluno.BExcluirAluno.setEnabled(true);
                fAluno.BLimparAluno.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Aluno!\n"+e.getMessage());
            }
            
            this.dispose();
            
            } 
        }
    }//GEN-LAST:event_TConsultaAlunoMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAluno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarAluno;
    private javax.swing.JTable TConsultaAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
