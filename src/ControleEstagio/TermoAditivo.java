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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class TermoAditivo extends javax.swing.JFrame {
    
    Connection conn = null;
    Principal fPrincipal;
    private int count;
    
    

    public TermoAditivo() {
        initComponents();
  
    }
    
    public TermoAditivo(Connection conn, Principal fPrincipal, String GeradordoTermo){
        initComponents();
        
        this.conn = conn;
        this.fPrincipal = fPrincipal;
          
        Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
     
        TFGeradorTermo.setEnabled(false);
        TFCodigoAditivo.setVisible(false);
        BAtualizarAditivo.setEnabled(false);
        BGerarPDFAditivo.setEnabled(false);
        BExcluirAditivo.setEnabled(false);
    }
    @SuppressWarnings("unchecked") 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFNomeIntervAditivo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TFRepIntervAditivo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TFCargoRepIntervAditivo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        TFNomeConcAditivo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TFRepConcAditivo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TFCargoRepConcAditivo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        TFCPFRepConcAditivo = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        TFNomeEstagAditivo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        TFEmailEstagAditivo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        TFCursoEstagAditivo = new javax.swing.JTextField();
        BGerarPDFAditivo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        TFGeradorTermo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        RBObrigatorio = new javax.swing.JRadioButton();
        RBNaoObrigatorio = new javax.swing.JRadioButton();
        TFDataInicioAditivo = new javax.swing.JFormattedTextField();
        jLabel50 = new javax.swing.JLabel();
        TFDataTerminoAditivo = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        TFDataAssinatura = new javax.swing.JFormattedTextField();
        CBQuantTermo = new javax.swing.JComboBox();
        TFNumTermoAditivo = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        CBPesqAditivo = new javax.swing.JComboBox();
        TFPesquisaAditivo = new javax.swing.JTextField();
        BPesqAditivo = new javax.swing.JButton();
        TFCodigoAditivo = new javax.swing.JTextField();
        BCadastrarAditivo = new javax.swing.JButton();
        BLimparAditivo = new javax.swing.JButton();
        BExcluirAditivo = new javax.swing.JButton();
        BAtualizarAditivo = new javax.swing.JButton();
        BFecharAditivo = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAditivosGerados = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logoIfSul_novo.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/TermoAditivo.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(219, 252, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interveniente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Interveniente");

        TFNomeIntervAditivo.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Representado por");

        TFRepIntervAditivo.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Cargo");

        TFCargoRepIntervAditivo.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRepIntervAditivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCargoRepIntervAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeIntervAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNomeIntervAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFRepIntervAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(TFCargoRepIntervAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(211, 245, 145));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Concedente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Nome da Empresa");

        TFNomeConcAditivo.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Representado por");

        TFRepConcAditivo.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Cargo");

        TFCargoRepConcAditivo.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("CPF");

        TFCPFRepConcAditivo.setEditable(false);
        try {
            TFCPFRepConcAditivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFCPFRepConcAditivo.setFocusLostBehavior(TFCPFRepConcAditivo.COMMIT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFNomeConcAditivo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFRepConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCPFRepConcAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCargoRepConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TFNomeConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(TFRepConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TFCargoRepConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(TFCPFRepConcAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(215, 245, 146));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estagiário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Nome");

        TFNomeEstagAditivo.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("E-mail");

        TFEmailEstagAditivo.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Curso");

        TFCursoEstagAditivo.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFCursoEstagAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEmailEstagAditivo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNomeEstagAditivo)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TFNomeEstagAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TFEmailEstagAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(TFCursoEstagAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BGerarPDFAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BGerarPDFAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pdf.png"))); // NOI18N
        BGerarPDFAditivo.setText("Imprimir");
        BGerarPDFAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGerarPDFAditivoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(220, 251, 167));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Aditivo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Nº do Termo");

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel38.setText("Data do Inicio ");

        jLabel46.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel46.setText("Gerado por:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel47.setText("Tipo de Estágio");

        buttonGroup1.add(RBObrigatorio);
        RBObrigatorio.setText("Obrigatório");

        buttonGroup1.add(RBNaoObrigatorio);
        RBNaoObrigatorio.setText("Não Obrigatório");

        try {
            TFDataInicioAditivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFDataInicioAditivo.setFocusLostBehavior(TFDataInicioAditivo.COMMIT);

        jLabel50.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel50.setText("Data do Término ");

        try {
            TFDataTerminoAditivo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFDataTerminoAditivo.setFocusLostBehavior(TFDataInicioAditivo.COMMIT);

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel39.setText("Data Assinatura");

        try {
            TFDataAssinatura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFDataAssinatura.setFocusLostBehavior(TFDataInicioAditivo.COMMIT);

        CBQuantTermo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "* Selecione *", "Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto", "Sexto", "Sétimo", "Oitavo", "Nono", "Décimo", " " }));

        TFNumTermoAditivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TFNumTermoAditivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFNumTermoAditivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TFNumTermoAditivoMouseClicked(evt);
            }
        });
        TFNumTermoAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNumTermoAditivoActionPerformed(evt);
            }
        });
        TFNumTermoAditivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFNumTermoAditivoKeyPressed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel45.setText("Aditivo");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFNumTermoAditivo)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(CBQuantTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDataAssinatura, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(TFDataInicioAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFDataTerminoAditivo)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(RBObrigatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBNaoObrigatorio))
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFGeradorTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel50)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel39)
                            .addComponent(jLabel35)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RBObrigatorio)
                            .addComponent(RBNaoObrigatorio)
                            .addComponent(TFGeradorTermo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDataTerminoAditivo)
                            .addComponent(TFDataInicioAditivo)
                            .addComponent(TFDataAssinatura)
                            .addComponent(CBQuantTermo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(TFNumTermoAditivo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))))
        );

        jPanel6.setBackground(new java.awt.Color(149, 193, 57));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel48.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Pesquisar");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Pesquisar por:");

        CBPesqAditivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número do Termo", "Nome do Interveniente", "Nome do Concedente", "Nome do Estagiário" }));
        CBPesqAditivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBPesqAditivoMouseClicked(evt);
            }
        });
        CBPesqAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBPesqAditivoActionPerformed(evt);
            }
        });

        TFPesquisaAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPesquisaAditivoActionPerformed(evt);
            }
        });
        TFPesquisaAditivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFPesquisaAditivoKeyPressed(evt);
            }
        });

        BPesqAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Search-icon.png"))); // NOI18N
        BPesqAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPesqAditivoActionPerformed(evt);
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
                        .addComponent(TFCodigoAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(469, 469, 469)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBPesqAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TFPesquisaAditivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPesqAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BPesqAditivo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(TFCodigoAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(CBPesqAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFPesquisaAditivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BCadastrarAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BCadastrarAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/add.png"))); // NOI18N
        BCadastrarAditivo.setText("Cadastrar / Imprimir");
        BCadastrarAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastrarAditivoActionPerformed(evt);
            }
        });

        BLimparAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BLimparAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Limpar.png"))); // NOI18N
        BLimparAditivo.setText("Limpar");
        BLimparAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparAditivoActionPerformed(evt);
            }
        });

        BExcluirAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BExcluirAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/exit.png"))); // NOI18N
        BExcluirAditivo.setText("Excluir");
        BExcluirAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirAditivoActionPerformed(evt);
            }
        });

        BAtualizarAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BAtualizarAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/alterar.png"))); // NOI18N
        BAtualizarAditivo.setText("Atualizar");
        BAtualizarAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAtualizarAditivoActionPerformed(evt);
            }
        });

        BFecharAditivo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        BFecharAditivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/fechar.png"))); // NOI18N
        BFecharAditivo.setText("Voltar");
        BFecharAditivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFecharAditivoActionPerformed(evt);
            }
        });

        Data.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Data.setText("jLabel4");

        TAditivosGerados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero do Aditivo", "Data Inicio", "Data Término", "Gerado Por"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TAditivosGerados);
        if (TAditivosGerados.getColumnModel().getColumnCount() > 0) {
            TAditivosGerados.getColumnModel().getColumn(0).setResizable(false);
            TAditivosGerados.getColumnModel().getColumn(1).setResizable(false);
            TAditivosGerados.getColumnModel().getColumn(2).setResizable(false);
            TAditivosGerados.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Tabela de Aditivos Gerados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BLimparAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BCadastrarAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BExcluirAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BGerarPDFAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BAtualizarAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BFecharAditivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Data))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BCadastrarAditivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BLimparAditivo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BExcluirAditivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAtualizarAditivo))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BGerarPDFAditivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BFecharAditivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGerarPDFAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGerarPDFAditivoActionPerformed
            
         TFDataAssinatura.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
        
            String NomeIntervAditivo = TFNomeIntervAditivo.getText();
            String RepIntervAditivo = TFRepIntervAditivo.getText();
            String CargoRepIntervAditivo = TFCargoRepIntervAditivo.getText();
            String NomeConcAditivo = TFNomeConcAditivo.getText();
            String RepConcAditivo = TFRepConcAditivo.getText();
            String CargoRepConcAditivo = TFCargoRepConcAditivo.getText();
            String NomeEstagAditivo = TFNomeEstagAditivo.getText();
            String CursoEstagAditivo = TFCursoEstagAditivo.getText();
            String EmailEstagAditivo = TFEmailEstagAditivo.getText();
            String NumTermo = TFNumTermoAditivo.getText();
            String Aditivo = CBQuantTermo.getSelectedItem().toString();
            String DataInicialTermoAditivo = TFDataInicioAditivo.getText();
            String DataFinalTermoAditivo = TFDataTerminoAditivo.getText();
            String DataAssinaturaAditivo = TFDataAssinatura.getText();
            
            String DataCompletaTermo = TFDataAssinatura.getText();
                      
       /* String data =(DataInicialTermoAditivo) ; //Pego a data 
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
            if(RBObrigatorio.isSelected())
                
            {

                Document document = new Document(PageSize.A4, 40, 40, 40, 40);
        try {
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("TermoAditivo.doc"));
        
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
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS\n"
                    + "DEPARTAMENTO DE APOIO AOS DISCENTES E ENGRESSOS - PRÓ REITORIA DE EXTENSÃO\n",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P3 = new Paragraph("TERMO ADITIVO\n",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("     "+Aditivo+" Termo aditivo ao Termo de compromisso de Estágio "
                    + "nº "+NumTermo+" celebrado entre a "+NomeConcAditivo+", neste ato "
                    + "representado pelo seu "+CargoRepConcAditivo+",  "+RepConcAditivo+" doravante denominado(a) "
                    + "CONCEDENTE, e de outro lado o(a) ESTAGIÁRIO(a) "+NomeEstagAditivo+" e o "+NomeIntervAditivo+", "
                    + "representado(a) pelo "+CargoRepIntervAditivo+",  "+RepIntervAditivo+" "
                    + ", doravante denominado(a) INTERVENIENTE, resolvem celebrar o "
                    + "presente Termo Aditivo nas seguintes condições:",font10);  
            P4.setAlignment(Element.ALIGN_JUSTIFIED);
            P4.setSpacingAfter(15);
            document.add(P4);
                      
            Paragraph P13 = new Paragraph("\nCLÁUSULA PRIMEIRA: DA VIGÊNCIA Fica acordado entre as "
                    + "partes que o Termo de Compromisso, assinado em "+DataAssinaturaAditivo+", através da sua "
                    + "Cláusula terceira, será prorrogado a partir de "+DataInicialTermoAditivo+" a "+DataFinalTermoAditivo+", "
                    + "podendo ser prorrogado por igual período, conforme ON nº 04/2014.",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLÁUSULA SEGUNDA:\nPermanecem em vigor todas as demais cláusulas do contrato aditado.\n",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("	E por se acharem justo e contratados, lavram o presente "
                    + "documento em 03 (três) vias de igual teor, por nós e pelas testemunhas assinadas, "
                    + "o que incorporará ao Termo de Compromisso original.",font8);
            P15.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P15);
                       
            Paragraph P50 = new Paragraph("\nPassos - MG , "+DataCompletaTermo+".",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n\n_________________________________________\n"+RepConcAditivo+"\n"+NomeConcAditivo+"",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            P51.setSpacingAfter(30);
            document.add(P51);
            
            Paragraph P54 = new Paragraph("\n\n_________________________________________\n"+RepIntervAditivo+"\n"+CargoRepIntervAditivo+"",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P55 = new Paragraph("\n\n_________________________________________\n"+NomeEstagAditivo+"\nEstagiário(a)",font8);
            P55.setAlignment(Element.ALIGN_CENTER);
            document.add(P55);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" TermoAditivo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        } 

            }
   
    }//GEN-LAST:event_BGerarPDFAditivoActionPerformed

    private void CBPesqAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBPesqAditivoActionPerformed
   
        
    }//GEN-LAST:event_CBPesqAditivoActionPerformed

    private void TFPesquisaAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPesquisaAditivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPesquisaAditivoActionPerformed

    private void TFPesquisaAditivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFPesquisaAditivoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 
        
      
        String pesquisa = CBPesqAditivo.getSelectedItem().toString();
        String valor = TFPesquisaAditivo.getText();
        
        ConsultaTermoAditivo ca = new ConsultaTermoAditivo(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Termo Aditivo");
        ca.setVisible(true);
        
        CBPesqAditivo.setSelectedIndex(0);
        TFPesquisaAditivo.setText("");
        
        }
    }//GEN-LAST:event_TFPesquisaAditivoKeyPressed

    private void BPesqAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPesqAditivoActionPerformed
         
        String ModoPesquisa = CBPesqAditivo.getSelectedItem().toString();        
        
       
        String pesquisa = CBPesqAditivo.getSelectedItem().toString();
        String valor = TFPesquisaAditivo.getText();
        
        ConsultaTermoAditivo ca = new ConsultaTermoAditivo(conn, this, pesquisa, valor);
        ca.setTitle("Consulta de Termo Aditivo");
        ca.setVisible(true);
        
        CBPesqAditivo.setSelectedIndex(0);
        TFPesquisaAditivo.setText("");

    }//GEN-LAST:event_BPesqAditivoActionPerformed

    private void BCadastrarAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastrarAditivoActionPerformed

         if (

                !TFNomeConcAditivo.getText().equals("") &&  
                !TFNomeEstagAditivo.getText().equals("") &&
                !TFNomeIntervAditivo.getText().equals("") &&
                !TFDataAssinatura.getText().equals("  /  /    ") &&  
                !TFDataInicioAditivo.getText().equals("  /  /    ") &&
                !TFDataTerminoAditivo.getText().equals("  /  /    ") &&
                !TFNumTermoAditivo.getText().equals(""))
            
        {
        
        if(!CBQuantTermo.getSelectedItem().equals("* Selecione *")){
        
        String QuantTermo1  = CBQuantTermo.getSelectedItem().toString();
        String NumTermo1 = TFNumTermoAditivo.getText();
        
        try{
              Statement stmt = conn.createStatement();
            String query = "SELECT COUNT(*) FROM termoAditivo "
                    + "WHERE QuantTermo = '"+QuantTermo1+"' AND NumeroTermo = '"+NumTermo1+"'";
            ResultSet rs=stmt.executeQuery(query);                  
                        //Extact result from ResultSet rs
          while(rs.next()){
             count = rs.getInt(1);
           // count = rs.getInt(NumTermo)
       System.out.println("COUNT(*)="+rs.getString("COUNT(*)"));                              
                          }
                        // close ResultSet rs
                       // rs.close();
                   } catch(SQLException s){                                             
                                s.printStackTrace();
                         }
        if (count == 0){
        
        String Termo = TFNumTermoAditivo.getText();
        
       
            
            int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Confirmar Cadastro do Termo Aditivo do Termo de Compromisso Numero "+Termo+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        
       {

        String NumTermo = TFNumTermoAditivo.getText();
        String DataInicialTermo = TFDataInicioAditivo.getText();     
        String DataAssinatura = TFDataAssinatura.getText();
        String TipoEstagio = (RBObrigatorio.isSelected()?"Estágio Obrigatório":"Estagio não Obrigatório");
        String GeradoPor = fPrincipal.LLogin.getText();
        String QuantTermo = CBQuantTermo.getSelectedItem().toString();
        String Interveniente = TFNomeIntervAditivo.getText();
        String RepInterv = TFRepIntervAditivo.getText();
        String CargoRepInterv = TFCargoRepIntervAditivo.getText();
        String Concedente = TFNomeConcAditivo.getText();
        String RepConc = TFRepConcAditivo.getText();
        String CPFRepConc = TFCPFRepConcAditivo.getText();
        String CargoRepConc = TFCargoRepConcAditivo.getText();
        String Estagiario = TFNomeEstagAditivo.getText();
        String CursoEstag = TFCursoEstagAditivo.getText();
        String EmailEstag = TFEmailEstagAditivo.getText();
        
        String data = TFDataInicioAditivo.getText() ; 

        /*//Pego a data 
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
        
            String NomeIntervAditivo = TFNomeIntervAditivo.getText();
            String RepIntervAditivo = TFRepIntervAditivo.getText();
            String CargoRepIntervAditivo = TFCargoRepIntervAditivo.getText();
            String NomeConcAditivo = TFNomeConcAditivo.getText();
            String RepConcAditivo = TFRepConcAditivo.getText();
            String CargoRepConcAditivo = TFCargoRepConcAditivo.getText();
            String NomeEstagAditivo = TFNomeEstagAditivo.getText();
            String CursoEstagAditivo = TFCursoEstagAditivo.getText();
            String EmailEstagAditivo = TFEmailEstagAditivo.getText();
            String NumeroTermo = TFNumTermoAditivo.getText();
            String Aditivo = CBQuantTermo.getSelectedItem().toString();
            String DataInicialTermoAditivo = TFDataInicioAditivo.getText();
            String DataFinalTermoAditivo = TFDataTerminoAditivo.getText();
            String DataAssinaturaAditivo = TFDataAssinatura.getText();
            
            Data.setText(DateFormat.getDateInstance(DateFormat.FULL).format(new Date()));
            
            String Data1 = Data.getText(); 
                    
       
        try{
            
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO TermoAditivo VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pstm.setString(1, QuantTermo);
            pstm.setString(2, DataInicialTermo);
            pstm.setString(3, DataFinalTermoAditivo);
            pstm.setString(4, NumTermo);
            pstm.setString(5, DataAssinatura);
            pstm.setString(6, GeradoPor);          
            pstm.setString(7, Interveniente);
            pstm.setString(8, RepInterv);
            pstm.setString(9, CargoRepInterv);
            pstm.setString(10, Concedente);
            pstm.setString(11, RepConc);
            pstm.setString(12, CPFRepConc);
            pstm.setString(13, CargoRepInterv);
            pstm.setString(14, Estagiario);
            pstm.setString(15, CursoEstag);
            pstm.setString(16, EmailEstag);
            pstm.setString(17, TipoEstagio);

            pstm.executeUpdate();
            pstm.close();

                Document document = new Document(PageSize.A4, 40, 40, 40, 40);
        try {
            RtfWriter writer = RtfWriter.getInstance(document, new FileOutputStream("TermoAditivo.doc"));
        
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
                    + "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS\n"
                    + "DEPARTAMENTO DE APOIO AOS DISCENTES E ENGRESSOS - PRÓ REITORIA DE EXTENSÃO\n",font8Bold);  
            P1.setAlignment(Element.ALIGN_CENTER);
            document.add(P1); 

            Paragraph P3 = new Paragraph("TERMO ADITIVO\n",font12Bold);  
            P3.setAlignment(Element.ALIGN_CENTER);
            document.add(P3);
            
            Paragraph P4 = new Paragraph("     "+Aditivo+" Termo aditivo ao Termo de compromisso de Estágio "
                    + "nº "+NumeroTermo+" celebrado entre a "+NomeConcAditivo+", neste ato "
                    + "representado pelo seu "+CargoRepConcAditivo+",  "+RepConcAditivo+" doravante denominado(a) "
                    + "CONCEDENTE, e de outro lado o(a) ESTAGIÁRIO(a) "+NomeEstagAditivo+" e o "+NomeIntervAditivo+", "
                    + "representado(a) pelo "+CargoRepIntervAditivo+",  "+RepIntervAditivo+" "
                    + ", doravante denominado(a) INTERVENIENTE, resolvem celebrar o "
                    + "presente Termo Aditivo nas seguintes condições:",font10);  
            P4.setAlignment(Element.ALIGN_JUSTIFIED);
            P4.setSpacingAfter(15);
            document.add(P4);
                      
            Paragraph P13 = new Paragraph("\nCLÁUSULA PRIMEIRA: DA VIGÊNCIA Fica acordado entre as "
                    + "partes que o Termo de Compromisso, assinado em "+DataAssinaturaAditivo+", através da sua "
                    + "Cláusula terceira, será prorrogado a partir de "+DataInicialTermoAditivo+" a "+DataFinalTermoAditivo+", "
                    + "podendo ser prorrogado por igual período, conforme ON nº 04/2014.",font8);  
            P13.setAlignment(Element.ALIGN_JUSTIFIED);
            P13.setSpacingAfter(10);
            document.add(P13);
            
            Paragraph P14 = new Paragraph("\nCLÁUSULA SEGUNDA:\nPermanecem em vigor todas as demais cláusulas do contrato aditado.\n",font8);  
            P14.setAlignment(Element.ALIGN_JUSTIFIED);
            P14.setSpacingAfter(10);
            document.add(P14);
            
            Paragraph P15 = new Paragraph("	E por se acharem justo e contratados, lavram o presente "
                    + "documento em 03 (três) vias de igual teor, por nós e pelas testemunhas assinadas, "
                    + "o que incorporará ao Termo de Compromisso original.",font8);
            P15.setAlignment(Element.ALIGN_JUSTIFIED);
            document.add(P15);
                       
            Paragraph P50 = new Paragraph("\nPassos - MG , "+Data1+".",font8);
            P50.setSpacingAfter(30);
            P50.setAlignment(Element.ALIGN_CENTER);
            document.add(P50);
            
            Paragraph P51 = new Paragraph("\n\n_________________________________________\n"+RepConcAditivo+"\n"+NomeConcAditivo+"",font8);
            P51.setAlignment(Element.ALIGN_CENTER);
            P51.setSpacingAfter(30);
            document.add(P51);
            
            Paragraph P54 = new Paragraph("\n\n_________________________________________\n"+RepIntervAditivo+"\n"+CargoRepIntervAditivo+"",font8);
            P54.setAlignment(Element.ALIGN_CENTER);
            document.add(P54);
            
            Paragraph P55 = new Paragraph("\n\n_________________________________________\n"+NomeEstagAditivo+"\nEstagiário(a)",font8);
            P55.setAlignment(Element.ALIGN_CENTER);
            document.add(P55);
             
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler"+" TermoAditivo.doc");

            document.close();
        
        } catch (DocumentException | IOException ex) {
            Logger.getLogger(TermoCompromisso.class.getName()).log(Level.SEVERE, null, ex);
        } 

        }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao inserir Termo\n"+e.getMessage());
        }
       
       
        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem(0);
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
       
         BAtualizarAditivo.setEnabled(false);
         BCadastrarAditivo.setEnabled(true);
          BExcluirAditivo.setEnabled(false);
           BLimparAditivo.setEnabled(true);
           }
         }
        else
            JOptionPane.showMessageDialog(null, "O "+QuantTermo1+" Termo Aditivo do Termo de Compromisso "+NumTermo1+" já foi gerado!");
        }
        else
            JOptionPane.showMessageDialog(null, "Selecione o Termo Aditivo que será gerado!");
        }
        
        else
            JOptionPane.showMessageDialog(null, "Confira o Formulário!\nTodos os campos devem ser preenchidos!");
       
    
    }//GEN-LAST:event_BCadastrarAditivoActionPerformed

    private void BLimparAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparAditivoActionPerformed

        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem(0);
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
        
        DefaultTableModel tableModel =(DefaultTableModel) TAditivosGerados.getModel();  
tableModel.setNumRows(0);  
        
        BAtualizarAditivo.setEnabled(false);
         BCadastrarAditivo.setEnabled(true);
          BExcluirAditivo.setEnabled(false);
           BGerarPDFAditivo.setEnabled(false);
       
    }//GEN-LAST:event_BLimparAditivoActionPerformed

    private void BExcluirAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirAditivoActionPerformed

          String Termo = TFNumTermoAditivo.getText();
                
                int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Excluir o Termo Aditivo do Termo de Compromisso Numero "+Termo+" ?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM TermoAditivo WHERE NumTermo = '"+Termo+"'");

        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem(0);
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
        
        BAtualizarAditivo.setEnabled(false);
         BCadastrarAditivo.setEnabled(true);
          BExcluirAditivo.setEnabled(false);
           BLimparAditivo.setEnabled(true);
            
            
            pstm.executeUpdate();
            pstm.close();

         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Excluir Termo Aditivo \n"+e.getMessage());}

        }
    
    }//GEN-LAST:event_BExcluirAditivoActionPerformed

    private void BAtualizarAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAtualizarAditivoActionPerformed
           
        String Termo = TFNumTermoAditivo.getText();
        
         int opcao;
        opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Alterar os dados do Termo Aditivo do Termo de Compromisso Numero"+Termo+"?","Controle de Estágio",JOptionPane.YES_NO_OPTION);
       if (opcao == JOptionPane.YES_OPTION)
        {
   
        try{
                PreparedStatement pstm = conn.prepareStatement("UPDATE termoAditivo SET  NumeroTermo = '"+TFNumTermoAditivo.getText()+"',"

         + "TipoEstag = '"+(RBObrigatorio.isSelected()?"Estágio Obrigatório":"Estagio não Obrigatório")+"',"               
         + "DataInicial = '"+ TFDataInicioAditivo.getText()+"',"
         + "DataFinal = '"+ TFDataTerminoAditivo.getText()+"',"
         + "NumeroTermo = '"+ TFNumTermoAditivo.getText()+"',"
         + "DataAssinatura = '"+ TFDataAssinatura.getText()+"',"
         + "CPFRepConc = '"+ TFCPFRepConcAditivo.getText()+"',"
         + "QuantTermo = '"+ CBQuantTermo.getSelectedItem()+"',"
         + "GeradoPor = '"+TFGeradorTermo.getText()+"',"
         + "Interveniente = '"+TFNomeIntervAditivo.getText()+"',"
         + "RepInterv = '"+TFRepIntervAditivo.getText()+"',"
         + "CargoRepInterv = '"+TFCargoRepIntervAditivo.getText()+"',"
         + "Concedente = '"+TFNomeConcAditivo.getText()+"',"
         + "RepConc = '"+TFRepConcAditivo.getText()+"',"
         + "CargoRepConc = '"+TFCargoRepConcAditivo.getText()+"',"
         + "Estagiario = '"+TFNomeEstagAditivo.getText()+"',"
         + "CursoEstag = '"+TFCursoEstagAditivo.getText()+"',"
         + "EmailEstag = '"+TFEmailEstagAditivo.getText()+"'"
         + "WHERE codigo = '"+TFCodigoAditivo.getText()+"'");
                
            pstm.executeUpdate();
            pstm.close();
        
         }catch(SQLException | HeadlessException e){
            System.out.println("Erro ao Atualizar Termo Aditivo\n"+e.getMessage());
         
         }

        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem(0);
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
        
       TFPesquisaAditivo.setEnabled(false);
        BAtualizarAditivo.setEnabled(false);
         BCadastrarAditivo.setEnabled(true);
          BExcluirAditivo.setEnabled(false);
           BLimparAditivo.setEnabled(true);
        }
      
    }//GEN-LAST:event_BAtualizarAditivoActionPerformed

    private void BFecharAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFecharAditivoActionPerformed

        this.dispose();
    }//GEN-LAST:event_BFecharAditivoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String valor1 = TFNumTermoAditivo.getText();
        
        ConsultaTermoAditivo ca = new ConsultaTermoAditivo(conn, this,null,valor1);
        ca.setTitle("Consulta de Termo Aditivo");
        ca.setVisible(true);
        
        CBPesqAditivo.setSelectedIndex(0);
        TFPesquisaAditivo.setText(""); 


        /*                 
        String Numero = TFNumTermoAditivo.getText();
        
         DefaultTableModel m = (DefaultTableModel) TAditivosGerados.getModel();
        
        try{
                       
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT QuantTermo,  "
                    + "DataInicial,  "
                    + "DataFinal, "
                    + "GeradoPor "
                    + "FROM termoAditivo "
                    + "WHERE  NumeroTermo "
                    + "LIKE '%"+Numero+"%' "
                    + "ORDER BY DataInicial");

            while(rs.next()){
                String QuantTermo = rs.getString("QuantTermo");
                String DataInicial = rs.getString("DataInicial");
                String DataFinal = rs.getString("DataFinal");
                String GeradoPor = rs.getString("GeradoPor");

                m.addRow(new Object[] {QuantTermo, DataInicial, DataFinal, GeradoPor});
            }
            rs.close();
            }
           
           catch(SQLException e){
            System.out.println("Erro ao consultar Termo Aditivo!\n"+e.getMessage());
    
        } 
       
        try{
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM termoObrigatorio WHERE NumTermo LIKE '%"+Numero+"%'");
                
                while(rs.next()){

       int Codigo = rs.getInt("Codigo");
        String TipoEstagio = rs.getString("TipoEstagio");
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

        TFCodigoAditivo.setText(Codigo+"");
        if(TipoEstagio.equals("Estágio não Obrigatório"))
                        RBNaoObrigatorio.setSelected(true);
                    else
                        RBObrigatorio.setSelected(true);
        TFNomeIntervAditivo.setText(Interveniente);
        TFRepIntervAditivo.setText(RepInterv);
        TFCargoRepIntervAditivo.setText(CargoRepInterv);
        TFNomeConcAditivo.setText(Concedente);
        TFRepConcAditivo.setText(RepConc);
        TFCPFRepConcAditivo.setText(CPFRepConc);
        TFCargoRepConcAditivo.setText(CargoRepConc);
        TFNomeEstagAditivo.setText(Estagiario);
        TFCursoEstagAditivo.setText(CursoEstag);
        TFEmailEstagAditivo.setText(EmailEstag);
                    
                }
               rs.close();
               
       TFPesquisaAditivo.setEnabled(false);
       BAtualizarAditivo.setEnabled(false);
       BCadastrarAditivo.setEnabled(true);
       BExcluirAditivo.setEnabled(false);
       BLimparAditivo.setEnabled(true);
       BGerarPDFAditivo.setEnabled(false);

            }catch(SQLException e){
                System.out.println("Erro ao consultar Termo Compromisso!\n"+e.getMessage());
            }
*/      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TFNumTermoAditivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TFNumTermoAditivoMouseClicked
        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem("* Selecione *");
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
        
        DefaultTableModel tableModel =(DefaultTableModel) TAditivosGerados.getModel();  
tableModel.setNumRows(0);  
        
    }//GEN-LAST:event_TFNumTermoAditivoMouseClicked

    private void TFNumTermoAditivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNumTermoAditivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNumTermoAditivoActionPerformed

    private void CBPesqAditivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBPesqAditivoMouseClicked
       
        TFNumTermoAditivo.setText("");
        CBQuantTermo.setSelectedItem("* Selecione *");
        TFDataInicioAditivo.setText("");
        TFDataTerminoAditivo.setText("");
        TFDataAssinatura.setText("");
        TFGeradorTermo.setText("");
        buttonGroup1.clearSelection();
        TFNomeIntervAditivo.setText("");
        TFRepIntervAditivo.setText("");
        TFCargoRepIntervAditivo.setText("");
        TFNomeConcAditivo.setText("");
        TFRepConcAditivo.setText("");
        TFCPFRepConcAditivo.setText("");
        TFCargoRepConcAditivo.setText("");
        TFNomeEstagAditivo.setText("");
        TFCursoEstagAditivo.setText("");
        TFEmailEstagAditivo.setText("");
        
        DefaultTableModel tableModel =(DefaultTableModel) TAditivosGerados.getModel();  
tableModel.setNumRows(0);  
        
       TFPesquisaAditivo.setEnabled(false);
        BAtualizarAditivo.setEnabled(false);
         BCadastrarAditivo.setEnabled(true);
          BExcluirAditivo.setEnabled(false);
           BGerarPDFAditivo.setEnabled(false); 
        
    }//GEN-LAST:event_CBPesqAditivoMouseClicked

    private void TFNumTermoAditivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNumTermoAditivoKeyPressed

         if (evt.getKeyCode() == KeyEvent.VK_ENTER){ 

        String valor1 = TFNumTermoAditivo.getText();
        
        ConsultaTermoAditivo ca = new ConsultaTermoAditivo(conn, this,null,valor1);
        ca.setTitle("Consulta de Termo Aditivo");
        ca.setVisible(true);
        
        CBPesqAditivo.setSelectedIndex(0);
        TFPesquisaAditivo.setText(""); 
         }
    }//GEN-LAST:event_TFNumTermoAditivoKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TermoCompromisso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAtualizarAditivo;
    public javax.swing.JButton BCadastrarAditivo;
    public javax.swing.JButton BExcluirAditivo;
    private javax.swing.JButton BFecharAditivo;
    public javax.swing.JButton BGerarPDFAditivo;
    public javax.swing.JButton BLimparAditivo;
    private javax.swing.JButton BPesqAditivo;
    public javax.swing.JComboBox CBPesqAditivo;
    public javax.swing.JComboBox CBQuantTermo;
    private javax.swing.JLabel Data;
    public javax.swing.JRadioButton RBNaoObrigatorio;
    public javax.swing.JRadioButton RBObrigatorio;
    public javax.swing.JTable TAditivosGerados;
    public javax.swing.JFormattedTextField TFCPFRepConcAditivo;
    public javax.swing.JTextField TFCargoRepConcAditivo;
    public javax.swing.JTextField TFCargoRepIntervAditivo;
    public javax.swing.JTextField TFCodigoAditivo;
    public javax.swing.JTextField TFCursoEstagAditivo;
    public javax.swing.JFormattedTextField TFDataAssinatura;
    public javax.swing.JFormattedTextField TFDataInicioAditivo;
    public javax.swing.JFormattedTextField TFDataTerminoAditivo;
    public javax.swing.JTextField TFEmailEstagAditivo;
    public javax.swing.JTextField TFGeradorTermo;
    public javax.swing.JTextField TFNomeConcAditivo;
    public javax.swing.JTextField TFNomeEstagAditivo;
    public javax.swing.JTextField TFNomeIntervAditivo;
    public javax.swing.JTextField TFNumTermoAditivo;
    public javax.swing.JTextField TFPesquisaAditivo;
    public javax.swing.JTextField TFRepConcAditivo;
    public javax.swing.JTextField TFRepIntervAditivo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
