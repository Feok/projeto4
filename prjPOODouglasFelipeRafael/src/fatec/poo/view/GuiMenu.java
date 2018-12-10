package fatec.poo.view;

public class GuiMenu extends javax.swing.JFrame {

    public GuiMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuCurso = new javax.swing.JMenuItem();
        MenuTurma = new javax.swing.JMenuItem();
        MenuInstrutor = new javax.swing.JMenuItem();
        MenuAluno = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuAlocarInstrutor = new javax.swing.JMenuItem();
        MenuEfetuarMatricula = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Cadastros");
        jMenu2.add(jSeparator1);

        MenuCurso.setText("Curso");
        MenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCursoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCurso);

        MenuTurma.setText("Turma");
        MenuTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuTurmaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuTurma);

        MenuInstrutor.setText("Instrutor");
        MenuInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInstrutorActionPerformed(evt);
            }
        });
        jMenu2.add(MenuInstrutor);

        MenuAluno.setText("Aluno");
        MenuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlunoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAluno);

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSair);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operações");

        MenuAlocarInstrutor.setText("Alocar Instrutor");
        MenuAlocarInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlocarInstrutorActionPerformed(evt);
            }
        });
        jMenu3.add(MenuAlocarInstrutor);

        MenuEfetuarMatricula.setText("Efetuar Matricula");
        MenuEfetuarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEfetuarMatriculaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuEfetuarMatricula);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAlocarInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlocarInstrutorActionPerformed
        new GuiAlocarInstrutor().setVisible(true);
    }//GEN-LAST:event_MenuAlocarInstrutorActionPerformed

    private void MenuEfetuarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEfetuarMatriculaActionPerformed
        new GuiEfetuarMatricula().setVisible(true);
    }//GEN-LAST:event_MenuEfetuarMatriculaActionPerformed

    private void MenuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCursoActionPerformed
      new GuiCurso().setVisible(true);
    }//GEN-LAST:event_MenuCursoActionPerformed

    private void MenuTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuTurmaActionPerformed
      new GuiTurma().setVisible(true);
    }//GEN-LAST:event_MenuTurmaActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
    dispose();
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuInstrutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInstrutorActionPerformed
       new GuiInstrutor().setVisible(true);
    }//GEN-LAST:event_MenuInstrutorActionPerformed

    private void MenuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlunoActionPerformed
       new GuiAluno().setVisible(true);
    }//GEN-LAST:event_MenuAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAlocarInstrutor;
    private javax.swing.JMenuItem MenuAluno;
    private javax.swing.JMenuItem MenuCurso;
    private javax.swing.JMenuItem MenuEfetuarMatricula;
    private javax.swing.JMenuItem MenuInstrutor;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuTurma;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
