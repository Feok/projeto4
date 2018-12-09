package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAPrazo;
import fatec.poo.control.DaoAVista;
import fatec.poo.control.DaoAluno;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoMatricula;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.model.Curso;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GuiEfetuarMatricula extends javax.swing.JFrame {

    public GuiEfetuarMatricula() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jrbtAVista = new javax.swing.JRadioButton();
        jrbtParcelado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        txtQtdeMensaldiades = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCheque = new javax.swing.JTextField();
        txtJuros = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDtPagto = new javax.swing.JFormattedTextField();
        txtDtVencto = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jtxtDtMatricula = new javax.swing.JFormattedTextField();
        cbCurso = new javax.swing.JComboBox<>();
        cbTurma = new javax.swing.JComboBox<>();
        jtxtCpfAluno = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Efetuar Matrícula");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtValor.setEnabled(false);

        jLabel1.setText("Data da matrícula");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));
        jPanel1.setToolTipText("");

        jrbtAVista.setSelected(true);
        jrbtAVista.setText("À Vista");
        jrbtAVista.setEnabled(false);
        jrbtAVista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbtAVistaItemStateChanged(evt);
            }
        });
        jrbtAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtAVistaActionPerformed(evt);
            }
        });

        jrbtParcelado.setText("Parcelado");
        jrbtParcelado.setEnabled(false);
        jrbtParcelado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrbtParceladoItemStateChanged(evt);
            }
        });
        jrbtParcelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtParceladoMouseClicked(evt);
            }
        });

        jLabel7.setText("Agência");

        jLabel8.setText("Qtde. Mensalidades");

        jLabel9.setText("Tx. Juros(%)");

        txtAgencia.setEnabled(false);

        txtQtdeMensaldiades.setEnabled(false);

        jLabel10.setText("No. Cheque");

        txtCheque.setEnabled(false);

        txtJuros.setEnabled(false);

        jLabel11.setText("Data Pagto.");

        jLabel12.setText("Data 1º Vencto.");

        try {
            txtDtPagto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtPagto.setEnabled(false);

        try {
            txtDtVencto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtVencto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbtAVista)
                    .addComponent(jrbtParcelado))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdeMensaldiades, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgencia)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtDtVencto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDtPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbtAVista)
                    .addComponent(jLabel7)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDtPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtQtdeMensaldiades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jrbtParcelado)
                    .addComponent(txtDtVencto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("Curso");

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel3.setText("Turma");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        jLabel4.setText("CPF Aluno");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        try {
            jtxtDtMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar o Curso" }));
        cbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCursoActionPerformed(evt);
            }
        });

        cbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar a Turma" }));
        cbTurma.setEnabled(false);
        cbTurma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTurmaItemStateChanged(evt);
            }
        });
        cbTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTurmaActionPerformed(evt);
            }
        });

        try {
            jtxtCpfAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtxtCpfAluno.setEnabled(false);

        jLabel5.setText("Valor");

        jLabel6.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar)
                .addGap(18, 18, 18)
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtCpfAluno)
                                    .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtDtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtDtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jrbtAVistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbtAVistaItemStateChanged

    }//GEN-LAST:event_jrbtAVistaItemStateChanged

    private void jrbtAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtAVistaActionPerformed
        if (jrbtAVista.isSelected()) {
            txtAgencia.setEnabled(true);
            txtCheque.setEnabled(true);
            txtDtPagto.setEnabled(true);
        } else {
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            txtDtPagto.setEnabled(false);
        }
        if (jrbtParcelado.isSelected()) {
            txtQtdeMensaldiades.setEnabled(true);
            txtJuros.setEnabled(true);
            txtDtVencto.setEnabled(true);
        } else {
            txtQtdeMensaldiades.setEnabled(false);
            txtJuros.setEnabled(false);
            txtDtVencto.setEnabled(false);
        }
    }//GEN-LAST:event_jrbtAVistaActionPerformed

    private void jrbtParceladoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrbtParceladoItemStateChanged
        if (jrbtParcelado.isSelected()) {
            txtQtdeMensaldiades.setEnabled(true);
            txtJuros.setEnabled(true);
            txtDtVencto.setEnabled(true);
        } else {
            txtQtdeMensaldiades.setEnabled(false);
            txtJuros.setEnabled(false);
            txtDtVencto.setEnabled(false);
        }
        if (jrbtAVista.isSelected()) {
            txtAgencia.setEnabled(true);
            txtCheque.setEnabled(true);
            txtDtPagto.setEnabled(true);
        } else {
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            txtDtPagto.setEnabled(false);
        }
    }//GEN-LAST:event_jrbtParceladoItemStateChanged

    private void jrbtParceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtParceladoMouseClicked

    }//GEN-LAST:event_jrbtParceladoMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        aluno = daoAluno.consultar(jtxtCpfAluno.getText().replace(".", "").replace("-", ""));
        curso = daoCurso.consultar((String) cbCurso.getSelectedItem());

        if (Aluno.validarCPF(jtxtCpfAluno.getText())) {
            if (aluno == null) {
                JOptionPane.showMessageDialog(null, "O CPF digitado não é um aluno cadastrado", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            }
            else{
                txtNome.setText(aluno.getNome());
                txtValor.setText(String.valueOf(curso.getValor()));
                matricula = daoMatricula.consultar(jtxtCpfAluno.getText().replace(".", "").replace("-", ""), (String) cbTurma.getSelectedItem(), (String) cbCurso.getSelectedItem());
                if (matricula == null) {
                    jrbtAVista.setEnabled(true);
                    jrbtParcelado.setEnabled(true);
                    if (jrbtAVista.isSelected()) {
                        txtAgencia.setEnabled(true);
                        txtCheque.setEnabled(true);
                        txtDtPagto.setEnabled(true);
                    }
                    else
                    {
                        txtJuros.setEnabled(true);
                        txtQtdeMensaldiades.setEnabled(true);
                        txtDtVencto.setEnabled(true);
                    }
                    btnInserir.setEnabled(true);
                    btnExcluir.setEnabled(false);
                    btnConsultar.setEnabled(false);
                }
                else{
                    avista=null;
                    aprazo=null;
                    avista=daoAVista.consultar(matricula.getData(), matricula.getAluno().getCpf(), matricula.getTurma());
                    aprazo=daoAPrazo.consultar(matricula.getData(), matricula.getAluno().getCpf(), matricula.getTurma());

                    jtxtDtMatricula.setText(matricula.getData());
                    if(aprazo==null)
                    {
                        jrbtAVista.setSelected(true);
                        jrbtParcelado.setSelected(false);
                        txtAgencia.setText(String.valueOf(avista.getAgencia()));
                        txtCheque.setText(String.valueOf(avista.getnCheque()));
                        txtDtPagto.setText(avista.getPreData());

                        txtAgencia.setEnabled(true);
                        txtCheque.setEnabled(true);
                        txtDtPagto.setEnabled(true);
                        jrbtParcelado.setEnabled(false);

                        jtxtDtMatricula.setEnabled(false);
                        cbCurso.setEnabled(false);
                        cbTurma.setEnabled(false);
                        jtxtCpfAluno.setEnabled(false);
                        btnAlterar.setEnabled(true);
                        btnConsultar.setEnabled(false);
                        btnInserir.setEnabled(false);
                        btnExcluir.setEnabled(true);
                    }
                    else {
                        jrbtAVista.setSelected(false);
                        jrbtParcelado.setSelected(true);
                        txtJuros.setText(String.valueOf(aprazo.getTaxaJuros()*100));
                        txtQtdeMensaldiades.setText(String.valueOf(aprazo.getQtdeMensalidade()));
                        txtDtVencto.setText(aprazo.getDtVencimento());

                        txtJuros.setEnabled(true);
                        txtQtdeMensaldiades.setEnabled(true);
                        txtDtVencto.setEnabled(true);
                        jrbtAVista.setEnabled(false);

                        jtxtDtMatricula.setEnabled(false);
                        cbCurso.setEnabled(false);
                        cbTurma.setEnabled(false);
                        jtxtCpfAluno.setEnabled(false);
                        btnAlterar.setEnabled(true);
                        btnConsultar.setEnabled(false);
                        btnInserir.setEnabled(false);
                        btnExcluir.setEnabled(true);
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "O CPF inserido não é válido, por favor digite um CPF válido", "Erro de validação", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        curso = daoCurso.consultar((String) cbCurso.getSelectedItem());
        aluno = daoAluno.consultar(jtxtCpfAluno.getText().replace(".", "").replace("-", ""));
        turma = daoTurma.consultar((String) cbTurma.getSelectedItem(), curso);
        matricula = new Matricula(jtxtDtMatricula.getText().replace("/", ""));
        matricula.setAluno(aluno);
        matricula.setTurma(turma);
        turma.addMatricula(matricula);

        if (jrbtAVista.isSelected()) {
            avista = new AVista();
            avista.setAgencia(Integer.parseInt(txtAgencia.getText()));
            avista.setnCheque(Integer.parseInt(txtCheque.getText()));
            avista.setPreData(txtDtPagto.getText().replace("/", ""));
            avista.setValor(parseDouble(txtValor.getText()));
            avista.setMatricula(matricula);
            daoAVista.inserir(avista);
        } else {
            aprazo = new APrazo();
            aprazo.setDtVencimento(txtDtVencto.getText().replace("/",""));
            aprazo.setTaxaJuros(parseDouble(txtJuros.getText())/100);
            aprazo.setValor(parseDouble(txtValor.getText()));
            aprazo.setQtdeMensalidade(parseInt(txtQtdeMensaldiades.getText()));
            aprazo.setMatricula(matricula);
            daoAPrazo.inserir(aprazo);
        }
        //System.out.println("SIGLA " + matricula.getTurma().getSiglaTurma());
        daoMatricula.inserir(matricula);
        jtxtDtMatricula.setText("");
        txtAgencia.setText("");
        txtCheque.setText("");
        txtDtPagto.setText("");
        txtJuros.setText("");
        txtQtdeMensaldiades.setText("");
        txtDtVencto.setText("");
        txtValor.setText("");
        txtNome.setText("");
        cbCurso.setSelectedIndex(0);
        cbTurma.setSelectedIndex(0);
        jtxtCpfAluno.setText("");

        jtxtDtMatricula.setEnabled(true);
        txtAgencia.setEnabled(false);
        txtCheque.setEnabled(false);
        txtDtPagto.setEnabled(false);
        txtJuros.setEnabled(false);
        txtQtdeMensaldiades.setEnabled(false);
        txtDtVencto.setEnabled(false);
        jtxtCpfAluno.setEnabled(false);
        jrbtAVista.setEnabled(false);
        jrbtParcelado.setEnabled(false);
        cbCurso.requestFocus();
        jrbtAVista.setSelected(true);

        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnInserir.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma alteração?")== 0){//Sim

            if(aprazo == null)
            {
                avista.setValor(Double.parseDouble(txtValor.getText()));
                avista.setAgencia(Integer.parseInt(txtAgencia.getText()));
                avista.setnCheque(Integer.parseInt(txtCheque.getText()));
                avista.setPreData(txtDtPagto.getText().replace("/", ""));
                daoAVista.alterar(avista);
            }
            else
            {
                aprazo.setValor(Double.parseDouble(txtValor.getText()));
                aprazo.setTaxaJuros(Double.parseDouble(txtJuros.getText())/100);
                aprazo.setQtdeMensalidade(Integer.parseInt(txtQtdeMensaldiades.getText()));
                aprazo.setDtVencimento(txtDtVencto.getText().replace("/", ""));
                daoAPrazo.alterar(aprazo);

            }

        }

        jtxtDtMatricula.setText("");
        txtAgencia.setText("");
        txtCheque.setText("");
        txtDtPagto.setText("");
        txtJuros.setText("");
        txtQtdeMensaldiades.setText("");
        txtDtVencto.setText("");
        txtValor.setText("");
        txtNome.setText("");
        cbCurso.setSelectedIndex(0);
        cbCurso.setEnabled(true);
        cbTurma.setSelectedIndex(0);
        cbTurma.setEnabled(false);
        jtxtCpfAluno.setText("");

        jtxtDtMatricula.setEnabled(true);
        txtAgencia.setEnabled(false);
        txtCheque.setEnabled(false);
        txtDtPagto.setEnabled(false);
        txtJuros.setEnabled(false);
        txtQtdeMensaldiades.setEnabled(false);
        txtDtVencto.setEnabled(false);
        jtxtCpfAluno.setEnabled(false);
        jrbtAVista.setEnabled(false);
        jrbtParcelado.setEnabled(false);
        jtxtDtMatricula.requestFocus();

        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnInserir.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma exclusão?") == 0){

            if(aprazo == null){
                daoAVista.excluir(avista);
            }
            else{
                daoAPrazo.excluir(aprazo);
            }
            daoMatricula.excluir(matricula);

            jtxtDtMatricula.setText("");
            txtAgencia.setText("");
            txtCheque.setText("");
            txtDtPagto.setText("");
            txtJuros.setText("");
            txtQtdeMensaldiades.setText("");
            txtDtVencto.setText("");
            txtValor.setText("");
            txtNome.setText("");
            cbCurso.setSelectedIndex(0);
            cbCurso.setEnabled(true);
            cbTurma.setSelectedIndex(0);
            cbTurma.setEnabled(false);
            jtxtCpfAluno.setText("");

            jtxtDtMatricula.setEnabled(true);
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            txtDtPagto.setEnabled(false);
            txtJuros.setEnabled(false);
            txtQtdeMensaldiades.setEnabled(false);
            txtDtVencto.setEnabled(false);
            jtxtCpfAluno.setEnabled(false);
            jrbtAVista.setEnabled(false);
            jrbtParcelado.setEnabled(false);
            jtxtDtMatricula.requestFocus();
            jrbtAVista.setSelected(true);

            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnExcluir.setEnabled(false);

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCursoActionPerformed
        cbTurma.removeAllItems();
        cbTurma.addItem("Selecione a Turma");
        ArrayList<String> turmas = daoTurma.listarTurmas((String) cbCurso.getSelectedItem());

        for (int x = 0; x < turmas.size(); x++) {
            cbTurma.addItem(turmas.get(x));
        }
        cbTurma.setEnabled(true);
    }//GEN-LAST:event_cbCursoActionPerformed

    private void cbTurmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTurmaItemStateChanged
        if (cbTurma.getSelectedIndex() > 0 && cbCurso.getSelectedIndex() > 0) {
            //System.out.println("Index turma: " + cbTurma.getSelectedIndex() + "Index Curso: " + cbCurso.getSelectedIndex());
            jtxtCpfAluno.setEnabled(true);
        }
        else{
            jtxtCpfAluno.setEnabled(false);
        }
    }//GEN-LAST:event_cbTurmaItemStateChanged

    private void cbTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTurmaActionPerformed

    }//GEN-LAST:event_cbTurmaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("root", "root");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoAluno = new DaoAluno(conexao.conectar());
        daoTurma = new DaoTurma(conexao.conectar());
        daoCurso = new DaoCurso(conexao.conectar());
        daoAVista = new DaoAVista(conexao.conectar());
        daoAPrazo = new DaoAPrazo(conexao.conectar());
        daoMatricula = new DaoMatricula(conexao.conectar());

        ArrayList<String> cursos = daoCurso.listarSiglas();

        for (int x = 0; x < cursos.size(); x++) {
            cbCurso.addItem(cursos.get(x));
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(GuiEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEfetuarMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEfetuarMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbtAVista;
    private javax.swing.JRadioButton jrbtParcelado;
    private javax.swing.JFormattedTextField jtxtCpfAluno;
    private javax.swing.JFormattedTextField jtxtDtMatricula;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JFormattedTextField txtDtPagto;
    private javax.swing.JFormattedTextField txtDtVencto;
    private javax.swing.JTextField txtJuros;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdeMensaldiades;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private APrazo aprazo = null;
    private AVista avista = null;
    private Aluno aluno = null;
    private Turma turma = null;
    private Curso curso = null;
    private Matricula matricula = null;
    private DaoAVista daoAVista = null;
    private DaoAPrazo daoAPrazo = null;
    private DaoAluno daoAluno = null;
    private DaoMatricula daoMatricula = null;
    private DaoTurma daoTurma = null;
    private Conexao conexao = null;
    private DaoCurso daoCurso = null;
}
