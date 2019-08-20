package ControleEstagio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaTermoCompromisso extends javax.swing.JFrame {
    
    Connection conn = null;
    TermoCompromisso fTermoCompromisso ;

    public ConsultaTermoCompromisso() {
        initComponents();
    }
    
    public ConsultaTermoCompromisso(Connection conn, 
            TermoCompromisso fTermoCompromisso, 
            String pesquisa, 
            String valor) {
        initComponents();
        
        this.conn = conn;
        this.fTermoCompromisso = fTermoCompromisso;
        
        DefaultTableModel m = (DefaultTableModel) TConsultaTermoObrigatorio.getModel();

        while(TConsultaTermoObrigatorio.getRowCount()>0){
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
                    + "Numtermo "
                    + "FROM termoObrigatorio "
                    + "WHERE  NumTermo "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Estagiario");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumTermo");
                

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo});
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
                    + "Numtermo "
                    + "FROM termoObrigatorio "
                    + "WHERE  Interveniente "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Interveniente");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumTermo");
                

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo});
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
                    + "Numtermo "
                    + "FROM termoObrigatorio "
                    + "WHERE  Concedente "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Concedente");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumTermo");
                

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo});
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
                    + "Numtermo "
                    + "FROM termoObrigatorio "
                    + "WHERE  Estagiario "
                    + "LIKE '%"+valor+"%' "
                    + "ORDER BY Estagiario");

            while(rs.next()){
                String Estagiario = rs.getString("Estagiario");
                String Interveniente = rs.getString("Interveniente");
                String Concedente = rs.getString("Concedente");
                String NumTermo = rs.getString("NumTermo");
                

                m.addRow(new Object[] {Estagiario, Interveniente, Concedente, NumTermo});
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
        TConsultaTermoObrigatorio = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BFecharAluno = new javax.swing.JButton();
        BSelecionarTermo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TConsultaTermoObrigatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aluno", "Interveniente", "Concedente", "Número Termo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TConsultaTermoObrigatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TConsultaTermoObrigatorioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TConsultaTermoObrigatorio);
        if (TConsultaTermoObrigatorio.getColumnModel().getColumnCount() > 0) {
            TConsultaTermoObrigatorio.getColumnModel().getColumn(0).setResizable(false);
            TConsultaTermoObrigatorio.getColumnModel().getColumn(1).setResizable(false);
            TConsultaTermoObrigatorio.getColumnModel().getColumn(2).setResizable(false);
            TConsultaTermoObrigatorio.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(151, 195, 48));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta Termo Obrigatório");

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
     
        
        if(TConsultaTermoObrigatorio.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaTermoObrigatorio.getValueAt(TConsultaTermoObrigatorio.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM termoObrigatorio WHERE Estagiario LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        int Codigo = rs.getInt("Codigo");
        String NumTermo = rs.getString("NumTermo");
        String TipoEstagio = rs.getString("TipoEstagio");
        String DataTermo = rs.getString("DataTermo");
        String GeradoPor = rs.getString("GeradoPor");
        String Interveniente = rs.getString("Interveniente");
        String CNPJInterv = rs.getString("CNPJInterv");
        String EndInterv = rs.getString("EndInterv");
        String NumEndInterv = rs.getString("NumEndInterv");
        String CEPInterv = rs.getString("CEPInterv");
        String BairroInterv = rs.getString("BairroInterv");
        String CidadeInterv = rs.getString("CidadeInterv");
        String EstadoInterv = rs.getString("EstadoInterv");    
        String TelInterv = rs.getString("TelInterv");
        String RepInterv = rs.getString("RepInterv");
        String CargoRepInterv = rs.getString("CargoRepInterv");
        String RespInterv = rs.getString("RespInterv");
        String CargoRespInterv = rs.getString("CargoRespInterv");
        String Concedente = rs.getString("Concedente");
        String CNPJConc = rs.getString("CNPJConc");
        String EndConc = rs.getString("EndConc");
        String NumEndConc = rs.getString("NumEndConc");
        String CEPConc = rs.getString("CEPConc");
        String BairroConc = rs.getString("BairroConc");
        String CidadeConc = rs.getString("CidadeConc");
        String EstadoConc = rs.getString("EstadoConc");
        String TelConc = rs.getString("TelConc");
        String RepConc = rs.getString("RepConc");
        String CPFRepConc = rs.getString("CPFRepConc");
        String CargoRepConc = rs.getString("CargoRepConc");
        String RespConc = rs.getString("RespConc");
        String CPFRespConc = rs.getString("CPFRespConc");
        String CargoRespConc = rs.getString("CargoRespConc");
        String Estagiario = rs.getString("Estagiario");
        String CPFEstag = rs.getString("CPFEstag");
        String DataNascEstag = rs.getString("DataNascEstag");
        String EndEstag = rs.getString("EndEstag");
        String NumEndEstag = rs.getString("NumEndEstag");
        String CEPEstag = rs.getString("CEPEstag");
        String BairroEstag = rs.getString("BairroEstag");
        String CidadeEstag = rs.getString("CidadeEstag");
        String EstadoEstag = rs.getString("EstadoEstag");
        String TelEstag = rs.getString("TelEstag");
        String CursoEstag = rs.getString("CursoEstag");
        String EmailEstag = rs.getString("EmailEstag");
        String SemestreIngresso = rs.getString("SemestreIngresso");
        String AnoIngresso = rs.getString("AnoIngresso");
        String DataTerminoTermo = rs.getString("DataTerminoTermo");
        String HorarioEstagio = rs.getString("HorarioEstagio");
        
        fTermoCompromisso.TFCodigo.setText(Codigo+"");
        fTermoCompromisso.TFNumTermo.setText(NumTermo);
        fTermoCompromisso.Data.setText(DataTermo);
        if(TipoEstagio.equals("Estágio não Obrigatório"))
                        fTermoCompromisso.RBNaoObrigatorio.setSelected(true);
                    else
                        fTermoCompromisso.RBObrigatorio.setSelected(true);
        fTermoCompromisso.TFGeradorTermo.setText(GeradoPor);
        fTermoCompromisso.TFNomeInterv.setText(Interveniente);
        fTermoCompromisso.TFCNPJInterv.setText(CNPJInterv);
        fTermoCompromisso.TFEndInterv.setText(EndInterv);
        fTermoCompromisso.TFNumEndInterv.setText(NumEndInterv);
        fTermoCompromisso.TFCEPInterv.setText(CEPInterv);
        fTermoCompromisso.TFBairroInterv.setText(BairroInterv);
        fTermoCompromisso.TFCidadeInterv.setText(CidadeInterv);
        fTermoCompromisso.TFEstadoInterv.setText(EstadoInterv);
        fTermoCompromisso.TFTelInterv.setText(TelInterv);
        fTermoCompromisso.TFRepInterv.setText(RepInterv);
        fTermoCompromisso.TFCargoRepInterv.setText(CargoRepInterv);
        fTermoCompromisso.TFRespInterv.setText(RespInterv);
        fTermoCompromisso.TFCargoRespInterv.setText(CargoRespInterv);
        fTermoCompromisso.TFNomeConc.setText(Concedente);
        fTermoCompromisso.TFCNPJConc.setText(CNPJConc);
        fTermoCompromisso.TFEndConc.setText(EndConc);
        fTermoCompromisso.TFNumEndConc.setText(NumEndConc);
        fTermoCompromisso.TFCEPConc.setText(CEPConc);
        fTermoCompromisso.TFBairroConc.setText(BairroConc);
        fTermoCompromisso.TFCidadeConc.setText(CidadeConc);
        fTermoCompromisso.TFEstadoConc.setText(EstadoConc);
        fTermoCompromisso.TFTelConc.setText(TelConc);
        fTermoCompromisso.TFRepConc.setText(RepConc);
        fTermoCompromisso.TFCPFRepConc.setText(CPFRepConc);
        fTermoCompromisso.TFCargoRepConc.setText(CargoRepConc);
        fTermoCompromisso.TFRespConc.setText(RespConc);
        fTermoCompromisso.TFCPFRespConc.setText(CPFRespConc);
        fTermoCompromisso.TFCargoRespConc.setText(CargoRespConc);
        fTermoCompromisso.TFNomeEst.setText(Estagiario);
        fTermoCompromisso.TFCPFEst.setText(CPFEstag);
        fTermoCompromisso.TFDataNascEst.setText(DataNascEstag);
        fTermoCompromisso.TFEndEst.setText(EndEstag);
        fTermoCompromisso.TFNumEndEst.setText(NumEndEstag);
        fTermoCompromisso.TFCEPEst.setText(CEPEstag);
        fTermoCompromisso.TFBairroEst.setText(BairroEstag);
        fTermoCompromisso.TFCidadeEst.setText(CidadeEstag);
        fTermoCompromisso.TFEstadoEst.setText(EstadoEstag);
        fTermoCompromisso.TFTelEst.setText(TelEstag);
        fTermoCompromisso.TFCursoEst.setText(CursoEstag);
        fTermoCompromisso.TFEmailEst.setText(EmailEstag);
        fTermoCompromisso.TFSemestreEngresso.setText(SemestreIngresso);
        fTermoCompromisso.TFAnoEngresso.setText(AnoIngresso);
        fTermoCompromisso.TFHorarioEstagio.setText(HorarioEstagio);
        fTermoCompromisso.TFDataTerminoTermo.setText(DataTerminoTermo);
       
                     
                }
               rs.close();
               
       fTermoCompromisso.TFPesquisaTermo.setEnabled(false);
       fTermoCompromisso.BAtualizarTermo.setEnabled(true);
       fTermoCompromisso.BCadastrarTermo.setEnabled(false);
       fTermoCompromisso.BExcluirTermo.setEnabled(true);
       fTermoCompromisso.BLimparTermo.setEnabled(true);
       fTermoCompromisso.BGerarPDF.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
        } 
    }//GEN-LAST:event_BSelecionarTermoActionPerformed

    private void TConsultaTermoObrigatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TConsultaTermoObrigatorioMouseClicked
 
        if (evt.getClickCount() == 2) {

         if(TConsultaTermoObrigatorio.getSelectedRowCount() == 1){
            
            String nomeSelecionado = TConsultaTermoObrigatorio.getValueAt(TConsultaTermoObrigatorio.getSelectedRow(), 0).toString();
            try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM termoObrigatorio WHERE Estagiario LIKE '%"+nomeSelecionado+"%'");
                
                while(rs.next()){

        int Codigo = rs.getInt("Codigo");
        String NumTermo = rs.getString("NumTermo");
        String TipoEstagio = rs.getString("TipoEstagio");
        String DataTermo = rs.getString("DataTermo");
        String GeradoPor = rs.getString("GeradoPor");
        String Interveniente = rs.getString("Interveniente");
        String CNPJInterv = rs.getString("CNPJInterv");
        String EndInterv = rs.getString("EndInterv");
        String NumEndInterv = rs.getString("NumEndInterv");
        String CEPInterv = rs.getString("CEPInterv");
        String BairroInterv = rs.getString("BairroInterv");
        String CidadeInterv = rs.getString("CidadeInterv");
        String EstadoInterv = rs.getString("EstadoInterv");    
        String TelInterv = rs.getString("TelInterv");
        String RepInterv = rs.getString("RepInterv");
        String CargoRepInterv = rs.getString("CargoRepInterv");
        String RespInterv = rs.getString("RespInterv");
        String CargoRespInterv = rs.getString("CargoRespInterv");
        String Concedente = rs.getString("Concedente");
        String CNPJConc = rs.getString("CNPJConc");
        String EndConc = rs.getString("EndConc");
        String NumEndConc = rs.getString("NumEndConc");
        String CEPConc = rs.getString("CEPConc");
        String BairroConc = rs.getString("BairroConc");
        String CidadeConc = rs.getString("CidadeConc");
        String EstadoConc = rs.getString("EstadoConc");
        String TelConc = rs.getString("TelConc");
        String RepConc = rs.getString("RepConc");
        String CPFRepConc = rs.getString("CPFRepConc");
        String CargoRepConc = rs.getString("CargoRepConc");
        String RespConc = rs.getString("RespConc");
        String CPFRespConc = rs.getString("CPFRespConc");
        String CargoRespConc = rs.getString("CargoRespConc");
        String Estagiario = rs.getString("Estagiario");
        String CPFEstag = rs.getString("CPFEstag");
        String DataNascEstag = rs.getString("DataNascEstag");
        String EndEstag = rs.getString("EndEstag");
        String NumEndEstag = rs.getString("NumEndEstag");
        String CEPEstag = rs.getString("CEPEstag");
        String BairroEstag = rs.getString("BairroEstag");
        String CidadeEstag = rs.getString("CidadeEstag");
        String EstadoEstag = rs.getString("EstadoEstag");
        String TelEstag = rs.getString("TelEstag");
        String CursoEstag = rs.getString("CursoEstag");
        String EmailEstag = rs.getString("EmailEstag");
        String SemestreIngresso = rs.getString("SemestreIngresso");
        String AnoIngresso = rs.getString("AnoIngresso");
        String DataTerminoTermo = rs.getString("DataTerminoTermo");
        String HorarioEstagio = rs.getString("HorarioEstagio");
        
        fTermoCompromisso.TFCodigo.setText(Codigo+"");
        fTermoCompromisso.TFNumTermo.setText(NumTermo);
        fTermoCompromisso.Data.setText(DataTermo);
        if(TipoEstagio.equals("Estágio não Obrigatório"))
                        fTermoCompromisso.RBNaoObrigatorio.setSelected(true);
                    else
                        fTermoCompromisso.RBObrigatorio.setSelected(true);
        fTermoCompromisso.TFGeradorTermo.setText(GeradoPor);
        fTermoCompromisso.TFNomeInterv.setText(Interveniente);
        fTermoCompromisso.TFCNPJInterv.setText(CNPJInterv);
        fTermoCompromisso.TFEndInterv.setText(EndInterv);
        fTermoCompromisso.TFNumEndInterv.setText(NumEndInterv);
        fTermoCompromisso.TFCEPInterv.setText(CEPInterv);
        fTermoCompromisso.TFBairroInterv.setText(BairroInterv);
        fTermoCompromisso.TFCidadeInterv.setText(CidadeInterv);
        fTermoCompromisso.TFEstadoInterv.setText(EstadoInterv);
        fTermoCompromisso.TFTelInterv.setText(TelInterv);
        fTermoCompromisso.TFRepInterv.setText(RepInterv);
        fTermoCompromisso.TFCargoRepInterv.setText(CargoRepInterv);
        fTermoCompromisso.TFRespInterv.setText(RespInterv);
        fTermoCompromisso.TFCargoRespInterv.setText(CargoRespInterv);
        fTermoCompromisso.TFNomeConc.setText(Concedente);
        fTermoCompromisso.TFCNPJConc.setText(CNPJConc);
        fTermoCompromisso.TFEndConc.setText(EndConc);
        fTermoCompromisso.TFNumEndConc.setText(NumEndConc);
        fTermoCompromisso.TFCEPConc.setText(CEPConc);
        fTermoCompromisso.TFBairroConc.setText(BairroConc);
        fTermoCompromisso.TFCidadeConc.setText(CidadeConc);
        fTermoCompromisso.TFEstadoConc.setText(EstadoConc);
        fTermoCompromisso.TFTelConc.setText(TelConc);
        fTermoCompromisso.TFRepConc.setText(RepConc);
        fTermoCompromisso.TFCPFRepConc.setText(CPFRepConc);
        fTermoCompromisso.TFCargoRepConc.setText(CargoRepConc);
        fTermoCompromisso.TFRespConc.setText(RespConc);
        fTermoCompromisso.TFCPFRespConc.setText(CPFRespConc);
        fTermoCompromisso.TFCargoRespConc.setText(CargoRespConc);
        fTermoCompromisso.TFNomeEst.setText(Estagiario);
        fTermoCompromisso.TFCPFEst.setText(CPFEstag);
        fTermoCompromisso.TFDataNascEst.setText(DataNascEstag);
        fTermoCompromisso.TFEndEst.setText(EndEstag);
        fTermoCompromisso.TFNumEndEst.setText(NumEndEstag);
        fTermoCompromisso.TFCEPEst.setText(CEPEstag);
        fTermoCompromisso.TFBairroEst.setText(BairroEstag);
        fTermoCompromisso.TFCidadeEst.setText(CidadeEstag);
        fTermoCompromisso.TFEstadoEst.setText(EstadoEstag);
        fTermoCompromisso.TFTelEst.setText(TelEstag);
        fTermoCompromisso.TFCursoEst.setText(CursoEstag);
        fTermoCompromisso.TFEmailEst.setText(EmailEstag);
        fTermoCompromisso.TFSemestreEngresso.setText(SemestreIngresso);
        fTermoCompromisso.TFAnoEngresso.setText(AnoIngresso);
        fTermoCompromisso.TFHorarioEstagio.setText(HorarioEstagio);
        fTermoCompromisso.TFDataTerminoTermo.setText(DataTerminoTermo);
        
                }
               rs.close();
               
       fTermoCompromisso.TFPesquisaTermo.setEnabled(false);
       fTermoCompromisso.BAtualizarTermo.setEnabled(true);
       fTermoCompromisso.BCadastrarTermo.setEnabled(false);
       fTermoCompromisso.BExcluirTermo.setEnabled(true);
       fTermoCompromisso.BLimparTermo.setEnabled(true);
       fTermoCompromisso.BGerarPDF.setEnabled(true);
            
            }catch(SQLException e){
                System.out.println("Erro ao consultar Convenio!\n"+e.getMessage());
            }
            
            this.dispose();
            
        } 
        
        }      
    }//GEN-LAST:event_TConsultaTermoObrigatorioMouseClicked

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
    private javax.swing.JTable TConsultaTermoObrigatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
