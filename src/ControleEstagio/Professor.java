package ControleEstagio;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Professor extends javax.swing.JFrame {

    Connection conn;
    
    public Professor() {
        initComponents();
    }

    public Professor(Connection conn) {
        initComponents();
        
        this.conn = conn;
        
        TFCodigoProfessor.setVisible(false);
        
         Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new java.util.Date()));
        
       /* try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome FROM curso ORDER BY nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                CBCursoProf.addItem(nome);
            }
            rs.close();
        }catch(SQLException e){
            System.out.println("Erro ao consultar curso!\n"+e.getMessage());
        }*/
        
        BAtualizarProfessor.setEnabled(false);
         BCadastrarProfessor.setEnabled(true);
          BExcluirProfessor.setEnabled(false);
           BLimparProfessor.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BCadastrarProfessor = new javax.swing.JButton();
        BLimparProfessor = new javax.swing.JButton();
        BExcluirProfessor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFPesquisaProfessor = new javax.swing.JTextField();
        BPesqProf = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        RBFem = new javax.swing.JRadioButton();
        RBSexoMascProf = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFNomeProf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TFEmailProf = new javax.swing.JTextField();
        TFTelResProf = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFCelularProf = new javax.swing.JFormattedTextField();
        TFTelProf = new javax.swing.JFormattedTextField();
        CBCursoProf = new javax.swing.JTextField();
        BFecharProf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BAtualizarProfessor = new javax.swing.JButton();
        TFCodigoProfessor = new javax.swing.JTextField();
        Data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BCadastrarProfessor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarProfessor.setText("Cadastrar");
        BCadastrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarProfessorActionPerformed(evt);
            }
        });

        BLimparProfessor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparProfessor.setText("Limpar");
        BLimparProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparProfessorActionPerformed(evt);
            }
        });

        BExcluirProfessor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirProfessor.setText("Excluir");
        BExcluirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirProfessorActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText(" Nome do Professor");

        TFPesquisaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesquisaProfessorActionPerformed(evt);
            }
        });
        TFPesquisaProfessor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesquisaProfessorKeyPressed(evt);
            }
        });

        BPesqProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPesquisaProfessor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqProf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPesqProf)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFPesquisaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(251, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, new java.awt.Color(154, 207, 57)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Curso");

        buttonGroup1.add(RBFem);
        RBFem.setText("Fem");

        buttonGroup1.add(RBSexoMascProf);
        RBSexoMascProf.setText("Masc");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Sexo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("E-mail");

        TFTelResProf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TFTelResProf.setText("Tel Residencial");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Celular");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do Professor");

        try {
            TFCelularProf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCelularProf.setFocusLostBehavior(TFCelularProf.COMMIT);

        try {
            TFTelProf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelProf.setFocusLostBehavior(TFTelProf.COMMIT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBSexoMascProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(RBFem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCelularProf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelResProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelProf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEmailProf))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBCursoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBSexoMascProf)
                    .addComponent(jLabel22)
                    .addComponent(RBFem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TFTelResProf)
                    .addComponent(jLabel18)
                    .addComponent(TFEmailProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCelularProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTelProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CBCursoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        BFecharProf.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharProf.setText("Voltar");
        BFecharProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharProfActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Verm_Prof.png"))); // NOI18N

        BAtualizarProfessor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarProfessor.setText("Atualizar");
        BAtualizarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarProfessorActionPerformed(evt);
            }
        });

        TFCodigoProfessor.setEditable(false);

        Data.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BCadastrarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BLimparProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BExcluirProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAtualizarProfessor)
                                .addGap(37, 37, 37)
                                .addComponent(TFCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(BFecharProf))
                            .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(Data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrarProfessor)
                    .addComponent(BLimparProfessor)
                    .addComponent(BExcluirProfessor)
                    .addComponent(BFecharProf)
                    .addComponent(BAtualizarProfessor)
                    .addComponent(TFCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarProfessorActionPerformed

        String professor = TFNomeProf.getText();
        
             if (!TFNomeProf.getText().equals("") && 
                !CBCursoProf.getText().equals("") &&  
                !TFEmailProf.getText().equals(""))
        {
        
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Professor "+professor+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {
        
        String NomeProf = TFNomeProf.getText();
        String SexoMascProf = (RBSexoMascProf.isSelected()?"M":"F");
        String CelularProf = TFCelularProf.getText();
        String TelProf = TFTelProf.getText();
        String EmailProf = TFEmailProf.getText();
        String CursoProfessor = CBCursoProf.getText();
        //String curso = CBCursoProf.getText();
 
        /*try{
            Statement stmt = conn.createStatement();
            ResultSet rs2 = stmt.executeQuery("SELECT codigo FROM curso where nome = '"+curso+"';");
            while(rs2.next())
                codigocurso = rs2.getInt("codigo");
            rs2.close();
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar!\n"+e.getMessage());
        }*/
  
        try{
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO professor VALUES (null,?,?,?,?,?,?)");
            pstm.setString(1, NomeProf);
            pstm.setString(2, SexoMascProf);
            pstm.setString(3, CelularProf);
            pstm.setString(4, TelProf);
            pstm.setString(5, EmailProf);
            pstm.setString(6, CursoProfessor);

            pstm.executeUpdate();
            
            TFCodigoProfessor.setText("");
            TFNomeProf.setText("");
            buttonGroup1.clearSelection();
            TFCelularProf.setText("");
            TFTelProf.setText("");
            TFEmailProf.setText("");
            CBCursoProf.setText("");
           
        }catch(SQLException e){
            System.out.println("Erro ao inserir Professor\n"+e.getMessage());
        }
        }}
       else
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
        
    }//GEN-LAST:event_BCadastrarProfessorActionPerformed

    private void BPesqProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqProfActionPerformed
       
        String valor = TFPesquisaProfessor.getText();
        
        ConsultaProfessor cp = new ConsultaProfessor(conn, this, valor);
        cp.setTitle("Consulta de Professor");
        cp.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_BPesqProfActionPerformed

    private void BFecharProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharProfActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharProfActionPerformed

    private void BLimparProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparProfessorActionPerformed

            TFCodigoProfessor.setText("");
            TFNomeProf.setText("");
            buttonGroup1.clearSelection();
            TFCelularProf.setText("");
            TFTelProf.setText("");
            TFEmailProf.setText("");
            CBCursoProf.setText("");
            
        BAtualizarProfessor.setEnabled(false);
         BCadastrarProfessor.setEnabled(true);
          BExcluirProfessor.setEnabled(false);
           BLimparProfessor.setEnabled(true);

    }//GEN-LAST:event_BLimparProfessorActionPerformed

    private void BExcluirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirProfessorActionPerformed
        
        String professor = TFNomeProf.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Professor "+professor+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM professor WHERE nome = '"+TFNomeProf.getText()+"'");

            TFCodigoProfessor.setText("");
            TFNomeProf.setText("");
            buttonGroup1.clearSelection();
            TFCelularProf.setText("");
            TFTelProf.setText("");
            TFEmailProf.setText("");
            CBCursoProf.setText("");
                        
        BAtualizarProfessor.setEnabled(false);
         BCadastrarProfessor.setEnabled(true);
          BExcluirProfessor.setEnabled(false);
           BLimparProfessor.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Curso\n"+e.getMessage());}

        }
        
    
    }//GEN-LAST:event_BExcluirProfessorActionPerformed

    private void BAtualizarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarProfessorActionPerformed
         
        //String curso = CBCursoProf.getText();
        String professor = TFNomeProf.getText();
       
        /*int codigoCurso = 0;
        
        try{
            Statement stmt = conn.createStatement();
            try (ResultSet rs2 = stmt.executeQuery("SELECT codigo FROM curso where nome = '"+curso+"';")) {
                while(rs2.next()) {
                    codigoCurso = rs2.getInt("codigo");
                }
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar!\n"+e.getMessage());
        }
            */  
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Professor "+professor+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE professor  SET nome = '"+TFNomeProf.getText()+"',"
                    + "sexo = '"+(RBSexoMascProf.isSelected()?"M":"F")+"',"
                    + "celular = '"+TFCelularProf.getText()+"',"
                    + "telefone = '"+TFTelProf.getText()+"',"
                    + "CursoProfessor = '"+CBCursoProf.getText()+"',"
                    + "email = '"+TFEmailProf.getText()+"'"
                    + "WHERE codigo = '"+TFCodigoProfessor.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Professor\n"+e.getMessage());
         
         }
            TFCodigoProfessor.setText("");
            TFNomeProf.setText("");
            buttonGroup1.clearSelection();
            TFCelularProf.setText("");
            TFTelProf.setText("");
            TFEmailProf.setText("");
            CBCursoProf.setText("");
                        
        BAtualizarProfessor.setEnabled(false);
         BCadastrarProfessor.setEnabled(true);
          BExcluirProfessor.setEnabled(false);
           BLimparProfessor.setEnabled(true);
    } 
        
    }//GEN-LAST:event_BAtualizarProfessorActionPerformed

    private void TFPesquisaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesquisaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesquisaProfessorActionPerformed

    private void TFPesquisaProfessorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesquisaProfessorKeyPressed
        {  
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 
            
        String valor = TFPesquisaProfessor.getText();
        
        ConsultaProfessor cp = new ConsultaProfessor(conn, this, valor);
        cp.setTitle("Consulta de Professor");
        cp.setVisible(true); 
        
        
        TFPesquisaProfessor.setText("");


            }
        }
    }//GEN-LAST:event_TFPesquisaProfessorKeyPressed

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
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Professor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarProfessor;
    public javax.swing.JButton BCadastrarProfessor;
    public javax.swing.JButton BExcluirProfessor;
    private javax.swing.JButton BFecharProf;
    public javax.swing.JButton BLimparProfessor;
    private javax.swing.JButton BPesqProf;
    public javax.swing.JTextField CBCursoProf;
    private javax.swing.JLabel Data;
    public javax.swing.JRadioButton RBFem;
    public javax.swing.JRadioButton RBSexoMascProf;
    public javax.swing.JFormattedTextField TFCelularProf;
    public javax.swing.JTextField TFCodigoProfessor;
    public javax.swing.JTextField TFEmailProf;
    public javax.swing.JTextField TFNomeProf;
    private javax.swing.JTextField TFPesquisaProfessor;
    public javax.swing.JFormattedTextField TFTelProf;
    private javax.swing.JLabel TFTelResProf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
