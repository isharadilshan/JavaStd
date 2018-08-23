
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Instructor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
public class UpdateInstructor extends javax.swing.JPanel {
    
    AdminPanel adminPanel;
    String DoB;
    /**
     * Creates new form UpdateInstructor
     * @param adminPanel
     */
    public UpdateInstructor(AdminPanel adminPanel) {
        this.adminPanel=adminPanel;
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

        jButtonRegister = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jTextContact = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelContact = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelDoB = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate1 = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jPickerDoB = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegister.setBackground(new java.awt.Color(0, 153, 204));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 111, 243, 96));

        jButtonView.setBackground(new java.awt.Color(0, 153, 204));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 111, 244, 96));

        jButtonUpdate.setBackground(new java.awt.Color(153, 153, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 111, 244, 96));
        add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 344, 350, 38));
        add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 480, 350, 40));
        add(jTextContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 547, 350, 43));
        add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 615, 350, 40));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setText("Email :-");
        add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 615, 178, 40));

        jLabelContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContact.setText("Contact Number :-");
        add(jLabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 549, 178, 43));

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAddress.setText("Address :-");
        add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 485, 178, 39));

        jLabelDoB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDoB.setText("Date of Birth :-");
        add(jLabelDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 409, 178, 48));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setText("Name :-");
        add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 344, 178, 46));

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 660, 171, -1));

        jButtonUpdate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButtonUpdate1.setText("Update");
        jButtonUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdate1ActionPerformed(evt);
            }
        });
        add(jButtonUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 171, -1));

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelId.setText("Id Number >>>");
        add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 192, 36));

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 244, 36));

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.png"))); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 171, -1));

        jPickerDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerDoBActionPerformed(evt);
            }
        });
        add(jPickerDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        RegInstructor regIns=new RegInstructor(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(regIns);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        regIns.setVisible(true);
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        ViewLecturer viewlec=new ViewLecturer(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(viewlec);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        viewlec.setVisible(true);

    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String id=jTextId.getText();
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Want to Delete","Exit",JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0){
            try {
                InstructorController.deleteInstructor(id);
                JOptionPane.showMessageDialog(adminPanel, "Data Removed Sucessfully");
                UpdateInstructor updateIns=new UpdateInstructor(adminPanel);
                adminPanel.masterPanel.removeAll();
                adminPanel.masterPanel.add(updateIns);
                adminPanel.masterPanel.repaint();
                adminPanel.masterPanel.revalidate();
            updateIns.setVisible(true);  
            } catch (ClassNotFoundException | SQLException ex) {
                ExceptionHandle.showError(ex);
            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdate1ActionPerformed

        String id = jTextId.getText();
        Instructor ins = new Instructor(id,jTextName.getText(),DoB,jTextAddress.getText(),jTextEmail.getText(),jTextContact.getText());
        try {
            InstructorController.updateInstructor(ins);
            JOptionPane.showMessageDialog(adminPanel, "Updated Data Sucessfully");
            UpdateInstructor updateIns=new UpdateInstructor(adminPanel);
            adminPanel.masterPanel.removeAll();
            adminPanel.masterPanel.add(updateIns);
            adminPanel.masterPanel.repaint();
            adminPanel.masterPanel.revalidate();
            updateIns.setVisible(true);  
        } catch (ClassNotFoundException | SQLException ex) {
            ExceptionHandle.showError(ex);
        }
    }//GEN-LAST:event_jButtonUpdate1ActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        String id=jTextId.getText();
        try {
            Instructor ins = InstructorController.searchInstructor(id);
            if(ins==null){
                JOptionPane.showMessageDialog(adminPanel, "Not a Registered Instructor");
                UpdateInstructor updateIns=new UpdateInstructor(adminPanel);
                adminPanel.masterPanel.removeAll();
                adminPanel.masterPanel.add(updateIns);
                adminPanel.masterPanel.repaint();
                adminPanel.masterPanel.revalidate();
                updateIns.setVisible(true);  
            }
            jTextName.setText(ins.getName());
            jTextAddress.setText(ins.getAddress());
            jTextContact.setText(ins.getContact());
            jTextEmail.setText(ins.getEmail());
            String dateValue = ins.getDoB();
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
    private org.jdesktop.swingx.JXDatePicker jPickerDoB;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
