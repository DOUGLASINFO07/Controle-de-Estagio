package ControleEstagio;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.rtf.RtfWriter;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")

public class TermoCompromisso extends javax.swing.JFrame {
    
    Connection conn ;
    public int concedente = 0;
    public int interveniente = 0;
    public int estagiário = 0;
    Principal fPrincipal = null;
    private int count;
    
    

    public TermoCompromisso() {
        initComponents();
  
    }
    
    public TermoCompromisso(Connection conn, Principal fPrincipal, String GeradordoTermo) {
        initComponents();
        
        this.conn = conn;
        this.fPrincipal = fPrincipal;
        
        Calendar c = Calendar.getInstance();
        Data1.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
        Data.setText(new java.text.SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date()));
  
        TFGeradorTermo.setEnabled(false);
        BExcluirTermo.setEnabled(false);
        BAtualizarTermo.setEnabled(false);
        TFCodigo.setVisible(false);
    
        TFNumTermo.setEnabled(true);
        Data.setEnabled(true);
        TFGeradorTermo.setEnabled(false);
        TFNomeInterv.setEnabled(true);
        TFCNPJInterv.setEnabled(false);
        TFEndInterv.setEnabled(false);
        TFNumEndInterv.setEnabled(false);
        TFCEPInterv.setEnabled(false);
        TFBairroInterv.setEnabled(false);
        TFCidadeInterv.setEnabled(false);
        TFEstadoInterv.setEnabled(false);    
        TFTelInterv.setEnabled(false);
        TFRepInterv.setEnabled(false);
        TFCargoRepInterv.setEnabled(false);
        TFRespInterv.setEnabled(true);
        TFCargoRespInterv.setEnabled(true);
        TFNomeConc.setEnabled(true);
        TFCNPJConc.setEnabled(false);
        TFEndConc.setEnabled(false);
        TFNumEndConc.setEnabled(false);
        TFCEPConc.setEnabled(false);
        TFBairroConc.setEnabled(false);
        TFCidadeConc.setEnabled(false);
        TFEstadoConc.setEnabled(false);
        TFTelConc.setEnabled(false);
        TFRepConc.setEnabled(false);
        TFCPFRepConc.setEnabled(false);
        TFCargoRepConc.setEnabled(false);
        TFRespConc.setEnabled(true);
        TFCPFRespConc.setEnabled(true);
        TFCargoRespConc.setEnabled(true);
        TFNomeEst.setEnabled(true);
        TFCPFEst.setEnabled(false);
        TFDataNascEst.setEnabled(false);
        TFEndEst.setEnabled(false);
        TFNumEndEst.setEnabled(false);
        TFCEPEst.setEnabled(false);
        TFBairroEst.setEnabled(false);
        TFCidadeEst.setEnabled(false);
        TFEstadoEst.setEnabled(false);
        TFTelEst.setEnabled(false);
        TFCursoEst.setEnabled(false);
        TFEmailEst.setEnabled(false);
        TFSemestreEngresso.setEnabled(false);
        TFAnoEngresso.setEnabled(false);
        BGerarPDF.setEnabled(false);
        TFCodigo.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked") 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFNomeInterv = new javax.swing.JTextField();
        BBuscarInterv = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFEndInterv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFNumEndInterv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFBairroInterv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TFCidadeInterv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFRepInterv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFCargoRepInterv = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TFRespInterv = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TFCargoRespInterv = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        TFEstadoInterv = new javax.swing.JTextField();
        TFCNPJInterv = new javax.swing.JFormattedTextField();
        TFCEPInterv = new javax.swing.JFormattedTextField();
        TFTelInterv = new javax.swing.JFormattedTextField();
        BCadastrarTermo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TFNomeConc = new javax.swing.JTextField();
        BBuscarConc = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TFEndConc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TFNumEndConc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TFBairroConc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TFCidadeConc = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TFRepConc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TFCargoRepConc = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TFRespConc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TFCargoRespConc = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        TFEstadoConc = new javax.swing.JTextField();
        TFCPFRepConc = new javax.swing.JFormattedTextField();
        TFCPFRespConc = new javax.swing.JFormattedTextField();
        TFCNPJConc = new javax.swing.JFormattedTextField();
        TFCEPConc = new javax.swing.JFormattedTextField();
        TFTelConc = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        TFNomeEst = new javax.swing.JTextField();
        BBuscarEst = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TFEndEst = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        TFNumEndEst = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TFBairroEst = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TFCidadeEst = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TFEmailEst = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        TFCursoEst = new javax.swing.JTextField();
        TFEstadoEst = new javax.swing.JTextField();
        TFCPFEst = new javax.swing.JFormattedTextField();
        TFDataNascEst = new javax.swing.JFormattedTextField();
        TFCEPEst = new javax.swing.JFormattedTextField();
        TFTelEst = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        TFAnoEngresso = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        TFSemestreEngresso = new javax.swing.JTextField();
        BGerarPDF = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        TFNumTermo = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        TFGeradorTermo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        RBObrigatorio = new javax.swing.JRadioButton();
        RBNaoObrigatorio = new javax.swing.JRadioButton();
        Data = new javax.swing.JFormattedTextField();
        TFDataTerminoTermo = new javax.swing.JFormattedTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        TFHorarioEstagio = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        CBPesqTermo = new javax.swing.JComboBox();
        TFPesquisaTermo = new javax.swing.JTextField();
        BPesqTermo = new javax.swing.JButton();
        TFCodigo = new javax.swing.JTextField();
        BLimparTermo = new javax.swing.JButton();
        BExcluirTermo = new javax.swing.JButton();
        BAtualizarTermo = new javax.swing.JButton();
        BFecharAluno = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        Data1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TermoObrigatorio.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(219, 252, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interveniente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Interveniente");

        BBuscarInterv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BBuscarInterv.setText("Buscar Dados");
        BBuscarInterv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarIntervActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CNPJ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Endereço");

        TFEndInterv.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nº");

        TFNumEndInterv.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CEP");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Bairro");

        TFBairroInterv.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cidade");

        TFCidadeInterv.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tel.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Representado por");

        TFRepInterv.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cargo");

        TFCargoRepInterv.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Responsável pela assinatura do TCE");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Cargo");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Estado");

        TFEstadoInterv.setEditable(false);

        TFCNPJInterv.setEditable(false);
        try {
            TFCNPJInterv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCNPJInterv.setFocusLostBehavior(TFCEPInterv.COMMIT);

        TFCEPInterv.setEditable(false);
        try {
            TFCEPInterv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPInterv.setFocusLostBehavior(TFCEPInterv.COMMIT);

        TFTelInterv.setEditable(false);
        try {
            TFTelInterv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelInterv.setFocusLostBehavior(TFTelInterv.COMMIT);

        BCadastrarTermo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarTermo.setText("Cadastrar / Imprimir");
        BCadastrarTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarTermoActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNomeInterv))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEndInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNumEndInterv))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BBuscarInterv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRespInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCargoRespInterv))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRepInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCargoRepInterv))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCEPInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFBairroInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCidadeInterv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEstadoInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelInterv, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCadastrarTermo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFNomeInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BBuscarInterv)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BCadastrarTermo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(TFEndInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TFNumEndInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCNPJInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TFCEPInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TFBairroInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(TFCidadeInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel39)
                        .addComponent(TFEstadoInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFTelInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFRepInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TFCargoRepInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(TFRespInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(TFCargoRespInterv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        jPanel2.setBackground(new java.awt.Color(211, 245, 145));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Concedente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nome da Empresa");

        BBuscarConc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BBuscarConc.setText("Buscar Dados");
        BBuscarConc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarConcActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("CNPJ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Endereço");

        TFEndConc.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Nº");

        TFNumEndConc.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CEP");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Bairro");

        TFBairroConc.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Cidade");

        TFCidadeConc.setEditable(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Tel.");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Representado por");

        TFRepConc.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Cargo");

        TFCargoRepConc.setEditable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Responsável pela assinatura do TCE");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Cargo");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Estado");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("CPF");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("CPF");

        TFEstadoConc.setEditable(false);

        TFCPFRepConc.setEditable(false);
        try {
            TFCPFRepConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFRepConc.setFocusLostBehavior(TFCPFRespConc.COMMIT);

        try {
            TFCPFRespConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFRespConc.setFocusLostBehavior(TFCPFRespConc.COMMIT);

        try {
            TFCNPJConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCNPJConc.setFocusLostBehavior(TFCNPJConc.COMMIT);

        try {
            TFCEPConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCEPConc.setFocusLostBehavior(TFCEPConc.COMMIT);

        try {
            TFTelConc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelConc.setFocusLostBehavior(TFTelConc.COMMIT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCNPJConc, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEndConc, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNomeConc, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BBuscarConc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TFNumEndConc))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRespConc, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFCPFRespConc)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCargoRespConc, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFRepConc))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(8, 8, 8)
                                .addComponent(TFCEPConc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroConc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCidadeConc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEstadoConc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelConc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCPFRepConc, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCargoRepConc, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TFNomeConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarConc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(TFEndConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(TFNumEndConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCNPJConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(TFCEPConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(TFBairroConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(TFCidadeConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(TFEstadoConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TFTelConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TFRepConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TFCargoRepConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(TFCPFRepConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel25)
                        .addComponent(TFRespConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(TFCPFRespConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(TFCargoRespConc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );

        jPanel3.setBackground(new java.awt.Color(215, 245, 146));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estagiário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Nome");

        BBuscarEst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BBuscarEst.setText("Buscar Dados");
        BBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarEstActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("CPF");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Endereço");

        TFEndEst.setEditable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Nº");

        TFNumEndEst.setEditable(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("CEP");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Bairro");

        TFBairroEst.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Cidade");

        TFCidadeEst.setEditable(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Tel.");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("E-mail");

        TFEmailEst.setEditable(false);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Estado");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Data Nasc.");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Curso");

        TFCursoEst.setEditable(false);

        TFEstadoEst.setEditable(false);

        TFCPFEst.setEditable(false);
        try {
            TFCPFEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFEst.setFocusLostBehavior(TFCPFEst.COMMIT);

        TFDataNascEst.setEditable(false);
        try {
            TFDataNascEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFDataNascEst.setFocusLostBehavior(TFDataNascEst.COMMIT);

        TFCEPEst.setEditable(false);
        try {
            TFCEPEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        TFTelEst.setEditable(false);
        try {
            TFTelEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFTelEst.setFocusLostBehavior(TFTelEst.COMMIT);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Ano Engresso");

        TFAnoEngresso.setEditable(false);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Semestre Engresso");

        TFSemestreEngresso.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCidadeEst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEstadoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFTelEst, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFAnoEngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFSemestreEngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeEst, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(BBuscarEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCPFEst, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDataNascEst, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCursoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEmailEst, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFEndEst, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNumEndEst, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFCEPEst, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFBairroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TFNomeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BBuscarEst)
                    .addComponent(jLabel28)
                    .addComponent(TFCPFEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(TFDataNascEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(TFEndEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(TFNumEndEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(TFCEPEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(TFBairroEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(TFCidadeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFSemestreEngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(TFAnoEngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50)
                        .addComponent(TFTelEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(TFEstadoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TFEmailEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(TFCursoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        BGerarPDF.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BGerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pdf.png"))); // NOI18N
        BGerarPDF.setText("Imprimir");
        BGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerarPDFActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(220, 251, 167));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Termo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Nº do Termo de Compromisso");

        TFNumTermo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFNumTermo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel38.setText("Data do Inicio do Termo");

        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel46.setText("Gerado por:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel47.setText("Tipo de Estágio");

        buttonGroup1.add(RBObrigatorio);
        RBObrigatorio.setText("Obrigatório");

        buttonGroup1.add(RBNaoObrigatorio);
        RBNaoObrigatorio.setText("Não Obrigatório");

        try {
            Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Data.setFocusLostBehavior(Data.COMMIT);

        try {
            TFDataTerminoTermo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFDataTerminoTermo.setFocusLostBehavior(Data.COMMIT);

        jLabel52.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel52.setText("Data do Termino do Termo");

        jLabel53.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel53.setText("Horario de Estágio");

        try {
            TFHorarioEstagio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:## às ##:##, e das ##:## às ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFHorarioEstagio.setFocusLostBehavior(Data.COMMIT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFNumTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBObrigatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBNaoObrigatorio)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFGeradorTermo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDataTerminoTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFHorarioEstagio)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TFNumTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(TFGeradorTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(RBObrigatorio)
                    .addComponent(RBNaoObrigatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel53)
                        .addComponent(TFHorarioEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(TFDataTerminoTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38)))
        );

        jPanel6.setBackground(new java.awt.Color(149, 193, 57));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Pesquisar");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Pesquisar por:");

        CBPesqTermo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número do Termo", "Nome do Interveniente", "Nome Concedente", "Nome do Estagiário", " ", " " }));
        CBPesqTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqTermoActionPerformed(evt);
            }
        });

        TFPesquisaTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesquisaTermoActionPerformed(evt);
            }
        });
        TFPesquisaTermo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesquisaTermoKeyPressed(evt);
            }
        });

        BPesqTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqTermoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBPesqTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFPesquisaTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(BPesqTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPesqTermo)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(CBPesqTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPesquisaTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BLimparTermo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparTermo.setText("Limpar");
        BLimparTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparTermoActionPerformed(evt);
            }
        });

        BExcluirTermo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirTermo.setText("Excluir");
        BExcluirTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirTermoActionPerformed(evt);
            }
        });

        BAtualizarTermo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarTermo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarTermo.setText("Atualizar");
        BAtualizarTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarTermoActionPerformed(evt);
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

        jLabel45.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel45.setText("Hoje é ");

        Data1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Data1.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(167, 167, 167)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BGerarPDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAtualizarTermo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(BExcluirTermo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLimparTermo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BFecharAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45)
                                .addComponent(Data1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BLimparTermo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BExcluirTermo)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(BAtualizarTermo)
                        .addGap(18, 18, 18)
                        .addComponent(BGerarPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharAluno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerarPDFActionPerformed

            String Nome = TFNomeInterv.getText();
            String CNPJInternv = TFCNPJInterv.getText();
            String EndInterv = TFEndInterv.getText();
            String NumEndInterv = TFNumEndInterv.getText();
            String CEPInterv = TFCEPInterv.getText();
            String BairroInterv = TFBairroInterv.getText();
            String CidadeInterv = TFCidadeInterv.getText();
            String EstadoInterv = TFEstadoInterv.getText();
            String TelInterv = TFTelInterv.getText();
            String RepInterv = TFRepInterv.getText();
            String CargoRepInterv = TFCargoRepInterv.getText();
            String RespInterv = TFRespInterv.getText();
            String CargoRespInterv = TFCargoRespInterv.getText();
            String NomeConc = TFNomeConc.getText();
            String CNPJConc = TFCNPJConc.getText();
            String EndConc = TFEndConc.getText();
            String NUmEndConc = TFNumEndConc.getText();
            String CEPConc = TFCEPConc.getText();
            String BairroConc = TFBairroConc.getText();
            String CidadeConc = TFCidadeConc.getText();
            String EstadoConc = TFEstadoConc.getText();
            String TelConc = TFTelConc.getText();
            String RepConc = TFRepConc.getText();
            String CPFRepConc = TFCPFRepConc.getText();
            String CargoRepConc = TFCargoRepConc.getText();
            String RespConc = TFRespConc.getText();
            String CPFRespConc = TFCPFRespConc.getText();
            String CargoRespConc = TFCargoRespConc.getText();
            String NomeEst = TFNomeEst.getText();
            String CPFEst = TFCPFEst.getText();
            String DataNascEst = TFDataNascEst.getText();
            String SexoEst = ("m");
            String EndEst = TFEndEst.getText();
            String NumEndEst = TFNumEndEst.getText();
            String CEPEst = TFCEPEst.getText();
            String BairroEst = TFBairroEst.getText();
            String CidadeEst = TFCidadeEst.getText();
            String EstadoEst = TFEstadoEst.getText();
            String TelEst = TFTelEst.getText();
            String CursoEst = TFCursoEst.getText();
            String EmailEst = TFEmailEst.getText();
            String DataTerminoTermo = TFDataTerminoTermo.getText();
            String HorarioEstagio = TFHorarioEstagio.getText();
            String NumTermo = TFNumTermo.getText();
            String DataCompletaTermo = Data1.getText();
            String DataTermo = Data.getText();
            String SemEngresso = TFSemestreEngresso.getText();
            String AnoEngresso = TFAnoEngresso.getText();
            
            if(RBObrigatorio.isSelected())
                
            {

                Document document = new Document(PageSize.A4, 40, 40, 40, 40);
                
        try {
            
        
                
        /*String data =(DataTermo) ; //Pego a data 
        //divido ela em partes 
        String dd = data.substring(0, 2); //05/12/2009 
        String mm = data.substring(3, 5);//1234567890 
        String yyyy = data.substring(6, 10); 
        //depois junto de novo pronto para o banco 
        String dataingles = yyyy + "/" + mm + "/" + dd ;                 
        
        Date a = new Date(dataingles);          
        a.setDate(a.getDate() + 180);          
  
        String formato = "dd/MM/yyyy";  
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);   */        
            
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("Termo.doc"));
        
            document.open();

            Image Img = Image.getInstance("src/Imagem/Rep_Brasil.png");
            Img.setAlignment(Element.ALIGN_CENTER);
            document.add(Img);
            
            Font font10 = new Font(Font.TIMES_ROMAN,12);
            Font font8 = new Font(Font.TIMES_ROMAN,12);
            Font font8Bold = new Font(Font.TIMES_ROMAN,10,Font.BOLD);
            Font font12Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
  
            Paragraph P1 = new Paragraph("\n\nMINISTÉRIO DA EDUCAÇÃO\n"
                    + "SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA\n"
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS - CAMPUS PASSOS\n"
                    + "SEÇÃO DE ESTÁGIOS\n",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P2 = new Paragraph("passos@ifsuldeminas.edu.br\n",font10);  
            P2.setAlignment(Element.ALIGN_CENTER);
            P2.setSpacingAfter(10);
            document.add(P2);
            
            Paragraph P3 = new Paragraph("TERMO DE COMPROMISSO DE ESTÁGIO OBRIGATÓRIO Nº "+NumTermo+"",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("(Instrumento jurídico de acordo com a lei Federal nª 11.788 de  25 de Setembro de 2008)",font10);  
            P4.setAlignment(Element.ALIGN_CENTER);
            P4.setSpacingAfter(15);
            document.add(P4);
            
            Paragraph P5 = new Paragraph("A "+DataCompletaTermo+" na cidade de Passos MG neste ato, as partes a seguir nomeadas:",font10);  
            P5.setAlignment(Element.ALIGN_CENTER);
            P5.setSpacingAfter(15);
            document.add(P5); 
            
            Paragraph P6 = new Paragraph("\nINTERVENIENTE",font12Bold);  
            P6.setAlignment(Element.ALIGN_CENTER);
            P6.setSpacingAfter(10);
            document.add(P6);
            
            Paragraph P7 = new Paragraph("INTERVENIENTE: "+Nome+"\n"
                                       + "CNPJ: "+CNPJInternv+"\n"
                                       + "ENDEREÇO: "+EndInterv+"       Nº: "+NumEndInterv+"\n"
                                       + "BAIRRO: "+BairroInterv+"      CIDADE: "+CidadeInterv+"        ESTADO: "+EstadoInterv+"\n"
                                       + "CEP: "+CEPInterv+"        TELEFONE: "+TelInterv+"\n"
                                       + "REPRESENTADO POR: "+RepInterv+"       CARGO: "+CargoRepInterv+"\n"
                                       + "RESPONSÁVEL PELA ASS. DO TCE: "+RespInterv+"      CARGO: "+CargoRespInterv+" \n",font10);  
            P7.setSpacingAfter(15);
            document.add(P7);
            
            Paragraph P8 = new Paragraph("CONCEDENTE",font12Bold);  
            P8.setAlignment(Element.ALIGN_CENTER);
            P8.setSpacingAfter(10);
            document.add(P8);
            
            Paragraph P9 = new Paragraph("NOME DA EMPRESA: "+NomeConc+" \n"
                                       + "CNPJ: "+CNPJConc+" \n"
                                       + "ENDEREÇO: "+EndConc+"          Nº: "+NUmEndConc+" \n"
                                       + "BAIRRO: "+BairroConc+"         CIDADE: "+CidadeConc+"         ESTADO: "+EstadoConc+"\n"
                                       + "CEP: "+CEPConc+"          TELEFONE: "+TelConc+"\n"
                                       + "REPRESENTADO POR: "+RepConc+"     CPF: "+CPFRepConc+"     CARGO: "+CargoRepConc+"\n"
                                       + "RESPONSÁVEL ASS. DO TCE: "+RespConc+"     CPF: "+CPFRespConc+"    CARGO: "+CargoRespConc+"\n",font10); 
            P9.setSpacingAfter(15);
            document.add(P9);
            
            Paragraph P10 = new Paragraph("ESTAGIÁRIO",font12Bold);  
            P10.setAlignment(Element.ALIGN_CENTER);
            P10.setSpacingAfter(10);
            document.add(P10);
            
            Paragraph P11 = new Paragraph("NOME: "+NomeEst+"\n"
                                       + "CPF: "+CPFEst+"       DATA NASCIMENTO: "+DataNascEst+"        SEXO: "+SexoEst+" \n"
                                       + "ENDEREÇO: "+EndEst+"          Nº: "+NumEndEst+"  \n"
                                       + "BAIRRO: "+BairroEst+"         CIDADE: "+CidadeEst+"       ESTADO: "+EstadoEst+"\n"
                                       + "CEP: "+CEPEst+"        TELEFONE: "+TelEst+"\n"
                                       + "ANO ENGRESSO: "+AnoEngresso+"        SEMESTRE ENGRESSO: "+SemEngresso+"\n"
                                       + "MATRICULADO REGULARMENTE NO CURSO: "+CursoEst+" \n"
                                       + "E-MAIL: "+EmailEst+" \n",font10); 
            P11.setSpacingAfter(10);
            document.add(P11);
            
            Paragraph P12 = new Paragraph("Celebram entre si este TERMO DEE COMPROMISSO DE ESTÁGIO, ajustando as seguintes cláusulas",font8Bold);  
            P12.setAlignment(Element.ALIGN_CENTER);
            P12.setSpacingAfter(10);
            document.add(P12);
            
            Paragraph P13 = new Paragraph("\nCLAUSULA PRIMEIRA: DO OBJETO: Este Instrumento tem por objetivo estabelecer as "
                    + "condições para a realização do estágio e particularizar"
                    + "a relação jurídica especial existente entre o ESTAGIÁRIO(a) a CONCEDENTE e a INSTITUIÇÂO DE ENSINO. ",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLAUSULA SEGUNDA: DA FINALIDADE: O Estágio Obrigatório, definido no Projeto "
                    + "Pedagógico do Curso, nos termos da Lei nº 11.788/08 e da Lei nº"
                    + "9.394/96 (diretrizes e Bases da Educação Nacional), entendido como ato educativo supervisionado, "
                    + "visa a complementação do ensino e da aprendizagem, proporcionando preparaçao "
                    + "para o trabalho profissional do ESTAGIARIO, possibilitando-lhe aperfeiçoamento técnico-cultural, "
                    + "científico e de relacionamento humano, bem como condições de vivenciar"
                    + "e adiquirir experiência práticas em situações reais de trabalho em sua área de atuação.",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("\nCLAUSULA TERCEIRA: DO HORÀRIO E DA VIGÊNCIA: Fica compromissado entre as partes que:",font8);
            document.add(P15);
            
            Paragraph P16 = new Paragraph("     a) Este termo de compromisso de Estágio terá vigência de "+DataTermo+" a "+DataTerminoTermo+" "
                    + "podendo ser interrompido a qualquer tempo"
                    + ", mediante comunicação escrita com 5 dias de antecedência.",font8);  
            P16.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P16);
            
            Paragraph P17 = new Paragraph("     b) as atividades do estágio a serem cumpridas pelo estagiário poderão ser "
                    + "cumpridas nos seguintes horários: das "+HorarioEstagio+"totalizando o máximo de trinta horas semanais.",font8);
            P17.setAlignment(Element.ALIGN_JUSTIFIED);
            P17.setSpacingAfter(10);
            document.add(P17);
            
            Paragraph P18 = new Paragraph("\nCLAUSULA QUARTA: DA RECISÃO: O seguinte Termo de Compromisso ficará rescindido nos "
                    + "seguintes casos:",font8);  
            document.add(P18);
            
            Paragraph P19 = new Paragraph("     a) Ao término do estágio. ",font8);  
            document.add(P19);
            
            Paragraph P20 = new Paragraph("     b) ao trancamento de matrícula pelo estagiário.",font8);  
            document.add(P20);
            
            Paragraph P21 = new Paragraph("     c) Na desistência do Curso pelo Estagiário.",font8);  
            document.add(P21);
            
            Paragraph P22 = new Paragraph("     d) Pelo não comparecimento do aluno ao estágio por um período superior a 05 dias, "
                    + "sem justa causa.",font8);  
            document.add(P22);
            
            Paragraph P23 = new Paragraph("     e) Ambas as partes se sentirem prejudicados no andamento na área pedagógica.",font8);  
            document.add(P23);
            
            Paragraph P24 = new Paragraph("     f) Pelo trancamento da matrícula, abandono, desligamento ou conclusão do curso na "
                    + "INSTITUIÇÂO DE ENSINO.",font8);  
            document.add(P24);
 
            Paragraph P25 = new Paragraph("     g) Pelo descumprimento das condições do presente Termo de Compromissso de Estágio.",font8);  
            P25.setSpacingAfter(10);
            document.add(P25);
            
            Paragraph P26 = new Paragraph("\nCLAÚSULA QUINTA: DOS ENCARGOS SOCIAIS - O presente Estágio, não acarretará vinculo empregatício de "
                    + "qualquer natureza, desde que observados"
                    + "as disposições da Lei nº 11.788/08 e do presente termo de Compromisso.",font8);
            P26.setAlignment(Element.ALIGN_JUSTIFIED);
            P26.setSpacingAfter(10);
            document.add(P26);
            
            Paragraph P27 = new Paragraph("\nCLAÚSULA SEXTA: DO SEGURO - na vigencia do presente convênio, o ESTAGIÁRIO, BOLSISTA E ALUNO, "
                    + "regularmente matriculados estão assegurados"
                    + " pelo GRUPO FEDERAL SEGUROS através da apólice nº 0101.82.00.00000186 e possui os seguintes "
                    + "coberturas: morte acidental, e invalidez "
                    + "permanente total ou parcial por acidente.",font8);
            P27.setAlignment(Element.ALIGN_JUSTIFIED);
            P27.setSpacingAfter(10);
            document.add(P27);
            
            Paragraph P28 = new Paragraph("\nCLAÚSULA SETIMA: DOS BENEFICIOS - de acordo com a normativa nº 7, de 30 de Outubro "
                    + "de 2008 o estágio obrigatório"
                    + "somente será realizado sem ônus para os órgão e entidades..",font8);
            P28.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P28);
            
            Paragraph P29 = new Paragraph("Paragrafo Único: A eventual concessão de benefício relacionados a transporte, "
                    + "alimnetação, saúde, entre outros"
                    + "não caracteriza vínculo empregatício.(artigo 12 da Lei nº11.788, de 25 de Outubro de 2008).",font8);
            P29.setAlignment(Element.ALIGN_JUSTIFIED);
            P29.setSpacingAfter(10);
            document.add(P29);
            
            Paragraph P30 = new Paragraph("\nCLAUSULA OITAVA: DAS OBRIGAÇÕES DAS UNIDADES CONCEDENTES: - no desenvolvimento "
                    + "do estágio ora compromissado, caberá á unidade Concedente:",font8);  
            document.add(P30);
            
            Paragraph P31 = new Paragraph("     a) Proporcionar ao ESTAGIÀRIO, condições propícias para o exercícios das "
                    + "atividades práticas compatíveis com seu Plano de atividades. ",font8);  
            document.add(P31);
            
            Paragraph P32 = new Paragraph("     b) Facilitar as atividades do professor orientador para que o mesmo, "
                    + "juntamente com o supervisor, possa auxiliar o estagiário em eventuais"
                    + "problemas durante o curso.",font8);  
            document.add(P32);
            
            Paragraph P33 = new Paragraph("     c) Dosignar o(a) Sr(a) "+RespConc+" ocupante do Cargo de "+CargoRespConc+" "
                    + "para Supervisor de estágio en  quanto vigorar o presente"
                    + "Termo de Compromisso..",font8); 
            P33.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P33);
            
            Paragraph P34 = new Paragraph("     d) Avaliar através do Supervisor, o desempenho do Estagiário de acordo com "
                    + "as diretrizes fornecidade pela Instituição de Ensino.",font8);  
            document.add(P34);
            
            Paragraph P35 = new Paragraph("     e) Comunicar a Instituição de Ensino, as interrupções e eventuais alterações "
                    + "que ocorrem neste Termo de Compromisso.",font8);
            P35.setSpacingAfter(10);
            document.add(P35);
            
            Paragraph P36 = new Paragraph("\n\nCLAUSULA NONA: DAS OBRIGAÇÕES DO ESTAGIÁRIO: - no desenvolvimento do estágio ora "
                    + "compromissado, caberá á unidade Concedente:",font8);  
            document.add(P36);
            
            Paragraph P37 = new Paragraph("     a) Cumprir em todo empenho e interessea programação estabelecida para seu estágio. ",font8);  
            document.add(P37);
            
            Paragraph P38 = new Paragraph("     b) Observar e obedecer as normas internas da Unidade concedente.",font8);  
            document.add(P38);
            
            Paragraph P39 = new Paragraph("     c) Comunicar a Instituição de Ensino, qualquer fato relevantesobre seu estágio.",font8);  
            document.add(P39);
            
            Paragraph P40 = new Paragraph("     d) Responder por perdas e danos consequentes da inobservanciadas normas "
                    + "internas da Unidade concedente ou das constantes"
                    + "do presente Termo de Compromisso.",font8);  
            document.add(P40);
            
            Paragraph P41 = new Paragraph("     e) respeitar, acatar ordens, bem como não divulgar quaiquer informação, "
                    + "dados, trabalhos reservados ou confidenciais"
                    + " de que tiver conhecimento em decorrência do estágio.",font8); 
            P41.setAlignment(Element.ALIGN_JUSTIFIED);
            P41.setSpacingAfter(10);
            document.add(P41);
            
            Paragraph P42 = new Paragraph("\nCLAUSULA DÉCIMA: DAS OBRIGAÇÕES DA INSTIUIÇÃO DE ENSINO: - No desenvolvimento "
                    + "do estágio curricular obrigatório"
                    + " caberá a Instituição de Ensino:",font8);  
            document.add(P42);
            
            Paragraph P43 = new Paragraph("     a) Designar o(a) Sr(a) "+RespInterv+" como Professor(a) Orientador(a) que "
                    + "assessorá e acompanhará o Estagiário(a). ",font8);  
            document.add(P43);
            
            Paragraph P44 = new Paragraph("     b) Avaliar através do Professor(a) Orientador(a), após análise do Supervisor "
                    + "da Unidade Concedente, do relatório Final elaborado pelo aluno(a)"
                    + "com base nas atividades executadas durante o período de estágio.",font8); 
            P44.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P44);
            
            Paragraph P45 = new Paragraph("     c) Conceder quando solicitado pela Unidade Concedente, informações "
                    + "acerca da vida escolar do estagiário.",font8);  
            document.add(P45);
            
            Paragraph P46 = new Paragraph("     d) Responder por perdas e danos consequentes da inobservanciadas "
                    + "normas internas da Unidade concedenteou das constantes"
                    + "do presente Termo de Compromisso.",font8);  
            document.add(P46);
            
            Paragraph P47 = new Paragraph("     e) respeitar, acatar ordens, bem como não divulgar quaiquer "
                    + "informação, dados, trabalhos reservados ou confidenciais"
                    + " de que tiver conhecimento em decorrência do estágio.",font8);
            P47.setAlignment(Element.ALIGN_JUSTIFIED);
            P47.setSpacingAfter(15);
            document.add(P47);
            
            Paragraph P48 = new Paragraph("\n     As partes, de comum acordo, elegem o foro da Justça Federeal, Subseção "
                    + "Judiciária de Pouso Alegre - MG, com expressa renuncia de qualquer outro, "
                    + "por mais previlegiado que seja, para dirimir quaisquer dúvida no cumprimento ou execução do "
                    + "presente Termo e do correspondente Convênio, "
                    + "que não puderem ser resolvidas administrativamente.",font8);
            P48.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P48);
            
            Paragraph P49 = new Paragraph("     E por estarem de inteiro e comum acordo com as condições e com o "
                    + "texto deste termo de Compromisso, as partes asssinam em três vias de iguais teor, "
                    + "cabendo a primeira via a Unidade Concedente, a segunda via ao Estagiário, e a terceira via "
                    + "ao Instituto de Ensino.",font8);
            P49.setAlignment(Element.ALIGN_JUSTIFIED);
            P49.setSpacingAfter(15);
            document.add(P49);
            
            Paragraph P50 = new Paragraph("\nPassos - MG, "+DataCompletaTermo+".",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n\n_________________________________________\n"+RepConc+"\n"+NomeConc+"",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            P51.setSpacingAfter(30);
            document.add(P51);
            
            Paragraph P54 = new Paragraph("\n\n_________________________________________\n"+RepInterv+"\nDiretor Geral Pró-Tempore Campus Passos",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P55 = new Paragraph("\n\n_________________________________________\n"+NomeEst+"\nEstagiário",font8);
            P55.setAlignment(Element.ALIGN_CENTER);
            document.add(P55);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+" Termo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
            
            
            //CONDIÇÃO PARA GERAR .DOC ESTÁGIO NÃO OBRIGATÓRIO, USANDO O RADIOBUTTON
            
            if (RBNaoObrigatorio.isSelected())
                
            {
                
      /*  String data =(DataTermo) ; //Pego a data 
        //divido ela em partes 
        String dd = data.substring(0, 2); //05/12/2009 
        String mm = data.substring(3, 5);//1234567890 
        String yyyy = data.substring(6, 10); 
        //depois junto de novo pronto para o banco 
        String dataingles = yyyy + "/" + mm + "/" + dd ;                 
        
        Date a = new Date(dataingles);          
        a.setDate(a.getDate() + 180);          
  
        String formato = "dd/MM/yyyy";  
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);   */
            
                               Document document = new Document(PageSize.A4, 40, 40, 40, 40);
        try {
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("Termo.doc"));
        
            document.open();

            Image Img = Image.getInstance("src/Imagem/Rep_Brasil.png");
            Img.setAlignment(Element.ALIGN_CENTER);
            document.add(Img);
            
            Font font10 = new Font(Font.TIMES_ROMAN,12);
            Font font8 = new Font(Font.TIMES_ROMAN,12);
            Font font8Bold = new Font(Font.TIMES_ROMAN,10,Font.BOLD);
            Font font12Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
  
            Paragraph P1 = new Paragraph("\nMINISTÉRIO DA EDUCAÇÃO\n"
                    + "SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA\n"
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS - CAMPUS PASSOS\n"
                    + "SEÇÃO DE ESTÁGIOS",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P2 = new Paragraph("passos@ifsuldeminas.edu.br",font10);  
            P2.setAlignment(Element.ALIGN_CENTER);
            P2.setSpacingAfter(10);
            document.add(P2);
            
            Paragraph P3 = new Paragraph("TERMO DE COMPROMISSO DE ESTÁGIO NÃO OBRIGATÓRIO Nº "+NumTermo+".",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("(Instrumento jurídico de acordo com a lei Federal nª 11.788 de  25 de Setembro de 2008)",font10);  
            P4.setAlignment(Element.ALIGN_CENTER);
            P4.setSpacingAfter(15);
            document.add(P4);
            
            Paragraph P5 = new Paragraph("A "+DataCompletaTermo+" na cidade de Passos MG neste ato, as partes a seguir nomeadas:",font10);  
            P5.setAlignment(Element.ALIGN_CENTER);
            P5.setSpacingAfter(15);
            document.add(P5);
            
            Paragraph P6 = new Paragraph("\nINTERVENIENTE",font12Bold);  
            P6.setAlignment(Element.ALIGN_CENTER);
            P6.setSpacingAfter(10);
            document.add(P6);
            
            Paragraph P7 = new Paragraph("INTERVENIENTE: "+NomeEst+"\n"
                                       + "CNPJ: "+CNPJInternv+"\n"
                                       + "ENDEREÇO: "+EndInterv+"       Nº "+NumEndInterv+"\n"
                                       + "BAIRRO: "+BairroInterv+"      CIDADE: "+CidadeInterv+"         ESTADO: "+EstadoInterv+"\n"
                                       + "CEP: "+CEPInterv+"        TELEFONE: "+TelInterv+"\n"
                                       + "REPRESENTADO POR: "+RepInterv+"       CARGO: "+CargoRepInterv+"\n"
                                       + "RESPONSÁVEL PELA ASS. DO TCE: "+RespInterv+"       CARGO: "+CargoRespInterv+" ",font10);  
            P7.setSpacingAfter(15);
            document.add(P7);
            
            Paragraph P8 = new Paragraph("CONCEDENTE",font12Bold);  
            P8.setAlignment(Element.ALIGN_CENTER);
            P8.setSpacingAfter(10);
            document.add(P8);
            
            Paragraph P9 = new Paragraph("NOME DA EMPRESA: "+NomeConc+" \n"
                                       + "CNPJ: "+CNPJConc+" \n"
                                       + "ENDEREÇO: "+EndConc+"  Nº        "+NUmEndConc+" \n"
                                       + "BAIRRO: "+BairroConc+"        CIDADE: "+CidadeConc+"      ESTADO: "+EstadoConc+"\n"
                                       + "CEP: "+CEPConc+"          TELEFONE: "+TelConc+"\n"
                                       + "REPRESENTADO POR: "+RepConc+"     CPF: "+CPFRepConc+"     CARGO: "+CargoRepConc+"\n"
                                       + "RESPONSÁVEL ASS. DO TCE: "+RespConc+"     CPF: "+CPFRespConc+"     CARGO: "+CargoRespConc+"",font10); 
            P9.setSpacingAfter(15);
            document.add(P9);
            
            Paragraph P10 = new Paragraph("ESTAGIÁRIO",font12Bold);  
            P10.setAlignment(Element.ALIGN_CENTER);
            P10.setSpacingAfter(10);
            document.add(P10);
            
            Paragraph P11 = new Paragraph("NOME: "+Nome+"\n"
                                       + "CPF: "+CPFEst+"       DATA NASCIMENTO: "+DataNascEst+"        SEXO: "+SexoEst+" \n"
                                       + "ENDEREÇO: "+EndEst+"       Nº "+NumEndEst+"  \n"
                                       + "BAIRRO: "+BairroEst+"         CIDADE: "+CidadeEst+"       ESTADO: "+EstadoEst+" \n"
                                       + "CEP: "+CEPEst+"        TELEFONE: "+TelEst+"\n"
                                       + "MATRICULADO REGULARMENTE NO CURSO: "+CursoEst+" \n"
                                       + "E-MAIL: "+EmailEst+" \n",font10); 
            P11.setSpacingAfter(10);
            document.add(P11);
            
            Paragraph P12 = new Paragraph("Celebram entre si este TERMO DE COMPROMISSO DE ESTÁGIO, ajustando as seguintes cláusulas:\n",font8Bold);  
            P12.setAlignment(Element.ALIGN_CENTER);
            P12.setSpacingAfter(10);
            document.add(P12);
            
            Paragraph P13 = new Paragraph("CLAUSULA 1ª - Este Termo de Compromisso reger-se-á pela lei 11.788/2008, pelas normas de estágio "
                    + "do Instituto Federal de Educação, Ciência e Tecnologia do Sul de Minas Gerais e pelo Convênio celebrado entre a CONCEDENTE E A INTERVENIENTE. ",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLAUSULA 2ª: O Estágio Não Obrigatório é aquele desenvolvido como atividade opcional, acrescida á carga horária regular, nos termos da lei "
                    + "11.788/08 e da lei nº 9.394/96, visa ao aprendizado de competências próprias da atividade profissional e a contextualização curricular,"
                    + "objetivando o desenvolvimento do educandopara a vida cidadã e para o trabalho.",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("\nCLAUSULA 3ª: O estágio terá início em "+DataTermo+" e terá seu término em "+DataTerminoTermo+" "
                    + "com uma atividade de 06 horas diárias, totalizando 30 horas semanais, sendo compatível com "
                    + "as atividades escolares e de acordo com o art. 10° da Lei n° 11.788/08.",font8);
            P15.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P15);
            
            Paragraph P57 = new Paragraph("     § 1º - A jornada de atividade em estágio não poderá ultrapassar os limites fixados "
                    + "pelos incisos I e II, § 1º e 2º § do art. 10 da Lei nº 11.788/2008. ",font8);  
            P57.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P57);
            
            Paragraph P58 = new Paragraph("Podendo ser prorrogado por igual período mediante termo aditivo "
                    + "e entendimento entre as partes, não podendo ultrapassar os limites fixados "
                    + "conforme consta no art. 11 da Lei nº 11.788/2008",font8);  
            P58.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P58);
            
            Paragraph P59 = new Paragraph("     § 2º - Tendo o estágio a duração igual ou superior a um ano, "
                    + "é assegurado ao ESTAGIÁRIO, período de recesso de 30 (trinta)dias, a ser gozado "
                    + "preferencialmente durante suas férias escolares, ou se inferior a um ano, o recesso "
                    + "será proporcional. ",font8);  
            P59.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P59);
            
            Paragraph P16 = new Paragraph("\nCLÁUSULA 4ª - O estágio será acompanhado pelo professor(a) "
                    + "orientador(a) da "+Nome+" e pelo supervisor da "
                    + "CONCEDENTE, que deverão apor seus vistos nos relatórios de atividades e no relatório de aprovação do ESTAGIÁRIO.",font8);  
            P16.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P16);
            
            Paragraph P17 = new Paragraph("\nCLÁUSULA 5ª– O ESTAGIÁRIO desenvolverá suas atividades obrigando-se a:",font8);
            P17.setAlignment(Element.ALIGN_JUSTIFIED);
            P17.setSpacingAfter(10);
            document.add(P17);
            
            Paragraph P18 = new Paragraph("   a)   Cumprir com empenho e interesse a programação estabelecida no Plano de Atividades;\n" +
"   b)	Cumprir as condições fixadas para o Estágio observando as normas de trabalho vigentes na CONCEDENTE, "
                    + "preservando o sigilo e a confidencialidade sobre as informações que tenha acesso;\n" +
"   c)	Observar a jornada e o horário ajustados para o Estágio;\n" +
"   d)	Apresentar documentos comprobatórios da regularidade da sua situação escolar, sempre que solicitado pela CONCEDENTE;\n" +
"   e)	Manter rigorosamente atualizados seus dados cadastrais e escolares, junto à CONCEDENTE;\n" +
"   f)	Informar de imediato, qualquer alteração na sua situação escolar, tais como: trancamento de matrícula, abandono, "
                    + "conclusão de curso ou transferência de Instituição de Ensino;\n" +
"   g)	Visitar os Relatórios de Atividades elaborados pela CONCEDENTE com periodicidade mínima de 06 (seis) meses e, "
                    + "inclusive, sempre que solicitado;\n" +
"   h)	Responder pelas perdas e danos eventualmente causados por inobservância das normas internas da CONCEDENTE, ou "
                    + "provocados por negligência ou imprudência.\n" +
"   i)	Observar o regulamento disciplinar da CONCEDENTE e a atender as orientações recebidas na mesma.\n" +
"   j)	É assegurada ao estagiário nos períodos de avaliação da aprendizagem pelas instituições de ensino, carga "
                    + "horária reduzida pelo menos à metade mediante comprovação emitida pela Coordenação do Curso:",font8);
            P18.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P18);
            
            Paragraph P19 = new Paragraph("\nCLÁUSULA 6ª – Cabe à CONCEDENTE:\n" +
"   a)	Conceder o Estágio e proporcionar ao ESTAGIÁRIO condições propícias para o "
                    + "exercício das atividades práticas compatíveis com o seu Plano de Atividades;\n" +
"   b)	Solicitar ao ESTAGIÁRIO, a qualquer tempo, documentos comprobatórios da "
                    + "regularidade da situação escolar, uma vez que trancamento "
                    + "de matrícula, abandono, conclusão de curso ou transferência "
                    + "de Instituição de Ensino constituem motivos de imediata rescisão;\n" +
"   c)	Elaborar e encaminhar para a "+Nome+" o "
                    + "Relatório de Atividades, assinado pelo seu Supervisor, com "
                    + "periodicidade mínima de 06 (seis) meses com vista obrigatória do ESTAGIÁRIO;\n" +
"   d)	Entregar, por ocasião do desligamento, Termo de Realização do Estágio com "
                    + "indicação resumida das atividades desenvolvidas, dos períodos e da avaliação de desempenho;\n" +
"   e)	Manter em arquivo e à disposição da fiscalização os documentos que comprovem a relação de Estágio;\n" +
"   f)	Permitir o início das atividades de Estágio somente após o recebimento deste "
                    + "instrumento assinado pelos partícipes.\n" +
"   g) 	Implementação e observar a legislação relacionada à saúde e à segurança no trabalho.  ",font8);  
            P19.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P19);
            
            Paragraph P20 = new Paragraph("\nCLÁUSULA 7ª – Cabe a "+Nome+" "
                    + "Indicar, no Plano de Atividades, as condições de adequação do estágio à proposta "
                    + "pedagógica do curso, à etapa e modalidade da formação escolar, ao horário e calendário escolar;\n" +
"   a)	Avaliar as instalações da parte concedente do Estágio e sua adequação à formação cultural e profissional do aluno;\n" +
"   b)	Comunicar à CONCEDENTE, no início do período letivo, as datas de realização das avaliações escolares;\n" +
"   c)	Exigir do aluno a apresentação periódica, em prazo não superior a 06 (seis) meses, de Relatório de Atividades;\n" +
"   d)	Zelar pelo cumprimento do Termo de Compromisso de Estágio, reorientando o ESTAGIÁRIO para outro "
                    + "local em caso de descumprimento de suas normas;\n" +
"   e)	Avaliar a realização do Estágio do aluno por meio de Instrumentos de Avaliação.",font8);
            P20.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P20);
            
            Paragraph P21 = new Paragraph("\nCLÁUSULA 8ª– Na vigência do presente Termo, o ESTAGIÁRIO estará "
                    + "incluído na cobertura do seguro contra acidentes pessoais, contratado pela "
                    + "CONCEDENTE, conforme certificado individual de seguro, Apólice n0 0101.82.00.00000020 do "
                    + "GRUPO FEDERAL DE SEGUROS",font8); 
            P21.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P21);
            
            Paragraph P22 = new Paragraph("\nCLÁUSULA 9ª – O término do Estágio ocorrerá nos seguintes casos:\n" +
"   a)	Automaticamente, ao término do período previsto para sua realização;\n" +
"   b)	Desistência do Estágio ou rescisão do Termo de Compromisso de Estágio, "
                    + "por decisão voluntária de qualquer dos partícipes, "
                    + "mediante comunicação por escrito com antecedência de 05 (cinco) dias;\n" +
"   c)	Pelo trancamento da matrícula, abandono, desligamento ou conclusão "
                    + "do curso no "+Nome+"\n" +
"   d)	Pelo descumprimento das condições do presente Termo de Compromisso de Estágio;",font8); 
            P22.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P22);
            
            Paragraph P23 = new Paragraph("\nCLÁUSULA 10ª– O ESTAGIÁRIO receberá uma "
                    + "bolsa de R$ 520,00(ou outra forma de contraprestação), bem como "
                    + "auxílio-transporte, custeados pela Instituição CONCEDENTE.",font8);
            P23.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P23);
            
            Paragraph P24 = new Paragraph("\nCLÁUSULA 11ª - É assegurado ao estagiário, sempre que o estágio não-obrigatório tenha "
                    + "duração igual ou superior a dois semestres, período de recesso de 30(trinta) dias a ser gozado "
                    + "preferencialmente durante as suas férias escolares, sendo permitido seu parcelamento em até 3 (três) "
                    + "etapas, portanto os dias de recesso previsto neste artigo serão concedidos de maneira proporcional, "
                    + "na hipótese de estágio inferior a dois semestres;\n"
                    + "O Estágio não cria vínculo empregatício de qualquer natureza, "
                    + "desde que observadas as disposições da Lei n° 11.788/08 e do presente Termo de Compromisso de Estágio.",font8); 
            P24.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P24);
 
            Paragraph P25 = new Paragraph("\nCLÁUSULA 12ª – A rescisão do presente Termo de Compromisso de Estágio poderá "
                    + "ser feita a qualquer tempo, unilateralmente, mediante comunicação por escrito, "
                    + "feita com cinco dias de antecedência.",font8); 
            P25.setAlignment(Element.ALIGN_JUSTIFIED);
            P25.setSpacingAfter(10);
            document.add(P25);
            
            Paragraph P26 = new Paragraph("\nCLÁUSULA 13ª -  Por força do artigo 109, inciso I, "
                    + "da Constituição Federal, o Foro competente para dirimir eventuais "
                    + "controvérsias resultantes do presente Convênio é o da Justiça Federal, "
                    + "Seção de Minas Gerais, Subseção de  Pouso Alegre, Estado de Minas Gerais.\n\n" 
                    + "E assim, justos e acordados, assinam este instrumento em três vias de igual teor e forma.",font8);
            P26.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P26);

            Paragraph P50 = new Paragraph("Pouso Alegre - MG "+DataCompletaTermo+"",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n__________________________________________",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            document.add(P51);
            
            Paragraph P52 = new Paragraph(""+RepInterv+"\n"+CargoRepInterv+"",font8);
            P52.setAlignment(Element.ALIGN_CENTER);
            document.add(P52);
            
            Paragraph P100 = new Paragraph("\n_________________________________________",font8);
            P100.setAlignment(Element.ALIGN_CENTER);
            document.add(P100);
            
            Paragraph P53 = new Paragraph(""+RepConc+"\n"+CargoRepConc+"",font8);
            P53.setAlignment(Element.ALIGN_CENTER);
            P53.setSpacingAfter(30);
            document.add(P53);
            
            Paragraph P54 = new Paragraph("\n__________________________________________",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P56 = new Paragraph(""+NomeEst+"\nEstagiário(a)",font8);
            P56.setAlignment(Element.ALIGN_CENTER);
            document.add(P56);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" Termo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        }  
            
            }
            
        
    }//GEN-LAST:event_BGerarPDFActionPerformed

    private void BBuscarIntervActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarIntervActionPerformed

        String Interveniente = TFNomeInterv.getText();
        
        ConsultaInterveniente ci = new ConsultaInterveniente(conn, this, Interveniente);
        ci.setTitle("Consulta Interveiente");
        ci.setVisible(true);
        
    }//GEN-LAST:event_BBuscarIntervActionPerformed

    private void BBuscarConcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarConcActionPerformed

        String Concedente = TFNomeConc.getText();
        
        ConsultaConcedente cconc = new ConsultaConcedente(conn, this, Concedente);
        cconc.setTitle("Consulta Concedente");
        cconc.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarConcActionPerformed

    private void BBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarEstActionPerformed
        
        String Estagiario = TFNomeEst.getText();
        
        ConsultaEstagiario cest = new ConsultaEstagiario(conn, this, Estagiario);
        cest.setTitle("Consulta Concedente");
        cest.setVisible(true);
       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BBuscarEstActionPerformed

    private void CBPesqTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqTermoActionPerformed
   
        
       
    }//GEN-LAST:event_CBPesqTermoActionPerformed

    private void TFPesquisaTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesquisaTermoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesquisaTermoActionPerformed

    private void TFPesquisaTermoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesquisaTermoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){            
               
        String pesquisa = CBPesqTermo.getSelectedItem().toString();
        String valor = TFPesquisaTermo.getText();
        
        ConsultaTermoCompromisso ca = new ConsultaTermoCompromisso(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Termo Obrigatório");
        ca.setVisible(true);
        
        CBPesqTermo.setSelectedIndex(0);
        TFPesquisaTermo.setText("");
        
        }
    }//GEN-LAST:event_TFPesquisaTermoKeyPressed

    private void BPesqTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqTermoActionPerformed
          
          
        String pesquisa = CBPesqTermo.getSelectedItem().toString();
        String valor = TFPesquisaTermo.getText();
        
        ConsultaTermoCompromisso ca = new ConsultaTermoCompromisso(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Termo Obrigatório");
        ca.setVisible(true);
        
        CBPesqTermo.setSelectedIndex(0);
        TFPesquisaTermo.setText("");
        
    }//GEN-LAST:event_BPesqTermoActionPerformed

    private void BCadastrarTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarTermoActionPerformed
        
        String NumTermo = TFNumTermo.getText();
        
                try{
              Statement stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM termoObrigatorio "
                    + "WHERE NumTermo = '"+NumTermo+"'";
            ResultSet rs=stmt.executeQuery(query);                  
                        //Extact result from ResultSet rs
          while(rs.next()){
             count = rs.getInt(1);
           // count = rs.getInt(NumTermo)
       //System.out.println("COUNT(*)="+rs.getString("COUNT(*)"));                              
                          }
                        // close ResultSet rs
                       // rs.close();
                   } catch(SQLException s){                                             
                                s.printStackTrace();
                         }
        if (count == 0){
        
        
        
        String aluno = TFNomeEst.getText();
        
        if (!TFNomeConc.getText().equals("") && 
                !TFNomeEst.getText().equals("") &&  
                !TFNomeInterv.getText().equals("") && 
                !buttonGroup1.getSelection().equals("") &&
                !TFNumTermo.getText().equals(""))
            
        {
            
            int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Termo de Compromisso do Aluno "+aluno+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
        
               if (opcao == JOptionPane.YES_OPTION)
               {
       String Nome = TFNomeInterv.getText();
            String CNPJInternv = TFCNPJInterv.getText();
            String EndInterv = TFEndInterv.getText();
            String NumEndInterv = TFNumEndInterv.getText();
            String CEPInterv = TFCEPInterv.getText();
            String BairroInterv = TFBairroInterv.getText();
            String CidadeInterv = TFCidadeInterv.getText();
            String EstadoInterv = TFEstadoInterv.getText();
            String TelInterv = TFTelInterv.getText();
            String RepInterv = TFRepInterv.getText();
            String CargoRepInterv = TFCargoRepInterv.getText();
            String RespInterv = TFRespInterv.getText();
            String CargoRespInterv = TFCargoRespInterv.getText();
            String NomeConc = TFNomeConc.getText();
            String CNPJConc = TFCNPJConc.getText();
            String EndConc = TFEndConc.getText();
            String NUmEndConc = TFNumEndConc.getText();
            String CEPConc = TFCEPConc.getText();
            String BairroConc = TFBairroConc.getText();
            String CidadeConc = TFCidadeConc.getText();
            String EstadoConc = TFEstadoConc.getText();
            String TelConc = TFTelConc.getText();
            String RepConc = TFRepConc.getText();
            String CPFRepConc = TFCPFRepConc.getText();
            String CargoRepConc = TFCargoRepConc.getText();
            String RespConc = TFRespConc.getText();
            String CPFRespConc = TFCPFRespConc.getText();
            String CargoRespConc = TFCargoRespConc.getText();
            String NomeEst = TFNomeEst.getText();
            String CPFEst = TFCPFEst.getText();
            String DataNascEst = TFDataNascEst.getText();
            String SexoEst = ("m");
            String EndEst = TFEndEst.getText();
            String NumEndEst = TFNumEndEst.getText();
            String CEPEst = TFCEPEst.getText();
            String BairroEst = TFBairroEst.getText();
            String CidadeEst = TFCidadeEst.getText();
            String EstadoEst = TFEstadoEst.getText();
            String TelEst = TFTelEst.getText();
            String CursoEst = TFCursoEst.getText();
            String EmailEst = TFEmailEst.getText();
            String SemEngresso = TFSemestreEngresso.getText();
            String AnoEngresso = TFAnoEngresso.getText();
            //String NumTermo = TFNumTermo.getText();
            String DataCompletaTermo = Data1.getText();
            String DataTermo = Data.getText();
            String DataTerminoTermo = TFDataTerminoTermo.getText();
            String HorarioEstagio = TFHorarioEstagio.getText();
            if(RBObrigatorio.isSelected())
                
            {

                Document document = new Document(PageSize.A4, 40, 40, 40, 40);
                
        try {
            
        
                
       /* String data =(DataTermo) ; //Pego a data 
        //divido ela em partes 
        String dd = data.substring(0, 2); //05/12/2009 
        String mm = data.substring(3, 5);//1234567890 
        String yyyy = data.substring(6, 10); 
        //depois junto de novo pronto para o banco 
        String dataingles = yyyy + "/" + mm + "/" + dd ;                 
        
        Date a = new Date(dataingles);          
        a.setDate(a.getDate() + 180);          
  
        String formato = "dd/MM/yyyy";  
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);           
            */
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("Termo.doc"));
        
            document.open();

            Image Img = Image.getInstance("src/Imagem/Rep_Brasil.png");
            Img.setAlignment(Element.ALIGN_CENTER);
            document.add(Img);
            
            Font font10 = new Font(Font.TIMES_ROMAN,12);
            Font font8 = new Font(Font.TIMES_ROMAN,12);
            Font font8Bold = new Font(Font.TIMES_ROMAN,10,Font.BOLD);
            Font font12Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
  
            Paragraph P1 = new Paragraph("\n\nMINISTÉRIO DA EDUCAÇÃO\n"
                    + "SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA\n"
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS - CAMPUS PASSOS\n"
                    + "SEÇÃO DE ESTÁGIOS\n",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P2 = new Paragraph("passos@ifsuldeminas.edu.br\n",font10);  
            P2.setAlignment(Element.ALIGN_CENTER);
            P2.setSpacingAfter(10);
            document.add(P2);
            
            Paragraph P3 = new Paragraph("TERMO DE COMPROMISSO DE ESTÁGIO OBRIGATÓRIO Nº "+NumTermo+"",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("(Instrumento jurídico de acordo com a lei Federal nª 11.788 de  25 de Setembro de 2008)",font10);  
            P4.setAlignment(Element.ALIGN_CENTER);
            P4.setSpacingAfter(15);
            document.add(P4);
            
            Paragraph P5 = new Paragraph("A "+DataCompletaTermo+" na cidade de Passos MG neste ato, as partes a seguir nomeadas:",font10);  
            P5.setAlignment(Element.ALIGN_CENTER);
            P5.setSpacingAfter(15);
            document.add(P5); 
            
            Paragraph P6 = new Paragraph("\nINTERVENIENTE",font12Bold);  
            P6.setAlignment(Element.ALIGN_CENTER);
            P6.setSpacingAfter(10);
            document.add(P6);
            
            Paragraph P7 = new Paragraph("INTERVENIENTE: "+Nome+"\n"
                                       + "CNPJ: "+CNPJInternv+"\n"
                                       + "ENDEREÇO: "+EndInterv+"       Nº: "+NumEndInterv+"\n"
                                       + "BAIRRO: "+BairroInterv+"      CIDADE: "+CidadeInterv+"        ESTADO: "+EstadoInterv+"\n"
                                       + "CEP: "+CEPInterv+"        TELEFONE: "+TelInterv+"\n"
                                       + "REPRESENTADO POR: "+RepInterv+"       CARGO: "+CargoRepInterv+"\n"
                                       + "RESPONSÁVEL PELA ASS. DO TCE: "+RespInterv+"      CARGO: "+CargoRespInterv+" \n",font10);  
            P7.setSpacingAfter(15);
            document.add(P7);
            
            Paragraph P8 = new Paragraph("CONCEDENTE",font12Bold);  
            P8.setAlignment(Element.ALIGN_CENTER);
            P8.setSpacingAfter(10);
            document.add(P8);
            
            Paragraph P9 = new Paragraph("NOME DA EMPRESA: "+NomeConc+" \n"
                                       + "CNPJ: "+CNPJConc+" \n"
                                       + "ENDEREÇO: "+EndConc+"          Nº: "+NUmEndConc+" \n"
                                       + "BAIRRO: "+BairroConc+"         CIDADE: "+CidadeConc+"         ESTADO: "+EstadoConc+"\n"
                                       + "CEP: "+CEPConc+"          TELEFONE: "+TelConc+"\n"
                                       + "REPRESENTADO POR: "+RepConc+"     CPF: "+CPFRepConc+"     CARGO: "+CargoRepConc+"\n"
                                       + "RESPONSÁVEL ASS. DO TCE: "+RespConc+"     CPF: "+CPFRespConc+"    CARGO: "+CargoRespConc+"\n",font10); 
            P9.setSpacingAfter(15);
            document.add(P9);
            
            Paragraph P10 = new Paragraph("ESTAGIÁRIO",font12Bold);  
            P10.setAlignment(Element.ALIGN_CENTER);
            P10.setSpacingAfter(10);
            document.add(P10);
            
            Paragraph P11 = new Paragraph("NOME: "+NomeEst+"\n"
                                       + "CPF: "+CPFEst+"       DATA NASCIMENTO: "+DataNascEst+"        SEXO: "+SexoEst+" \n"
                                       + "ENDEREÇO: "+EndEst+"          Nº: "+NumEndEst+"  \n"
                                       + "BAIRRO: "+BairroEst+"         CIDADE: "+CidadeEst+"       ESTADO: "+EstadoEst+"\n"
                                       + "CEP: "+CEPEst+"        TELEFONE: "+TelEst+"\n"
                                       + "ANO ENGRESSO: "+AnoEngresso+"        SEMESTRE ENGRESSO: "+SemEngresso+"\n"
                                       + "MATRICULADO REGULARMENTE NO CURSO: "+CursoEst+" \n"
                                       + "E-MAIL: "+EmailEst+" \n",font10); 
            P11.setSpacingAfter(10);
            document.add(P11);
            
            Paragraph P12 = new Paragraph("Celebram entre si este TERMO DEE COMPROMISSO DE ESTÁGIO, ajustando as seguintes cláusulas",font8Bold);  
            P12.setAlignment(Element.ALIGN_CENTER);
            P12.setSpacingAfter(10);
            document.add(P12);
            
            Paragraph P13 = new Paragraph("\nCLAUSULA PRIMEIRA: DO OBJETO: Este Instrumento tem por objetivo estabelecer as "
                    + "condições para a realização do estágio e particularizar"
                    + "a relação jurídica especial existente entre o ESTAGIÁRIO(a) a CONCEDENTE e a INSTITUIÇÂO DE ENSINO. ",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLAUSULA SEGUNDA: DA FINALIDADE: O Estágio Obrigatório, definido no Projeto "
                    + "Pedagógico do Curso, nos termos da Lei nº 11.788/08 e da Lei nº"
                    + "9.394/96 (diretrizes e Bases da Educação Nacional), entendido como ato educativo supervisionado, "
                    + "visa a complementação do ensino e da aprendizagem, proporcionando preparaçao "
                    + "para o trabalho profissional do ESTAGIARIO, possibilitando-lhe aperfeiçoamento técnico-cultural, "
                    + "científico e de relacionamento humano, bem como condições de vivenciar"
                    + "e adiquirir experiência práticas em situações reais de trabalho em sua área de atuação.",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("\nCLAUSULA TERCEIRA: DO HORÀRIO E DA VIGÊNCIA: Fica compromissado entre as partes que:",font8);
            document.add(P15);
            
            Paragraph P16 = new Paragraph("     a) Este termo de compromisso de Estágio terá vigência de "+DataTermo+" a "+DataTerminoTermo+" "
                    + "podendo ser interrompido a qualquer tempo"
                    + ", mediante comunicação escrita com 5 dias de antecedência.",font8);  
            P16.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P16);
            
            Paragraph P17 = new Paragraph("     b) as atividades do estágio a serem cumpridas pelo estagiário poderão ser "
                    + "cumpridas nos seguintes horários: das "+HorarioEstagio+" totalizando o máximo de trinta horas semanais.",font8);
            P17.setAlignment(Element.ALIGN_JUSTIFIED);
            P17.setSpacingAfter(10);
            document.add(P17);
            
            Paragraph P18 = new Paragraph("\nCLAUSULA QUARTA: DA RECISÃO: O seguinte Termo de Compromisso ficará rescindido nos "
                    + "seguintes casos:",font8);  
            document.add(P18);
            
            Paragraph P19 = new Paragraph("     a) Ao término do estágio. ",font8);  
            document.add(P19);
            
            Paragraph P20 = new Paragraph("     b) ao trancamento de matrícula pelo estagiário.",font8);  
            document.add(P20);
            
            Paragraph P21 = new Paragraph("     c) Na desistência do Curso pelo Estagiário.",font8);  
            document.add(P21);
            
            Paragraph P22 = new Paragraph("     d) Pelo não comparecimento do aluno ao estágio por um período superior a 05 dias, "
                    + "sem justa causa.",font8);  
            document.add(P22);
            
            Paragraph P23 = new Paragraph("     e) Ambas as partes se sentirem prejudicados no andamento na área pedagógica.",font8);  
            document.add(P23);
            
            Paragraph P24 = new Paragraph("     f) Pelo trancamento da matrícula, abandono, desligamento ou conclusão do curso na "
                    + "INSTITUIÇÂO DE ENSINO.",font8);  
            document.add(P24);
 
            Paragraph P25 = new Paragraph("     g) Pelo descumprimento das condições do presente Termo de Compromissso de Estágio.",font8);  
            P25.setSpacingAfter(10);
            document.add(P25);
            
            Paragraph P26 = new Paragraph("\nCLAÚSULA QUINTA: DOS ENCARGOS SOCIAIS - O presente Estágio, não acarretará vinculo empregatício de "
                    + "qualquer natureza, desde que observados"
                    + "as disposições da Lei nº 11.788/08 e do presente termo de Compromisso.",font8);
            P26.setAlignment(Element.ALIGN_JUSTIFIED);
            P26.setSpacingAfter(10);
            document.add(P26);
            
            Paragraph P27 = new Paragraph("\nCLAÚSULA SEXTA: DO SEGURO - na vigencia do presente convênio, o ESTAGIÁRIO, BOLSISTA E ALUNO, "
                    + "regularmente matriculados estão assegurados"
                    + " pelo GRUPO FEDERAL SEGUROS através da apólice nº 0101.82.00.00000186 e possui os seguintes "
                    + "coberturas: morte acidental, e invalidez "
                    + "permanente total ou parcial por acidente.",font8);
            P27.setAlignment(Element.ALIGN_JUSTIFIED);
            P27.setSpacingAfter(10);
            document.add(P27);
            
            Paragraph P28 = new Paragraph("\nCLAÚSULA SETIMA: DOS BENEFICIOS - de acordo com a normativa nº 7, de 30 de Outubro "
                    + "de 2008 o estágio obrigatório"
                    + "somente será realizado sem ônus para os órgão e entidades..",font8);
            P28.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P28);
            
            Paragraph P29 = new Paragraph("Paragrafo Único: A eventual concessão de benefício relacionados a transporte, "
                    + "alimnetação, saúde, entre outros"
                    + "não caracteriza vínculo empregatício.(artigo 12 da Lei nº11.788, de 25 de Outubro de 2008).",font8);
            P29.setAlignment(Element.ALIGN_JUSTIFIED);
            P29.setSpacingAfter(10);
            document.add(P29);
            
            Paragraph P30 = new Paragraph("\nCLAUSULA OITAVA: DAS OBRIGAÇÕES DAS UNIDADES CONCEDENTES: - no desenvolvimento "
                    + "do estágio ora compromissado, caberá á unidade Concedente:",font8);  
            document.add(P30);
            
            Paragraph P31 = new Paragraph("     a) Proporcionar ao ESTAGIÀRIO, condições propícias para o exercícios das "
                    + "atividades práticas compatíveis com seu Plano de atividades. ",font8);  
            document.add(P31);
            
            Paragraph P32 = new Paragraph("     b) Facilitar as atividades do professor orientador para que o mesmo, "
                    + "juntamente com o supervisor, possa auxiliar o estagiário em eventuais"
                    + "problemas durante o curso.",font8);  
            document.add(P32);
            
            Paragraph P33 = new Paragraph("     c) Dosignar o(a) Sr(a) "+RespConc+" ocupante do Cargo de "+CargoRespConc+" "
                    + "para Supervisor de estágio en  quanto vigorar o presente"
                    + "Termo de Compromisso..",font8); 
            P33.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P33);
            
            Paragraph P34 = new Paragraph("     d) Avaliar através do Supervisor, o desempenho do Estagiário de acordo com "
                    + "as diretrizes fornecidade pela Instituição de Ensino.",font8);  
            document.add(P34);
            
            Paragraph P35 = new Paragraph("     e) Comunicar a Instituição de Ensino, as interrupções e eventuais alterações "
                    + "que ocorrem neste Termo de Compromisso.",font8);
            P35.setSpacingAfter(10);
            document.add(P35);
            
            Paragraph P36 = new Paragraph("\n\nCLAUSULA NONA: DAS OBRIGAÇÕES DO ESTAGIÁRIO: - no desenvolvimento do estágio ora "
                    + "compromissado, caberá á unidade Concedente:",font8);  
            document.add(P36);
            
            Paragraph P37 = new Paragraph("     a) Cumprir em todo empenho e interessea programação estabelecida para seu estágio. ",font8);  
            document.add(P37);
            
            Paragraph P38 = new Paragraph("     b) Observar e obedecer as normas internas da Unidade concedente.",font8);  
            document.add(P38);
            
            Paragraph P39 = new Paragraph("     c) Comunicar a Instituição de Ensino, qualquer fato relevantesobre seu estágio.",font8);  
            document.add(P39);
            
            Paragraph P40 = new Paragraph("     d) Responder por perdas e danos consequentes da inobservanciadas normas "
                    + "internas da Unidade concedente ou das constantes"
                    + "do presente Termo de Compromisso.",font8);  
            document.add(P40);
            
            Paragraph P41 = new Paragraph("     e) respeitar, acatar ordens, bem como não divulgar quaiquer informação, "
                    + "dados, trabalhos reservados ou confidenciais"
                    + " de que tiver conhecimento em decorrência do estágio.",font8); 
            P41.setAlignment(Element.ALIGN_JUSTIFIED);
            P41.setSpacingAfter(10);
            document.add(P41);
            
            Paragraph P42 = new Paragraph("\nCLAUSULA DÉCIMA: DAS OBRIGAÇÕES DA INSTIUIÇÃO DE ENSINO: - No desenvolvimento "
                    + "do estágio curricular obrigatório"
                    + " caberá a Instituição de Ensino:",font8);  
            document.add(P42);
            
            Paragraph P43 = new Paragraph("     a) Designar o(a) Sr(a) "+RespInterv+" como Professor(a) Orientador(a) que "
                    + "assessorá e acompanhará o Estagiário(a). ",font8);  
            document.add(P43);
            
            Paragraph P44 = new Paragraph("     b) Avaliar através do Professor(a) Orientador(a), após análise do Supervisor "
                    + "da Unidade Concedente, do relatório Final elaborado pelo aluno(a)"
                    + "com base nas atividades executadas durante o período de estágio.",font8); 
            P44.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P44);
            
            Paragraph P45 = new Paragraph("     c) Conceder quando solicitado pela Unidade Concedente, informações "
                    + "acerca da vida escolar do estagiário.",font8);  
            document.add(P45);
            
            Paragraph P46 = new Paragraph("     d) Responder por perdas e danos consequentes da inobservanciadas "
                    + "normas internas da Unidade concedenteou das constantes"
                    + "do presente Termo de Compromisso.",font8);  
            document.add(P46);
            
            Paragraph P47 = new Paragraph("     e) respeitar, acatar ordens, bem como não divulgar quaiquer "
                    + "informação, dados, trabalhos reservados ou confidenciais"
                    + " de que tiver conhecimento em decorrência do estágio.",font8);
            P47.setAlignment(Element.ALIGN_JUSTIFIED);
            P47.setSpacingAfter(15);
            document.add(P47);
            
            Paragraph P48 = new Paragraph("\n     As partes, de comum acordo, elegem o foro da Justça Federeal, Subseção "
                    + "Judiciária de Pouso Alegre - MG, com expressa renuncia de qualquer outro, "
                    + "por mais previlegiado que seja, para dirimir quaisquer dúvida no cumprimento ou execução do "
                    + "presente Termo e do correspondente Convênio, "
                    + "que não puderem ser resolvidas administrativamente.",font8);
            P48.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P48);
            
            Paragraph P49 = new Paragraph("     E por estarem de inteiro e comum acordo com as condições e com o "
                    + "texto deste termo de Compromisso, as partes asssinam em três vias de iguais teor, "
                    + "cabendo a primeira via a Unidade Concedente, a segunda via ao Estagiário, e a terceira via "
                    + "ao Instituto de Ensino.",font8);
            P49.setAlignment(Element.ALIGN_JUSTIFIED);
            P49.setSpacingAfter(15);
            document.add(P49);
            
            Paragraph P50 = new Paragraph("\nPassos - MG, "+DataCompletaTermo+".",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n\n_________________________________________\n"+RepConc+"\n"+NomeConc+"",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            P51.setSpacingAfter(30);
            document.add(P51);
            
            Paragraph P54 = new Paragraph("\n\n_________________________________________\n"+RepInterv+"\nDiretor Geral Pró-Tempore Campus Passos",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P55 = new Paragraph("\n\n_________________________________________\n"+NomeEst+"\nEstagiário",font8);
            P55.setAlignment(Element.ALIGN_CENTER);
            document.add(P55);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+" Termo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
            
            
            //CONDIÇÃO PARA GERAR .DOC ESTÁGIO NÃO OBRIGATÓRIO, USANDO O RADIOBUTTON
            
            if (RBNaoObrigatorio.isSelected())
                
            {
                
      /*  String data =(DataTermo) ; //Pego a data 
        //divido ela em partes 
        String dd = data.substring(0, 2); //05/12/2009 
        String mm = data.substring(3, 5);//1234567890 
        String yyyy = data.substring(6, 10); 
        //depois junto de novo pronto para o banco 
        String dataingles = yyyy + "/" + mm + "/" + dd ;                 
        
        Date a = new Date(dataingles);          
        a.setDate(a.getDate() + 180);          
  
        String formato = "dd/MM/yyyy";  
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato);   */
            
                               Document document = new Document(PageSize.A4, 40, 40, 40, 40);
        try {
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("Termo.doc"));
        
            document.open();

            Image Img = Image.getInstance("src/Imagem/Rep_Brasil.png");
            Img.setAlignment(Element.ALIGN_CENTER);
            document.add(Img);
            
            Font font10 = new Font(Font.TIMES_ROMAN,12);
            Font font8 = new Font(Font.TIMES_ROMAN,12);
            Font font8Bold = new Font(Font.TIMES_ROMAN,10,Font.BOLD);
            Font font12Bold = new Font(Font.TIMES_ROMAN,12,Font.BOLD);
  
            Paragraph P1 = new Paragraph("\nMINISTÉRIO DA EDUCAÇÃO\n"
                    + "SECRETARIA DE EDUCAÇÃO PROFISSIONAL E TECNOLOGIA\n"
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS - CAMPUS PASSOS\n"
                    + "SEÇÃO DE ESTÁGIOS",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P2 = new Paragraph("passos@ifsuldeminas.edu.br",font10);  
            P2.setAlignment(Element.ALIGN_CENTER);
            P2.setSpacingAfter(10);
            document.add(P2);
            
            Paragraph P3 = new Paragraph("TERMO DE COMPROMISSO DE ESTÁGIO NÃO OBRIGATÓRIO Nº "+NumTermo+".",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("(Instrumento jurídico de acordo com a lei Federal nª 11.788 de  25 de Setembro de 2008)",font10);  
            P4.setAlignment(Element.ALIGN_CENTER);
            P4.setSpacingAfter(15);
            document.add(P4);
            
            Paragraph P5 = new Paragraph("A "+DataCompletaTermo+" na cidade de Passos MG neste ato, as partes a seguir nomeadas:",font10);  
            P5.setAlignment(Element.ALIGN_CENTER);
            P5.setSpacingAfter(15);
            document.add(P5);
            
            Paragraph P6 = new Paragraph("\nINTERVENIENTE",font12Bold);  
            P6.setAlignment(Element.ALIGN_CENTER);
            P6.setSpacingAfter(10);
            document.add(P6);
            
            Paragraph P7 = new Paragraph("INTERVENIENTE: "+NomeEst+"\n"
                                       + "CNPJ: "+CNPJInternv+"\n"
                                       + "ENDEREÇO: "+EndInterv+"       Nº "+NumEndInterv+"\n"
                                       + "BAIRRO: "+BairroInterv+"      CIDADE: "+CidadeInterv+"         ESTADO: "+EstadoInterv+"\n"
                                       + "CEP: "+CEPInterv+"        TELEFONE: "+TelInterv+"\n"
                                       + "REPRESENTADO POR: "+RepInterv+"       CARGO: "+CargoRepInterv+"\n"
                                       + "RESPONSÁVEL PELA ASS. DO TCE: "+RespInterv+"       CARGO: "+CargoRespInterv+" ",font10);  
            P7.setSpacingAfter(15);
            document.add(P7);
            
            Paragraph P8 = new Paragraph("CONCEDENTE",font12Bold);  
            P8.setAlignment(Element.ALIGN_CENTER);
            P8.setSpacingAfter(10);
            document.add(P8);
            
            Paragraph P9 = new Paragraph("NOME DA EMPRESA: "+NomeConc+" \n"
                                       + "CNPJ: "+CNPJConc+" \n"
                                       + "ENDEREÇO: "+EndConc+"  Nº        "+NUmEndConc+" \n"
                                       + "BAIRRO: "+BairroConc+"        CIDADE: "+CidadeConc+"      ESTADO: "+EstadoConc+"\n"
                                       + "CEP: "+CEPConc+"          TELEFONE: "+TelConc+"\n"
                                       + "REPRESENTADO POR: "+RepConc+"     CPF: "+CPFRepConc+"     CARGO: "+CargoRepConc+"\n"
                                       + "RESPONSÁVEL ASS. DO TCE: "+RespConc+"     CPF: "+CPFRespConc+"     CARGO: "+CargoRespConc+"",font10); 
            P9.setSpacingAfter(15);
            document.add(P9);
            
            Paragraph P10 = new Paragraph("ESTAGIÁRIO",font12Bold);  
            P10.setAlignment(Element.ALIGN_CENTER);
            P10.setSpacingAfter(10);
            document.add(P10);
            
            Paragraph P11 = new Paragraph("NOME: "+Nome+"\n"
                                       + "CPF: "+CPFEst+"       DATA NASCIMENTO: "+DataNascEst+"        SEXO: "+SexoEst+" \n"
                                       + "ENDEREÇO: "+EndEst+"       Nº "+NumEndEst+"  \n"
                                       + "BAIRRO: "+BairroEst+"         CIDADE: "+CidadeEst+"       ESTADO: "+EstadoEst+" \n"
                                       + "CEP: "+CEPEst+"        TELEFONE: "+TelEst+"\n"
                                       + "ANO ENGRESSO: "+AnoEngresso+"        SEMESTRE ENGRESSO: "+SemEngresso+"\n"
                                       + "MATRICULADO REGULARMENTE NO CURSO: "+CursoEst+" \n"
                                       + "E-MAIL: "+EmailEst+" \n",font10); 
            P11.setSpacingAfter(10);
            document.add(P11);
            
            Paragraph P12 = new Paragraph("Celebram entre si este TERMO DE COMPROMISSO DE ESTÁGIO, ajustando as seguintes cláusulas:\n",font8Bold);  
            P12.setAlignment(Element.ALIGN_CENTER);
            P12.setSpacingAfter(10);
            document.add(P12);
            
            Paragraph P13 = new Paragraph("CLAUSULA 1ª - Este Termo de Compromisso reger-se-á pela lei 11.788/2008, pelas normas de estágio "
                    + "do Instituto Federal de Educação, Ciência e Tecnologia do Sul de Minas Gerais e pelo Convênio celebrado entre a CONCEDENTE E A INTERVENIENTE. ",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLAUSULA 2ª: O Estágio Não Obrigatório é aquele desenvolvido como atividade opcional, acrescida á carga horária regular, nos termos da lei "
                    + "11.788/08 e da lei nº 9.394/96, visa ao aprendizado de competências próprias da atividade profissional e a contextualização curricular,"
                    + "objetivando o desenvolvimento do educandopara a vida cidadã e para o trabalho.",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("\nCLAUSULA 3ª: O estágio terá início em "+DataTermo+" e terá seu término em "+DataTerminoTermo+" "
                    + "com uma atividade de 06 horas diárias, totalizando 30 horas semanais, sendo compatível com "
                    + "as atividades escolares e de acordo com o art. 10° da Lei n° 11.788/08.",font8);
            P15.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P15);
            
            Paragraph P57 = new Paragraph("     § 1º - A jornada de atividade em estágio não poderá ultrapassar os limites fixados "
                    + "pelos incisos I e II, § 1º e 2º § do art. 10 da Lei nº 11.788/2008. ",font8);  
            P57.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P57);
            
            Paragraph P58 = new Paragraph("Podendo ser prorrogado por igual período mediante termo aditivo "
                    + "e entendimento entre as partes, não podendo ultrapassar os limites fixados "
                    + "conforme consta no art. 11 da Lei nº 11.788/2008",font8);  
            P58.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P58);
            
            Paragraph P59 = new Paragraph("     § 2º - Tendo o estágio a duração igual ou superior a um ano, "
                    + "é assegurado ao ESTAGIÁRIO, período de recesso de 30 (trinta)dias, a ser gozado "
                    + "preferencialmente durante suas férias escolares, ou se inferior a um ano, o recesso "
                    + "será proporcional. ",font8);  
            P59.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P59);
            
            Paragraph P16 = new Paragraph("\nCLÁUSULA 4ª - O estágio será acompanhado pelo professor(a) "
                    + "orientador(a) da "+Nome+" e pelo supervisor da "
                    + "CONCEDENTE, que deverão apor seus vistos nos relatórios de atividades e no relatório de aprovação do ESTAGIÁRIO.",font8);  
            P16.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P16);
            
            Paragraph P17 = new Paragraph("\nCLÁUSULA 5ª– O ESTAGIÁRIO desenvolverá suas atividades obrigando-se a:",font8);
            P17.setAlignment(Element.ALIGN_JUSTIFIED);
            P17.setSpacingAfter(10);
            document.add(P17);
            
            Paragraph P18 = new Paragraph("   a)   Cumprir com empenho e interesse a programação estabelecida no Plano de Atividades;\n" +
"   b)	Cumprir as condições fixadas para o Estágio observando as normas de trabalho vigentes na CONCEDENTE, "
                    + "preservando o sigilo e a confidencialidade sobre as informações que tenha acesso;\n" +
"   c)	Observar a jornada e o horário ajustados para o Estágio;\n" +
"   d)	Apresentar documentos comprobatórios da regularidade da sua situação escolar, sempre que solicitado pela CONCEDENTE;\n" +
"   e)	Manter rigorosamente atualizados seus dados cadastrais e escolares, junto à CONCEDENTE;\n" +
"   f)	Informar de imediato, qualquer alteração na sua situação escolar, tais como: trancamento de matrícula, abandono, "
                    + "conclusão de curso ou transferência de Instituição de Ensino;\n" +
"   g)	Visitar os Relatórios de Atividades elaborados pela CONCEDENTE com periodicidade mínima de 06 (seis) meses e, "
                    + "inclusive, sempre que solicitado;\n" +
"   h)	Responder pelas perdas e danos eventualmente causados por inobservância das normas internas da CONCEDENTE, ou "
                    + "provocados por negligência ou imprudência.\n" +
"   i)	Observar o regulamento disciplinar da CONCEDENTE e a atender as orientações recebidas na mesma.\n" +
"   j)	É assegurada ao estagiário nos períodos de avaliação da aprendizagem pelas instituições de ensino, carga "
                    + "horária reduzida pelo menos à metade mediante comprovação emitida pela Coordenação do Curso:",font8);
            P18.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P18);
            
            Paragraph P19 = new Paragraph("\nCLÁUSULA 6ª – Cabe à CONCEDENTE:\n" +
"   a)	Conceder o Estágio e proporcionar ao ESTAGIÁRIO condições propícias para o "
                    + "exercício das atividades práticas compatíveis com o seu Plano de Atividades;\n" +
"   b)	Solicitar ao ESTAGIÁRIO, a qualquer tempo, documentos comprobatórios da "
                    + "regularidade da situação escolar, uma vez que trancamento "
                    + "de matrícula, abandono, conclusão de curso ou transferência "
                    + "de Instituição de Ensino constituem motivos de imediata rescisão;\n" +
"   c)	Elaborar e encaminhar para a "+Nome+" o "
                    + "Relatório de Atividades, assinado pelo seu Supervisor, com "
                    + "periodicidade mínima de 06 (seis) meses com vista obrigatória do ESTAGIÁRIO;\n" +
"   d)	Entregar, por ocasião do desligamento, Termo de Realização do Estágio com "
                    + "indicação resumida das atividades desenvolvidas, dos períodos e da avaliação de desempenho;\n" +
"   e)	Manter em arquivo e à disposição da fiscalização os documentos que comprovem a relação de Estágio;\n" +
"   f)	Permitir o início das atividades de Estágio somente após o recebimento deste "
                    + "instrumento assinado pelos partícipes.\n" +
"   g) 	Implementação e observar a legislação relacionada à saúde e à segurança no trabalho.  ",font8);  
            P19.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P19);
            
            Paragraph P20 = new Paragraph("\nCLÁUSULA 7ª – Cabe a "+Nome+" "
                    + "Indicar, no Plano de Atividades, as condições de adequação do estágio à proposta "
                    + "pedagógica do curso, à etapa e modalidade da formação escolar, ao horário e calendário escolar;\n" +
"   a)	Avaliar as instalações da parte concedente do Estágio e sua adequação à formação cultural e profissional do aluno;\n" +
"   b)	Comunicar à CONCEDENTE, no início do período letivo, as datas de realização das avaliações escolares;\n" +
"   c)	Exigir do aluno a apresentação periódica, em prazo não superior a 06 (seis) meses, de Relatório de Atividades;\n" +
"   d)	Zelar pelo cumprimento do Termo de Compromisso de Estágio, reorientando o ESTAGIÁRIO para outro "
                    + "local em caso de descumprimento de suas normas;\n" +
"   e)	Avaliar a realização do Estágio do aluno por meio de Instrumentos de Avaliação.",font8);
            P20.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P20);
            
            Paragraph P21 = new Paragraph("\nCLÁUSULA 8ª– Na vigência do presente Termo, o ESTAGIÁRIO estará "
                    + "incluído na cobertura do seguro contra acidentes pessoais, contratado pela "
                    + "CONCEDENTE, conforme certificado individual de seguro, Apólice n0 0101.82.00.00000020 do "
                    + "GRUPO FEDERAL DE SEGUROS",font8); 
            P21.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P21);
            
            Paragraph P22 = new Paragraph("\nCLÁUSULA 9ª – O término do Estágio ocorrerá nos seguintes casos:\n" +
"   a)	Automaticamente, ao término do período previsto para sua realização;\n" +
"   b)	Desistência do Estágio ou rescisão do Termo de Compromisso de Estágio, "
                    + "por decisão voluntária de qualquer dos partícipes, "
                    + "mediante comunicação por escrito com antecedência de 05 (cinco) dias;\n" +
"   c)	Pelo trancamento da matrícula, abandono, desligamento ou conclusão "
                    + "do curso no "+Nome+"\n" +
"   d)	Pelo descumprimento das condições do presente Termo de Compromisso de Estágio;",font8); 
            P22.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P22);
            
            Paragraph P23 = new Paragraph("\nCLÁUSULA 10ª– O ESTAGIÁRIO receberá uma "
                    + "bolsa de R$ 520,00(ou outra forma de contraprestação), bem como "
                    + "auxílio-transporte, custeados pela Instituição CONCEDENTE.",font8);
            P23.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P23);
            
            Paragraph P24 = new Paragraph("\nCLÁUSULA 11ª - É assegurado ao estagiário, sempre que o estágio não-obrigatório tenha "
                    + "duração igual ou superior a dois semestres, período de recesso de 30(trinta) dias a ser gozado "
                    + "preferencialmente durante as suas férias escolares, sendo permitido seu parcelamento em até 3 (três) "
                    + "etapas, portanto os dias de recesso previsto neste artigo serão concedidos de maneira proporcional, "
                    + "na hipótese de estágio inferior a dois semestres;\n"
                    + "O Estágio não cria vínculo empregatício de qualquer natureza, "
                    + "desde que observadas as disposições da Lei n° 11.788/08 e do presente Termo de Compromisso de Estágio.",font8); 
            P24.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P24);
 
            Paragraph P25 = new Paragraph("\nCLÁUSULA 12ª – A rescisão do presente Termo de Compromisso de Estágio poderá "
                    + "ser feita a qualquer tempo, unilateralmente, mediante comunicação por escrito, "
                    + "feita com cinco dias de antecedência.",font8); 
            P25.setAlignment(Element.ALIGN_JUSTIFIED);
            P25.setSpacingAfter(10);
            document.add(P25);
            
            Paragraph P26 = new Paragraph("\nCLÁUSULA 13ª -  Por força do artigo 109, inciso I, "
                    + "da Constituição Federal, o Foro competente para dirimir eventuais "
                    + "controvérsias resultantes do presente Convênio é o da Justiça Federal, "
                    + "Seção de Minas Gerais, Subseção de  Pouso Alegre, Estado de Minas Gerais.\n\n" 
                    + "E assim, justos e acordados, assinam este instrumento em três vias de igual teor e forma.",font8);
            P26.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P26);

            Paragraph P50 = new Paragraph("Pouso Alegre - MG "+DataCompletaTermo+"",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n__________________________________________",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            document.add(P51);
            
            Paragraph P52 = new Paragraph(""+RepInterv+"\n"+CargoRepInterv+"",font8);
            P52.setAlignment(Element.ALIGN_CENTER);
            document.add(P52);
            
            Paragraph P100 = new Paragraph("\n_________________________________________",font8);
            P100.setAlignment(Element.ALIGN_CENTER);
            document.add(P100);
            
            Paragraph P53 = new Paragraph(""+RepConc+"\n"+CargoRepConc+"",font8);
            P53.setAlignment(Element.ALIGN_CENTER);
            P53.setSpacingAfter(30);
            document.add(P53);
            
            Paragraph P54 = new Paragraph("\n__________________________________________",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P56 = new Paragraph(""+NomeEst+"\nEstagiário(a)",font8);
            P56.setAlignment(Element.ALIGN_CENTER);
            document.add(P56);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" Termo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        }  
           
            }


        
       

        String TipoEstagio = (RBObrigatorio.isSelected()?"Estágio Obrigatório":"Estagio não Obrigatório");
        String GeradoPor = fPrincipal.LLogin.getText();
        String Interveniente = TFNomeInterv.getText();
        String CNPJInterv = TFCNPJInterv.getText();
        String Estagiario = TFNomeEst.getText();
        String CPFEstag = TFCPFEst.getText();
        String DataNascEstag = TFDataNascEst.getText();
        String EndEstag = TFEndEst.getText();
        String NumEndEstag = TFNumEndEst.getText();
        String CEPEstag = TFCEPEst.getText();
        String BairroEstag = TFBairroEst.getText();
        String CidadeEstag = TFCidadeEst.getText();
        String EstadoEstag = TFEstadoEst.getText();
        String TelEstag = TFTelEst.getText();
        String CursoEstag = TFCursoEst.getText();
        String EmailEstag = TFEmailEst.getText();
       
        try{
            
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO TermoObrigatorio VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, NumTermo);
            pstm.setString(2, TipoEstagio);
            pstm.setString(3, DataTermo);
            pstm.setString(4, GeradoPor);
            pstm.setString(5, Interveniente);
            pstm.setString(6, CNPJInterv);          
            pstm.setString(7, EndInterv);
            pstm.setString(8, NumEndInterv);
            pstm.setString(9, CEPInterv);
            pstm.setString(10, BairroInterv);
            pstm.setString(11, CidadeInterv);
            pstm.setString(12, EstadoInterv);
            pstm.setString(13, TelInterv);
            pstm.setString(14, RepInterv);
            pstm.setString(15, CargoRepInterv);
            pstm.setString(16, RespInterv);
            pstm.setString(17, CargoRespInterv);
            pstm.setString(18, NomeConc);
            pstm.setString(19, CNPJConc);
            pstm.setString(20, EndConc);
            pstm.setString(21, NUmEndConc);
            pstm.setString(22, CEPConc);
            pstm.setString(23, BairroConc);
            pstm.setString(24, CidadeConc);
            pstm.setString(25, EstadoConc);
            pstm.setString(26, TelConc);
            pstm.setString(27, RepConc);
            pstm.setString(28, CPFRepConc);
            pstm.setString(29, CargoRepConc);
            pstm.setString(30, RespConc);
            pstm.setString(31, CPFRespConc);
            pstm.setString(32, CargoRespConc);
            pstm.setString(33, Estagiario);
            pstm.setString(34, CPFEstag);
            pstm.setString(35, DataNascEstag);
            pstm.setString(36, EndEstag);
            pstm.setString(37, NumEndEstag);
            pstm.setString(38, CEPEstag);
            pstm.setString(39, BairroEstag);
            pstm.setString(40, CidadeEstag);
            pstm.setString(41, EstadoEstag);
            pstm.setString(42, TelEstag);
            pstm.setString(43, CursoEstag);
            pstm.setString(44, EmailEstag);
            pstm.setString(45, SemEngresso);
            pstm.setString(46, AnoEngresso);
            pstm.setString(47, DataTerminoTermo);
            pstm.setString(48, HorarioEstagio);
            

            pstm.executeUpdate();
            pstm.close();
        
            
        TFNumTermo.setText("");
        Data.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeInterv.setText("");
        TFCNPJInterv.setText("");
        TFEndInterv.setText("");
        TFNumEndInterv.setText("");
        TFCEPInterv.setText("");
        TFBairroInterv.setText("");
        TFCidadeInterv.setText("");
        TFEstadoInterv.setText("");    
        TFTelInterv.setText("");
        TFRepInterv.setText("");
        TFCargoRepInterv.setText("");
        TFRespInterv.setText("");
        TFCargoRespInterv.setText("");
        TFNomeConc.setText("");
        TFCNPJConc.setText("");
        TFEndConc.setText("");
        TFNumEndConc.setText("");
        TFCEPConc.setText("");
        TFBairroConc.setText("");
        TFCidadeConc.setText("");
        TFEstadoConc.setText("");
        TFTelConc.setText("");
        TFRepConc.setText("");
        TFCPFRepConc.setText("");
        TFCargoRepConc.setText("");
        TFRespConc.setText("");
        TFCPFRespConc.setText("");
        TFCargoRespConc.setText("");
        TFNomeEst.setText("");
        TFCPFEst.setText("");
        TFDataNascEst.setText("");
        TFEndEst.setText("");
        TFNumEndEst.setText("");
        TFCEPEst.setText("");
        TFBairroEst.setText("");
        TFCidadeEst.setText("");
        TFEstadoEst.setText("");
        TFTelEst.setText("");
        TFCursoEst.setText("");
        TFEmailEst.setText("");
        TFAnoEngresso.setText("");
        TFSemestreEngresso.setText("");
        TFDataTerminoTermo.setText("");
        TFHorarioEstagio.setText("");

        }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao inserir Termo\n"+e.getMessage());
        }

            }
              
 
      
        BAtualizarTermo.setEnabled(false);
         BCadastrarTermo.setEnabled(true);
          BExcluirTermo.setEnabled(false);
           BLimparTermo.setEnabled(true);
        }
        
         else
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
        }
        
        else
            JOptionPane.showMessageDialog(null, "O Numero do TERMO DE COMPROMISSO digitado já foi cadastrado!");
       
        
    }//GEN-LAST:event_BCadastrarTermoActionPerformed

    private void BLimparTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparTermoActionPerformed

        TFNumTermo.setText("");
        TFCodigo.setText("");
        Data.setText("");
        TFGeradorTermo.setText("");
        TFNomeInterv.setText("");
        buttonGroup1.clearSelection();
        TFCNPJInterv.setText("");
        TFEndInterv.setText("");
        TFNumEndInterv.setText("");
        TFCEPInterv.setText("");
        TFBairroInterv.setText("");
        TFCidadeInterv.setText("");
        TFEstadoInterv.setText("");    
        TFTelInterv.setText("");
        TFRepInterv.setText("");
        TFCargoRepInterv.setText("");
        TFRespInterv.setText("");
        TFCargoRespInterv.setText("");
        TFNomeConc.setText("");
        TFCNPJConc.setText("");
        TFEndConc.setText("");
        TFNumEndConc.setText("");
        TFCEPConc.setText("");
        TFBairroConc.setText("");
        TFCidadeConc.setText("");
        TFEstadoConc.setText("");
        TFTelConc.setText("");
        TFRepConc.setText("");
        TFCPFRepConc.setText("");
        TFCargoRepConc.setText("");
        TFRespConc.setText("");
        TFCPFRespConc.setText("");
        TFCargoRespConc.setText("");
        TFNomeEst.setText("");
        TFCPFEst.setText("");
        TFDataNascEst.setText("");
        TFEndEst.setText("");
        TFNumEndEst.setText("");
        TFCEPEst.setText("");
        TFBairroEst.setText("");
        TFCidadeEst.setText("");
        TFEstadoEst.setText("");
        TFTelEst.setText("");
        TFCursoEst.setText("");
        TFEmailEst.setText("");
        TFAnoEngresso.setText("");
        TFSemestreEngresso.setText("");
         TFDataTerminoTermo.setText("");
        TFHorarioEstagio.setText("");
        
            BAtualizarTermo.setEnabled(false);
         BCadastrarTermo.setEnabled(true);
          BExcluirTermo.setEnabled(false);
           BLimparTermo.setEnabled(true);
           BGerarPDF.setEnabled(false);
       
    }//GEN-LAST:event_BLimparTermoActionPerformed

    private void BExcluirTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirTermoActionPerformed

          String Termo = TFNumTermo.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Termo "+Termo+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM TermoObrigatorio WHERE NumTermo = '"+Termo+"'");

        TFNumTermo.setText("");
         TFCodigo.setText("");
        Data.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeInterv.setText("");
        TFCNPJInterv.setText("");
        TFEndInterv.setText("");
        TFNumEndInterv.setText("");
        TFCEPInterv.setText("");
        TFBairroInterv.setText("");
        TFCidadeInterv.setText("");
        TFEstadoInterv.setText("");    
        TFTelInterv.setText("");
        TFRepInterv.setText("");
        TFCargoRepInterv.setText("");
        TFRespInterv.setText("");
        TFCargoRespInterv.setText("");
        TFNomeConc.setText("");
        TFCNPJConc.setText("");
        TFEndConc.setText("");
        TFNumEndConc.setText("");
        TFCEPConc.setText("");
        TFBairroConc.setText("");
        TFCidadeConc.setText("");
        TFEstadoConc.setText("");
        TFTelConc.setText("");
        TFRepConc.setText("");
        TFCPFRepConc.setText("");
        TFCargoRepConc.setText("");
        TFRespConc.setText("");
        TFCPFRespConc.setText("");
        TFCargoRespConc.setText("");
        TFNomeEst.setText("");
        TFCPFEst.setText("");
        TFDataNascEst.setText("");
        TFEndEst.setText("");
        TFNumEndEst.setText("");
        TFCEPEst.setText("");
        TFBairroEst.setText("");
        TFCidadeEst.setText("");
        TFEstadoEst.setText("");
        TFTelEst.setText("");
        TFCursoEst.setText("");
        TFEmailEst.setText("");
        TFAnoEngresso.setText("");
        TFSemestreEngresso.setText("");
         TFDataTerminoTermo.setText("");
        TFHorarioEstagio.setText("");
        
        BAtualizarTermo.setEnabled(false);
         BCadastrarTermo.setEnabled(true);
          BExcluirTermo.setEnabled(false);
           BLimparTermo.setEnabled(true);
           BGerarPDF.setEnabled(false);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Termo\n"+e.getMessage());}

        }
    
    }//GEN-LAST:event_BExcluirTermoActionPerformed

    private void BAtualizarTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarTermoActionPerformed
           
        String Termo = TFNumTermo.getText();
        
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Termo "+Termo+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE termoObrigatorio SET  NumTermo = '"+TFNumTermo.getText()+"',"

         + "TipoEstagio = '"+(RBObrigatorio.isSelected()?"Estágio Obrigatório":"Estagio não Obrigatório")+"',"               
         + "DataTermo = '"+ Data.getText()+"',"
         + "GeradoPor = '"+TFGeradorTermo.getText()+"',"
         + "Interveniente = '"+TFNomeInterv.getText()+"',"
         + "CNPJInterv = '"+TFCNPJInterv.getText()+"',"
         + "EndInterv = '"+TFEndInterv.getText()+"',"
         + "NumEndInterv = '"+TFNumEndInterv.getText()+"',"
         + "CEPInterv = '"+TFCEPInterv.getText()+"',"
         + "BairroInterv = '"+TFBairroInterv.getText()+"',"
         + "CidadeInterv = '"+TFCidadeInterv.getText()+"',"
         + "EstadoInterv = '"+TFEstadoInterv.getText()+"',"   
         + "TelInterv = '"+TFTelInterv.getText()+"',"
         + "RepInterv = '"+TFRepInterv.getText()+"',"
         + "CargoRepInterv = '"+TFCargoRepInterv.getText()+"',"
         + "RespInterv = '"+TFRespInterv.getText()+"',"
         + "CargoRespInterv = '"+TFCargoRespInterv.getText()+"',"
         + "Concedente = '"+TFNomeConc.getText()+"',"
         + "CNPJConc = '"+TFCNPJConc.getText()+"',"
         + "EndConc = '"+TFEndConc.getText()+"',"
         + "NumEndConc = '"+TFNumEndConc.getText()+"',"
         + "CEPConc = '"+TFCEPConc.getText()+"',"
         + "BairroConc = '"+TFBairroConc.getText()+"',"
         + "CidadeConc = '"+TFCidadeConc.getText()+"',"
         + "EstadoConc = '"+TFEstadoConc.getText()+"',"
         + "TelConc = '"+TFTelConc.getText()+"',"
         + "RepConc = '"+TFRepConc.getText()+"',"
         + "CPFRepConc = '"+TFCPFRepConc.getText()+"',"
         + "CargoRepConc = '"+TFCargoRepConc.getText()+"',"
         + "RespConc = '"+TFRespConc.getText()+"',"
         + "CPFRespConc = '"+TFCPFRespConc.getText()+"',"
         + "CargoRespConc = '"+TFCargoRespConc.getText()+"',"
         + "Estagiario = '"+TFNomeEst.getText()+"',"
         + "CPFEstag = '"+TFCPFEst.getText()+"',"
         + "DataNascEstag = '"+TFDataNascEst.getText()+"',"
         + "EndEstag = '"+TFEndEst.getText()+"',"
         + "NumEndEstag = '"+TFNumEndEst.getText()+"',"
         + "CEPEstag = '"+TFCEPEst.getText()+"',"
         + "BairroEstag = '"+TFBairroEst.getText()+"',"
         + "CidadeEstag = '"+TFCidadeEst.getText()+"',"
         + "EstadoEstag = '"+TFEstadoEst.getText()+"',"
         + "TelEstag = '"+TFTelEst.getText()+"',"
                        + "SemestreIngresso = '"+TFSemestreEngresso.getText()+"',"
                        + "AnoIngresso = '"+TFAnoEngresso.getText()+"',"
                        + "DataTerminoTermo = '"+TFDataTerminoTermo.getText()+"',"
                        + "HorarioEstagio = '"+TFHorarioEstagio.getText()+"',"
         + "CursoEstag = '"+TFCursoEst.getText()+"',"
         + "EmailEstag = '"+TFEmailEst.getText()+"'"
         + "WHERE codigo = '"+TFCodigo.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Convênio\n"+e.getMessage());
         
         }

        TFNumTermo.setText("");
        TFCodigo.setText("");
        buttonGroup1.clearSelection();
        Data.setText("");
        TFGeradorTermo.setText("");
        TFNomeInterv.setText("");
        TFCNPJInterv.setText("");
        TFEndInterv.setText("");
        TFNumEndInterv.setText("");
        TFCEPInterv.setText("");
        TFBairroInterv.setText("");
        TFCidadeInterv.setText("");
        TFEstadoInterv.setText("");    
        TFTelInterv.setText("");
        TFRepInterv.setText("");
        TFCargoRepInterv.setText("");
        TFRespInterv.setText("");
        TFCargoRespInterv.setText("");
        TFNomeConc.setText("");
        TFCNPJConc.setText("");
        TFEndConc.setText("");
        TFNumEndConc.setText("");
        TFCEPConc.setText("");
        TFBairroConc.setText("");
        TFCidadeConc.setText("");
        TFEstadoConc.setText("");
        TFTelConc.setText("");
        TFRepConc.setText("");
        TFCPFRepConc.setText("");
        TFCargoRepConc.setText("");
        TFRespConc.setText("");
        TFCPFRespConc.setText("");
        TFCargoRespConc.setText("");
        TFNomeEst.setText("");
        TFCPFEst.setText("");
        TFDataNascEst.setText("");
        TFEndEst.setText("");
        TFNumEndEst.setText("");
        TFCEPEst.setText("");
        TFBairroEst.setText("");
        TFCidadeEst.setText("");
        TFEstadoEst.setText("");
        TFTelEst.setText("");
        TFCursoEst.setText("");
        TFEmailEst.setText("");
        TFAnoEngresso.setText("");
        TFSemestreEngresso.setText("");
         TFDataTerminoTermo.setText("");
        TFHorarioEstagio.setText("");
        
        BAtualizarTermo.setEnabled(false);
         BCadastrarTermo.setEnabled(true);
          BExcluirTermo.setEnabled(false);
           BLimparTermo.setEnabled(true);
           BGerarPDF.setEnabled(false);
        }
      
    }//GEN-LAST:event_BAtualizarTermoActionPerformed

    private void BFecharAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAlunoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAlunoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TermoCompromisso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarTermo;
    private javax.swing.JButton BBuscarConc;
    private javax.swing.JButton BBuscarEst;
    private javax.swing.JButton BBuscarInterv;
    public javax.swing.JButton BCadastrarTermo;
    public javax.swing.JButton BExcluirTermo;
    private javax.swing.JButton BFecharAluno;
    public javax.swing.JButton BGerarPDF;
    public javax.swing.JButton BLimparTermo;
    private javax.swing.JButton BPesqTermo;
    public javax.swing.JComboBox CBPesqTermo;
    public javax.swing.JFormattedTextField Data;
    private javax.swing.JLabel Data1;
    public javax.swing.JRadioButton RBNaoObrigatorio;
    public javax.swing.JRadioButton RBObrigatorio;
    public javax.swing.JTextField TFAnoEngresso;
    public javax.swing.JTextField TFBairroConc;
    public javax.swing.JTextField TFBairroEst;
    public javax.swing.JTextField TFBairroInterv;
    public javax.swing.JFormattedTextField TFCEPConc;
    public javax.swing.JFormattedTextField TFCEPEst;
    public javax.swing.JFormattedTextField TFCEPInterv;
    public javax.swing.JFormattedTextField TFCNPJConc;
    public javax.swing.JFormattedTextField TFCNPJInterv;
    public javax.swing.JFormattedTextField TFCPFEst;
    public javax.swing.JFormattedTextField TFCPFRepConc;
    public javax.swing.JFormattedTextField TFCPFRespConc;
    public javax.swing.JTextField TFCargoRepConc;
    public javax.swing.JTextField TFCargoRepInterv;
    public javax.swing.JTextField TFCargoRespConc;
    public javax.swing.JTextField TFCargoRespInterv;
    public javax.swing.JTextField TFCidadeConc;
    public javax.swing.JTextField TFCidadeEst;
    public javax.swing.JTextField TFCidadeInterv;
    public javax.swing.JTextField TFCodigo;
    public javax.swing.JTextField TFCursoEst;
    public javax.swing.JFormattedTextField TFDataNascEst;
    public javax.swing.JFormattedTextField TFDataTerminoTermo;
    public javax.swing.JTextField TFEmailEst;
    public javax.swing.JTextField TFEndConc;
    public javax.swing.JTextField TFEndEst;
    public javax.swing.JTextField TFEndInterv;
    public javax.swing.JTextField TFEstadoConc;
    public javax.swing.JTextField TFEstadoEst;
    public javax.swing.JTextField TFEstadoInterv;
    public javax.swing.JTextField TFGeradorTermo;
    public javax.swing.JFormattedTextField TFHorarioEstagio;
    public javax.swing.JTextField TFNomeConc;
    public javax.swing.JTextField TFNomeEst;
    public javax.swing.JTextField TFNomeInterv;
    public javax.swing.JTextField TFNumEndConc;
    public javax.swing.JTextField TFNumEndEst;
    public javax.swing.JTextField TFNumEndInterv;
    public javax.swing.JTextField TFNumTermo;
    public javax.swing.JTextField TFPesquisaTermo;
    public javax.swing.JTextField TFRepConc;
    public javax.swing.JTextField TFRepInterv;
    public javax.swing.JTextField TFRespConc;
    public javax.swing.JTextField TFRespInterv;
    public javax.swing.JTextField TFSemestreEngresso;
    public javax.swing.JFormattedTextField TFTelConc;
    public javax.swing.JFormattedTextField TFTelEst;
    public javax.swing.JFormattedTextField TFTelInterv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
