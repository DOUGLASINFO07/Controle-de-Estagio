package ControleEstagio;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DateFormat;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Curso extends javax.swing.JFrame {

    Connection conn;
    
    public Curso() {
        initComponents();
    }
    
    public Curso(Connection conn) {
        initComponents();
        
        this.conn = conn;
        
        TFCodigoCurso.setVisible(false);
        
        
         Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new java.util.Date()));
        
        
        
       /* 
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome FROM professor ORDER BY nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                CBCoordCurso.addItem(nome);
            }
            rs.close();
        }catch(SQLException e){
            System.out.println("Erro ao consultar curso!\n"+e.getMessage());
        }
        */
        BAtualizarCurso.setEnabled(false);
         BCadastrarCurso.setEnabled(true);
          BExcluirCurso.setEnabled(false);
           BLimparCurso.setEnabled(true);
           
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BCadastrarCurso = new javax.swing.JButton();
        BLimparCurso = new javax.swing.JButton();
        BExcluirCurso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBPesqCurso = new javax.swing.JComboBox();
        TFPesquisaCurso = new javax.swing.JTextField();
        BPesqCurso = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFNomeCurso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TFQuantPeriodo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFHoraEstagio = new javax.swing.JTextField();
        TFHoraEstagioPeriodo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBCoordCurso = new javax.swing.JTextField();
        BFecharCurso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BAtualizarCurso = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        TFCodigoCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BCadastrarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarCurso.setText("Cadastrar");
        BCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarCursoActionPerformed(evt);
            }
        });

        BLimparCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparCurso.setText("Limpar");
        BLimparCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparCursoActionPerformed(evt);
            }
        });

        BExcluirCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirCurso.setText("Excluir");
        BExcluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirCursoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar por:");

        CBPesqCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome do Curso", "Nome do Coordenador do Curso" }));
        CBPesqCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqCursoActionPerformed(evt);
            }
        });

        TFPesquisaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesquisaCursoActionPerformed(evt);
            }
        });
        TFPesquisaCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        BPesqCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqCursoActionPerformed(evt);
            }
        });
        BPesqCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PrecionarEnter(evt);
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
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBPesqCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFPesquisaCurso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPesqCurso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBPesqCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPesquisaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(251, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, new java.awt.Color(154, 207, 57)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome do Curso");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Quantidade de períodos");

        TFNomeCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickMouse(evt);
            }
        });
        TFNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNomeCursoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Coordenador do Curso");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Carga Horária do Estágio");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Maximo de Horas de Estágio por Período");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do Curso");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TFNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFQuantPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBCoordCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFHoraEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFHoraEstagioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFQuantPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(CBCoordCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TFHoraEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TFHoraEstagioPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        BFecharCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharCurso.setText("Voltar");
        BFecharCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharCursoActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Verm_Curso.png"))); // NOI18N

        BAtualizarCurso.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarCurso.setText("Atualizar");
        BAtualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarCursoActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BCadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BLimparCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BExcluirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(BAtualizarCurso)
                            .addGap(44, 44, 44)
                            .addComponent(TFCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BFecharCurso)))
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Data)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrarCurso)
                    .addComponent(BLimparCurso)
                    .addComponent(BExcluirCurso)
                    .addComponent(BFecharCurso)
                    .addComponent(BAtualizarCurso)
                    .addComponent(TFCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarCursoActionPerformed

        String curso = TFNomeCurso.getText();
        
        
            if (!TFNomeCurso.getText().equals("") &&  !TFQuantPeriodo.getText().equals("") &&  !TFHoraEstagioPeriodo.getText().equals("") &&  !CBCoordCurso.getText().equals("")
                &&  !TFHoraEstagio.getText().equals(""))
        {    
        int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Curso de "+curso+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {
        
        
        
        String nome = TFNomeCurso.getText();
        int qtdPeriodos = Integer.parseInt(TFQuantPeriodo.getText());
        String coordenador = CBCoordCurso.getText();
        int chEstagio = Integer.parseInt(TFHoraEstagio.getText());
        int maxChPeriodo = Integer.parseInt(TFHoraEstagioPeriodo.getText());
        
       /* int codigocoord = 0;
        
        try{
            Statement stmt = conn.createStatement();
            try (ResultSet rs2 = stmt.executeQuery("SELECT codigo FROM professor where nome = '"+coordenador+"';")) {
                while(rs2.next()) {
                    codigocoord = rs2.getInt("codigo");
                }
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar!\n"+e.getMessage());
        }*/
       
        try{
                PreparedStatement pstm = conn.prepareStatement("INSERT INTO curso VALUES (null,?,?,?,?,?)");
                pstm.setString(1, nome);
                pstm.setInt(2, qtdPeriodos);
                pstm.setInt(3, chEstagio);
                pstm.setInt(4, maxChPeriodo);
                pstm.setString(5, coordenador);

                pstm.executeUpdate();
            

        
            
            TFNomeCurso.setText("");
            TFHoraEstagio.setText("");
            TFHoraEstagioPeriodo.setText("");
            TFQuantPeriodo.setText("");
            CBCoordCurso.setText("");
            
            BAtualizarCurso.setEnabled(false);
             BCadastrarCurso.setEnabled(true);
              BExcluirCurso.setEnabled(false);
               BLimparCurso.setEnabled(true);
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir curso\n"+e.getMessage());
        }
        }}
        else
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
            
        
    }//GEN-LAST:event_BCadastrarCursoActionPerformed

    private void CBPesqCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqCursoActionPerformed

        TFNomeCurso.setText("");
        TFHoraEstagio.setText("");
        TFHoraEstagioPeriodo.setText("");
        TFQuantPeriodo.setText("");
        CBCoordCurso.setText("");
    }//GEN-LAST:event_CBPesqCursoActionPerformed

    private void BPesqCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqCursoActionPerformed
      
         String ModoPesquisa = CBPesqCurso.getSelectedItem().toString();        
        
        
        String pesquisa = CBPesqCurso.getSelectedItem().toString();
        String valor = TFPesquisaCurso.getText();
        
        consultaCurso cc = new consultaCurso(conn, this, pesquisa, valor);
        cc.setTitle("Consulta de Curso");
        cc.setVisible(true);
        
        CBPesqCurso.setSelectedIndex(0);
        TFPesquisaCurso.setText("");

        
    }//GEN-LAST:event_BPesqCursoActionPerformed

    private void BFecharCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharCursoActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharCursoActionPerformed

    private void BLimparCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparCursoActionPerformed

            TFNomeCurso.setText("");
            TFHoraEstagio.setText("");
            TFHoraEstagioPeriodo.setText("");
            TFQuantPeriodo.setText("");
            CBCoordCurso.setText("");
            
        BAtualizarCurso.setEnabled(false);
         BCadastrarCurso.setEnabled(true);
          BExcluirCurso.setEnabled(false);
           BLimparCurso.setEnabled(true);
  
    }//GEN-LAST:event_BLimparCursoActionPerformed

    private void BExcluirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirCursoActionPerformed

        String curso = TFNomeCurso.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Curso de "+curso+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM Curso WHERE nome = '"+TFNomeCurso.getText()+"'");

                        TFNomeCurso.setText("");
                        TFQuantPeriodo.setText("");
                        CBCoordCurso.setText("");
                        TFHoraEstagio.setText("");
                        TFHoraEstagioPeriodo.setText("");
                        
                                  TFPesquisaCurso.setEnabled(false);
                                   BAtualizarCurso.setEnabled(false);
                                    BCadastrarCurso.setEnabled(true);
                                     BExcluirCurso.setEnabled(false);
                                      BLimparCurso.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Curso\n"+e.getMessage());}

        }
        
    }//GEN-LAST:event_BExcluirCursoActionPerformed

    private void BAtualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarCursoActionPerformed

         //String coordenador = CBCoordCurso.getText();
         String curso = TFNomeCurso.getText();
       
        /*int codigocoord = 0;
        
        try{
            Statement stmt = conn.createStatement();
            try (ResultSet rs2 = stmt.executeQuery("SELECT codigo FROM professor where nome = '"+coordenador+"';")) {
                while(rs2.next()) {
                    codigocoord = rs2.getInt("codigo");
                }
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar!\n"+e.getMessage());
        }
           */   
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Curso "+curso+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE Curso c SET c.nome = '"+TFNomeCurso.getText()+"',"
                    + "c.qtdPeriodos = '"+Integer.parseInt(TFQuantPeriodo.getText())+"',"
                    + "c.CargaHorariaEstagio = '"+Integer.parseInt(TFHoraEstagio.getText())+"',"
                    + "c.MaxHorasPeriodo = '"+Integer.parseInt(TFHoraEstagioPeriodo.getText())+"',"
                    + "c.Coordenador = '"+CBCoordCurso.getText()+"'"
                    + "WHERE c.codigo = '"+TFCodigoCurso.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Curso\n"+e.getMessage());
         
         }
                        TFNomeCurso.setText("");
                        TFQuantPeriodo.setText("");
                        CBCoordCurso.setText("");
                        TFHoraEstagio.setText("");
                        TFHoraEstagioPeriodo.setText("");
                        
                                    BAtualizarCurso.setEnabled(false);
                                    BCadastrarCurso.setEnabled(true);
                                     BExcluirCurso.setEnabled(false);
                                      BLimparCurso.setEnabled(true);
                
    }//GEN-LAST:event_BAtualizarCursoActionPerformed
    }
    private void PrecionarEnter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecionarEnter
      
    }//GEN-LAST:event_PrecionarEnter

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter

        {  
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 
            
             String ModoPesquisa = CBPesqCurso.getSelectedItem().toString();        
        
            
                    String pesquisa = CBPesqCurso.getSelectedItem().toString();
        String valor = TFPesquisaCurso.getText();
        
        consultaCurso cc = new consultaCurso(conn, this, pesquisa, valor);
        cc.setTitle("Consulta de Curso");
        cc.setVisible(true);
        
        CBPesqCurso.setSelectedIndex(0);
        TFPesquisaCurso.setText("");


            }
        }
    }//GEN-LAST:event_Enter

    private void TFPesquisaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesquisaCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesquisaCursoActionPerformed

    private void TFNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNomeCursoActionPerformed



    }//GEN-LAST:event_TFNomeCursoActionPerformed

    private void ClickMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouse
        

    }//GEN-LAST:event_ClickMouse

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Curso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarCurso;
    public javax.swing.JButton BCadastrarCurso;
    public javax.swing.JButton BExcluirCurso;
    private javax.swing.JButton BFecharCurso;
    public javax.swing.JButton BLimparCurso;
    private javax.swing.JButton BPesqCurso;
    public javax.swing.JTextField CBCoordCurso;
    public javax.swing.JComboBox CBPesqCurso;
    private javax.swing.JLabel Data;
    public javax.swing.JTextField TFCodigoCurso;
    public javax.swing.JTextField TFHoraEstagio;
    public javax.swing.JTextField TFHoraEstagioPeriodo;
    public javax.swing.JTextField TFNomeCurso;
    public javax.swing.JTextField TFPesquisaCurso;
    public javax.swing.JTextField TFQuantPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
