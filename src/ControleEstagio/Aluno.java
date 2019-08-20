package ControleEstagio;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Aluno extends javax.swing.JFrame {

Connection conn ;
    
    public Aluno() {
        initComponents();
    }
    
    public Aluno(Connection conn) {
        initComponents();
        
        this.conn = conn;
        
        TFCodigoAluno.setVisible(false);
        
       try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome FROM curso ORDER BY nome");

            while(rs.next()){
                String nome = rs.getString("nome");
                CBCursoAluno.addItem(nome);
            }
            rs.close();
        }catch(SQLException e){
            System.out.println("Erro ao consultar Curso!\n"+e.getMessage());
        }
        
         BAtualizarAluno.setEnabled(false);
         BCadastrarAluno.setEnabled(true);
          BExcluirAluno.setEnabled(false);
           BLimparAluno.setEnabled(true);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BCadastrarAluno = new javax.swing.JButton();
        BLimparAluno = new javax.swing.JButton();
        BExcluirAluno = new javax.swing.JButton();
        BFecharAluno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBPesqAluno = new javax.swing.JComboBox();
        BPesqAluno = new javax.swing.JButton();
        TFPesquisaAluno = new javax.swing.JTextField();

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TFAnoIngressoAluno = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        RBSexoFemAluno = new javax.swing.JRadioButton();
        RBSexoMascAluno = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFRGAluno = new javax.swing.JTextField();
        TFMatriculaAluno = new javax.swing.JTextField();
        TFNomeAluno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFEmailAluno = new javax.swing.JTextField();
        TFEndAluno = new javax.swing.JTextField();
        TFNumEndAluno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CBEstadoAluno = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFCidadeAluno = new javax.swing.JTextField();
        TFBairroAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFNascAluno = new javax.swing.JFormattedTextField();
        TFCPFAluno = new javax.swing.JFormattedTextField();
        TFTelAluno = new javax.swing.JFormattedTextField();
        TFCelularAluno = new javax.swing.JFormattedTextField();
        TFCEPAluno = new javax.swing.JFormattedTextField();
        CBCursoAluno = new javax.swing.JComboBox();
        RBPrimeiroSemestreAluno = new javax.swing.JRadioButton();
        RBSegundoSemestreAluno = new javax.swing.JRadioButton();
        BAtualizarAluno = new javax.swing.JButton();
        TFCodigoAluno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Vermelho.png"))); // NOI18N

        BCadastrarAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarAluno.setText("Cadastrar");
        BCadastrarAluno.setToolTipText("Realiza o Cadastro");
        BCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarAlunoActionPerformed(evt);
            }
        });

        BLimparAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparAluno.setText("Limpar");
        BLimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparAlunoActionPerformed(evt);
            }
        });

        BExcluirAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirAluno.setText("Excluir");
        BExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirAlunoActionPerformed(evt);
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

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar por:");

        CBPesqAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome do Aluno", "Matrícula", "Número do RG" }));
        CBPesqAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBPesqAlunoMouseClicked(evt);
            }
        });
        CBPesqAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqAlunoActionPerformed(evt);
            }
        });

        BPesqAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqAlunoActionPerformed(evt);
            }
        });

        TFPesquisaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFPesquisaAlunoMouseClicked(evt);
            }
        });
        TFPesquisaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesquisaAlunoActionPerformed(evt);
            }
        });
        TFPesquisaAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesquisaAlunoKeyPressed(evt);
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
                        .addComponent(CBPesqAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPesquisaAluno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPesqAluno)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CBPesqAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPesquisaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(251, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, new java.awt.Color(154, 207, 57)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Matrícula");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Semestre de  Ingresso");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Ano de Ingresso");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Curso");

        buttonGroup1.add(RBSexoFemAluno);
        RBSexoFemAluno.setText("Fem");

        buttonGroup1.add(RBSexoMascAluno);
        RBSexoMascAluno.setText("Masc");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Sexo");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("RG");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nome");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("CPF");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Endereço");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("E-mail");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nº");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Data Nascimento");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Bairro");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Tel Residencial");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Celular");

        CBEstadoAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI ", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));
        CBEstadoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBEstadoAlunoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Estado");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Cidade");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CEP");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do Aluno");

        try {
            TFNascAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFNascAluno.setFocusLostBehavior(TFNascAluno.COMMIT);

        try {
            TFCPFAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFAluno.setFocusLostBehavior(TFCPFAluno.COMMIT);

        try {
            TFTelAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelAluno.setFocusLostBehavior(TFTelAluno.COMMIT);

        try {
            TFCelularAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCelularAluno.setFocusLostBehavior(TFCelularAluno.COMMIT);

        try {
            TFCEPAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPAluno.setCaretPosition(5);
        TFCEPAluno.setFocusLostBehavior(TFCEPAluno.COMMIT);
        TFCEPAluno.setVerifyInputWhenFocusTarget(false);
        TFCEPAluno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFCEPAlunoCaretUpdate(evt);
            }
        });

        CBCursoAluno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "***   Selecione   ***" }));

        buttonGroup2.add(RBPrimeiroSemestreAluno);
        RBPrimeiroSemestreAluno.setText("1º");

        buttonGroup2.add(RBSegundoSemestreAluno);
        RBSegundoSemestreAluno.setText("2º");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNomeAluno))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroAluno))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(CBEstadoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEmailAluno)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCPFAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(16, 16, 16)
                        .addComponent(RBSexoMascAluno)
                        .addGap(18, 18, 18)
                        .addComponent(RBSexoFemAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBCursoAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFAnoIngressoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBPrimeiroSemestreAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBSegundoSemestreAluno)
                        .addGap(32, 32, 32))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFMatriculaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TFNumEndAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(TFBairroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(TFCidadeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(CBEstadoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCEPAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(TFEmailAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTelAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCelularAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(TFRGAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(RBSexoMascAluno)
                    .addComponent(RBSexoFemAluno)
                    .addComponent(TFNascAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCPFAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(TFAnoIngressoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(CBCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBPrimeiroSemestreAluno)
                    .addComponent(RBSegundoSemestreAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BAtualizarAluno.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarAluno.setText("Atualizar");
        BAtualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarAlunoActionPerformed(evt);
            }
        });

        TFCodigoAluno.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(TFCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BCadastrarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BLimparAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BExcluirAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAtualizarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharAluno))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrarAluno)
                    .addComponent(BExcluirAluno)
                    .addComponent(BFecharAluno)
                    .addComponent(BAtualizarAluno)
                    .addComponent(BLimparAluno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPesqAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqAlunoActionPerformed

         String ModoPesquisa = CBPesqAluno.getSelectedItem().toString();        
      
        String pesquisa = CBPesqAluno.getSelectedItem().toString();
        String valor = TFPesquisaAluno.getText();
        
        ConsultaAluno ca = new ConsultaAluno(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Aluno");
        ca.setVisible(true);
        
        CBPesqAluno.setSelectedIndex(0);
        TFPesquisaAluno.setText("");

    }//GEN-LAST:event_BPesqAlunoActionPerformed

    private void BCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarAlunoActionPerformed
        
        String aluno = TFNomeAluno.getText();
        
        if (!TFNomeAluno.getText().equals("") && 
                !TFEndAluno.getText().equals("") &&  
                !CBCursoAluno.getSelectedItem().equals("***   Selecione   ***") && 
                !CBEstadoAluno.getSelectedItem().equals(0) &&
                !TFBairroAluno.getText().equals("") &&  
                !TFCEPAluno.getText().equals("") &&  
                !TFCidadeAluno.getText().equals("") &&  
                !TFCelularAluno.getText().equals("") &&  
                !TFTelAluno.getText().equals("") &&  
                !TFEmailAluno.getText().equals("") &&
                !buttonGroup1.getSelection().equals("") &&
                !TFNascAluno.getText().equals("") && 
                !TFCPFAluno.getText().equals("") &&  
                !TFRGAluno.getText().equals("") &&  
                !TFNumEndAluno.getText().equals(""))
        {
            
            int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Aluno "+aluno+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {
        
        
        String MatriculaAluno = TFMatriculaAluno.getText();
        String NomeAluno = TFNomeAluno.getText();
        String EndAluno = TFEndAluno.getText();
        String BairroAluno = TFBairroAluno.getText();
        String CEPAluno = TFCEPAluno.getText();
        String NumEnd = TFNumEndAluno.getText();
        String CidadeAluno = TFCidadeAluno.getText();
        String Estado = CBEstadoAluno.getSelectedItem().toString();
        String CelularAluno = TFCelularAluno.getText();    
        String TelAluno = TFTelAluno.getText();
        String EmailAluno = TFEmailAluno.getText();
        String NascAluno = TFNascAluno.getText();
        String CPFAluno = TFCPFAluno.getText();
        String RGAluno = TFRGAluno.getText();
        String SexoAluno = (RBSexoMascAluno.isSelected()?"M":"F");
        int IngressoAluno = Integer.parseInt(TFAnoIngressoAluno.getText());
        String SemIngressoAluno= (RBPrimeiroSemestreAluno.isSelected()?"1º":"2º");
        String curso = CBCursoAluno.getSelectedItem().toString();
        
              
        
      /* try{
            Statement stmt = conn.createStatement();
            try (ResultSet rs2 = stmt.executeQuery("SELECT codigo FROM curso where nome = '"+curso+"';")) {
                while(rs2.next()) {
                    CodigoCurso = rs2.getInt("codigo");
                }
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao cadastrar!\n"+e.getMessage());
        } */
        
        try{
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO aluno VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                
            pstm.setString(1, MatriculaAluno);
            pstm.setString(2, NomeAluno);
            pstm.setString(3, EndAluno);
            pstm.setString(4, NumEnd);
            pstm.setString(5, BairroAluno);
            pstm.setString(6, CEPAluno);
            pstm.setString(7, CidadeAluno);
            pstm.setString(8, Estado);
            pstm.setString(9, CelularAluno);
            pstm.setString(10, TelAluno);
            pstm.setString(11, EmailAluno);
            pstm.setString(12, NascAluno);
            pstm.setString(13, CPFAluno);
            pstm.setString(14, RGAluno);
            pstm.setString(15, SexoAluno);             
            pstm.setInt(16, IngressoAluno);
            pstm.setString(17, SemIngressoAluno);
            pstm.setString(18, curso);

            pstm.executeUpdate();
            pstm.close();
            
               
        TFMatriculaAluno.setText("");
        TFNomeAluno.setText("");
        TFEndAluno.setText("");
        TFNumEndAluno.setText("");
        TFBairroAluno.setText("");
        TFCEPAluno.setText("");
        TFCidadeAluno.setText("");
        CBEstadoAluno.setSelectedIndex(0);
        TFCelularAluno.setText("");    
        TFTelAluno.setText("");
        TFEmailAluno.setText("");
        TFNascAluno.setText("");
        TFCPFAluno.setText("");
        CBCursoAluno.setSelectedItem("***   Selecione   ***");
        TFRGAluno.setText("");
        buttonGroup1.clearSelection();
        TFAnoIngressoAluno.setText("");
       buttonGroup2.clearSelection(); 
        
        }
        
        catch(SQLException | HeadlessException e){
            System.out.println("Erro ao inserir aluno\n"+e.getMessage());
            
        }
        
        }

        BAtualizarAluno.setEnabled(false);
         BCadastrarAluno.setEnabled(true);
          BExcluirAluno.setEnabled(false);
           BLimparAluno.setEnabled(true);
           
        } 
        else
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
         
    }//GEN-LAST:event_BCadastrarAlunoActionPerformed

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharAlunoActionPerformed

    private void CBPesqAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqAlunoActionPerformed
       
        TFMatriculaAluno.setText("");
        TFNomeAluno.setText("");
        TFEndAluno.setText("");
        TFNumEndAluno.setText("");
        TFBairroAluno.setText("");
        TFCEPAluno.setText("");
        TFCidadeAluno.setText("");
        CBEstadoAluno.setSelectedIndex(0);
        TFCelularAluno.setText("");    
        TFTelAluno.setText("");
        TFEmailAluno.setText("");
        TFNascAluno.setText("");
        TFCPFAluno.setText("");
        TFRGAluno.setText("");
        CBCursoAluno.setSelectedItem("***   Selecione   ***");
        buttonGroup1.clearSelection();
        TFAnoIngressoAluno.setText("");
        buttonGroup2.clearSelection();
         
    }//GEN-LAST:event_CBPesqAlunoActionPerformed

    private void CBEstadoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBEstadoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBEstadoAlunoActionPerformed

    private void BLimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparAlunoActionPerformed

        TFMatriculaAluno.setText("");
        TFNomeAluno.setText("");
        TFEndAluno.setText("");
        TFNumEndAluno.setText("");
        TFBairroAluno.setText("");
        TFCEPAluno.setText("");
        TFCidadeAluno.setText("");
        CBEstadoAluno.setSelectedIndex(0);
        TFCelularAluno.setText("");    
        TFTelAluno.setText("");
        TFEmailAluno.setText("");
        TFNascAluno.setText("");
        TFCPFAluno.setText("");
        TFRGAluno.setText("");
        CBCursoAluno.setSelectedItem("***   Selecione   ***");
        buttonGroup1.clearSelection();
        TFAnoIngressoAluno.setText("");
        buttonGroup2.clearSelection();

        BAtualizarAluno.setEnabled(false);
         BCadastrarAluno.setEnabled(true);
          BExcluirAluno.setEnabled(false);
           BLimparAluno.setEnabled(true);
           
           /*this.dispose();
           Aluno aluno = new Aluno();
           aluno.setVisible(true);*/
    }//GEN-LAST:event_BLimparAlunoActionPerformed

    private void BExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirAlunoActionPerformed
        
         String aluno = TFNomeAluno.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Aluno "+aluno+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM aluno WHERE nome = '"+TFNomeAluno.getText()+"'");

        TFMatriculaAluno.setText("");
        TFNomeAluno.setText("");
        TFEndAluno.setText("");
        TFNumEndAluno.setText("");
        TFBairroAluno.setText("");
        TFCEPAluno.setText("");
        TFCidadeAluno.setText("");
        CBEstadoAluno.setSelectedIndex(0);
        TFCelularAluno.setText("");    
        TFTelAluno.setText("");
        TFEmailAluno.setText("");
        TFNascAluno.setText("");
        TFCPFAluno.setText("");
        TFRGAluno.setText("");
        CBCursoAluno.setSelectedItem("***   Selecione   ***");
        buttonGroup1.clearSelection();
        TFAnoIngressoAluno.setText("");
        buttonGroup2.clearSelection(); 

        BAtualizarAluno.setEnabled(false);
         BCadastrarAluno.setEnabled(true);
          BExcluirAluno.setEnabled(false);
           BLimparAluno.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Curso\n"+e.getMessage());}

        }
        
    }//GEN-LAST:event_BExcluirAlunoActionPerformed

    private void BAtualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarAlunoActionPerformed
        
         String curso = CBCursoAluno.getSelectedItem().toString();
         String aluno = TFNomeAluno.getText();
       
     /*   int codigoCurso = 0;
        
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
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Aluno "+aluno+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE aluno SET nome = '"+TFNomeAluno.getText()+"',"
                    + "Matricula = '"+TFMatriculaAluno.getText()+"',"
                    + "Endereco = '"+TFEndAluno.getText()+"',"
                    + "numEnd = '"+TFNumEndAluno.getText()+"',"
                    + "bairro = '"+TFBairroAluno.getText()+"',"
                    + "CEP = '"+TFCEPAluno.getText()+"',"
                    + "Cidade = '"+TFCidadeAluno.getText()+"',"
                    + "Estado = '"+CBEstadoAluno.getSelectedItem()+"',"
                    + "telCelular = '"+TFCelularAluno.getText()+"',"
                    + "telResidencial = '"+TFTelAluno.getText()+"',"
                    + "email = '"+TFEmailAluno.getText()+"',"
                    + "dtNasc = '"+TFNascAluno.getText()+"',"
                    + "CPF = '"+TFCPFAluno.getText()+"',"
                    + "CursoAluno = '"+CBCursoAluno.getSelectedItem().toString()+"',"
                    + "RG = '"+TFRGAluno.getText()+"',"
                    + "sexo = '"+(RBSexoMascAluno.isSelected()?"M":"F")+"',"
                    + "anoIngresso = '"+Integer.parseInt(TFAnoIngressoAluno.getText())+"',"
                    + "SemestreIngresso = '"+(RBPrimeiroSemestreAluno.isSelected()?"1º":"2º")+"'"
                    + "WHERE codigo = '"+TFCodigoAluno.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Aluno\n"+e.getMessage());
         
         }
        TFMatriculaAluno.setText("");
        TFNomeAluno.setText("");
        TFEndAluno.setText("");
        TFNumEndAluno.setText("");
        TFBairroAluno.setText("");
        TFCEPAluno.setText("");
        TFCidadeAluno.setText("");
        CBEstadoAluno.setSelectedIndex(0);
        TFCelularAluno.setText("");    
        TFTelAluno.setText("");
        TFEmailAluno.setText("");
        TFNascAluno.setText("");
        TFCPFAluno.setText("");
        TFRGAluno.setText("");
        CBCursoAluno.setSelectedItem("***   Selecione   ***");
        buttonGroup1.clearSelection();
        TFAnoIngressoAluno.setText("");
        buttonGroup2.clearSelection();

        BAtualizarAluno.setEnabled(false);
         BCadastrarAluno.setEnabled(true);
          BExcluirAluno.setEnabled(false);
           BLimparAluno.setEnabled(true);
                
    }  
        
    }//GEN-LAST:event_BAtualizarAlunoActionPerformed

    private void TFCEPAlunoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFCEPAlunoCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCEPAlunoCaretUpdate

    private void CBPesqAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBPesqAlunoMouseClicked
       
   
    }//GEN-LAST:event_CBPesqAlunoMouseClicked

    private void TFPesquisaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesquisaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesquisaAlunoActionPerformed

    private void TFPesquisaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFPesquisaAlunoMouseClicked

        
    }//GEN-LAST:event_TFPesquisaAlunoMouseClicked

    private void TFPesquisaAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesquisaAlunoKeyPressed

        
 String ModoPesquisa = CBPesqAluno.getSelectedItem().toString();        
        
 if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 
 
        
        String pesquisa = CBPesqAluno.getSelectedItem().toString();
        String valor = TFPesquisaAluno.getText();
        
        ConsultaAluno ca = new ConsultaAluno(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Aluno");
        ca.setVisible(true);
        
        CBPesqAluno.setSelectedIndex(0);
        TFPesquisaAluno.setText("");
               
 }
    }//GEN-LAST:event_TFPesquisaAlunoKeyPressed

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
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluno().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarAluno;
    public javax.swing.JButton BCadastrarAluno;
    public javax.swing.JButton BExcluirAluno;
    private javax.swing.JButton BFecharAluno;
    public javax.swing.JButton BLimparAluno;
    private javax.swing.JButton BPesqAluno;
    public javax.swing.JComboBox CBCursoAluno;
    public javax.swing.JComboBox CBEstadoAluno;
    public javax.swing.JComboBox CBPesqAluno;
    public javax.swing.JRadioButton RBPrimeiroSemestreAluno;
    public javax.swing.JRadioButton RBSegundoSemestreAluno;
    public javax.swing.JRadioButton RBSexoFemAluno;
    public javax.swing.JRadioButton RBSexoMascAluno;
    public javax.swing.JTextField TFAnoIngressoAluno;
    public javax.swing.JTextField TFBairroAluno;
    public javax.swing.JFormattedTextField TFCEPAluno;
    public javax.swing.JFormattedTextField TFCPFAluno;
    public javax.swing.JFormattedTextField TFCelularAluno;
    public javax.swing.JTextField TFCidadeAluno;
    public javax.swing.JTextField TFCodigoAluno;
    public javax.swing.JTextField TFEmailAluno;
    public javax.swing.JTextField TFEndAluno;
    public javax.swing.JTextField TFMatriculaAluno;
    public javax.swing.JFormattedTextField TFNascAluno;
    public javax.swing.JTextField TFNomeAluno;
    public javax.swing.JTextField TFNumEndAluno;
    private javax.swing.JTextField TFPesquisaAluno;
    public javax.swing.JTextField TFRGAluno;
    public javax.swing.JFormattedTextField TFTelAluno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
