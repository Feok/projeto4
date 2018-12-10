package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Turma;
import java.util.ArrayList;

public class GuiAlocarInstrutor extends javax.swing.JFrame {

    public GuiAlocarInstrutor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbCurso = new javax.swing.JLabel();
        jlbTurma = new javax.swing.JLabel();
        jlbInstrutor = new javax.swing.JLabel();
        jlbSituacao = new javax.swing.JLabel();
        cmbbxCurso = new javax.swing.JComboBox<>();
        cmbbxTurma = new javax.swing.JComboBox<>();
        cmbbxInstrutor = new javax.swing.JComboBox<>();
        txtSituacao = new javax.swing.JTextField();
        btnAlocar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alocar Instrutor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlbCurso.setText("Curso");

        jlbTurma.setText("Turma");

        jlbInstrutor.setText("Instrutor");

        jlbSituacao.setText("Situação");

        cmbbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxCursoActionPerformed(evt);
            }
        });

        cmbbxTurma.setEnabled(false);
        cmbbxTurma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbxTurmaItemStateChanged(evt);
            }
        });

        cmbbxInstrutor.setEnabled(false);

        txtSituacao.setEnabled(false);

        btnAlocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAlocar.setText("Alocar");
        btnAlocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarActionPerformed(evt);
            }
        });

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbTurma, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbInstrutor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbSituacao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAlocar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLiberar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCurso)
                    .addComponent(cmbbxCurso))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTurma)
                    .addComponent(cmbbxTurma))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSituacao)
                            .addComponent(jlbSituacao))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbInstrutor)
                            .addComponent(cmbbxInstrutor))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlocar)
                            .addComponent(btnSair)
                            .addComponent(btnLiberar))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxCursoActionPerformed
        cmbbxTurma.removeAllItems();
        cmbbxTurma.addItem("Selecione a Turma");
        ArrayList<String> turmas = daoTurma.listarTurmas((String) cmbbxCurso.getSelectedItem());

        for (int x=0; x<turmas.size(); x++){
            cmbbxTurma.addItem(turmas.get(x));
        }
        cmbbxTurma.setEnabled(true);
    }//GEN-LAST:event_cmbbxCursoActionPerformed

    private void cmbbxTurmaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbxTurmaItemStateChanged
        if(cmbbxCurso.getSelectedIndex() > 0 && cmbbxTurma.getSelectedIndex() > 0){
            turma=null;
            curso=null;
            curso = daoCurso.consultar(String.valueOf(cmbbxCurso.getSelectedItem()));
            turma = daoTurma.consultar((String) cmbbxTurma.getSelectedItem(), curso);

            if(turma.getInstrutor() != null){
                cmbbxInstrutor.setSelectedItem((String) turma.getInstrutor().getNome());
                cmbbxInstrutor.setEnabled(false);
                cmbbxTurma.setEnabled(false);
                cmbbxCurso.setEnabled(true);
                btnAlocar.setEnabled(false);
                btnLiberar.setEnabled(true);
                txtSituacao.setText("Alocado");
            }else{
                cmbbxInstrutor.setEnabled(true);
                cmbbxInstrutor.setSelectedIndex(0);
                txtSituacao.setText("");
                btnAlocar.setEnabled(true);
                btnLiberar.setEnabled(false);

            }
        }
    }//GEN-LAST:event_cmbbxTurmaItemStateChanged

    private void btnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarActionPerformed
        curso = daoCurso.consultar((String) cmbbxCurso.getSelectedItem());
        turma = daoTurma.consultar((String) cmbbxTurma.getSelectedItem(), curso);
        cpfInstrutor = daoInstrutor.consultarCpf((String) cmbbxInstrutor.getSelectedItem());
        instrutor = daoInstrutor.consultar(cpfInstrutor.getCpf());

        turma.setInstrutor(instrutor);
        instrutor.addTurma(turma);
        daoTurma.alocarInstrutor(instrutor, turma);

        txtSituacao.setText("Alocado");

        btnAlocar.setEnabled(false);
        btnLiberar.setEnabled(true);

        cmbbxTurma.setEnabled(false);
        cmbbxInstrutor.setEnabled(false);

    }//GEN-LAST:event_btnAlocarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        curso = daoCurso.consultar((String) cmbbxCurso.getSelectedItem());
        turma = daoTurma.consultar((String) cmbbxTurma.getSelectedItem(), curso);

        daoTurma.liberarInstrutor(turma);
        txtSituacao.setText("Liberado");
        btnAlocar.setEnabled(true);
        btnLiberar.setEnabled(false);

        cmbbxTurma.setEnabled(false);
        cmbbxCurso.setEnabled(true);
        cmbbxInstrutor.setEnabled(true);

    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("root","root");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@localhost:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
        daoTurma = new DaoTurma(conexao.conectar());
        daoInstrutor = new DaoInstrutor(conexao.conectar());
        
        ArrayList<String> cursos = daoCurso.listarSiglas();
        ArrayList<String> instrutores = daoInstrutor.listarInstrutores();
        cmbbxCurso.addItem("Selecione aqui");
        for (int x=0; x<cursos.size(); x++){
           cmbbxCurso.addItem(cursos.get(x)); 
        }
        cmbbxInstrutor.addItem("Selecione aqui");
        for (int x=0; x<instrutores.size(); x++){
           cmbbxInstrutor.addItem(instrutores.get(x)); 
        }
        cmbbxTurma.setEnabled(false);
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
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAlocarInstrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAlocarInstrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbbxCurso;
    private javax.swing.JComboBox<String> cmbbxInstrutor;
    private javax.swing.JComboBox<String> cmbbxTurma;
    private javax.swing.JLabel jlbCurso;
    private javax.swing.JLabel jlbInstrutor;
    private javax.swing.JLabel jlbSituacao;
    private javax.swing.JLabel jlbTurma;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables
    private Curso curso = null;
    private Turma turma = null;
    private Instrutor instrutor = null;
    private DaoCurso daoCurso = null;
    private DaoTurma daoTurma = null;
    private DaoInstrutor daoInstrutor = null;
    private Conexao conexao = null;
    private Instrutor cpfInstrutor = null;
}
