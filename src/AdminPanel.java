
public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPostgraduate = new javax.swing.JButton();
        jButtonLecturer = new javax.swing.JButton();
        jButtonUndergraduate = new javax.swing.JButton();
        masterPanel = new javax.swing.JPanel();
        jButtonInstructor = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonEnrollment = new javax.swing.JButton();
        jButtonEvaluation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1107, 597));

        jButtonPostgraduate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPostgraduate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Student.png"))); // NOI18N
        jButtonPostgraduate.setText("Postgraduate");
        jButtonPostgraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPostgraduateActionPerformed(evt);
            }
        });

        jButtonLecturer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lecturer.png"))); // NOI18N
        jButtonLecturer.setText("Lecturer");
        jButtonLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLecturerActionPerformed(evt);
            }
        });

        jButtonUndergraduate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUndergraduate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/School.png"))); // NOI18N
        jButtonUndergraduate.setText("Undergraduate");
        jButtonUndergraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUndergraduateActionPerformed(evt);
            }
        });

        masterPanel.setLayout(new java.awt.BorderLayout());

        jButtonInstructor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonInstructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Instructor.png"))); // NOI18N
        jButtonInstructor.setText("Instructor");
        jButtonInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstructorActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonEnrollment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEnrollment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Enrollment.png"))); // NOI18N
        jButtonEnrollment.setText("Enrollment");
        jButtonEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnrollmentActionPerformed(evt);
            }
        });

        jButtonEvaluation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEvaluation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Evaluation_1.png"))); // NOI18N
        jButtonEvaluation.setText("Evaluation");
        jButtonEvaluation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvaluationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonUndergraduate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPostgraduate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLecturer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInstructor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEvaluation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(masterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButtonUndergraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonPostgraduate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButtonEvaluation, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(masterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPostgraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPostgraduateActionPerformed
        RegPostgraduate post=new RegPostgraduate(this);
        masterPanel.removeAll();
        masterPanel.add(post);
        masterPanel.repaint();
        masterPanel.validate();
        post.setVisible(true);
    }//GEN-LAST:event_jButtonPostgraduateActionPerformed

    private void jButtonLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLecturerActionPerformed
        RegLecturer regLec=new RegLecturer(this);
        masterPanel.removeAll();
        masterPanel.add(regLec);
        masterPanel.repaint();
        masterPanel.validate();
        regLec.setVisible(true);

        
    }//GEN-LAST:event_jButtonLecturerActionPerformed

    private void jButtonUndergraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUndergraduateActionPerformed
        RegUndergraduate stu=new RegUndergraduate(this);
        masterPanel.removeAll();
        masterPanel.add(stu);
        masterPanel.repaint();
        masterPanel.validate();
        stu.setVisible(true);
        
        
    }//GEN-LAST:event_jButtonUndergraduateActionPerformed

    private void jButtonInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstructorActionPerformed
        RegInstructor ins=new RegInstructor(this);
        masterPanel.removeAll();
        masterPanel.add(ins);
        masterPanel.repaint();
        masterPanel.validate();
        ins.setVisible(true);
    }//GEN-LAST:event_jButtonInstructorActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnrollmentActionPerformed
        PostgraduateEvaluation postge=new PostgraduateEvaluation(this);
        masterPanel.removeAll();
        masterPanel.add(postge);
        masterPanel.repaint();
        masterPanel.validate();
        postge.setVisible(true);
    }//GEN-LAST:event_jButtonEnrollmentActionPerformed

    private void jButtonEvaluationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvaluationActionPerformed
//        ViewUndergraduate stu=new ViewUndergraduate();
//        masterPanel.removeAll();
//        masterPanel.add(stu);
//        masterPanel.repaint();
//        masterPanel.validate();
//        stu.setVisible(true);
    }//GEN-LAST:event_jButtonEvaluationActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               AdminPanel a= new AdminPanel();
                       a.setVisible(true);
                      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnrollment;
    private javax.swing.JButton jButtonEvaluation;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonInstructor;
    private javax.swing.JButton jButtonLecturer;
    private javax.swing.JButton jButtonPostgraduate;
    private javax.swing.JButton jButtonUndergraduate;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel masterPanel;
    // End of variables declaration//GEN-END:variables
}
