
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/*It is a some asasd sadece yoruldum amk yeterrrr be yeter nolur duzel artik yaaajkllkjhkjh*/
/**
 *
 * @author begench
 */
public final class StudentsScreenWorking extends javax.swing.JDialog {

    DefaultTableModel model;
    
    StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
    

    public StudentsScreenWorking(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        model = (DefaultTableModel) students_table.getModel();
        
        studentShow();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        students_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_area = new javax.swing.JTextField();
        surname_area = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        email_area = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        massage_write = new javax.swing.JLabel();
        search_box = new javax.swing.JTextField();
        updateStudent = new javax.swing.JButton();
        screenRefresh = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 0, 0));

        students_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Surname", "Email", "Create Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        students_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                students_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(students_table);
        if (students_table.getColumnModel().getColumnCount() > 0) {
            students_table.getColumnModel().getColumn(1).setResizable(false);
            students_table.getColumnModel().getColumn(2).setResizable(false);
            students_table.getColumnModel().getColumn(3).setResizable(false);
            students_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Surname:");

        name_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        surname_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addStudent.setText("Register");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        email_area.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("E-mail");

        search_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_boxActionPerformed(evt);
            }
        });
        search_box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_boxKeyReleased(evt);
            }
        });

        updateStudent.setText("Update");
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });

        screenRefresh.setText("Refresh");
        screenRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenRefreshActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(surname_area, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_area, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(email_area))
                                    .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(605, 605, 605)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(screenRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(surname_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(email_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(160, 160, 160)
                                .addComponent(massage_write, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        massage_write.setText("");
        String name = name_area.getText();
        String surname = surname_area.getText();
        String email = email_area.getText();
        
        studentDaoImpl.createStudentTable(name, surname, email);
        studentShow();
        massage_write.setText("Registration new user succesfull");
    }//GEN-LAST:event_addStudentActionPerformed

    private void search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_boxActionPerformed
    
    public void dynamicSearch(String search){
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       
       students_table.setRowSorter(tr);
       
       tr.setRowFilter(RowFilter.regexFilter(search));
    
    }
    
    private void search_boxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_boxKeyReleased
        // TODO add your handling code here:
        String search = search_box.getText();

        dynamicSearch(search);
    }//GEN-LAST:event_search_boxKeyReleased

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
        // TODO add your handling code here:
        
        /*String name = name_area.getText();
        String surname = surname_area.getText();
        String gender = email_area.getText();
        int selectedrow = students_table.getSelectedRow();
        
        if(selectedrow == -1){
            if(model.getRowCount() == 0){
                massage_write.setText("Students table is empty...");
            }
            else{
                massage_write.setText("Please select an student to update");
            }
        }
        else{
            int id = (int)model.getValueAt(selectedrow, 0);
            
            //studentDaoImpl.workerUpdateAssistant(id,name,surname,departmant,gender,ageInt,adress,tel_no);
        
            studentShow();

        }*/
    }//GEN-LAST:event_updateStudentActionPerformed

    private void students_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_students_tableMouseClicked
        // TODO add your handling code here:
        
        int selectedrow = students_table.getSelectedRow();
        
        name_area.setText(model.getValueAt(selectedrow, 1).toString());
        surname_area.setText(model.getValueAt(selectedrow, 2).toString());
        email_area.setText(model.getValueAt(selectedrow, 3).toString());
    }//GEN-LAST:event_students_tableMouseClicked

    private void screenRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenRefreshActionPerformed
        // TODO add your handling code here:
        name_area.setText("");
        surname_area.setText("");
        email_area.setText("");
        


        studentShow();
    }//GEN-LAST:event_screenRefreshActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_logoutButtonActionPerformed
    
    
    public void studentShow(){
        model.setRowCount(0);
        ArrayList<Students> students = new ArrayList<Students>();
        
        students = studentDaoImpl.selectAll();
        
        if(students != null){
            for(Students student : students){
                                
                Object[] beAdded = {student.getId(),student.getName(),student.getSurname(),student.getEmail(),student.getCreate_time()};
                
                model.addRow(beAdded);
                
                
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(StudentsScreenWorking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentsScreenWorking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentsScreenWorking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentsScreenWorking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentsScreenWorking dialog = new StudentsScreenWorking(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JTextField email_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel massage_write;
    private javax.swing.JTextField name_area;
    private javax.swing.JButton screenRefresh;
    private javax.swing.JTextField search_box;
    private javax.swing.JTable students_table;
    private javax.swing.JTextField surname_area;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}