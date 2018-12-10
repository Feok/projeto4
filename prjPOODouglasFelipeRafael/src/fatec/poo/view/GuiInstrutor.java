package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class GuiInstrutor extends javax.swing.JFrame {

    public GuiInstrutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        cmbbxSexo = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        lblCurso = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jftxtRg = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCurso1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jftxtCpf = new javax.swing.JFormattedTextField();
        txtFormacao = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbbxEstadoCivil = new javax.swing.JComboBox<>();
        jftxtDataNascto = new javax.swing.JFormattedTextField();
        jftxtCep = new javax.swing.JFormattedTextField();
        jftxtTelRes = new javax.swing.JFormattedTextField();
        jftxtCelular = new javax.swing.JFormattedTextField();
        txtAreaAtuacao = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        cmbbxEstado = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Instrutor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel7.setText("Bairro");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        cmbbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        cmbbxSexo.setEnabled(false);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblCurso.setText("CPF");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        txtNome.setEnabled(false);

        jLabel3.setText("Sexo");

        txtBairro.setEnabled(false);

        jLabel4.setText("Endereço");

        txtEndereco.setEnabled(false);

        try {
            jftxtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtRg.setEnabled(false);
        jftxtRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftxtRgActionPerformed(evt);
            }
        });

        jLabel9.setText("Formação");

        jLabel10.setText("Email");

        lblCurso1.setText("Cidade");

        jLabel11.setText("RG");

        try {
            jftxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtFormacao.setEnabled(false);

        txtCidade.setEnabled(false);

        txtEmail.setEnabled(false);

        jLabel1.setText("Estado Civil");

        jLabel13.setText("Data Nascto");

        jLabel14.setText("Nº");

        jLabel15.setText("CEP");

        jLabel19.setText("Tel. Res");

        jLabel20.setText("Celular");

        jLabel21.setText("Área de atuação");

        cmbbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado" }));
        cmbbxEstadoCivil.setEnabled(false);
        cmbbxEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxEstadoCivilActionPerformed(evt);
            }
        });

        try {
            jftxtDataNascto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtDataNascto.setEnabled(false);

        try {
            jftxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtCep.setEnabled(false);

        try {
            jftxtTelRes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtTelRes.setEnabled(false);

        try {
            jftxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtCelular.setEnabled(false);

        txtAreaAtuacao.setEnabled(false);

        txtNumero.setEnabled(false);

        cmbbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA ", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cmbbxEstado.setToolTipText("");
        cmbbxEstado.setEnabled(false);
        cmbbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxEstadoActionPerformed(evt);
            }
        });

        jLabel16.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftxtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(219, 219, 219))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(318, 318, 318)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCurso1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jftxtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jftxtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnConsultar)
                            .addComponent(btnInserir)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir)
                            .addComponent(btnSair))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCurso)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCurso1)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jftxtRg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jftxtDataNascto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cmbbxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jftxtTelRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(jftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel21)
                                    .addComponent(txtAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))))
                        .addGap(105, 105, 105))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftxtRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftxtRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftxtRgActionPerformed

    private void cmbbxEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxEstadoCivilActionPerformed

    private void cmbbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxEstadoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        instrutor = null;
        instrutor = daoInstrutor.consultar(jftxtCpf.getText().replace(".","").replace("-",""));
        int i = jftxtCpf.getText().replace(" ", "").length();
        if(i != 14) {
            JOptionPane.showMessageDialog(null, "O CPF inserido não contém caracteres suficientes. Por favor, digite um CPF válido.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
        } else {
            if(Instrutor.validarCPF(jftxtCpf.getText())){
                if (instrutor == null){
                jftxtCpf.setEnabled(false);
                txtNome.setEnabled(true);
                txtNome.requestFocus();
                cmbbxSexo.setEnabled(true);
                cmbbxEstadoCivil.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtNumero.setEnabled(true);
                txtBairro.setEnabled(true);
                jftxtCep.setEnabled(true);
                txtCidade.setEnabled(true);
                cmbbxEstado.setEnabled(true);
                jftxtTelRes.setEnabled(true);
                jftxtCelular.setEnabled(true);
                jftxtRg.setEnabled(true);
                txtEmail.setEnabled(true);
                jftxtDataNascto.setEnabled(true);
                txtFormacao.setEnabled(true);
                txtAreaAtuacao.setEnabled(true);

                btnConsultar.setEnabled(false);
                btnInserir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                }
                else{
                    txtNome.setText(instrutor.getNome());
                    cmbbxSexo.setSelectedItem(instrutor.getSexo());
                    cmbbxEstadoCivil.setSelectedItem(instrutor.getEstadoCivil());
                    txtEndereco.setText(instrutor.getEndereco());
                    txtNumero.setText(Integer.toString(instrutor.getNumero()));
                    txtBairro.setText(instrutor.getBairro());
                    jftxtCep.setText(instrutor.getCep());
                    txtCidade.setText(instrutor.getCidade());
                    cmbbxEstado.setSelectedItem(instrutor.getEstado());
                    jftxtTelRes.setText(instrutor.getTelefone());
                    jftxtCelular.setText(instrutor.getCelular());
                    jftxtRg.setText(instrutor.getRg());
                    txtEmail.setText(instrutor.getEmail());
                    jftxtDataNascto.setText(instrutor.getDataNasc());
                    txtFormacao.setText(instrutor.getFormacao());
                    txtAreaAtuacao.setText(instrutor.getAreaAtuacao());

                    jftxtCpf.setEnabled(false);
                    txtNome.setEnabled(true);
                    txtNome.requestFocus();
                    cmbbxSexo.setEnabled(true);
                    cmbbxEstadoCivil.setEnabled(true);
                    txtEndereco.setEnabled(true);
                    txtNumero.setEnabled(true);
                    txtBairro.setEnabled(true);
                    jftxtCep.setEnabled(true);
                    txtCidade.setEnabled(true);
                    cmbbxEstado.setEnabled(true);
                    jftxtTelRes.setEnabled(true);
                    jftxtCelular.setEnabled(true);
                    jftxtRg.setEnabled(true);
                    txtEmail.setEnabled(true);
                    jftxtDataNascto.setEnabled(true);
                    txtFormacao.setEnabled(true);
                    txtAreaAtuacao.setEnabled(true);

                    btnConsultar.setEnabled(false);
                    btnInserir.setEnabled(false);
                    btnAlterar.setEnabled(true);
                    btnExcluir.setEnabled(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "O CPF inserido é inválido. Por favor, digite um CPF válido.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("root","root");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoInstrutor = new DaoInstrutor(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        instrutor = new Instrutor(jftxtCpf.getText().replace(".","").replace("-",""), txtNome.getText());
        instrutor.setEndereco(txtEndereco.getText());
        instrutor.setDataNasc(jftxtDataNascto.getText().replace("/","").replace(" ", ""));
        if(!(txtNumero.getText().replace(".", "").replace("-", "").replace(" ", "").equals(""))){
            instrutor.setNumero(parseInt(txtNumero.getText()));
        }
        instrutor.setBairro(txtBairro.getText());
        instrutor.setCidade(txtCidade.getText());
        instrutor.setEstado(String.valueOf(cmbbxEstado.getSelectedItem()));
        instrutor.setCep(jftxtCep.getText().replace("-", "").replace(" ", ""));
        instrutor.setTelefone(jftxtTelRes.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        instrutor.setCelular(jftxtCelular.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        instrutor.setSexo(String.valueOf(cmbbxSexo.getSelectedItem()));
        instrutor.setEstadoCivil(String.valueOf(cmbbxEstadoCivil.getSelectedItem()));
        instrutor.setRg(jftxtRg.getText().replace(".", "").replace("-", "").replace(" ", ""));
        instrutor.setEmail(txtEmail.getText());
        instrutor.setFormacao(txtFormacao.getText()); 
        instrutor.setAreaAtuacao(txtAreaAtuacao.getText());
        daoInstrutor.inserir(instrutor);
         
        jftxtCpf.setText("");
        txtNome.setText("");
        jftxtDataNascto.setText("");
        cmbbxSexo.setSelectedIndex(0);
        cmbbxEstadoCivil.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        jftxtCep.setText("");
        txtCidade.setText("");
        cmbbxEstado.setSelectedIndex(0);
        jftxtTelRes.setText("");
        jftxtCelular.setText("");
        jftxtRg.setText("");
        txtEmail.setText("");
        txtFormacao.setText("");
        txtAreaAtuacao.setText("");
        
        
        btnInserir.setEnabled(false);
        jftxtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        jftxtDataNascto.setEnabled(false);
        cmbbxSexo.setEnabled(false);
        cmbbxEstadoCivil.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        jftxtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        cmbbxEstado.setEnabled(false);
        jftxtTelRes.setEnabled(false);
        jftxtCelular.setEnabled(false);
        jftxtRg.setEnabled(false);
        txtEmail.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtAreaAtuacao.setEnabled(false);
        
        jftxtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma alteração?") == 0){
            instrutor.setNome(txtNome.getText());
            instrutor.setEndereco(txtEndereco.getText());
            instrutor.setDataNasc(jftxtDataNascto.getText().replace("/","").replace(" ", ""));
            if(!(txtNumero.getText().replace(".", "").replace("-", "").replace(" ", "").equals(""))){
                instrutor.setNumero(parseInt(txtNumero.getText()));
            }
            instrutor.setBairro(txtBairro.getText());
            instrutor.setCidade(txtCidade.getText());
            instrutor.setEstado(String.valueOf(cmbbxEstado.getSelectedItem()));
            instrutor.setCep(jftxtCep.getText().replace("-", "").replace(" ", ""));
            instrutor.setTelefone(jftxtTelRes.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            instrutor.setCelular(jftxtCelular.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
            instrutor.setSexo(String.valueOf(cmbbxSexo.getSelectedItem()));
            instrutor.setEstadoCivil(String.valueOf(cmbbxEstadoCivil.getSelectedItem()));
            instrutor.setRg(jftxtRg.getText().replace(".", "").replace("-", "").replace(" ", ""));
            instrutor.setEmail(txtEmail.getText());
            instrutor.setFormacao(txtFormacao.getText()); 
            instrutor.setAreaAtuacao(txtAreaAtuacao.getText());
            daoInstrutor.alterar(instrutor);  
        }
        jftxtCpf.setText("");
        txtNome.setText("");
        jftxtDataNascto.setText("");
        cmbbxSexo.setSelectedIndex(0);
        cmbbxEstadoCivil.setSelectedIndex(0);
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        jftxtCep.setText("");
        txtCidade.setText("");
        cmbbxEstado.setSelectedIndex(0);
        jftxtTelRes.setText("");
        jftxtCelular.setText("");
        jftxtRg.setText("");
        txtEmail.setText("");
        txtFormacao.setText("");
        txtAreaAtuacao.setText("");
        
        
        btnInserir.setEnabled(false);
        jftxtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        jftxtDataNascto.setEnabled(false);
        cmbbxSexo.setEnabled(false);
        cmbbxEstadoCivil.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtNumero.setEnabled(false);
        txtBairro.setEnabled(false);
        jftxtCep.setEnabled(false);
        txtCidade.setEnabled(false);
        cmbbxEstado.setEnabled(false);
        jftxtTelRes.setEnabled(false);
        jftxtCelular.setEnabled(false);
        jftxtRg.setEnabled(false);
        txtEmail.setEnabled(false);
        txtFormacao.setEnabled(false);
        txtAreaAtuacao.setEnabled(false);
        
        jftxtCpf.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma exclusão?") == 0){
            daoInstrutor.excluir(instrutor);
            
            jftxtCpf.setText("");
            txtNome.setText("");
            jftxtDataNascto.setText("");
            cmbbxSexo.setSelectedIndex(0);
            cmbbxEstadoCivil.setSelectedIndex(0);
            txtEndereco.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            jftxtCep.setText("");
            txtCidade.setText("");
            cmbbxEstado.setSelectedIndex(0);
            jftxtTelRes.setText("");
            jftxtCelular.setText("");
            jftxtRg.setText("");
            txtEmail.setText("");
            txtFormacao.setText("");
            txtAreaAtuacao.setText("");


            btnInserir.setEnabled(false);
            jftxtCpf.setEnabled(true);
            txtNome.setEnabled(false);
            jftxtDataNascto.setEnabled(false);
            cmbbxSexo.setEnabled(false);
            cmbbxEstadoCivil.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtNumero.setEnabled(false);
            txtBairro.setEnabled(false);
            jftxtCep.setEnabled(false);
            txtCidade.setEnabled(false);
            cmbbxEstado.setEnabled(false);
            jftxtTelRes.setEnabled(false);
            jftxtCelular.setEnabled(false);
            jftxtRg.setEnabled(false);
            txtEmail.setEnabled(false);
            txtFormacao.setEnabled(false);
            txtAreaAtuacao.setEnabled(false);

            jftxtCpf.requestFocus();

            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbbxEstado;
    private javax.swing.JComboBox<String> cmbbxEstadoCivil;
    private javax.swing.JComboBox<String> cmbbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField jftxtCelular;
    private javax.swing.JFormattedTextField jftxtCep;
    private javax.swing.JFormattedTextField jftxtCpf;
    private javax.swing.JFormattedTextField jftxtDataNascto;
    private javax.swing.JFormattedTextField jftxtRg;
    private javax.swing.JFormattedTextField jftxtTelRes;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblCurso1;
    private javax.swing.JTextField txtAreaAtuacao;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
    private DaoInstrutor daoInstrutor=null;
    private Instrutor instrutor=null;
    private Conexao conexao=null;
}
