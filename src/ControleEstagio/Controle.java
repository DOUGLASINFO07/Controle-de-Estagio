package ControleEstagio;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Controle extends javax.swing.JFrame {

    private Connection conn = null;

    public Controle() {
        initComponents();
        
    }
    
    public Controle(Connection conn) {
        initComponents();
        
        this.conn = conn;
        
        TFCodigo.setVisible(false);
                
        TFCurso.setEnabled(false);
        TFSemestre.setEnabled(false);
        TFAno.setEnabled(false);
        TFConcedente.setEnabled(false);
        TFInicioEstagio.setEnabled(false);
        TFTerminoEstagio.setEnabled(false);
        TFHorasEstagio.setEnabled(false);
        TFHorasEstagioConcluidas.setEnabled(false);
        TFHorasEstagioPendentes.setEnabled(false);
        TFProfessorOrientador.setEnabled(false);
        RBEstagioNormal.setEnabled(true);
        RBestagioEmprego.setEnabled(true);
        RBDeclaracaoNormal.setEnabled(false);
        RBFrequenciaNormal.setEnabled(false);
        RBAvaliacaoSupervisorNormal.setEnabled(false);
        RBTCENormal1.setEnabled(false);
        RBRelatorioNormal.setEnabled(false);
        RBSim.setEnabled(false);
        RBNao.setEnabled(false);
        RBTCEEmprego.setEnabled(false);
        RBDeclaracaoAtribuicaoEmprego.setEnabled(false);
        RBFrequenciaEmprego.setEnabled(false);
        RBAvaliacaoEmprego.setEnabled(false);
        RBRelatorioEmprego.setEnabled(false);
        RBCarteiraEmprego.setEnabled(false);
        
        BAtualizarControle.setEnabled(false);
        BExcluirControle.setEnabled(false);
        BCadastrarControle.setEnabled(false);
        
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel26 = new javax.swing.JLabel();
        BCadastrarControle = new javax.swing.JButton();
        BLimparControle = new javax.swing.JButton();
        BExcluirControle = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBPesqControle = new javax.swing.JComboBox();
        TFPesqControle = new javax.swing.JTextField();
        BPesqControle = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFCurso = new javax.swing.JTextField();
        TFHorasEstagioConcluidas = new javax.swing.JTextField();
        TFNomeAluno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TFTerminoEstagio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFConcedente = new javax.swing.JTextField();
        TFNumeroTCE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TFProfessorOrientador = new javax.swing.JTextField();
        TFHorasEstagio = new javax.swing.JTextField();
        RBEstagioNormal = new javax.swing.JRadioButton();
        RBestagioEmprego = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        TFSemestre = new javax.swing.JTextField();
        TFInicioEstagio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFHorasEstagioPendentes = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        RBDeclaracaoNormal = new javax.swing.JRadioButton();
        RBAvaliacaoSupervisorNormal = new javax.swing.JRadioButton();
        RBFrequenciaNormal = new javax.swing.JRadioButton();
        RBRelatorioNormal = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        RBSim = new javax.swing.JRadioButton();
        RBNao = new javax.swing.JRadioButton();
        RBDeclaracaoAtribuicaoEmprego = new javax.swing.JRadioButton();
        RBFrequenciaEmprego = new javax.swing.JRadioButton();
        RBAvaliacaoEmprego = new javax.swing.JRadioButton();
        RBRelatorioEmprego = new javax.swing.JRadioButton();
        RBTCEEmprego = new javax.swing.JRadioButton();
        RBCarteiraEmprego = new javax.swing.JRadioButton();
        RBTCENormal1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        TFAno = new javax.swing.JTextField();
        BBuscarDados = new javax.swing.JButton();
        TFCodigo = new javax.swing.JTextField();
        BFecharControle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BAtualizarControle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Verm_Controle.png"))); // NOI18N

        BCadastrarControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarControle.setText("Cadastrar");
        BCadastrarControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarControleActionPerformed(evt);
            }
        });

        BLimparControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparControle.setText("Limpar");
        BLimparControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparControleActionPerformed(evt);
            }
        });

        BExcluirControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirControle.setText("Excluir");
        BExcluirControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirControleActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar por:");

        CBPesqControle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome Estagiário", "Número TCE" }));
        CBPesqControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqControleActionPerformed(evt);
            }
        });

        TFPesqControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesqControleActionPerformed(evt);
            }
        });
        TFPesqControle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesqControleKeyPressed(evt);
            }
        });

        BPesqControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqControleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(CBPesqControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFPesqControle, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqControle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFPesqControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBPesqControle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(BPesqControle))
        );

        jPanel3.setBackground(new java.awt.Color(251, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, new java.awt.Color(154, 207, 57)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nome Aluno");

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Estágio Normal");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Data Inicio Estágio");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Numero TCE");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Curso");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Concedente");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Professor Orientador");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Data Termino Estágio");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Horas de Estágios");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados do Estágio");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Horas de Estágio Concluídas");

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Check List de Documentos da Pasta do Estágio");

        buttonGroup2.add(RBEstagioNormal);
        RBEstagioNormal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RBEstagioNormal.setText("Estágio Normal");
        RBEstagioNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBEstagioNormalActionPerformed(evt);
            }
        });

        buttonGroup2.add(RBestagioEmprego);
        RBestagioEmprego.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RBestagioEmprego.setText("Estágio realizado no próprio emprego");
        RBestagioEmprego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBestagioEmpregoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Turma");

        TFInicioEstagio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFInicioEstagioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Horas de Estágio Pendentes");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Estágio realizado no próprio emprego");

        RBDeclaracaoNormal.setText("Declaração de Atribuições");

        RBAvaliacaoSupervisorNormal.setText("Avaliação do Supervisor");

        RBFrequenciaNormal.setText("Ficha de Frequência");

        RBRelatorioNormal.setText("Relatório de Estágio");

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Estágio Realizado no IF sul de Minas");

        buttonGroup3.add(RBSim);
        RBSim.setText("SIM");

        buttonGroup3.add(RBNao);
        RBNao.setText("NÃO");

        RBDeclaracaoAtribuicaoEmprego.setText("Declaração de Atribuições");

        RBFrequenciaEmprego.setText("Ficha de Frequência");

        RBAvaliacaoEmprego.setText("Avaliação do Supervisor");

        RBRelatorioEmprego.setText("Relatório de Estágio");

        RBTCEEmprego.setText("TCE Assinado");

        RBCarteiraEmprego.setText("Cópia carteira de trabalho");

        RBTCENormal1.setText("TCE Assinado");

        jLabel9.setText("Semestre de ");

        BBuscarDados.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BBuscarDados.setText("Buscar Dados");
        BBuscarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(RBEstagioNormal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBestagioEmprego)
                                .addGap(177, 177, 177)
                                .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBDeclaracaoNormal)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(RBSim)
                                        .addGap(18, 18, 18)
                                        .addComponent(RBNao))
                                    .addComponent(RBFrequenciaNormal)
                                    .addComponent(RBAvaliacaoSupervisorNormal)
                                    .addComponent(RBTCENormal1)
                                    .addComponent(RBRelatorioNormal))
                                .addGap(244, 244, 244)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBTCEEmprego)
                                    .addComponent(RBFrequenciaEmprego)
                                    .addComponent(RBDeclaracaoAtribuicaoEmprego)
                                    .addComponent(RBAvaliacaoEmprego)
                                    .addComponent(RBRelatorioEmprego)
                                    .addComponent(RBCarteiraEmprego))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TFConcedente, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(TFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(TFSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(TFAno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(TFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(TFNumeroTCE, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(BBuscarDados))))
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGap(104, 104, 104)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(TFHorasEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TFHorasEstagioConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TFHorasEstagioPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(TFInicioEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TFTerminoEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFProfessorOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TFNumeroTCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel23)
                    .addComponent(TFSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TFAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFConcedente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel14)
                        .addComponent(TFInicioEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFTerminoEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(TFHorasEstagioPendentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TFHorasEstagioConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(TFHorasEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TFProfessorOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(RBEstagioNormal)
                    .addComponent(RBestagioEmprego)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(RBDeclaracaoNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBFrequenciaNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBAvaliacaoSupervisorNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBTCENormal1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBRelatorioNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBNao)
                            .addComponent(RBSim)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(RBTCEEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBDeclaracaoAtribuicaoEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBFrequenciaEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBAvaliacaoEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBRelatorioEmprego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBCarteiraEmprego)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        BFecharControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharControle.setText("Voltar");
        BFecharControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharControleActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        BAtualizarControle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarControle.setText("Atualizar");
        BAtualizarControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarControleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BCadastrarControle, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(BLimparControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAtualizarControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BExcluirControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BFecharControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BCadastrarControle)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparControle)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarControle)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharControle))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastrarControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarControleActionPerformed
        
        String Controle = TFNomeAluno.getText();
        String NumeroTCE = TFNumeroTCE.getText();
        
        if      (!TFNomeAluno.getText().equals("") && 
                !TFNumeroTCE.getText().equals("") &&  
                !TFCurso.getText().equals("") &&
                !TFConcedente.getText().equals("") &&
                !TFSemestre.getText().equals("") &&  
                !TFAno.getText().equals(""))
            
        {
            
            int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Controle do Estagiário "+Controle+" "
                + "e TCE Numero "+NumeroTCE+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {

        String NomeAluno = TFNomeAluno.getText();
        String NumTCE = TFNumeroTCE.getText();
        String Curso = TFCurso.getText();
        String Semestre = TFSemestre.getText();
        String Ano = TFAno.getText();
        String Concedente = TFConcedente.getText();
        String DataInicioEstagio = TFInicioEstagio.getText();
        String DataTerminoEstagio = TFTerminoEstagio.getText();
        String HorasEstagio = TFHorasEstagio.getText();
        String HorasestagioConcluido = TFHorasEstagioConcluidas.getText();
        String HoraEstagioPendente = TFHorasEstagioPendentes.getText();    
        String ProfessorOrientador = TFProfessorOrientador.getText();
        String TipoEstagio = (RBEstagioNormal.isSelected()?"Estagio Normal":"Estágio no Emprego");
        String DeclaracaoNormal = (RBDeclaracaoNormal.isSelected()?"OK":"Pendente");
        String FrequanciaNormal = (RBFrequenciaNormal.isSelected()?"OK":"Pendente");
        String AvaliacaoNormal = (RBDeclaracaoNormal.isSelected()?"OK":"Pendente");
        String TCENormal = (RBTCENormal1.isSelected()?"OK":"Pendente");
        String RelatorioNormal = (RBRelatorioNormal.isSelected()?"OK":"Pendente");
        String TCEEmprego = (RBTCEEmprego.isSelected()?"OK":"Pendente");
        String DeclaracaoEmprego = (RBDeclaracaoAtribuicaoEmprego.isSelected()?"OK":"Pendente");
        String FrequenciaEmprego = (RBFrequenciaEmprego.isSelected()?"OK":"Pendente");
        String AvaliacaoEmprego = (RBAvaliacaoEmprego.isSelected()?"OK":"Pendente");
        String RelatorioEmprego = (RBRelatorioEmprego.isSelected()?"OK":"Pendente");
        String CarteiraTrabalho = (RBCarteiraEmprego.isSelected()?"OK":"Pendente");
        String RealizadonoIFSul = (RBSim.isSelected()?"Sim":"Não");
        
       
        try{
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO controle VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, NomeAluno);
            pstm.setString(2, NumTCE);
            pstm.setString(3, Curso);
            pstm.setString(4, Semestre);
            pstm.setString(5, Ano);          
            pstm.setString(6, Concedente);
            pstm.setString(7, DataInicioEstagio);
            pstm.setString(8, DataTerminoEstagio);
            pstm.setString(9, HorasEstagio);
            pstm.setString(10, HorasestagioConcluido);
            pstm.setString(11, HoraEstagioPendente);
            pstm.setString(12, ProfessorOrientador);
            pstm.setString(13, TipoEstagio);
            pstm.setString(14, DeclaracaoNormal);
            pstm.setString(15, FrequanciaNormal);
            pstm.setString(16, AvaliacaoNormal);
            pstm.setString(17, TCENormal);
            pstm.setString(18, RelatorioNormal);
            pstm.setString(19, RealizadonoIFSul);
            pstm.setString(20, TCEEmprego);
            pstm.setString(21, DeclaracaoEmprego);
            pstm.setString(22, FrequenciaEmprego);
            pstm.setString(23, AvaliacaoEmprego);
            pstm.setString(24, RelatorioEmprego);
            pstm.setString(25, CarteiraTrabalho);


            pstm.executeUpdate();
            pstm.close();
            
        TFNomeAluno.setText("");
        TFNumeroTCE.setText("");
        TFCurso.setText("");
        TFSemestre.setText("");
        TFAno.setText("");
        TFConcedente.setText("");
        TFInicioEstagio.setText("");
        TFTerminoEstagio.setText("");
        TFHorasEstagio.setText("");
        TFHorasEstagioConcluidas.setText("");
        TFHorasEstagioPendentes.setText("");    
        TFProfessorOrientador.setText("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        RBDeclaracaoNormal.setSelected(false);
        RBFrequenciaNormal.setSelected(false);
        RBDeclaracaoNormal.setSelected(false);
        RBTCENormal1.setSelected(false);
        RBRelatorioNormal.setSelected(false);
        RBTCEEmprego.setSelected(false);
        RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        RBFrequenciaEmprego.setSelected(false);
        RBAvaliacaoEmprego.setSelected(false);
        RBRelatorioEmprego.setSelected(false);
        RBCarteiraEmprego.setSelected(false);
                  
        
        }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao inserir Controle\n"+e.getMessage());
        }
        
       }
       
        BAtualizarControle.setEnabled(false);
         BCadastrarControle.setEnabled(true);
          BExcluirControle.setEnabled(false);
           BLimparControle.setEnabled(true);
        }
        
        else
            
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
        
    }//GEN-LAST:event_BCadastrarControleActionPerformed

    private void CBPesqControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqControleActionPerformed

       TFNomeAluno.setText("");
        TFNumeroTCE.setText("");
        TFCurso.setText("");
        TFSemestre.setText("");
        TFAno.setText("");
        TFConcedente.setText("");
        TFInicioEstagio.setText("");
        TFTerminoEstagio.setText("");
        TFHorasEstagio.setText("");
        TFHorasEstagioConcluidas.setText("");
        TFHorasEstagioPendentes.setText("");    
        TFProfessorOrientador.setText("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        RBDeclaracaoNormal.setSelected(false);
        RBFrequenciaNormal.setSelected(false);
        RBDeclaracaoNormal.setSelected(false);
        RBTCENormal1.setSelected(false);
        RBRelatorioNormal.setSelected(false);
        RBTCEEmprego.setSelected(false);
        RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        RBFrequenciaEmprego.setSelected(false);
        RBAvaliacaoEmprego.setSelected(false);
        RBRelatorioEmprego.setSelected(false);
        RBCarteiraEmprego.setSelected(false);
        
        BAtualizarControle.setEnabled(false);
         BCadastrarControle.setEnabled(false);
          BExcluirControle.setEnabled(false);
           BLimparControle.setEnabled(true);
           
    }//GEN-LAST:event_CBPesqControleActionPerformed

    private void BPesqControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqControleActionPerformed
   
                
        String pesquisa = TFPesqControle.getText();

        ConsultaControle Controle = new ConsultaControle(conn, this, pesquisa);
        Controle.setTitle("Consulta de Controle");
        Controle.setVisible(true);
        
        CBPesqControle.setSelectedIndex(0);
        TFPesqControle.setText("");
         
    }//GEN-LAST:event_BPesqControleActionPerformed

    private void BFecharControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharControleActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharControleActionPerformed

    private void BLimparControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparControleActionPerformed

        TFNomeAluno.setText("");
        TFNumeroTCE.setText("");
        TFCurso.setText("");
        TFSemestre.setText("");
        TFAno.setText("");
        TFConcedente.setText("");
        TFInicioEstagio.setText("");
        TFTerminoEstagio.setText("");
        TFHorasEstagio.setText("");
        TFHorasEstagioConcluidas.setText("");
        TFHorasEstagioPendentes.setText("");    
        TFProfessorOrientador.setText("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        RBDeclaracaoNormal.setSelected(false);
        RBFrequenciaNormal.setSelected(false);
        RBDeclaracaoNormal.setSelected(false);
        RBTCENormal1.setSelected(false);
        RBRelatorioNormal.setSelected(false);
        RBTCEEmprego.setSelected(false);
        RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        RBFrequenciaEmprego.setSelected(false);
        RBAvaliacaoEmprego.setSelected(false);
        RBRelatorioEmprego.setSelected(false);
        RBCarteiraEmprego.setSelected(false);
        
        BAtualizarControle.setEnabled(false);
         BCadastrarControle.setEnabled(false);
          BExcluirControle.setEnabled(false);
           BLimparControle.setEnabled(true);
           
    }//GEN-LAST:event_BLimparControleActionPerformed

    private void BExcluirControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirControleActionPerformed
        
          String Controle = TFNomeAluno.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Controle de Estágio do Aluno "+Controle+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
           
        {
   
        try{
            
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM Controle WHERE nomeAluno = '"+Controle+"'");

        TFNomeAluno.setText("");
        TFNumeroTCE.setText("");
        TFCurso.setText("");
        TFSemestre.setText("");
        TFAno.setText("");
        TFConcedente.setText("");
        TFInicioEstagio.setText("");
        TFTerminoEstagio.setText("");
        TFHorasEstagio.setText("");
        TFHorasEstagioConcluidas.setText("");
        TFHorasEstagioPendentes.setText("");    
        TFProfessorOrientador.setText("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        RBDeclaracaoNormal.setSelected(false);
        RBFrequenciaNormal.setSelected(false);
        RBDeclaracaoNormal.setSelected(false);
        RBTCENormal1.setSelected(false);
        RBRelatorioNormal.setSelected(false);
        RBTCEEmprego.setSelected(false);
        RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        RBFrequenciaEmprego.setSelected(false);
        RBAvaliacaoEmprego.setSelected(false);
        RBRelatorioEmprego.setSelected(false);
        RBCarteiraEmprego.setSelected(false);
        
        BAtualizarControle.setEnabled(false);
         BCadastrarControle.setEnabled(false);
          BExcluirControle.setEnabled(false);
           BLimparControle.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Controle de Estágio\n"+e.getMessage());}

        }
        
    }//GEN-LAST:event_BExcluirControleActionPerformed

    private void BAtualizarControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarControleActionPerformed
        
                String Controle = TFNomeAluno.getText();
        
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Controle de Estágio do Aluno "+Controle+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE Controle SET NomeAluno = '"+TFNomeAluno.getText()+"',"
                    + "NumeroTCE = '"+TFNumeroTCE.getText()+"',"
                    + "Curso = '"+TFCurso.getText()+"',"
                    + "Semestre = '"+TFSemestre.getText()+"',"
                    + "Ano = '"+TFAno.getText()+"',"
                    + "Concedente = '"+TFConcedente.getText()+"',"
                    + "DataInicio = '"+TFInicioEstagio.getText()+"',"
                    + "DataTermino = '"+TFTerminoEstagio.getText()+"',"
                    + "HoraEstagio = '"+TFHorasEstagio.getText()+"',"
                    + "HoraConcluida = '"+TFHorasEstagioConcluidas.getText()+"',"
                    + "HoraPendente = '"+TFHorasEstagioPendentes.getText()+"',"
                    + "ProfessorOrientador = '"+TFProfessorOrientador.getText()+"',"
                    + "TipoEstagio = '"+(RBEstagioNormal.isSelected()?"Estagio Normal":"Estágio no Emprego")+"',"
                    + "DeclaracaoEstNormal = '"+(RBDeclaracaoNormal.isSelected()?"OK":"Pendente")+"',"
                    + "FrequenciaEstNormal = '"+(RBFrequenciaNormal.isSelected()?"OK":"Pendente")+"',"
                    + "AvaliacaoEstNormal = '"+(RBDeclaracaoNormal.isSelected()?"OK":"Pendente")+"',"
                    + "TCEEstNormal = '"+(RBTCENormal1.isSelected()?"OK":"Pendente")+"',"
                    + "RelatorioEstNormal = '"+(RBRelatorioNormal.isSelected()?"OK":"Pendente")+"',"
                    + "RealizadonoIFSul = '"+(RBSim.isSelected()?"Sim":"Não")+"',"
                    + "TCEEstEmprego = '"+(RBTCEEmprego.isSelected()?"OK":"Pendente")+"',"
                    + "DeclaracaoEmprego = '"+(RBDeclaracaoAtribuicaoEmprego.isSelected()?"OK":"Pendente")+"',"
                    + "frequenciaEmprego = '"+(RBFrequenciaEmprego.isSelected()?"OK":"Pendente")+"',"
                    + "AvaliacaoEmprego = '"+(RBAvaliacaoEmprego.isSelected()?"OK":"Pendente")+"',"
                    + "RelatorioEmprego = '"+(RBRelatorioEmprego.isSelected()?"OK":"Pendente")+"',"
                    + "CopiaCarteira = '"+(RBCarteiraEmprego.isSelected()?"OK":"Pendente")+"'"
                    + "WHERE codigo = '"+TFCodigo.getText()+"'");

                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Convênio\n"+e.getMessage());
         
         }

        TFNomeAluno.setText("");
        TFNumeroTCE.setText("");
        TFCurso.setText("");
        TFSemestre.setText("");
        TFAno.setText("");
        TFConcedente.setText("");
        TFInicioEstagio.setText("");
        TFTerminoEstagio.setText("");
        TFHorasEstagio.setText("");
        TFHorasEstagioConcluidas.setText("");
        TFHorasEstagioPendentes.setText("");    
        TFProfessorOrientador.setText("");
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        RBDeclaracaoNormal.setSelected(false);
        RBFrequenciaNormal.setSelected(false);
        RBDeclaracaoNormal.setSelected(false);
        RBTCENormal1.setSelected(false);
        RBRelatorioNormal.setSelected(false);
        RBTCEEmprego.setSelected(false);
        RBDeclaracaoAtribuicaoEmprego.setSelected(false);
        RBFrequenciaEmprego.setSelected(false);
        RBAvaliacaoEmprego.setSelected(false);
        RBRelatorioEmprego.setSelected(false);
        RBCarteiraEmprego.setSelected(false);
        
        BAtualizarControle.setEnabled(false);
         BCadastrarControle.setEnabled(false);
          BExcluirControle.setEnabled(false);
           BLimparControle.setEnabled(true);
            
                
    }  
        
    }//GEN-LAST:event_BAtualizarControleActionPerformed

    private void TFPesqControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesqControleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesqControleActionPerformed

    private void TFPesqControleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesqControleKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        
               
        String valor = TFPesqControle.getText();

        ConsultaControle convenio = new ConsultaControle(conn, this, valor);
        convenio.setTitle("Consulta de Controle");
        convenio.setVisible(true);
        
        CBPesqControle.setSelectedIndex(0);
        TFPesqControle.setText("");

        }
    }//GEN-LAST:event_TFPesqControleKeyPressed

    private void RBEstagioNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBEstagioNormalActionPerformed
             
        if (RBEstagioNormal.isSelected())    
          {
        RBDeclaracaoNormal.setEnabled(true);
        RBFrequenciaNormal.setEnabled(true);
        RBAvaliacaoSupervisorNormal.setEnabled(true);
        RBTCENormal1.setEnabled(true);
        RBRelatorioNormal.setEnabled(true);
        RBSim.setEnabled(true);
        RBNao.setEnabled(true);
        
                RBTCEEmprego.setEnabled(false);
        RBDeclaracaoAtribuicaoEmprego.setEnabled(false);
        RBFrequenciaEmprego.setEnabled(false);
        RBAvaliacaoEmprego.setEnabled(false);
        RBRelatorioEmprego.setEnabled(false);
        RBCarteiraEmprego.setEnabled(false);
 
          }

       
    }//GEN-LAST:event_RBEstagioNormalActionPerformed

    private void RBestagioEmpregoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBestagioEmpregoActionPerformed
       
               if (RBestagioEmprego.isSelected())    
          {
              
        RBTCEEmprego.setEnabled(true);
        RBDeclaracaoAtribuicaoEmprego.setEnabled(true);
        RBFrequenciaEmprego.setEnabled(true);
        RBAvaliacaoEmprego.setEnabled(true);
        RBRelatorioEmprego.setEnabled(true);
        RBCarteiraEmprego.setEnabled(true);
        
        RBDeclaracaoNormal.setEnabled(false);
        RBFrequenciaNormal.setEnabled(false);
        RBAvaliacaoSupervisorNormal.setEnabled(false);
        RBTCENormal1.setEnabled(false);
        RBRelatorioNormal.setEnabled(false);
        RBSim.setEnabled(false);
        RBNao.setEnabled(false);
 
          }  

    }//GEN-LAST:event_RBestagioEmpregoActionPerformed

    private void TFInicioEstagioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFInicioEstagioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFInicioEstagioActionPerformed

    private void BBuscarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDadosActionPerformed
            
        String pesquisa = TFPesqControle.getText();
        String NumeroTermo = TFNumeroTCE.getText();

        BuscaDadosControle BDControle = new BuscaDadosControle(conn, this, pesquisa,NumeroTermo);
        BDControle.setTitle("   ***   Buscar Dados do Estagiário   ***");
        BDControle.setVisible(true);


    }//GEN-LAST:event_BBuscarDadosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Controle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarControle;
    public javax.swing.JButton BBuscarDados;
    public javax.swing.JButton BCadastrarControle;
    public javax.swing.JButton BExcluirControle;
    public javax.swing.JButton BFecharControle;
    public javax.swing.JButton BLimparControle;
    public javax.swing.JButton BPesqControle;
    public javax.swing.JComboBox CBPesqControle;
    public javax.swing.JRadioButton RBAvaliacaoEmprego;
    public javax.swing.JRadioButton RBAvaliacaoSupervisorNormal;
    public javax.swing.JRadioButton RBCarteiraEmprego;
    public javax.swing.JRadioButton RBDeclaracaoAtribuicaoEmprego;
    public javax.swing.JRadioButton RBDeclaracaoNormal;
    public javax.swing.JRadioButton RBEstagioNormal;
    public javax.swing.JRadioButton RBFrequenciaEmprego;
    public javax.swing.JRadioButton RBFrequenciaNormal;
    public javax.swing.JRadioButton RBNao;
    public javax.swing.JRadioButton RBRelatorioEmprego;
    public javax.swing.JRadioButton RBRelatorioNormal;
    public javax.swing.JRadioButton RBSim;
    public javax.swing.JRadioButton RBTCEEmprego;
    public javax.swing.JRadioButton RBTCENormal1;
    public javax.swing.JRadioButton RBestagioEmprego;
    public javax.swing.JTextField TFAno;
    public javax.swing.JTextField TFCodigo;
    public javax.swing.JTextField TFConcedente;
    public javax.swing.JTextField TFCurso;
    public javax.swing.JTextField TFHorasEstagio;
    public javax.swing.JTextField TFHorasEstagioConcluidas;
    public javax.swing.JTextField TFHorasEstagioPendentes;
    public javax.swing.JTextField TFInicioEstagio;
    public javax.swing.JTextField TFNomeAluno;
    public javax.swing.JTextField TFNumeroTCE;
    public javax.swing.JTextField TFPesqControle;
    public javax.swing.JTextField TFProfessorOrientador;
    public javax.swing.JTextField TFSemestre;
    public javax.swing.JTextField TFTerminoEstagio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
