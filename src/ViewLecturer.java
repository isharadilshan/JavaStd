
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Lecturer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
public class ViewLecturer extends javax.swing.JPanel {
    
    AdminPanel adminPanel;
    /**
     * Creates new form ViewLecturer
     * @param adminPanel
     */
    public ViewLecturer(AdminPanel adminPanel) {
        initComponents();
        this.adminPanel=adminPanel;
        
    }

    ViewLecturer() {
        
    }

//    ViewLecturer() {
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

        jLabelId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabelDoB = new javax.swing.JLabel();
        jTextDoB = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jTextContact = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jButtonRegister = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelId.setText("Id Number >>>");

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setText("Name :-");

        jLabelDoB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDoB.setText("Date of Birth :-");

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAddress.setText("Address :-");

        jLabelContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContact.setText("Contact Number :-");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setText("Email :-");

        jButtonRegister.setBackground(new java.awt.Color(0, 153, 204));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonView.setBackground(new java.awt.Color(153, 153, 255));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButtonRegister)
                        .addGap(64, 64, 64)
                        .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        RegLecturer regLec=new RegLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(regLec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        regLec.setVisible(true);    
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        String id=jTextId.getText();
        try {
            Lecturer lec = LecturerController.searchLecturer(id);
            if(lec==null){
                JOptionPane.showMessageDialog(adminPanel, "Not a Registered Lecturer");
            }
            jTextName.setText(lec.getName());
            jTextDoB.setText(lec.getDoB());
            jTextAddress.setText(lec.getAddress());
            jTextContact.setText(lec.getContact());
            jTextEmail.setText(lec.getEmail());
            
        } catch (ClassNotFoundException | SQLException ex) {
            ExceptionHandle.showError(ex);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        UpdateLecturer updateLec=new UpdateLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(updateLec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        updateLec.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextDoB;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
