/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dakmainstitute.view.managetest;

import dakmainstitute.controller.SubjectController;
import dakmainstitute.controller.TestController;
import dakmainstitute.model.Subject;
import dakmainstitute.model.Test;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Shashi
 */
public class AddTest extends JFrame {

    private Timer timer;
    private Date d;
    private DateFormat timeInstance;

    /**
     * Creates new form AddTest
     */
    public AddTest() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        try {
            fillSubjectCombo();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dateFormat.format(d);
        dateText.setText(date);
        timeInstance = DateFormat.getTimeInstance(DateFormat.MEDIUM);

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
        dateLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        textIdLabel = new javax.swing.JLabel();
        testIdText = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        testTypeCombo = new javax.swing.JComboBox();
        classLabel = new javax.swing.JLabel();
        durationText = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        testTypeLabel1 = new javax.swing.JLabel();
        testTypeLabel2 = new javax.swing.JLabel();
        subjectCombo = new javax.swing.JComboBox();
        classText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dakma Higher Education Center");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);

        dateLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        dateLabel.setText("Date        :");

        durationLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        durationLabel.setText("Duration  :");

        textIdLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textIdLabel.setText("Test Id    :");

        testIdText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        testIdText.setForeground(new java.awt.Color(153, 0, 51));
        testIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testIdTextActionPerformed(evt);
            }
        });
        testIdText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                testIdTextKeyReleased(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(153, 153, 255));
        saveButton.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/save-26.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        saveButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                saveButtonKeyReleased(evt);
            }
        });

        saveButton1.setBackground(new java.awt.Color(255, 153, 153));
        saveButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        saveButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dakmainstitute/icon/delete-26.png"))); // NOI18N
        saveButton1.setText("Cancel");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        testTypeCombo.setBackground(new java.awt.Color(153, 204, 255));
        testTypeCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        testTypeCombo.setForeground(new java.awt.Color(51, 70, 14));
        testTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Revision", "Theory" }));
        testTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testTypeComboActionPerformed(evt);
            }
        });
        testTypeCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                testTypeComboKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                testTypeComboKeyReleased(evt);
            }
        });

        classLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        classLabel.setText("Class       :");

        durationText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        durationText.setForeground(new java.awt.Color(153, 0, 51));
        durationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTextActionPerformed(evt);
            }
        });
        durationText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                durationTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                durationTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                durationTextKeyTyped(evt);
            }
        });

        dateText.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        dateText.setForeground(new java.awt.Color(153, 0, 51));
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });
        dateText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateTextKeyReleased(evt);
            }
        });

        testTypeLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        testTypeLabel1.setText("Test Type:");

        testTypeLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        testTypeLabel2.setText("Subject  :");

        subjectCombo.setBackground(new java.awt.Color(153, 204, 255));
        subjectCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subjectCombo.setForeground(new java.awt.Color(51, 70, 14));
        subjectCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboActionPerformed(evt);
            }
        });
        subjectCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjectComboKeyPressed(evt);
            }
        });

        classText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        classText.setForeground(new java.awt.Color(153, 0, 51));
        classText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Add New Test ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(durationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textIdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(testTypeLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(classText, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(testTypeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(testTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(durationText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(dateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(testIdText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(saveButton1)
                        .addGap(13, 13, 13)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classLabel)
                            .addComponent(classText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testTypeLabel1))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testTypeLabel2))
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdLabel)
                    .addComponent(testIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {saveButton, saveButton1});

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

    private void testIdTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testIdTextKeyReleased
        setSaveButtonEnabled();
    }//GEN-LAST:event_testIdTextKeyReleased

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String txt1 = classText.getText();

        String txt2 = subjectCombo.getSelectedItem() + "";
        String sub = txt2.substring(0);

        String txt3 = testTypeCombo.getSelectedItem() + "";
        String clzType = txt3.substring(0);
        String testId = sub + ", " + txt1 + ", " + clzType + ",  " + testIdText.getText();
        Test test = new Test(testId, dateText.getText(), durationText.getText(), testTypeCombo.getSelectedItem() + "", classText.getText(), subjectCombo.getSelectedItem() + "");
        try {
            int res = TestController.addTest(test);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Successfull......");
            } else {
                JOptionPane.showMessageDialog(this, "fail...");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            refresh();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
        }

  }//GEN-LAST:event_saveButtonActionPerformed

    private void saveButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveButtonKeyReleased
        setSaveButtonEnabled();

    }//GEN-LAST:event_saveButtonKeyReleased

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void testTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testTypeComboActionPerformed
        testIdText.requestFocus();
    }//GEN-LAST:event_testTypeComboActionPerformed

    private void durationTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationTextKeyReleased
        setSaveButtonEnabled();
    }//GEN-LAST:event_durationTextKeyReleased

    private void dateTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateTextKeyReleased
        setSaveButtonEnabled();
    }//GEN-LAST:event_dateTextKeyReleased

    private void durationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTextActionPerformed
        String txt = durationText.getText();
        durationText.setText(txt + "hr");
        durationText.nextFocus();
    }//GEN-LAST:event_durationTextActionPerformed

    private void durationTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationTextKeyTyped
    }//GEN-LAST:event_durationTextKeyTyped

    private void durationTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationTextKeyPressed
    }//GEN-LAST:event_durationTextKeyPressed

    private void testTypeComboKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testTypeComboKeyReleased
        setSaveButtonEnabled();
    }//GEN-LAST:event_testTypeComboKeyReleased

    private void testIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testIdTextActionPerformed
        durationText.requestFocus();
    }//GEN-LAST:event_testIdTextActionPerformed

    private void subjectComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectComboActionPerformed

    private void classTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classTextActionPerformed
        String txt = classText.getText();
        classText.setText(txt + "A/L");
        subjectCombo.requestFocus();
    }//GEN-LAST:event_classTextActionPerformed

    private void subjectComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectComboKeyPressed
        if (evt.getKeyCode() == 10) {
            testTypeCombo.requestFocus();
        }
    }//GEN-LAST:event_subjectComboKeyPressed

    private void testTypeComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testTypeComboKeyPressed
        if (evt.getKeyCode() == 10) {
            testIdText.requestFocus();
        }
    }//GEN-LAST:event_testTypeComboKeyPressed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        saveButton.requestFocus();
    }//GEN-LAST:event_dateTextActionPerformed

    private void saveButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveButtonKeyPressed
        if (evt.getKeyCode() == 10) {
            String txt1 = classText.getText();

            String txt2 = subjectCombo.getSelectedItem() + "";
            String sub = txt2.substring(0);

            String txt3 = testTypeCombo.getSelectedItem() + "";
            String clzType = txt3.substring(0);
            String testId = sub + ", " + txt1 + ", " + clzType + ",  " + testIdText.getText();
            Test test = new Test(testId, dateText.getText(), durationText.getText(), testTypeCombo.getSelectedItem() + "", classText.getText(), subjectCombo.getSelectedItem() + "");
            try {
                int res = TestController.addTest(test);
                if (res > 0) {

                    JOptionPane.showMessageDialog(this, JOptionPane.OK_OPTION, "Success....", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "fail...");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                refresh();
            } catch (SQLException ex) {
                Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_saveButtonKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField classText;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.JComboBox subjectCombo;
    private javax.swing.JTextField testIdText;
    private javax.swing.JComboBox testTypeCombo;
    private javax.swing.JLabel testTypeLabel1;
    private javax.swing.JLabel testTypeLabel2;
    private javax.swing.JLabel textIdLabel;
    // End of variables declaration//GEN-END:variables

    private void setSaveButtonEnabled() {
        boolean b = testIdText.getText().isEmpty() || dateText.getText().isEmpty() || durationText.getText().isEmpty();
        saveButton.setEnabled(!b);
    }

    private void fillSubjectCombo() throws SQLException, ClassNotFoundException {
        ArrayList<Subject> subjectList = SubjectController.getAllSubject();
        //subjectList.removeAllItems();
        for (Subject subject : subjectList) {
            subjectCombo.addItem(subject);

        }
    }

    private void refresh() throws SQLException, ClassNotFoundException {
        classText.setText("");
        testIdText.setText("");
        durationText.setText("");
        fillSubjectCombo();
        d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dateFormat.format(d);
        dateText.setText(date);
        timeInstance = DateFormat.getTimeInstance(DateFormat.MEDIUM);
    }
}
