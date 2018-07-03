
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Stream;
import model.Undergraduate;


public class RegUndergraduate extends javax.swing.JPanel {
    AdminPanel adminPanel;
    String Faculty;
    String Year;
    String Sem;
    String faculty;
    String stream;
    String streamid;
    String id;
    String DoB;
    String RegDate;
    /**
     * Creates new form Undergraduate
     */
    public RegUndergraduate(AdminPanel adminPanel) {
        this.adminPanel=adminPanel;
//        jLabelSubject1.setText("Mathematics");
//        jLabelSubject2.setText("Chemistry");
//        jLabelSubject3.setText("Physics");
        initComponents();
    }

    RegUndergraduate(){
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabelStream = new javax.swing.JLabel();
        jComboStream = new javax.swing.JComboBox<>();
        jLabelZScore = new javax.swing.JLabel();
        jLabelRank = new javax.swing.JLabel();
        jLabelSubject3 = new javax.swing.JLabel();
        jLabelSubject2 = new javax.swing.JLabel();
        jLabelSubject1 = new javax.swing.JLabel();
        jTextZScore = new javax.swing.JTextField();
        jTextRank = new javax.swing.JTextField();
        jTextEnglish = new javax.swing.JTextField();
        jLabelEnglish = new javax.swing.JLabel();
        jTextSubject2 = new javax.swing.JTextField();
        jTextSubject1 = new javax.swing.JTextField();
        jTextSubject3 = new javax.swing.JTextField();
        StarEmail4 = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSubmit = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelFaculty = new javax.swing.JLabel();
        jComboFaculty = new javax.swing.JComboBox<>();
        jLabelRegDate = new javax.swing.JLabel();
        jPickerRegDate = new org.jdesktop.swingx.JXDatePicker();
        jPickerDoB = new org.jdesktop.swingx.JXDatePicker();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1130, 752));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelName.setText("Name :-");
        jPanel2.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 190, 192, 36));
        jPanel2.add(jTextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 192, 338, 36));

        jLabelDoB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDoB.setText("Date of Birth :-");
        jPanel2.add(jLabelDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 246, 192, 36));

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAddress.setText("Address :-");
        jPanel2.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 302, 192, 36));
        jPanel2.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 304, 338, 36));

        jLabelContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelContact.setText("Contact Number :-");
        jPanel2.add(jLabelContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 358, 192, 36));
        jPanel2.add(jTextContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 360, 338, 36));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setText("Email :-");
        jPanel2.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 414, 192, 36));
        jPanel2.add(jTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 416, 338, 36));

        jLabelIntake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelIntake.setText("Intake :-");
        jPanel2.add(jLabelIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 470, 192, 36));

        jComboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", " " }));
        jComboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboYearActionPerformed(evt);
            }
        });
        jPanel2.add(jComboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 471, 149, 35));

        jComboSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester 1", "Semester 2", " " }));
        jComboSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSemesterActionPerformed(evt);
            }
        });
        jPanel2.add(jComboSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 471, 144, 35));

        jLabelStream.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelStream.setText("Stream :-");
        jPanel2.add(jLabelStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 537, 192, 36));

        jComboStream.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboStream.setForeground(new java.awt.Color(0, 0, 153));
        jComboStream.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Physical Stream", "Biological Stream", "Commerce Stream", " " }));
        jComboStream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStreamActionPerformed(evt);
            }
        });
        jPanel2.add(jComboStream, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 538, 185, 36));

        jLabelZScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelZScore.setText("Z Score :-");
        jPanel2.add(jLabelZScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 100, 36));

        jLabelRank.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRank.setText("Rank :-");
        jPanel2.add(jLabelRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 100, 36));

        jLabelSubject3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject3.setText("Physics:-");
        jPanel2.add(jLabelSubject3, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 623, 159, 36));

        jLabelSubject2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject2.setText("Chemistry :-");
        jPanel2.add(jLabelSubject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 686, -1, 36));

        jLabelSubject1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSubject1.setText("Mathematics :-");
        jPanel2.add(jLabelSubject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 623, -1, 36));
        jPanel2.add(jTextZScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 89, 36));

        jTextRank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRankActionPerformed(evt);
            }
        });
        jPanel2.add(jTextRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, 89, 36));

        jTextEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEnglishActionPerformed(evt);
            }
        });
        jPanel2.add(jTextEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 688, 89, 36));

        jLabelEnglish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEnglish.setText("English :-");
        jPanel2.add(jLabelEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 688, 100, 36));

        jTextSubject2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSubject2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextSubject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 688, 89, 36));
        jPanel2.add(jTextSubject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 625, 89, 36));
        jPanel2.add(jTextSubject3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 625, 89, 36));

        StarEmail4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StarEmail4.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(StarEmail4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 616, 19, -1));

        jButtonView.setBackground(new java.awt.Color(0, 153, 204));
        jButtonView.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ViewPro.png"))); // NOI18N
        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 49, 237, 97));

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear.png"))); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 784, 163, -1));

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Submit.png"))); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 784, 171, -1));

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 255));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RegisterPro.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 49, 239, 97));

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UpdatePro.png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 49, 238, 97));

        jLabelFaculty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFaculty.setText("Faculty :-");
        jPanel2.add(jLabelFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 110, 36));

        jComboFaculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Bussiness", "Engineering" }));
        jComboFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFacultyActionPerformed(evt);
            }
        });
        jPanel2.add(jComboFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 151, 35));

        jLabelRegDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRegDate.setText("Registration Date :-");
        jPanel2.add(jLabelRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 180, 36));

        jPickerRegDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerRegDateActionPerformed(evt);
            }
        });
        jPanel2.add(jPickerRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, -1, 30));

        jPickerDoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPickerDoBActionPerformed(evt);
            }
        });
        jPanel2.add(jPickerDoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEnglishActionPerformed

    private void jTextRankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRankActionPerformed

    private void jComboStreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStreamActionPerformed
        stream = (String)jComboStream.getSelectedItem();
        if(stream.equals("Physical Stream")){
            jLabelSubject1.setText("Mathematics");
            jLabelSubject2.setText("Chemistry");
            jLabelSubject3.setText("Physics");
        }else if(stream.equals("Biological Stream")){
            jLabelSubject1.setText("Biology");
            jLabelSubject2.setText("Chemistry");
            jLabelSubject3.setText("Physics");
        }else{
            jLabelSubject1.setText("Commerce");
            jLabelSubject2.setText("Econ");
            jLabelSubject3.setText("Accounting");
        }
    }//GEN-LAST:event_jComboStreamActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        RegUndergraduate regUnderg=new RegUndergraduate(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(regUnderg);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        regUnderg.setVisible(true);
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        try {
            id=IdGenerator.getNewId("Undergraduate","Student_Id","US");
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
            Undergraduate underg=new Undergraduate(id,jTextName.getText(),DoB,jTextAddress.getText(),jTextEmail.getText(),jTextContact.getText(),RegDate,intake,stream,faculty);
            UndergraduateController.addUndergraduate(underg);
            if(stream.equals("Physical Stream")){
                streamid="CM001";
            }else if(stream.equals("Biological Stream")){
                streamid="BI001";
            }else{
                streamid="EC001";
            }
            Stream news=new Stream(streamid,stream,jTextSubject1.getText(),jTextSubject2.getText(),jTextSubject3.getText(),jTextEnglish.getText(),jTextRank.getText(),jTextZScore.getText(),id);
            StreamController.addStream(news);
            RegUndergraduate regUnderg=new RegUndergraduate(adminPanel);
            adminPanel.masterPanel.removeAll();
            adminPanel.masterPanel.add(regUnderg);
            adminPanel.masterPanel.repaint();
            adminPanel.masterPanel.revalidate();
            regUnderg.setVisible(true);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegUndergraduate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        ViewUndergraduate viewUnderg=new ViewUndergraduate(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(viewUnderg);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        viewUnderg.setVisible(true);

    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        UpdateUndergraduate updateUnderg=new UpdateUndergraduate(adminPanel);
        adminPanel.masterPanel.removeAll();
        adminPanel.masterPanel.add(updateUnderg);
        adminPanel.masterPanel.repaint();
        adminPanel.masterPanel.revalidate();
        updateUnderg.setVisible(true);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jComboFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFacultyActionPerformed
        Object selectedItem = jComboFaculty.getSelectedItem();
        if (selectedItem != null)
        {
            Faculty = selectedItem.toString();
        }
    }//GEN-LAST:event_jComboFacultyActionPerformed

    private void jTextSubject2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSubject2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSubject2ActionPerformed

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

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed

    }//GEN-LAST:event_jButtonRegisterActionPerformed

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
    private javax.swing.JLabel StarEmail4;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboFaculty;
    private javax.swing.JComboBox<String> jComboSemester;
    private javax.swing.JComboBox<String> jComboStream;
    private javax.swing.JComboBox<String> jComboYear;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelDoB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEnglish;
    private javax.swing.JLabel jLabelFaculty;
    private javax.swing.JLabel jLabelIntake;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRank;
    private javax.swing.JLabel jLabelRegDate;
    private javax.swing.JLabel jLabelStream;
    private javax.swing.JLabel jLabelSubject1;
    private javax.swing.JLabel jLabelSubject2;
    private javax.swing.JLabel jLabelSubject3;
    private javax.swing.JLabel jLabelZScore;
    private javax.swing.JPanel jPanel2;
    private org.jdesktop.swingx.JXDatePicker jPickerDoB;
    private org.jdesktop.swingx.JXDatePicker jPickerRegDate;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextContact;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEnglish;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextRank;
    private javax.swing.JTextField jTextSubject1;
    private javax.swing.JTextField jTextSubject2;
    private javax.swing.JTextField jTextSubject3;
    private javax.swing.JTextField jTextZScore;
    // End of variables declaration//GEN-END:variables
}
