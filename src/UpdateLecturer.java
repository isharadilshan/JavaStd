
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class UpdateLecturer extends javax.swing.JPanel {
    AdminPanel adminPanel;
    String DoB;
    /**
     * Creates new form UpdateLecturer
     * @param adminPanel
     */
    public UpdateLecturer(AdminPanel adminPanel) {
        initComponents();
        this.adminPanel=adminPanel;
    }

    UpdateLecturer(){
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUpdate = new javax.swing.JPanel();
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
        jButtonUpdate1 = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jPickerDoB = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUpdate.setBackground(new java.awt.Color(153, 153, 255));

        jButtonRegister.setBackground(new java.awt.Color(0, 153, 203));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
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

        jButtonUpdate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButtonUpdate1.setText("Update");
        jButtonUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate1ActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonView.setBackground(new java.awt.Color(0, 153, 204));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(153, 153, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelId.setText("Id Number >>>");

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.png"))); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jPickerDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerDoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateLayout = new javax.swing.GroupLayout(jPanelUpdate);
        jPanelUpdate.setLayout(jPanelUpdateLayout);
        jPanelUpdateLayout.setHorizontalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPickerDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGap(726, 726, 726)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelUpdateLayout.setVerticalGroup(
            jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpdateLayout.createSequentialGroup()
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPickerDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUpdateLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonUpdate1)))
                .addGap(14, 14, 14)
                .addComponent(jButtonDelete))
        );

        add(jPanelUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    public boolean validateFields(){
        if(jTextName.getText().isEmpty() | jTextAddress.getText().isEmpty() | jTextContact.getText().isEmpty() | jTextEmail.getText().isEmpty()){
            JOptionPane.showMessageDialog(adminPanel, "Please Fill all the Fields Before Submit", "Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    private void jButtonUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdate1ActionPerformed

        String id = jTextId.getText();
        Lecturer lec = new Lecturer(id,jTextName.getText(),DoB,jTextAddress.getText(),jTextEmail.getText(),jTextContact.getText());
        if(validateFields()){
            try {
                LecturerController.updateLecturer(lec);
                JOptionPane.showMessageDialog(adminPanel, "Updated Data Sucessfully");
                UpdateLecturer updateLec=new UpdateLecturer(adminPanel);
                adminPanel.masterPanel.removeAll();
                adminPanel.masterPanel.add(updateLec);
                adminPanel.masterPanel.repaint();
                adminPanel.masterPanel.revalidate();
                updateLec.setVisible(true);  
            } catch (ClassNotFoundException | SQLException ex) {
                ExceptionHandle.showError(ex);
            }
        }
    }//GEN-LAST:event_jButtonUpdate1ActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String id=jTextId.getText();
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Want to Exit","Exit",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            try {
                LecturerController.deleteLecturer(id);
                JOptionPane.showMessageDialog(adminPanel, "Data Removed Sucessfully");
                UpdateLecturer updateLec=new UpdateLecturer(adminPanel);
                adminPanel.masterPanel.removeAll();
                adminPanel.masterPanel.add(updateLec);
                adminPanel.masterPanel.repaint();
                adminPanel.masterPanel.revalidate();
                updateLec.setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                ExceptionHandle.showError(ex);
            }
        }   
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed

    }//GEN-LAST:event_jTextIdActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        RegLecturer regLec=new RegLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(regLec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        regLec.setVisible(true);
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        ViewLecturer viewLec=new ViewLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(viewLec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        viewLec.setVisible(true);
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        String id=jTextId.getText();
        try {
            Lecturer lec = LecturerController.searchLecturer(id);
            if(lec==null){
                JOptionPane.showMessageDialog(adminPanel, "Not a Registered Lecturer");
                UpdateLecturer updateLec=new UpdateLecturer(adminPanel);
                adminPanel.masterPanel.removeAll();
                adminPanel.masterPanel.add(updateLec);
                adminPanel.masterPanel.repaint();
                adminPanel.masterPanel.revalidate();
                updateLec.setVisible(true);
            }
            jTextName.setText(lec.getName());
            jTextAddress.setText(lec.getAddress());
            jTextContact.setText(lec.getContact());
            jTextEmail.setText(lec.getEmail());
            String dateValue = lec.getDoB();
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            Date date = fmt.parse(dateValue);
            jPickerDoB.setFormats(fmt);
            jPickerDoB.setDate(date);
            
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            ExceptionHandle.showError(ex);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jPickerDoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPickerDoBActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        jPickerDoB.setFormats(formatter);
        DoB = formatter.format(jPickerDoB.getDate());
    }//GEN-LAST:event_jPickerDoBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonUpdate1;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanelUpdate;
    private org.jdesktop.swingx.JXDatePicker jPickerDoB;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
