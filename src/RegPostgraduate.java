
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Postgraduate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
public class RegPostgraduate extends javax.swing.JPanel {
    AdminPanel adminPanel;
    String CompletionYear;
    String Faculty;
    String Year;
    String Sem;
    String faculty;
    String DoB;
    String RegDate;
    /**
     * Creates new form Postgraduate
     */
    public RegPostgraduate(AdminPanel adminPanel) {
        initComponents();
        this.adminPanel=adminPanel;
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
        jLabelName = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabelDoB = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jLabelContact = new javax.swing.JLabel();
        jTextContact = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelIntake = new javax.swing.JLabel();
        jComboYear = new javax.swing.JComboBox<>();
        jComboSemester = new javax.swing.JComboBox<>();
        jComboCompletion = new javax.swing.JComboBox<>();
        jLabelCompletion = new javax.swing.JLabel();
        jTextQualification = new javax.swing.JTextField();
        jLabelQualification = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jComboFaculty = new javax.swing.JComboBox<>();
        jLabelFaculty = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jPickerDoB = new org.jdesktop.swingx.JXDatePicker();
        jLabelRegDate = new javax.swing.JLabel();
        jPickerRegDate = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

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

        jLabelIntake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIntake.setText("Intake :-");

        jComboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", " " }));
        jComboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboYearActionPerformed(evt);
            }
        });

        jComboSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", " " }));
        jComboSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSemesterActionPerformed(evt);
            }
        });

        jComboCompletion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));
        jComboCompletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCompletionActionPerformed(evt);
            }
        });

        jLabelCompletion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCompletion.setText("Year of Completion :-");

        jLabelQualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelQualification.setText("Qualification Type :-");

        jButtonView.setBackground(new java.awt.Color(0, 153, 204));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear.png"))); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
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

        jComboFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Bussiness", "Engineering" }));
        jComboFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFacultyActionPerformed(evt);
            }
        });

        jLabelFaculty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFaculty.setText("Faculty :-");

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");

        jPickerDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerDoBActionPerformed(evt);
            }
        });

        jLabelRegDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRegDate.setText("Registration Date :-");

        jPickerRegDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerRegDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCompletion)
                                .addGap(34, 34, 34)
                                .addComponent(jComboCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jTextQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jComboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(325, 325, 325))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jPickerDoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPickerRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)
                            .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(156, 156, 156)
                            .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPickerDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPickerRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextContact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIntake, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCompletion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTextQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jComboFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonSubmit))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboCompletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCompletionActionPerformed
        Object selectedItem = jComboCompletion.getSelectedItem();
        if (selectedItem != null)
        {
            CompletionYear = selectedItem.toString();
        }
    }//GEN-LAST:event_jComboCompletionActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        RegPostgraduate regPostg=new RegPostgraduate(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(regPostg);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        regPostg.setVisible(true);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        try {
            String id=IdGenerator.getNewId("Postgraduate","Student_Id","PS");
            if(Faculty.equals("Computer Science")){
                faculty="FCS01";
            }else if(Faculty.equals("Bussiness")){
                faculty="FBS02";
            }else{
                faculty="FES03";
            }
            String s;
            if(Sem.equals("Semester 1")){
                s="S1";
            }else{
                s="S2";
            }
            String intake=Year+s;
            Postgraduate postg=new Postgraduate(id,jTextName.getText(),DoB,jTextAddress.getText(),jTextEmail.getText(),jTextContact.getText(),RegDate,intake,CompletionYear,jTextQualification.getText(),faculty);
            PostgraduateController.addPostgraduate(postg);
            RegPostgraduate regPostg=new RegPostgraduate(adminPanel);
            adminPanel.masterPanel.removeAll();
            adminPanel.masterPanel.add(regPostg);
            adminPanel.masterPanel.repaint();
            adminPanel.masterPanel.revalidate();
            regPostg.setVisible(true);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegPostgraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jComboFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFacultyActionPerformed
        Object selectedItem = jComboFaculty.getSelectedItem();
        if (selectedItem != null)
        {
            Faculty = selectedItem.toString();
        }
    }//GEN-LAST:event_jComboFacultyActionPerformed

    private void jComboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboYearActionPerformed
        Object selectedItem = jComboYear.getSelectedItem();
        if (selectedItem != null)
        {
            Year = selectedItem.toString();
        }
    }//GEN-LAST:event_jComboYearActionPerformed

    private void jComboSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSemesterActionPerformed
        Object selectedItem = jComboSemester.getSelectedItem();
        if (selectedItem != null)
        {
            Sem = selectedItem.toString();
        }
    }//GEN-LAST:event_jComboSemesterActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        ViewPostgraduate postg=new ViewPostgraduate(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(postg);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        postg.setVisible(true);
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jPickerDoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPickerDoBActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        jPickerDoB.setFormats(formatter);
        DoB = formatter.format(jPickerDoB.getDate());
    }//GEN-LAST:event_jPickerDoBActionPerformed

    private void jPickerRegDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPickerRegDateActionPerformed
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        jPickerRegDate.setFormats(formatter);
        RegDate = formatter.format(jPickerRegDate.getDate());
    }//GEN-LAST:event_jPickerRegDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboCompletion;
    private javax.swing.JComboBox<String> jComboFaculty;
    private javax.swing.JComboBox<String> jComboSemester;
    private javax.swing.JComboBox<String> jComboYear;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCompletion;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFaculty;
    private javax.swing.JLabel jLabelIntake;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelQualification;
    private javax.swing.JLabel jLabelRegDate;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXDatePicker jPickerDoB;
    private org.jdesktop.swingx.JXDatePicker jPickerRegDate;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextQualification;
    // End of variables declaration//GEN-END:variables
}
