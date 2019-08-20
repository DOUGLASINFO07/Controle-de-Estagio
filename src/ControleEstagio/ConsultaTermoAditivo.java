package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ConsultaTermoAditivo extends javax.swing.JFrame {
    
    Connection conn = null;
    TermoAditivo fTermoAditivo ;

    public ConsultaTermoAditivo() {
        initComponents();
    }
    
    public ConsultaTermoAditivo(Connection conn, 
            TermoAditivo fTermoAditivo, 
            String pesquisa, 
            String valor) {
        initComponents();
        
        this.conn = conn;
        this.fTermoAditivo = fTermoAditivo;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaTermoAditivo.getModel();

        while(TConsultaTermoAditivo.getRowCount()>0){
             m.removeRow(0);
        }
        
         try{
             
           if (pesquisa == "Número do Termo")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT Estagiario,  "
                    + "Interveniente,  "
                    + "Concedente, "
                    + "QuantTermo, "
                    + "NumeroTermo "
                    + "FROM termoAditivo "
                    + "WHERE  NumeroTermo "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Estagiario");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumeroTermo");
                String QuantTermo = rs.getString("QuantTermo");

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo, QuantTermo});
            }
            rs.close();
            }
           
           if (pesquisa == "Nome do Interveniente")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT Estagiario,  "
                    + "Interveniente,  "
                    + "Concedente, "
                    + "QuantTermo, "
                    + "NumeroTermo "
                    + "FROM termoAditivo "
                    + "WHERE  Interveniente "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Interveniente");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumeroTermo");
                String QuantTermo = rs.getString("QuantTermo");

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo, QuantTermo});
            }
            rs.close();
            }
                      
            if (pesquisa == "Nome do Concedente")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT Estagiario,  "
                    + "Interveniente,  "
                    + "Concedente, "
                    + "QuantTermo, "
                    + "NumeroTermo "
                    + "FROM termoAditivo "
                    + "WHERE  Concedente "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Concedente");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumeroTermo");
                String QuantTermo = rs.getString("QuantTermo");

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo, QuantTermo});
            }
            rs.close();
            }
           
            if (pesquisa == "Nome do Estagiário")
            {
             
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT Estagiario,  "
                    + "Interveniente,  "
                    + "Concedente, "
                    + "QuantTermo, "
                    + "NumeroTermo "
                    + "FROM termoAditivo "
                    + "WHERE  Estagiario "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Estagiario");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumeroTermo");
                String QuantTermo = rs.getString("QuantTermo");

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo, QuantTermo});
            }
            rs.close();
            }
           
           
        }catch(SQLException e){
            System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
    
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TConsultaTermoAditivo = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharAluno = new javax.swing.JButton();
        BSelecionarTermo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaTermoAditivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Interveniente", "Concedente", "Número Termo Compromisso", "Termo Aditivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaTermoAditivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaTermoAditivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaTermoAditivo);
        if (TConsultaTermoAditivo.getColumnModel().getColumnCount() > 0) {
            TConsultaTermoAditivo.getColumnModel().getColumn(0).setResizable(false);
            TConsultaTermoAditivo.getColumnModel().getColumn(1).setResizable(false);
            TConsultaTermoAditivo.getColumnModel().getColumn(2).setResizable(false);
            TConsultaTermoAditivo.getColumnModel().getColumn(3).setResizable(false);
            TConsultaTermoAditivo.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Termo Aditivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
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

        BSelecionarTermo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BSelecionarTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/botaoOK2.png"))); // NOI18N
        BSelecionarTermo.setText("Selecionar");
        BSelecionarTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSelecionarTermoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BSelecionarTermo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BFecharAluno, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSelecionarTermo)
                    .addComponent(BFecharAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void BSelecionarTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSelecionarTermoActionPerformed
     
        
        if(TConsultaTermoAditivo.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaTermoAditivo.getValueAt(TConsultaTermoAditivo.getSelectedRow(), 3).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM termoAditivo WHERE NumeroTermo LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        int Codigo = rs.getInt("Codigo");
        String QuantTermo = rs.getString("QuantTermo");
        String NumTermo = rs.getString("NumeroTermo");
        String TipoEstagio = rs.getString("TipoEstag");
        String DataInicialTermo = rs.getString("DataInicial");
        String DataFinalTermo = rs.getString("DataFinal");
        String DataAssinatura = rs.getString("DataAssinatura");
        String GeradoPor = rs.getString("GeradoPor");
        String Interveniente = rs.getString("Interveniente");
        String RepInterv = rs.getString("RepInterv");
        String CargoRepInterv = rs.getString("CargoRepInterv");
        String Concedente = rs.getString("Concedente");
        String RepConc = rs.getString("RepConc");
        String CPFRepConc = rs.getString("CPFRepConc");
        String CargoRepConc = rs.getString("CargoRepConc");
        String Estagiario = rs.getString("Estagiario");
        String CursoEstag = rs.getString("CursoEstag");
        String EmailEstag = rs.getString("EmailEstag");

        fTermoAditivo.TFCodigoAditivo.setText(Codigo+"");
        fTermoAditivo.TFNumTermoAditivo.setText(NumTermo);
        fTermoAditivo.CBQuantTermo.setSelectedItem(QuantTermo);
        fTermoAditivo.TFDataInicioAditivo.setText(DataInicialTermo);
        fTermoAditivo.TFDataTerminoAditivo.setText(DataFinalTermo);
        fTermoAditivo.TFDataAssinatura.setText(DataAssinatura);
        if(TipoEstagio.equals("Estágio não Obrigatório"))
                        fTermoAditivo.RBNaoObrigatorio.setSelected(true);
                    else
                        fTermoAditivo.RBObrigatorio.setSelected(true);
        fTermoAditivo.TFGeradorTermo.setText(GeradoPor);
        fTermoAditivo.TFNomeIntervAditivo.setText(Interveniente);
        fTermoAditivo.TFRepIntervAditivo.setText(RepInterv);
        fTermoAditivo.TFCargoRepIntervAditivo.setText(CargoRepInterv);
        fTermoAditivo.TFNomeConcAditivo.setText(Concedente);
        fTermoAditivo.TFRepConcAditivo.setText(RepConc);
        fTermoAditivo.TFCPFRepConcAditivo.setText(CPFRepConc);
        fTermoAditivo.TFCargoRepConcAditivo.setText(CargoRepConc);
        fTermoAditivo.TFNomeEstagAditivo.setText(Estagiario);
        fTermoAditivo.TFCursoEstagAditivo.setText(CursoEstag);
        fTermoAditivo.TFEmailEstagAditivo.setText(EmailEstag);
           
                }
               rs.close();
               
       fTermoAditivo.BAtualizarAditivo.setEnabled(true);
       fTermoAditivo.BCadastrarAditivo.setEnabled(false);
       fTermoAditivo.BExcluirAditivo.setEnabled(true);
       fTermoAditivo.BLimparAditivo.setEnabled(true);
       fTermoAditivo.BGerarPDFAditivo.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
            }
        
       
        String numero = TConsultaTermoAditivo.getValueAt(TConsultaTermoAditivo.getSelectedRow(), 3).toString();
            
             DefaultTableModel m = (DefaultTableModel) fTermoAditivo.TAditivosGerados.getModel();
        
        try{
             
                       
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT QuantTermo,  "
                    + "DataInicial,  "
                    + "DataFinal, "
                    + "GeradoPor "
                    + "FROM termoAditivo "
                    + "WHERE  NumeroTermo "
                    + "LIKE '%"+numero+"%' "
                    + "ORDER BY DataInicial");

            while(rs.next()){
                String QuantTermo1 = rs.getString("QuantTermo");
                String DataInicial1 = rs.getString("DataInicial");
                String DataFinal1 = rs.getString("DataFinal");
                String GeradoPor1 = rs.getString("GeradoPor");

                m.addRow(new Object[] {QuantTermo1, DataInicial1, DataFinal1, GeradoPor1});
            }
            rs.close();
            }
           
           catch(SQLException e){
            System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
    
        } 

            this.dispose();
   }
    }//GEN-LAST:event_BSelecionarTermoActionPerformed

    private void TConsultaTermoAditivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaTermoAditivoMouseClicked
 
        if (evt.getClickCount() == 2) {

                  if(TConsultaTermoAditivo.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaTermoAditivo.getValueAt(TConsultaTermoAditivo.getSelectedRow(), 3).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM termoAditivo WHERE NumeroTermo LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        int Codigo = rs.getInt("Codigo");
        String QuantTermo = rs.getString("QuantTermo");
        String NumTermo = rs.getString("NumeroTermo");
        String TipoEstagio = rs.getString("TipoEstag");
        String DataInicialTermo = rs.getString("DataInicial");
        String DataFinalTermo = rs.getString("DataFinal");
        String DataAssinatura = rs.getString("DataAssinatura");
        String GeradoPor = rs.getString("GeradoPor");
        String Interveniente = rs.getString("Interveniente");
        String RepInterv = rs.getString("RepInterv");
        String CargoRepInterv = rs.getString("CargoRepInterv");
        String Concedente = rs.getString("Concedente");
        String RepConc = rs.getString("RepConc");
        String CPFRepConc = rs.getString("CPFRepConc");
        String CargoRepConc = rs.getString("CargoRepConc");
        String Estagiario = rs.getString("Estagiario");
        String CursoEstag = rs.getString("CursoEstag");
        String EmailEstag = rs.getString("EmailEstag");

        fTermoAditivo.TFCodigoAditivo.setText(Codigo+"");
        fTermoAditivo.TFNumTermoAditivo.setText(NumTermo);
        fTermoAditivo.CBQuantTermo.setSelectedItem(QuantTermo);
        fTermoAditivo.TFDataInicioAditivo.setText(DataInicialTermo);
        fTermoAditivo.TFDataTerminoAditivo.setText(DataFinalTermo);
        fTermoAditivo.TFDataAssinatura.setText(DataAssinatura);
        if(TipoEstagio.equals("Estágio não Obrigatório"))
                        fTermoAditivo.RBNaoObrigatorio.setSelected(true);
                    else
                        fTermoAditivo.RBObrigatorio.setSelected(true);
        fTermoAditivo.TFGeradorTermo.setText(GeradoPor);
        fTermoAditivo.TFNomeIntervAditivo.setText(Interveniente);
        fTermoAditivo.TFRepIntervAditivo.setText(RepInterv);
        fTermoAditivo.TFCargoRepIntervAditivo.setText(CargoRepInterv);
        fTermoAditivo.TFNomeConcAditivo.setText(Concedente);
        fTermoAditivo.TFRepConcAditivo.setText(RepConc);
        fTermoAditivo.TFCPFRepConcAditivo.setText(CPFRepConc);
        fTermoAditivo.TFCargoRepConcAditivo.setText(CargoRepConc);
        fTermoAditivo.TFNomeEstagAditivo.setText(Estagiario);
        fTermoAditivo.TFCursoEstagAditivo.setText(CursoEstag);
        fTermoAditivo.TFEmailEstagAditivo.setText(EmailEstag);
           
                }
               rs.close();
               
       fTermoAditivo.BAtualizarAditivo.setEnabled(true);
       fTermoAditivo.BCadastrarAditivo.setEnabled(false);
       fTermoAditivo.BExcluirAditivo.setEnabled(true);
       fTermoAditivo.BLimparAditivo.setEnabled(true);
       fTermoAditivo.BGerarPDFAditivo.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
            }
        
       
        String numero = TConsultaTermoAditivo.getValueAt(TConsultaTermoAditivo.getSelectedRow(), 3).toString();
            
             DefaultTableModel m = (DefaultTableModel) fTermoAditivo.TAditivosGerados.getModel();
        
        try{
             
                       
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT QuantTermo,  "
                    + "DataInicial,  "
                    + "DataFinal, "
                    + "GeradoPor "
                    + "FROM termoAditivo "
                    + "WHERE  NumeroTermo "
                    + "LIKE '%"+numero+"%' "
                    + "ORDER BY DataInicial");

            while(rs.next()){
                String QuantTermo1 = rs.getString("QuantTermo");
                String DataInicial1 = rs.getString("DataInicial");
                String DataFinal1 = rs.getString("DataFinal");
                String GeradoPor1 = rs.getString("GeradoPor");

                m.addRow(new Object[] {QuantTermo1, DataInicial1, DataFinal1, GeradoPor1});
            }
            rs.close();
            }
           
           catch(SQLException e){
            System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
    
        } 

            this.dispose();
   }
        }   
    }//GEN-LAST:event_TConsultaTermoAditivoMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaTermoCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaTermoCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaTermoCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaTermoCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaTermoCompromisso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFecharAluno;
    private javax.swing.JButton BSelecionarTermo;
    private javax.swing.JTable TConsultaTermoAditivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
