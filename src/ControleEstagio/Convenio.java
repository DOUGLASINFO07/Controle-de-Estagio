package ControleEstagio;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Convenio extends javax.swing.JFrame {

    private Connection conn = null;

    public Convenio() {
        initComponents();
        
    }
    
    public Convenio(Connection conn) {
        initComponents();
        
        this.conn = conn;
        
        TFCodigoConvenio.setVisible(false);
        
        TFEndCorrespConvenio.setEnabled(false);
        TFNumCorrespConvenio.setEnabled(false);
        TFBairroCorrespConvenio.setEnabled(false);
        TFCEPCorrespConvenio.setEnabled(false);
        TFCidadeCorrespConvenio.setEnabled(false);
        CBEstadoCorrespConvenio.setEnabled(false);
        TFFaxCorrespConvenio.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel26 = new javax.swing.JLabel();
        BCadastrarConvenio = new javax.swing.JButton();
        BLimparConvenio = new javax.swing.JButton();
        BExcluirConvenio = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBPesqConvenio = new javax.swing.JComboBox();
        TFPesqConvenio = new javax.swing.JTextField();
        BPesqConvenio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TFNumEndConvenio = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        RBSexoFemRepConvenio = new javax.swing.JRadioButton();
        RBSexoMascRepConvenio = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFNomeFantasiaConvenio = new javax.swing.JTextField();
        TFCidadeConvenio = new javax.swing.JTextField();
        TFRazaoSocial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFEndConvenio = new javax.swing.JTextField();
        TFEmailConvenio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TFAreaAtuacao = new javax.swing.JTextField();
        CBEstadoConvenio = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFBairroConvenio = new javax.swing.JTextField();
        TFInscEstadualConvenio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TFEndCorrespConvenio = new javax.swing.JTextField();
        TFNumCorrespConvenio = new javax.swing.JTextField();
        TFBairroCorrespConvenio = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TFCidadeCorrespConvenio = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        CBEstadoCorrespConvenio = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TFNomeRepConvenio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TFCargoRepConvenio = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        TFRGRepConvenio = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        TFEndRepConvenio = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        TFNumEndRepConvenio = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        TFBairroRepConvenio = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        TFCidadeRepConvenio = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        CBEstadoRepConvenio = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        TFFormacaoRepConvenio = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        CBEstadoCivilRepConvenio = new javax.swing.JComboBox();
        TFCodigoConvenio = new javax.swing.JTextField();
        TFCNPJConvenio = new javax.swing.JFormattedTextField();
        TFCEPConvenio = new javax.swing.JFormattedTextField();
        TFTelConvenio = new javax.swing.JFormattedTextField();
        TFFaxConvenio = new javax.swing.JFormattedTextField();
        TFFaxCorrespConvenio = new javax.swing.JFormattedTextField();
        TFCPFRepConvenio = new javax.swing.JFormattedTextField();
        TFCelularRepConvenio = new javax.swing.JFormattedTextField();
        TFTelRepConvenio = new javax.swing.JFormattedTextField();
        TFCEPCorrespConvenio = new javax.swing.JFormattedTextField();
        TFCEPRepConvenio = new javax.swing.JFormattedTextField();
        RBMesmoEnd = new javax.swing.JRadioButton();
        RBOutroEnd = new javax.swing.JRadioButton();
        BFecharConvenio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BAtualizarConvenio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Bot_Verm_Convenio.png"))); // NOI18N

        BCadastrarConvenio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarConvenio.setText("Cadastrar");
        BCadastrarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarConvenioActionPerformed(evt);
            }
        });

        BLimparConvenio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparConvenio.setText("Limpar");
        BLimparConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparConvenioActionPerformed(evt);
            }
        });

        BExcluirConvenio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirConvenio.setText("Excluir");
        BExcluirConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirConvenioActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(149, 193, 57));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pesquisar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pesquisar por:");

        CBPesqConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome Fantasia", "Razão Social" }));
        CBPesqConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqConvenioActionPerformed(evt);
            }
        });

        TFPesqConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesqConvenioActionPerformed(evt);
            }
        });
        TFPesqConvenio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesqConvenioKeyPressed(evt);
            }
        });

        BPesqConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqConvenioActionPerformed(evt);
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
                        .addComponent(CBPesqConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFPesqConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BPesqConvenio))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBPesqConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFPesqConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(251, 252, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, new java.awt.Color(154, 207, 57)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Razão Social");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setText("Sexo");

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Dados Representante");

        buttonGroup1.add(RBSexoFemRepConvenio);
        RBSexoFemRepConvenio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBSexoFemRepConvenio.setText("Fem");

        buttonGroup1.add(RBSexoMascRepConvenio);
        RBSexoMascRepConvenio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBSexoMascRepConvenio.setText("Masc");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("CNPJ / MF");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setText("Área Atuação");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Nome Fantasia");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Endereço");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("E-mail");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Nº");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Bairro");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("Telefone");

        CBEstadoConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Incrição Estadual");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("CEP");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dados da Empresa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Cidade");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Estado");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setText("Fax");

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Endereço para correspondência");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setText("Endereço");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel30.setText("Nº");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel32.setText("Bairro");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel33.setText("Cidade");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel34.setText("CEP");

        CBEstadoCorrespConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC ", "SE", "TO" }));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel35.setText("Estado");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel37.setText("Fax");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("Cargo");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel38.setText("CPF");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel39.setText("RG");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel40.setText("Celular");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel41.setText("Telefone");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel42.setText("Endereço");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel43.setText("Nº");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel44.setText("Bairro");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel45.setText("CEP");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel46.setText("Cidade");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel47.setText("Estado");

        CBEstadoRepConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UF", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel48.setText("Formação");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel49.setText("Estado Civil");

        CBEstadoCivilRepConvenio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " *** Selecione ***", "Casado(a)", "Solteiro(a)", "Divorciado(a)", "Viúvo(a)" }));

        TFCodigoConvenio.setEditable(false);

        try {
            TFCNPJConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCNPJConvenio.setFocusLostBehavior(TFCNPJConvenio.COMMIT);

        try {
            TFCEPConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPConvenio.setFocusLostBehavior(TFCEPConvenio.COMMIT);

        try {
            TFTelConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelConvenio.setFocusLostBehavior(TFTelConvenio.COMMIT);

        try {
            TFFaxConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFFaxConvenio.setFocusLostBehavior(TFFaxConvenio.COMMIT);

        try {
            TFFaxCorrespConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFFaxCorrespConvenio.setFocusLostBehavior(TFFaxCorrespConvenio.COMMIT);

        try {
            TFCPFRepConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFRepConvenio.setFocusLostBehavior(TFCPFRepConvenio.COMMIT);

        try {
            TFCelularRepConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCelularRepConvenio.setFocusLostBehavior(TFCelularRepConvenio.COMMIT);

        try {
            TFTelRepConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelRepConvenio.setFocusLostBehavior(TFTelRepConvenio.COMMIT);

        try {
            TFCEPCorrespConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPCorrespConvenio.setFocusLostBehavior(TFCEPCorrespConvenio.COMMIT);

        try {
            TFCEPRepConvenio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPRepConvenio.setFocusLostBehavior(TFCEPRepConvenio.COMMIT);

        buttonGroup2.add(RBMesmoEnd);
        RBMesmoEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RBMesmoEnd.setText("O mesmo");
        RBMesmoEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMesmoEndActionPerformed(evt);
            }
        });

        buttonGroup2.add(RBOutroEnd);
        RBOutroEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RBOutroEnd.setText("Outro endereço");
        RBOutroEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBOutroEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFInscEstadualConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEmailConvenio))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFEndConvenio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFBairroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFCEPConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFCidadeConvenio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBEstadoConvenio, 0, 51, Short.MAX_VALUE)
                                    .addComponent(TFNumEndConvenio)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeFantasiaConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(RBMesmoEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RBOutroEnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFEndCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFNumCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFBairroCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFaxCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(TFCodigoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCargoRepConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBSexoMascRepConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RBSexoFemRepConvenio))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCPFRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFRGRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFCelularRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFTelRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEndRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroRepConvenio)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFFormacaoRepConvenio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBEstadoCivilRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBEstadoRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFCodigoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TFRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFNomeFantasiaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(TFAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TFInscEstadualConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCNPJConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TFEndConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFNumEndConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFBairroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TFCidadeConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(CBEstadoConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TFCEPConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel27)
                    .addComponent(jLabel18)
                    .addComponent(TFEmailConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTelConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFaxConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(TFEndCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNumCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFBairroCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBMesmoEnd)
                    .addComponent(RBOutroEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFCidadeCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35)
                    .addComponent(CBEstadoCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(TFFaxCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCEPCorrespConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TFNomeRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(TFCargoRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RBSexoMascRepConvenio)
                    .addComponent(RBSexoFemRepConvenio)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(TFRGRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(TFCPFRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCelularRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFTelRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(TFEndRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(TFNumEndRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(TFBairroRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(TFCidadeRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(CBEstadoRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCEPRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(TFFormacaoRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(CBEstadoCivilRepConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BFecharConvenio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharConvenio.setText("Voltar");
        BFecharConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharConvenioActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        BAtualizarConvenio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarConvenio.setText("Atualizar");
        BAtualizarConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarConvenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BCadastrarConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BLimparConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BExcluirConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BAtualizarConvenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharConvenio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastrarConvenio)
                    .addComponent(BLimparConvenio)
                    .addComponent(BExcluirConvenio)
                    .addComponent(BFecharConvenio)
                    .addComponent(BAtualizarConvenio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastrarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarConvenioActionPerformed
        
        String convenio = TFRazaoSocial.getText();
        
        if (!TFRazaoSocial.getText().equals("") && 
                !TFNomeFantasiaConvenio.getText().equals("") &&  
                !TFAreaAtuacao.getText().equals("") &&  
                !CBEstadoConvenio.getSelectedItem().equals(0) && 
                !TFCNPJConvenio.getText().equals("") &&  
                !TFInscEstadualConvenio.getText().equals("") &&  
                !TFEndConvenio.getText().equals("") &&  
                !TFNumEndConvenio.getText().equals("") &&  
                !TFBairroConvenio.getText().equals("") &&  
                !TFEndCorrespConvenio.getText().equals("") &&  
                !TFNumCorrespConvenio.getText().equals("") && 
                !TFBairroCorrespConvenio.getText().equals("") &&  
                !TFCEPCorrespConvenio.getText().equals("") &&  
                !CBEstadoCorrespConvenio.getSelectedItem().equals(0) && 
                !TFCidadeCorrespConvenio.getText().equals("") &&  
                !TFFaxCorrespConvenio.getText().equals("") &&  
                !TFNomeRepConvenio.getText().equals("") &&  
                !TFCargoRepConvenio.getText().equals("") &&  
                !buttonGroup1.getSelection().equals("") &&
                !TFCPFRepConvenio.getText().equals("") && 
                !TFRGRepConvenio.getText().equals("") &&  
                !TFEndRepConvenio.getText().equals("") &&  
                !CBEstadoRepConvenio.getSelectedItem().equals(0) && 
                !CBEstadoCivilRepConvenio.getSelectedItem().equals(0) &&
                !TFNumEndRepConvenio.getText().equals("") &&  
                !TFBairroRepConvenio.getText().equals("") &&  
                !TFCEPCorrespConvenio.getText().equals("") &&  
                !TFCidadeRepConvenio.getText().equals("") &&  
                !TFFormacaoRepConvenio.getText().equals(""))
            
        {
            
            int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Convênio "+convenio+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {

        String RazaoSocial = TFRazaoSocial.getText();
        String NomeFantasia = TFNomeFantasiaConvenio.getText();
        String AreaAtuacao = TFAreaAtuacao.getText();
        String CNPJ = TFCNPJConvenio.getText();
        String InscricaoEstadual = TFInscEstadualConvenio.getText();
        String EndConvenio = TFEndConvenio.getText();
        String NumEndConvenio = TFNumEndConvenio.getText();
        String BairroConvenio = TFBairroConvenio.getText();
        String CidadeConvenio = TFCidadeConvenio.getText();
        String EstadoConvenio = CBEstadoConvenio.getSelectedItem().toString();
        String CEPConvenio = TFCEPConvenio.getText();    
        String TelConvenio = TFTelConvenio.getText();
        String FaxConvenio = TFFaxConvenio.getText();
        String EmailConvenio = TFEmailConvenio.getText();
        String EndCorrespConvenio = TFEndCorrespConvenio.getText();
        String NumEndCorrespConvenio = TFNumCorrespConvenio.getText();
        String BairroCorrespConvenio = TFBairroCorrespConvenio.getText();
        String CEPCorrespConvenio = TFCEPCorrespConvenio.getText();
        String CidadeCorrespConvenio = TFCidadeCorrespConvenio.getText();
        String EstadoCorrespConvenio = CBEstadoCorrespConvenio.getSelectedItem().toString();
        String FaxCorrespConvenio = TFFaxCorrespConvenio.getText();
        String NomeRepConvenio = TFNomeRepConvenio.getText();
        String CargoRepConvenio = TFCargoRepConvenio.getText();
        String SexoRepConvenio = (RBSexoMascRepConvenio.isSelected()?"M":"F");
        String CPFRepConvenio = TFCPFRepConvenio.getText();
        String RGRepConvenio = TFRGRepConvenio.getText();
        String CelRepConvenio = TFCelularRepConvenio.getText();
        String TelRepConvenio = TFTelRepConvenio.getText();
        String EndRepConvenio = TFEndRepConvenio.getText();
        String NumEndRepConvenio = TFNumEndRepConvenio.getText();
        String BairroRepConvenio = TFBairroRepConvenio.getText();
        String CEPRepConvenio = TFCEPRepConvenio.getText();
        String CidadeRepConvenio = TFCidadeRepConvenio.getText();
        String EstadoRepConvenio = CBEstadoRepConvenio.getSelectedItem().toString();
        String EstCivilRepConvenio = CBEstadoCivilRepConvenio.getSelectedItem().toString();
        String FormacaoRepConvenio = TFFormacaoRepConvenio.getText();
       
        try{
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO empresa VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, RazaoSocial);
            pstm.setString(2, NomeFantasia);
            pstm.setString(3, AreaAtuacao);
            pstm.setString(4, CNPJ);
            pstm.setString(5, InscricaoEstadual);          
            pstm.setString(6, EndConvenio);
            pstm.setString(7, NumEndConvenio);
            pstm.setString(8, BairroConvenio);
            pstm.setString(9, CidadeConvenio);
            pstm.setString(10, EstadoConvenio);
            pstm.setString(11, CEPConvenio);
            pstm.setString(12, TelConvenio);
            pstm.setString(13, FaxConvenio);
            pstm.setString(14, EmailConvenio);
            pstm.setString(15, EndCorrespConvenio);
            pstm.setString(16, NumEndCorrespConvenio);
            pstm.setString(17, BairroCorrespConvenio);
            pstm.setString(18, CEPCorrespConvenio);
            pstm.setString(19, CidadeCorrespConvenio);
            pstm.setString(20, EstadoCorrespConvenio);
            pstm.setString(21, FaxCorrespConvenio);
            pstm.setString(22, NomeRepConvenio);
            pstm.setString(23, SexoRepConvenio);
            pstm.setString(24, CargoRepConvenio);
            pstm.setString(25, CPFRepConvenio);
            pstm.setString(26, RGRepConvenio);
            pstm.setString(27, CelRepConvenio);
            pstm.setString(28, TelRepConvenio);
            pstm.setString(29, EndRepConvenio);
            pstm.setString(30, NumEndRepConvenio);
            pstm.setString(31, BairroRepConvenio);
            pstm.setString(32, CidadeRepConvenio);
            pstm.setString(33, CEPRepConvenio);
            pstm.setString(34, EstadoRepConvenio);
            pstm.setString(35, FormacaoRepConvenio);
            pstm.setString(36, EstCivilRepConvenio);

            pstm.executeUpdate();
            pstm.close();
                  
        TFRazaoSocial.setText("");
        TFNomeFantasiaConvenio.setText("");
        TFAreaAtuacao.setText("");
        TFCNPJConvenio.setText("");
        TFInscEstadualConvenio.setText("");
        TFEndConvenio.setText("");
        TFNumEndConvenio.setText("");
        TFBairroConvenio.setText("");
        TFCidadeConvenio.setText("");
        CBEstadoConvenio.setSelectedIndex(0);
        TFCEPConvenio.setText("");    
        TFTelConvenio.setText("");
        TFFaxConvenio.setText("");
        TFEmailConvenio.setText("");
        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
        TFNomeRepConvenio.setText("");
        TFCargoRepConvenio.setText("");
        buttonGroup1.clearSelection();
        TFCPFRepConvenio.setText("");
        TFRGRepConvenio.setText("");
        TFCelularRepConvenio.setText("");
        TFTelRepConvenio.setText("");
        TFEndRepConvenio.setText("");
        TFNumEndRepConvenio.setText("");
        TFBairroRepConvenio.setText("");
        TFCEPRepConvenio.setText("");
        TFCidadeRepConvenio.setText("");
        CBEstadoRepConvenio.setSelectedIndex(0);
        CBEstadoCivilRepConvenio.setSelectedIndex(0);
        TFFormacaoRepConvenio.setText("");
        
        }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao inserir convênio\n"+e.getMessage());
        }
        
       }
       
       TFPesqConvenio.setEnabled(false);
        BAtualizarConvenio.setEnabled(false);
         BCadastrarConvenio.setEnabled(true);
          BExcluirConvenio.setEnabled(false);
           BLimparConvenio.setEnabled(true);
        }
        
        else
            
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
        
    }//GEN-LAST:event_BCadastrarConvenioActionPerformed

    private void CBPesqConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqConvenioActionPerformed

        TFPesqConvenio.setEnabled(true);
        
                TFRazaoSocial.setText("");
        TFNomeFantasiaConvenio.setText("");
        TFAreaAtuacao.setText("");
        TFCNPJConvenio.setText("");
        TFInscEstadualConvenio.setText("");
        TFEndConvenio.setText("");
        TFNumEndConvenio.setText("");
        TFBairroConvenio.setText("");
        TFCidadeConvenio.setText("");
        CBEstadoConvenio.setSelectedIndex(0);
        TFCEPConvenio.setText("");    
        TFTelConvenio.setText("");
        TFFaxConvenio.setText("");
        TFEmailConvenio.setText("");
        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
        TFNomeRepConvenio.setText("");
        TFCargoRepConvenio.setText("");
        buttonGroup1.clearSelection();
        TFCPFRepConvenio.setText("");
        TFRGRepConvenio.setText("");
        TFCelularRepConvenio.setText("");
        TFTelRepConvenio.setText("");
        TFEndRepConvenio.setText("");
        TFNumEndRepConvenio.setText("");
        TFBairroRepConvenio.setText("");
        TFCEPRepConvenio.setText("");
        TFCidadeRepConvenio.setText("");
        CBEstadoRepConvenio.setSelectedIndex(0);
        CBEstadoCivilRepConvenio.setSelectedIndex(0);
        TFFormacaoRepConvenio.setText("");
           
    }//GEN-LAST:event_CBPesqConvenioActionPerformed

    private void BPesqConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqConvenioActionPerformed

        String ModoPesquisa = CBPesqConvenio.getSelectedItem().toString();        
        
        if (ModoPesquisa == "***   Selecione   ***")
            
           {
               
           JOptionPane.showMessageDialog(null,"Escolha um modo de Pesquisa!");
           
           }
        
        else{
        
        String pesquisa = CBPesqConvenio.getSelectedItem().toString();
        String valor = TFPesqConvenio.getText();

        ConsultaConvenio convenio = new ConsultaConvenio(conn, this, pesquisa, valor);
        convenio.setTitle("Consulta de Convenio");
        convenio.setVisible(true);
        
        CBPesqConvenio.setSelectedIndex(0);
        TFPesqConvenio.setText("");
        TFPesqConvenio.setEnabled(false);

        }
        
    }//GEN-LAST:event_BPesqConvenioActionPerformed

    private void BFecharConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharConvenioActionPerformed

        this.dispose();

    }//GEN-LAST:event_BFecharConvenioActionPerformed

    private void BLimparConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparConvenioActionPerformed

        TFRazaoSocial.setText("");
        TFNomeFantasiaConvenio.setText("");
        TFAreaAtuacao.setText("");
        TFCNPJConvenio.setText("");
        TFInscEstadualConvenio.setText("");
        TFEndConvenio.setText("");
        TFNumEndConvenio.setText("");
        TFBairroConvenio.setText("");
        TFCidadeConvenio.setText("");
        CBEstadoConvenio.setSelectedIndex(0);
        TFCEPConvenio.setText("");    
        TFTelConvenio.setText("");
        TFFaxConvenio.setText("");
        TFEmailConvenio.setText("");
        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
        TFNomeRepConvenio.setText("");
        TFCargoRepConvenio.setText("");
        buttonGroup1.clearSelection();
        TFCPFRepConvenio.setText("");
        TFRGRepConvenio.setText("");
        TFCelularRepConvenio.setText("");
        TFTelRepConvenio.setText("");
        TFEndRepConvenio.setText("");
        TFNumEndRepConvenio.setText("");
        TFBairroRepConvenio.setText("");
        TFCEPRepConvenio.setText("");
        TFCidadeRepConvenio.setText("");
        CBEstadoRepConvenio.setSelectedIndex(0);
        CBEstadoCivilRepConvenio.setSelectedIndex(0);
        TFFormacaoRepConvenio.setText("");
        
       TFPesqConvenio.setEnabled(false);
        BAtualizarConvenio.setEnabled(false);
         BCadastrarConvenio.setEnabled(true);
          BExcluirConvenio.setEnabled(false);
           BLimparConvenio.setEnabled(true);
           
    }//GEN-LAST:event_BLimparConvenioActionPerformed

    private void BExcluirConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirConvenioActionPerformed
        
          String convenio = TFRazaoSocial.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Convenio com "+convenio+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
           
        {
   
        try{
            
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM empresa WHERE razaoSocial = '"+TFRazaoSocial.getText()+"'");

        TFRazaoSocial.setText("");
        TFNomeFantasiaConvenio.setText("");
        TFAreaAtuacao.setText("");
        TFCNPJConvenio.setText("");
        TFInscEstadualConvenio.setText("");
        TFEndConvenio.setText("");
        TFNumEndConvenio.setText("");
        TFBairroConvenio.setText("");
        TFCidadeConvenio.setText("");
        CBEstadoConvenio.setSelectedIndex(0);
        TFCEPConvenio.setText("");    
        TFTelConvenio.setText("");
        TFFaxConvenio.setText("");
        TFEmailConvenio.setText("");
        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
        TFNomeRepConvenio.setText("");
        TFCargoRepConvenio.setText("");
        buttonGroup1.clearSelection();
        TFCPFRepConvenio.setText("");
        TFRGRepConvenio.setText("");
        TFCelularRepConvenio.setText("");
        TFTelRepConvenio.setText("");
        TFEndRepConvenio.setText("");
        TFNumEndRepConvenio.setText("");
        TFBairroRepConvenio.setText("");
        TFCEPRepConvenio.setText("");
        TFCidadeRepConvenio.setText("");
        CBEstadoRepConvenio.setSelectedIndex(0);
        CBEstadoCivilRepConvenio.setSelectedIndex(0);
        TFFormacaoRepConvenio.setText("");
        
       TFPesqConvenio.setEnabled(false);
        BAtualizarConvenio.setEnabled(false);
         BCadastrarConvenio.setEnabled(true);
          BExcluirConvenio.setEnabled(false);
           BLimparConvenio.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Convênio\n"+e.getMessage());}

        }
        
    }//GEN-LAST:event_BExcluirConvenioActionPerformed

    private void BAtualizarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarConvenioActionPerformed
        
                String convenio = TFRazaoSocial.getText();
        
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Convênio "+convenio+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE empresa SET razaoSocial = '"+TFRazaoSocial.getText()+"',"
                    + "nomeFantasia = '"+TFNomeFantasiaConvenio.getText()+"',"
                    + "areaAtuacao = '"+TFAreaAtuacao.getText()+"',"
                    + "cnpj = '"+TFCNPJConvenio.getText()+"',"
                    + "insEstadual = '"+TFInscEstadualConvenio.getText()+"',"
                    + "endereco = '"+TFEndConvenio.getText()+"',"
                    + "numero = '"+TFNumEndConvenio.getText()+"',"
                    + "bairro = '"+TFBairroConvenio.getText()+"',"
                    + "cidade = '"+TFCidadeConvenio.getText()+"',"
                    + "uf = '"+CBEstadoConvenio.getSelectedItem()+"',"
                    + "cep = '"+TFCEPConvenio.getText()+"',"
                    + "telefone = '"+TFTelConvenio.getText()+"',"
                    + "fax = '"+TFFaxConvenio.getText()+"',"
                    + "email = '"+TFEmailConvenio.getText()+"',"
                    + "enderecoCorresp = '"+TFEndCorrespConvenio.getText()+"',"
                    + "numCorresp = '"+TFNumEndRepConvenio.getText()+"',"
                    + "bairroCorresp = '"+TFBairroCorrespConvenio.getText()+"',"
                    + "cepCorresp = '"+TFCEPCorrespConvenio.getText()+"',"
                    + "cidadeCorresp = '"+TFCidadeCorrespConvenio.getText()+"',"
                    + "UFCorresp = '"+CBEstadoCorrespConvenio.getSelectedItem()+"',"
                    + "FaxCorresp = '"+TFFaxCorrespConvenio.getText()+"',"
                    + "representante = '"+TFNomeRepConvenio.getText()+"',"
                    + "sexo = '"+(RBSexoMascRepConvenio.isSelected()?"M":"F")+"',"
                    + "cargo = '"+TFCargoRepConvenio.getText()+"',"
                    + "cpf = '"+TFCPFRepConvenio.getText()+"',"
                    + "rg = '"+TFRGRepConvenio.getText()+"',"
                    + "Celular = '"+TFCelularRepConvenio.getText()+"',"
                    + "TelRepresentante = '"+TFTelRepConvenio.getText()+"',"
                    + "enderecoRep = '"+TFEndRepConvenio.getText()+"',"
                    + "numRep = '"+TFNumEndRepConvenio.getText()+"',"
                    + "bairroRep = '"+TFBairroRepConvenio.getText()+"',"
                    + "cidadeRep = '"+TFCidadeRepConvenio.getText()+"',"
                    + "CEPRep = '"+TFCEPRepConvenio.getText()+"',"
                    + "UFRep = '"+CBEstadoRepConvenio.getSelectedItem()+"',"
                    + "EstadoCivil = '"+CBEstadoCivilRepConvenio.getSelectedItem()+"',"    
                    + "formacao = '"+TFFormacaoRepConvenio.getText()+"'"
                    + "WHERE codigo = '"+TFCodigoConvenio.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Convênio\n"+e.getMessage());
         
         }

                TFRazaoSocial.setText("");
        TFNomeFantasiaConvenio.setText("");
        TFAreaAtuacao.setText("");
        TFCNPJConvenio.setText("");
        TFInscEstadualConvenio.setText("");
        TFEndConvenio.setText("");
        TFNumEndConvenio.setText("");
        TFBairroConvenio.setText("");
        TFCidadeConvenio.setText("");
        CBEstadoConvenio.setSelectedIndex(0);
        TFCEPConvenio.setText("");    
        TFTelConvenio.setText("");
        TFFaxConvenio.setText("");
        TFEmailConvenio.setText("");
        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
        TFNomeRepConvenio.setText("");
        TFCargoRepConvenio.setText("");
        buttonGroup1.clearSelection();
        TFCPFRepConvenio.setText("");
        TFRGRepConvenio.setText("");
        TFCelularRepConvenio.setText("");
        TFTelRepConvenio.setText("");
        TFEndRepConvenio.setText("");
        TFNumEndRepConvenio.setText("");
        TFBairroRepConvenio.setText("");
        TFCEPRepConvenio.setText("");
        TFCidadeRepConvenio.setText("");
        CBEstadoRepConvenio.setSelectedIndex(0);
        CBEstadoCivilRepConvenio.setSelectedIndex(0);
        TFFormacaoRepConvenio.setText("");
        
       TFPesqConvenio.setEnabled(false);
        BAtualizarConvenio.setEnabled(false);
         BCadastrarConvenio.setEnabled(true);
          BExcluirConvenio.setEnabled(false);
           BLimparConvenio.setEnabled(true);
                
    }  
        
    }//GEN-LAST:event_BAtualizarConvenioActionPerformed

    private void TFPesqConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesqConvenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesqConvenioActionPerformed

    private void TFPesqConvenioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesqConvenioKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
        
        String ModoPesquisa = CBPesqConvenio.getSelectedItem().toString();        
        
        if (ModoPesquisa == "***   Selecione   ***")
           {
           JOptionPane.showMessageDialog(null,"Escolha um modo de Pesquisa!");
           }
        else{
        
        String pesquisa = CBPesqConvenio.getSelectedItem().toString();
        String valor = TFPesqConvenio.getText();

        ConsultaConvenio convenio = new ConsultaConvenio(conn, this, pesquisa, valor);
        convenio.setTitle("Consulta de Convenio");
        convenio.setVisible(true);
        
        CBPesqConvenio.setSelectedIndex(0);
        TFPesqConvenio.setText("");
        TFPesqConvenio.setEnabled(false);

        }
        }
    }//GEN-LAST:event_TFPesqConvenioKeyPressed

    private void RBMesmoEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMesmoEndActionPerformed
             
        if (RBMesmoEnd.isSelected())    
          {
              
        String EndConvenio = TFEndConvenio.getText();
        String NumEndConvenio = TFNumEndConvenio.getText();
        String BairroConvenio = TFBairroConvenio.getText();
        String CidadeConvenio = TFCidadeConvenio.getText();
        String EstadoConvenio = CBEstadoConvenio.getSelectedItem().toString();
        String CEPConvenio = TFCEPConvenio.getText();    
        String FaxConvenio = TFFaxConvenio.getText();
        
        TFEndCorrespConvenio.setText(EndConvenio);
        TFNumCorrespConvenio.setText(NumEndConvenio);
        TFBairroCorrespConvenio.setText(BairroConvenio);
        TFCEPCorrespConvenio.setText(CEPConvenio);
        TFCidadeCorrespConvenio.setText(CidadeConvenio);
        CBEstadoCorrespConvenio.setSelectedItem(EstadoConvenio);
        TFFaxCorrespConvenio.setText(FaxConvenio);
        
        TFEndCorrespConvenio.setEnabled(false);
        TFNumCorrespConvenio.setEnabled(false);
        TFBairroCorrespConvenio.setEnabled(false);
        TFCEPCorrespConvenio.setEnabled(false);
        TFCidadeCorrespConvenio.setEnabled(false);
        CBEstadoCorrespConvenio.setEnabled(false);
        TFFaxCorrespConvenio.setEnabled(false);
 
          }

       
    }//GEN-LAST:event_RBMesmoEndActionPerformed

    private void RBOutroEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBOutroEndActionPerformed
       
        if (RBOutroEnd.isSelected()) 
        {
        TFEndCorrespConvenio.setEnabled(true);
        TFNumCorrespConvenio.setEnabled(true);
        TFBairroCorrespConvenio.setEnabled(true);
        TFCEPCorrespConvenio.setEnabled(true);
        TFCidadeCorrespConvenio.setEnabled(true);
        CBEstadoCorrespConvenio.setEnabled(true);
        TFFaxCorrespConvenio.setEnabled(true);
        

        TFEndCorrespConvenio.setText("");
        TFNumCorrespConvenio.setText("");
        TFBairroCorrespConvenio.setText("");
        TFCEPCorrespConvenio.setText("");
        TFCidadeCorrespConvenio.setText("");
        CBEstadoCorrespConvenio.setSelectedIndex(0);
        TFFaxCorrespConvenio.setText("");
       
        
        }  

    }//GEN-LAST:event_RBOutroEndActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Convenio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarConvenio;
    public javax.swing.JButton BCadastrarConvenio;
    public javax.swing.JButton BExcluirConvenio;
    public javax.swing.JButton BFecharConvenio;
    public javax.swing.JButton BLimparConvenio;
    private javax.swing.JButton BPesqConvenio;
    public javax.swing.JComboBox CBEstadoCivilRepConvenio;
    public javax.swing.JComboBox CBEstadoConvenio;
    public javax.swing.JComboBox CBEstadoCorrespConvenio;
    public javax.swing.JComboBox CBEstadoRepConvenio;
    public javax.swing.JComboBox CBPesqConvenio;
    private javax.swing.JRadioButton RBMesmoEnd;
    private javax.swing.JRadioButton RBOutroEnd;
    public javax.swing.JRadioButton RBSexoFemRepConvenio;
    public javax.swing.JRadioButton RBSexoMascRepConvenio;
    public javax.swing.JTextField TFAreaAtuacao;
    public javax.swing.JTextField TFBairroConvenio;
    public javax.swing.JTextField TFBairroCorrespConvenio;
    public javax.swing.JTextField TFBairroRepConvenio;
    public javax.swing.JFormattedTextField TFCEPConvenio;
    public javax.swing.JFormattedTextField TFCEPCorrespConvenio;
    public javax.swing.JFormattedTextField TFCEPRepConvenio;
    public javax.swing.JFormattedTextField TFCNPJConvenio;
    public javax.swing.JFormattedTextField TFCPFRepConvenio;
    public javax.swing.JTextField TFCargoRepConvenio;
    public javax.swing.JFormattedTextField TFCelularRepConvenio;
    public javax.swing.JTextField TFCidadeConvenio;
    public javax.swing.JTextField TFCidadeCorrespConvenio;
    public javax.swing.JTextField TFCidadeRepConvenio;
    public javax.swing.JTextField TFCodigoConvenio;
    public javax.swing.JTextField TFEmailConvenio;
    public javax.swing.JTextField TFEndConvenio;
    public javax.swing.JTextField TFEndCorrespConvenio;
    public javax.swing.JTextField TFEndRepConvenio;
    public javax.swing.JFormattedTextField TFFaxConvenio;
    public javax.swing.JFormattedTextField TFFaxCorrespConvenio;
    public javax.swing.JTextField TFFormacaoRepConvenio;
    public javax.swing.JTextField TFInscEstadualConvenio;
    public javax.swing.JTextField TFNomeFantasiaConvenio;
    public javax.swing.JTextField TFNomeRepConvenio;
    public javax.swing.JTextField TFNumCorrespConvenio;
    public javax.swing.JTextField TFNumEndConvenio;
    public javax.swing.JTextField TFNumEndRepConvenio;
    public javax.swing.JTextField TFPesqConvenio;
    public javax.swing.JTextField TFRGRepConvenio;
    public javax.swing.JTextField TFRazaoSocial;
    public javax.swing.JFormattedTextField TFTelConvenio;
    public javax.swing.JFormattedTextField TFTelRepConvenio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
