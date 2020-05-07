/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMS;




import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr Olayinka
 */
public class Main extends javax.swing.JFrame {


    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
       setLocationRelativeTo(null);
     
       
     //  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     // setSize(screenSize.width, screenSize.height);
        //setSize(1600, 1000);
       
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        LecturersMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        StudentsMenu = new javax.swing.JMenu();
        NewStudent = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        DeleteStudent = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        SearchMenu = new javax.swing.JMenu();
        LecturerMenuItemUnderSearchMenu = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        StudentMenuItemUnderSearchMenu = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        AttSys = new javax.swing.JMenuItem();
        SearchA = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        SearchMenu1 = new javax.swing.JMenu();
        NewAdmin = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem5.setText("jMenuItem5");

        jMenu4.setText("jMenu4");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jMenuItem14.setText("jMenuItem14");

        jMenuItem15.setText("jMenuItem15");

        jMenu7.setText("jMenu7");

        jMenu9.setText("jMenu9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Lecturers And Students Management System");
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/MilanoNight.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 3, 27)); // NOI18N
        jLabel2.setText("LECTURERS AND STUDENTS MANAGEMENT SYSTEM");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Copyright: 2017. Designed by Tolani Inc |  All Rights Reserved");

        jMenu1.setText("File");

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/tlmg0.png"))); // NOI18N
        jMenuItem12.setText("Exit");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        LecturersMenu.setText("Lecturers");
        LecturersMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LecturersMenuMouseClicked(evt);
            }
        });
        LecturersMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturersMenuActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg8.jpg"))); // NOI18N
        jMenuItem2.setText("New Lecturer...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        LecturersMenu.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/xImg3.jpg"))); // NOI18N
        jMenuItem3.setText("Update/Edit Lecturer...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        LecturersMenu.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/qImg1.jpg"))); // NOI18N
        jMenuItem4.setText("Delete Lecturer...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        LecturersMenu.add(jMenuItem4);
        LecturersMenu.add(jSeparator2);

        jMenuItem17.setText("Lecturers Record");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        LecturersMenu.add(jMenuItem17);

        jMenuBar1.add(LecturersMenu);

        StudentsMenu.setText("Students");

        NewStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        NewStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg8.jpg"))); // NOI18N
        NewStudent.setText("New Student...");
        NewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentActionPerformed(evt);
            }
        });
        StudentsMenu.add(NewStudent);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/xImg3.jpg"))); // NOI18N
        jMenuItem6.setText("Update/Edit Student...");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        StudentsMenu.add(jMenuItem6);

        DeleteStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        DeleteStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/qImg1.jpg"))); // NOI18N
        DeleteStudent.setText("Delete Student...");
        DeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStudentActionPerformed(evt);
            }
        });
        StudentsMenu.add(DeleteStudent);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/xImg1.jpg"))); // NOI18N
        jMenuItem18.setText("Student Record...");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        StudentsMenu.add(jMenuItem18);
        StudentsMenu.add(jSeparator4);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem20.setText("Report");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        StudentsMenu.add(jMenuItem20);

        jMenuBar1.add(StudentsMenu);

        SearchMenu.setText("Search/Filter");

        LecturerMenuItemUnderSearchMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        LecturerMenuItemUnderSearchMenu.setText("Lecturer...");
        LecturerMenuItemUnderSearchMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturerMenuItemUnderSearchMenuActionPerformed(evt);
            }
        });
        SearchMenu.add(LecturerMenuItemUnderSearchMenu);
        SearchMenu.add(jSeparator6);

        jMenu6.setText("Students");

        StudentMenuItemUnderSearchMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg1.png"))); // NOI18N
        StudentMenuItemUnderSearchMenu.setText("By Students ID");
        StudentMenuItemUnderSearchMenu.setInheritsPopupMenu(true);
        StudentMenuItemUnderSearchMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentMenuItemUnderSearchMenuActionPerformed(evt);
            }
        });
        jMenu6.add(StudentMenuItemUnderSearchMenu);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg1.png"))); // NOI18N
        jMenuItem7.setText("By Sudents Course/Level");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        SearchMenu.add(jMenu6);

        jMenuBar1.add(SearchMenu);

        jMenu5.setText("Attendance");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/xImg2.jpg"))); // NOI18N
        jMenuItem10.setText("Enroll / Delete...");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        AttSys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/qImg0.png"))); // NOI18N
        AttSys.setText("Attendance System");
        AttSys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttSysActionPerformed(evt);
            }
        });
        jMenu5.add(AttSys);

        SearchA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/yImg2.png"))); // NOI18N
        SearchA.setText("Search Attendance");
        SearchA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchAActionPerformed(evt);
            }
        });
        jMenu5.add(SearchA);
        jMenu5.add(jSeparator1);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg9.png"))); // NOI18N
        jMenuItem9.setText("Attendance Record...");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        SearchMenu1.setText("Admin");
        SearchMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMenu1ActionPerformed(evt);
            }
        });

        NewAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        NewAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg6.jpg"))); // NOI18N
        NewAdmin.setText("New Admin...");
        NewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAdminActionPerformed(evt);
            }
        });
        SearchMenu1.add(NewAdmin);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/xImg9.png"))); // NOI18N
        jMenuItem11.setText("Admin Records...");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        SearchMenu1.add(jMenuItem11);
        SearchMenu1.add(jSeparator9);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg3.jpg"))); // NOI18N
        jMenuItem13.setText("Remove Admin...");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        SearchMenu1.add(jMenuItem13);

        jMenuBar1.add(SearchMenu1);

        jMenu8.setText("Help");
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LSMS/wImg5.jpg"))); // NOI18N
        jMenuItem16.setText("About");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(268, 268, 268))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LecturersMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturersMenuActionPerformed

    }//GEN-LAST:event_LecturersMenuActionPerformed

    private void LecturersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LecturersMenuMouseClicked

    }//GEN-LAST:event_LecturersMenuMouseClicked

    private void NewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentActionPerformed
         //Calls the AddNew_Student Class :
        Student_Addnew a = new Student_Addnew(null,true);
       a.setVisible(true);

    }//GEN-LAST:event_NewStudentActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {

            Student_Update a = new Student_Update(null,true);
            a.setVisible(true);

        } catch (SQLException | ClassNotFoundException | IOException ex) {
          JOptionPane.showMessageDialog(this, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void DeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStudentActionPerformed
        
        try {
            
            Student_Delete a = new Student_Delete(null,true);
            a.setVisible(true);
            
        } catch (SQLException | ClassNotFoundException | IOException ex) {
           JOptionPane.showMessageDialog(this, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }


    }//GEN-LAST:event_DeleteStudentActionPerformed

    private void StudentMenuItemUnderSearchMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentMenuItemUnderSearchMenuActionPerformed
        By_Students_ID a = new By_Students_ID(null,true);
        a.setVisible(true);


    }//GEN-LAST:event_StudentMenuItemUnderSearchMenuActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        By_Students_Course a = new By_Students_Course(null,true);
        a.setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void SearchMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMenu1ActionPerformed

    }//GEN-LAST:event_SearchMenu1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        try {

            Attendance_Record g = new  Attendance_Record();
            g.setVisible(true);

        } catch (SQLException | ClassNotFoundException | IOException ex) {
              JOptionPane.showMessageDialog(this, ex);
        } catch (IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {

            Attendance_Enroll_Delete e = new Attendance_Enroll_Delete(null,true);
            e.setVisible(true);
            e.setLocationRelativeTo(null);

        } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(this, ex);
        } catch (IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void NewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAdminActionPerformed
        Admin_New n =  new Admin_New(this,true);
        n.setVisible(true);

    }//GEN-LAST:event_NewAdminActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            Admin_Records g = new Admin_Records(this,true);
            g.setVisible(true);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
             JOptionPane.showMessageDialog(this, ex);
        } catch (InstantiationException | IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        this.dispose();
        Signin g = new Signin();
        g.setVisible(true);


    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        try {
            Admin_Remove1 g = new Admin_Remove1();
            g.setVisible(true);

        } catch (ClassNotFoundException | SQLException | IOException ex) {
              JOptionPane.showMessageDialog(this, ex);
        } catch (IllegalAccessException | InstantiationException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        About g = new About(null, true);
        g.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
       Student_Record b = new Student_Record(this,true);
       b.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int confirm = JOptionPane.showConfirmDialog(this, "You Want to Exit the Application ","Confirm Exit",JOptionPane.YES_NO_OPTION);
         if(confirm == 0){
             this.dispose();
         }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Lecturer_Addnew g = new Lecturer_Addnew(this, true);

        g.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        try {
            Lecturer_Record g = new Lecturer_Record(null, true);
            g.setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Lecturer_Update  g = new Lecturer_Update(null, true);
            g.setVisible(true);
        } catch (SQLException | ClassNotFoundException | IOException | IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Lecturer_Delete  g = new Lecturer_Delete(null, true);
            g.setVisible(true);
        } catch (SQLException | ClassNotFoundException | IOException | IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(this, ex);
        
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void LecturerMenuItemUnderSearchMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturerMenuItemUnderSearchMenuActionPerformed
  
Lecturer_Search  g = new Lecturer_Search(null, true);
g.setVisible(true);
        
    }//GEN-LAST:event_LecturerMenuItemUnderSearchMenuActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
      
Student_Report  g = new  Student_Report(null, true);
g.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void AttSysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttSysActionPerformed
      Attendance_System ga =new Attendance_System();
       ga.setVisible(true);
    }//GEN-LAST:event_AttSysActionPerformed

    private void SearchAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchAActionPerformed
      Attendance_Search as = new Attendance_Search(this, true);
      as.setVisible(true);
    }//GEN-LAST:event_SearchAActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
      jLabel2.setFont(new Font("Arial", Font.PLAIN, 27));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       jLabel2.setFont(new Font("Arial", Font.BOLD, 27));
    }//GEN-LAST:event_jLabel2MouseExited

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AttSys;
    private javax.swing.JMenuItem DeleteStudent;
    private javax.swing.JMenuItem LecturerMenuItemUnderSearchMenu;
    private javax.swing.JMenu LecturersMenu;
    private javax.swing.JMenuItem NewAdmin;
    private javax.swing.JMenuItem NewStudent;
    private javax.swing.JMenuItem SearchA;
    private javax.swing.JMenu SearchMenu;
    private javax.swing.JMenu SearchMenu1;
    private javax.swing.JMenuItem StudentMenuItemUnderSearchMenu;
    private javax.swing.JMenu StudentsMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables






//  setLocationRelativeTo(this);
//        PrinterJob pj = PrinterJob.getPrinterJob();
//
//      HashPrintRequestAttributeSet printAttr = new HashPrintRequestAttributeSet();
//      printAttr.add(new PageRanges(1 ));
//
//      if(pj.printDialog(printAttr))     // Display print dialog
//      {            // If true is returned...
//        try {
//
//       pj.print(printAttr);    // then print
//
//      }catch(PrinterException e){
//            JOptionPane.showMessageDialog(null,"Failed to print the file: "+e,"Error",JOptionPane.ERROR_MESSAGE);
//       }
//      }
//      PrinterJob printJob = PrinterJob.getPrinterJob();
//
//  		    // Get and change default page format settings if necessary.
//
//        	printJob.setPrintable(this);
//        if (printJob.printDialog()) {
//            try {
//                printJob.print();
//
//            } catch (Exception PrintException) {
//                JOptionPane.showMessageDialog(null,"Failed to print the file: "+PrintException,"Error",JOptionPane.ERROR_MESSAGE);
//            }
//
//    		printJob.cancel();
//
//        }
//
//        printJob.cancel();













}
