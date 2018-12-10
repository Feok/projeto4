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
        rdbtnAVista = new javax.swing.JRadioButton();
        rdbtnParcelado = new javax.swing.JRadioButton();
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
        jftxtDataPagto = new javax.swing.JFormattedTextField();
        jftxtData1Vencto = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        jftxtDataMatricula = new javax.swing.JFormattedTextField();
        cmbbxCurso = new javax.swing.JComboBox<>();
        cmbbxTurma = new javax.swing.JComboBox<>();
        jftxtCpfAluno = new javax.swing.JFormattedTextField();
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

        rdbtnAVista.setSelected(true);
        rdbtnAVista.setText("À Vista");
        rdbtnAVista.setEnabled(false);
        rdbtnAVista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbtnAVistaItemStateChanged(evt);
            }
        });
        rdbtnAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnAVistaActionPerformed(evt);
            }
        });

        rdbtnParcelado.setText("Parcelado");
        rdbtnParcelado.setEnabled(false);
        rdbtnParcelado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdbtnParceladoItemStateChanged(evt);
            }
        });
        rdbtnParcelado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbtnParceladoMouseClicked(evt);
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
            jftxtDataPagto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtDataPagto.setEnabled(false);

        try {
            jftxtData1Vencto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtData1Vencto.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbtnAVista)
                    .addComponent(rdbtnParcelado))
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
                        .addComponent(jftxtData1Vencto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftxtDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnAVista)
                    .addComponent(jLabel7)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jftxtDataPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtQtdeMensaldiades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(rdbtnParcelado)
                    .addComponent(jftxtData1Vencto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            jftxtDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbbxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar o Curso" }));
        cmbbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxCursoActionPerformed(evt);
            }
        });

        cmbbxTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar a Turma" }));
        cmbbxTurma.setEnabled(false);
        cmbbxTurma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbxTurmaItemStateChanged(evt);
            }
        });
        cmbbxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxTurmaActionPerformed(evt);
            }
        });

        try {
            jftxtCpfAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftxtCpfAluno.setEnabled(false);

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
                                    .addComponent(jftxtCpfAluno)
                                    .addComponent(cmbbxTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jftxtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(cmbbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jftxtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cmbbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jftxtCpfAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void rdbtnAVistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbtnAVistaItemStateChanged

    }//GEN-LAST:event_rdbtnAVistaItemStateChanged

    private void rdbtnAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnAVistaActionPerformed
        if (rdbtnAVista.isSelected()) {
            txtAgencia.setEnabled(true);
            txtCheque.setEnabled(true);
            jftxtDataPagto.setEnabled(true);
            rdbtnParcelado.setSelected(false);
        } else {
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            jftxtDataPagto.setEnabled(false);
        }
        if (rdbtnParcelado.isSelected()) {
            txtQtdeMensaldiades.setEnabled(true);
            txtJuros.setEnabled(true);
            jftxtData1Vencto.setEnabled(true);
        } else {
            txtQtdeMensaldiades.setEnabled(false);
            txtJuros.setEnabled(false);
            jftxtData1Vencto.setEnabled(false);
        }
    }//GEN-LAST:event_rdbtnAVistaActionPerformed

    private void rdbtnParceladoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdbtnParceladoItemStateChanged
        if (rdbtnParcelado.isSelected()) {
            txtQtdeMensaldiades.setEnabled(true);
            txtJuros.setEnabled(true);
            jftxtData1Vencto.setEnabled(true);
            rdbtnAVista.setSelected(false);
        } else {
            txtQtdeMensaldiades.setEnabled(false);
            txtJuros.setEnabled(false);
            jftxtData1Vencto.setEnabled(false);
        }
        if (rdbtnAVista.isSelected()) {
            txtAgencia.setEnabled(true);
            txtCheque.setEnabled(true);
            jftxtDataPagto.setEnabled(true);
        } else {
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            jftxtDataPagto.setEnabled(false);
        }
    }//GEN-LAST:event_rdbtnParceladoItemStateChanged

    private void rdbtnParceladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbtnParceladoMouseClicked

    }//GEN-LAST:event_rdbtnParceladoMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        aluno = null;
        aluno = daoAluno.consultar(jftxtCpfAluno.getText().replace(".", "").replace("-", ""));
        curso = daoCurso.consultar((String) cmbbxCurso.getSelectedItem());

        if (Aluno.validarCPF(jftxtCpfAluno.getText())) {
            if (aluno == null) {
                JOptionPane.showMessageDialog(null, "O CPF digitado não é um aluno cadastrado", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            }
            else{
                txtNome.setText(aluno.getNome());
                txtValor.setText(String.valueOf(curso.getValor()));
                matricula = daoMatricula.consultar(jftxtCpfAluno.getText().replace(".", "").replace("-", ""), (String) cmbbxTurma.getSelectedItem(), (String) cmbbxCurso.getSelectedItem());
                if (matricula == null) {
                    rdbtnAVista.setEnabled(true);
                    rdbtnParcelado.setEnabled(true);
                    if (rdbtnAVista.isSelected()) {
                        txtAgencia.setEnabled(true);
                        txtCheque.setEnabled(true);
                        jftxtDataPagto.setEnabled(true);
                    }
                    else
                    {
                        txtJuros.setEnabled(true);
                        txtQtdeMensaldiades.setEnabled(true);
                        jftxtData1Vencto.setEnabled(true);
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

                    jftxtDataMatricula.setText(matricula.getData());
                    if(aprazo==null)
                    {
                        txtAgencia.setText(String.valueOf(avista.getAgencia()));
                        txtCheque.setText(String.valueOf(avista.getnCheque()));
                        jftxtDataPagto.setText(avista.getPreData());

                        txtAgencia.setEnabled(true);
                        txtCheque.setEnabled(true);
                        jftxtDataPagto.setEnabled(true);
                        rdbtnParcelado.setEnabled(false);

                        jftxtDataMatricula.setEnabled(false);
                        cmbbxCurso.setEnabled(false);
                        cmbbxTurma.setEnabled(false);
                        jftxtCpfAluno.setEnabled(false);
                        btnAlterar.setEnabled(true);
                        btnConsultar.setEnabled(false);
                        btnInserir.setEnabled(false);
                        btnExcluir.setEnabled(true);
                    }
                    else {
                        rdbtnAVista.setSelected(false);
                        rdbtnParcelado.setSelected(true);
                        txtJuros.setText(String.valueOf(aprazo.getTaxaJuros()*100));
                        txtQtdeMensaldiades.setText(String.valueOf(aprazo.getQtdeMensalidade()));
                        jftxtData1Vencto.setText(aprazo.getDtVencimento());

                        txtJuros.setEnabled(true);
                        txtQtdeMensaldiades.setEnabled(true);
                        jftxtData1Vencto.setEnabled(true);
                        rdbtnAVista.setEnabled(false);

                        jftxtDataMatricula.setEnabled(false);
                        cmbbxCurso.setEnabled(false);
                        cmbbxTurma.setEnabled(false);
                        jftxtCpfAluno.setEnabled(false);
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
        curso = daoCurso.consultar((String) cmbbxCurso.getSelectedItem());
        aluno = daoAluno.consultar(jftxtCpfAluno.getText().replace(".", "").replace("-", ""));
        turma = daoTurma.consultar((String) cmbbxTurma.getSelectedItem(), curso);
        matricula = new Matricula(jftxtDataMatricula.getText().replace("/", ""));
        matricula.setAluno(aluno);
        matricula.setTurma(turma);
        turma.addMatricula(matricula);

        if (rdbtnAVista.isSelected()) {
            avista = new AVista();
            avista.setAgencia(Integer.parseInt(txtAgencia.getText()));
            avista.setnCheque(Integer.parseInt(txtCheque.getText()));
            avista.setPreData(jftxtDataPagto.getText().replace("/", ""));
            avista.setValor(parseDouble(txtValor.getText()));
            avista.setMatricula(matricula);
            daoAVista.inserir(avista);
        } else {
            aprazo = new APrazo();
            aprazo.setDtVencimento(jftxtData1Vencto.getText().replace("/",""));
            aprazo.setTaxaJuros(parseDouble(txtJuros.getText())/100);
            aprazo.setValor(parseDouble(txtValor.getText()));
            aprazo.setQtdeMensalidade(parseInt(txtQtdeMensaldiades.getText()));
            aprazo.setMatricula(matricula);
            daoAPrazo.inserir(aprazo);
        }
        
        daoMatricula.inserir(matricula);
        jftxtDataMatricula.setText("");
        txtAgencia.setText("");
        txtCheque.setText("");
        jftxtDataPagto.setText("");
        txtJuros.setText("");
        txtQtdeMensaldiades.setText("");
        jftxtData1Vencto.setText("");
        txtValor.setText("");
        txtNome.setText("");
        cmbbxCurso.setSelectedIndex(0);
        cmbbxTurma.setSelectedIndex(0);
        jftxtCpfAluno.setText("");

        jftxtDataMatricula.setEnabled(true);
        txtAgencia.setEnabled(false);
        txtCheque.setEnabled(false);
        jftxtDataPagto.setEnabled(false);
        txtJuros.setEnabled(false);
        txtQtdeMensaldiades.setEnabled(false);
        jftxtData1Vencto.setEnabled(false);
        jftxtCpfAluno.setEnabled(false);
        rdbtnAVista.setEnabled(false);
        rdbtnParcelado.setEnabled(false);
        cmbbxCurso.requestFocus();
        rdbtnAVista.setSelected(true);

        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnInserir.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma alteração?")== 0){

            if(aprazo == null)
            {
                avista.setValor(Double.parseDouble(txtValor.getText()));
                avista.setAgencia(Integer.parseInt(txtAgencia.getText()));
                avista.setnCheque(Integer.parseInt(txtCheque.getText()));
                avista.setPreData(jftxtDataPagto.getText().replace("/", ""));
                daoAVista.alterar(avista);
            }
            else
            {
                aprazo.setValor(Double.parseDouble(txtValor.getText()));
                aprazo.setTaxaJuros(Double.parseDouble(txtJuros.getText())/100);
                aprazo.setQtdeMensalidade(Integer.parseInt(txtQtdeMensaldiades.getText()));
                aprazo.setDtVencimento(jftxtData1Vencto.getText().replace("/", ""));
                daoAPrazo.alterar(aprazo);

            }

        }

        jftxtDataMatricula.setText("");
        txtAgencia.setText("");
        txtCheque.setText("");
        jftxtDataPagto.setText("");
        txtJuros.setText("");
        txtQtdeMensaldiades.setText("");
        jftxtData1Vencto.setText("");
        txtValor.setText("");
        txtNome.setText("");
        cmbbxCurso.setSelectedIndex(0);
        cmbbxCurso.setEnabled(true);
        cmbbxTurma.setSelectedIndex(0);
        cmbbxTurma.setEnabled(false);
        jftxtCpfAluno.setText("");

        jftxtDataMatricula.setEnabled(true);
        txtAgencia.setEnabled(false);
        txtCheque.setEnabled(false);
        jftxtDataPagto.setEnabled(false);
        txtJuros.setEnabled(false);
        txtQtdeMensaldiades.setEnabled(false);
        jftxtData1Vencto.setEnabled(false);
        jftxtCpfAluno.setEnabled(false);
        rdbtnAVista.setEnabled(false);
        rdbtnParcelado.setEnabled(false);
        jftxtDataMatricula.requestFocus();

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

            jftxtDataMatricula.setText("");
            txtAgencia.setText("");
            txtCheque.setText("");
            jftxtDataPagto.setText("");
            txtJuros.setText("");
            txtQtdeMensaldiades.setText("");
            jftxtData1Vencto.setText("");
            txtValor.setText("");
            txtNome.setText("");
            cmbbxCurso.setSelectedIndex(0);
            cmbbxCurso.setEnabled(true);
            cmbbxTurma.setSelectedIndex(0);
            cmbbxTurma.setEnabled(false);
            jftxtCpfAluno.setText("");

            jftxtDataMatricula.setEnabled(true);
            txtAgencia.setEnabled(false);
            txtCheque.setEnabled(false);
            jftxtDataPagto.setEnabled(false);
            txtJuros.setEnabled(false);
            txtQtdeMensaldiades.setEnabled(false);
            jftxtData1Vencto.setEnabled(false);
            jftxtCpfAluno.setEnabled(false);
            rdbtnAVista.setEnabled(false);
            rdbtnParcelado.setEnabled(false);
            jftxtDataMatricula.requestFocus();
            rdbtnAVista.setSelected(true);

            btnConsultar.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmbbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxCursoActionPerformed
        cmbbxTurma.removeAllItems();
        cmbbxTurma.addItem("Selecione a Turma");
        ArrayList<String> turmas = daoTurma.listarTurmas((String) cmbbxCurso.getSelectedItem());

        for (int x = 0; x < turmas.size(); x++) {
            cmbbxTurma.addItem(turmas.get(x));
        }
        cmbbxTurma.setEnabled(true);
    }//GEN-LAST:event_cmbbxCursoActionPerformed

    private void cmbbxTurmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbxTurmaItemStateChanged
        if (cmbbxTurma.getSelectedIndex() > 0 && cmbbxCurso.getSelectedIndex() > 0) {
            jftxtCpfAluno.setEnabled(true);
        }
        else{
            jftxtCpfAluno.setEnabled(false);
        }
    }//GEN-LAST:event_cmbbxTurmaItemStateChanged

    private void cmbbxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxTurmaActionPerformed

    }//GEN-LAST:event_cmbbxTurmaActionPerformed

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
            cmbbxCurso.addItem(cursos.get(x));
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
    private javax.swing.JComboBox<String> cmbbxCurso;
    private javax.swing.JComboBox<String> cmbbxTurma;
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
    private javax.swing.JFormattedTextField jftxtCpfAluno;
    private javax.swing.JFormattedTextField jftxtData1Vencto;
    private javax.swing.JFormattedTextField jftxtDataMatricula;
    private javax.swing.JFormattedTextField jftxtDataPagto;
    private javax.swing.JRadioButton rdbtnAVista;
    private javax.swing.JRadioButton rdbtnParcelado;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtCheque;
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
