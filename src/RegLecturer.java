
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lecturer;


public class RegLecturer extends javax.swing.JPanel {

    AdminPanel adminPanel;
    String DoB;
    String RegDate;
    /**
     * Creates new form RegLecturer
     */
    public RegLecturer(AdminPanel adminPanel) {
        initComponents();
        this.adminPanel=adminPanel;
        StarName.setVisible(false);
        StarAddress.setVisible(false);
        StarContact.setVisible(false);
        StarEmail.setVisible(false);
    }

//    RegLecturer() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    RegLecturer() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonRegister = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabelDoB = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jTextContact = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        StarName = new javax.swing.JLabel();
        StarAddress = new javax.swing.JLabel();
        StarContact = new javax.swing.JLabel();
        StarEmail = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jPickerDoB = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 0, 243, 96));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setText("Name :-");
        jPanel1.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 187, 178, 38));
        jPanel1.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 187, 350, 38));

        jLabelDoB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDoB.setText("Date of Birth :-");
        jPanel1.add(jLabelDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 252, 178, 42));

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAddress.setText("Address :-");
        jPanel1.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 322, 178, 39));
        jPanel1.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 323, 350, 40));

        jLabelContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContact.setText("Contact Number :-");
        jPanel1.add(jLabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 388, 178, 43));
        jPanel1.add(jTextContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 390, 350, 43));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setText("Email :-");
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 456, 178, 40));
        jPanel1.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 458, 350, 40));

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.png"))); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 582, 171, 70));

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear.png"))); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 582, 163, 70));

        jButtonView.setBackground(new java.awt.Color(0, 153, 204));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 244, 96));

        StarName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StarName.setForeground(new java.awt.Color(204, 0, 0));
        StarName.setText("*");
        jPanel1.add(StarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 193, -1, -1));

        StarAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StarAddress.setForeground(new java.awt.Color(204, 0, 0));
        StarAddress.setText("*");
        jPanel1.add(StarAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 330, -1, -1));

        StarContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StarContact.setForeground(new java.awt.Color(204, 0, 0));
        StarContact.setText("*");
        jPanel1.add(StarContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 398, -1, -1));

        StarEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StarEmail.setForeground(new java.awt.Color(204, 0, 0));
        StarEmail.setText("*");
        jPanel1.add(StarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 465, -1, -1));

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 0, 244, 96));

        jPickerDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerDoBActionPerformed(evt);
            }
        });
        jPanel1.add(jPickerDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed

        try {
            String id=IdGenerator.getNewId("Lecturer", "Lecturer_Id", "LC");
            Lecturer lec = new Lecturer(id,jTextName.getText(),DoB,jTextAddress.getText(),jTextEmail.getText(),jTextContact.getText());
            LecturerController.addLecturer(lec);
            RegLecturer regLec=new RegLecturer(adminPanel);
            adminPanel.masterPanel.removeAll();
            adminPanel.masterPanel.add(regLec);
            adminPanel.masterPanel.repaint();
            adminPanel.masterPanel.revalidate();
            regLec.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Please Input a message box here");
            Logger.getLogger(RegLecturer.class.getName()).log(Level.SEVERE, null, ex);//how to set up jOptionPane in java
        }
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextName.setText("");
        jTextAddress.setText("");
        jTextContact.setText("");
        jTextEmail.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        ViewLecturer viewlec=new ViewLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(viewlec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        viewlec.setVisible(true);
        
     
        
   
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
      
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        UpdateLecturer updateLec=new UpdateLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(updateLec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        updateLec.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jPickerDoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPickerDoBActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        jPickerDoB.setFormats(formatter);
        DoB = formatter.format(jPickerDoB.getDate());
    }//GEN-LAST:event_jPickerDoBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StarAddress;
    private javax.swing.JLabel StarContact;
    private javax.swing.JLabel StarEmail;
    private javax.swing.JLabel StarName;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker jPickerDoB;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
