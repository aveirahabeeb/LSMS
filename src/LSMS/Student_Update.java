/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMS;

import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mr Olayinka
 */
public class Student_Update extends javax.swing.JDialog {

    //String url = "jdbc:mysql://localhost/students";
     ResultSet rs=null ;
     Connection conn = null;
      Statement st = null;
      String path;
      
     public static String id,fn,mn,ln,c,lev;  
     
    public Student_Update(java.awt.Frame parent, boolean modal) throws SQLException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        super(parent, modal);
        initComponents();
         ClockThread2 j = new ClockThread2();
                j.start();
        setLocationRelativeTo(null);
        StdTable() ;
       ResetImage();
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
        jPanel5 = new javax.swing.JPanel();
        coursecombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LevelComboBox = new javax.swing.JComboBox();
        matnotb = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        clo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Update_Button = new javax.swing.JButton();
        ClearButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Emptable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Update");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "StdDetails", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        coursecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Course...", "Accounting", "Bio Chemistry", "Computer Science", "Economics", "Industrial Chemistry", "Micro Biology", "Mass Comm", "Banking and Finanace" }));
        coursecombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        coursecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursecomboActionPerformed(evt);
            }
        });

        jLabel12.setText("ID");

        jTextField3.setEditable(false);

        jLabel14.setText("Course");
        jLabel14.setPreferredSize(new java.awt.Dimension(76, 14));

        jTextField4.setEditable(false);

        jLabel13.setText("MiddleName");
        jLabel13.setPreferredSize(new java.awt.Dimension(76, 14));

        jTextField1.setEditable(false);

        jLabel11.setText("FirstName");
        jLabel11.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel11.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel11.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel15.setText("LastName");
        jLabel15.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel15.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel15.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel7.setText("Level");
        jLabel7.setPreferredSize(new java.awt.Dimension(76, 14));

        LevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose  Level...", "100", "200", "300", "400", "500" }));
        LevelComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LevelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LevelComboBoxActionPerformed(evt);
            }
        });

        matnotb.setEditable(false);

        jLabel16.setText("Matric No");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coursecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matnotb, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(matnotb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image"));

        ImageLabel.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        clo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 204), null), "Date/Time"));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Execute", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        Update_Button.setText("Update");
        Update_Button.setEnabled(false);
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        ClearButton1.setText("Clear");
        ClearButton1.setEnabled(false);
        ClearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
        );

        Emptable1.setAutoCreateRowSorter(true);
        Emptable1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));
        Emptable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Emptable1.setForeground(new java.awt.Color(0, 0, 0));
        Emptable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FirstName", "MiddleName", "LastName", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Emptable1.setSelectionBackground(new java.awt.Color(0, 153, 255));
        Emptable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Emptable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Emptable1MouseClicked(evt);
            }
        });
        Emptable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Emptable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Emptable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void coursecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursecomboActionPerformed

    private void LevelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LevelComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LevelComboBoxActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed

        if((jTextField2.getText().equals(""))||
            (jTextField3.getText().equals(""))||(jTextField4.getText().equals(""))){

            JOptionPane.showMessageDialog(null, " Fill All Fields !  ");
            return;
        }
        if((coursecombo.getSelectedItem().equals("Select a Course..."))){

            JOptionPane.showMessageDialog(null, " Please Select  valid Course!  ");
            return;
        }
        if((LevelComboBox.getSelectedItem().equals("Choose  Level..."))){

            JOptionPane.showMessageDialog(null, " Please Choose Level!  ");
            return;
        }
        if((matnotb.getText().equals("Choose  Level..."))){

            JOptionPane.showMessageDialog(null, " Please Enter Matric No!  ");
            return;
        }

        int P = JOptionPane.showConfirmDialog(null," Are you sure want to Update these records ?","Confirmation",JOptionPane.YES_NO_OPTION);
        if (P==0)
        {
            try {
                String fn = jTextField2.getText();
                String mn = jTextField3.getText();
                String ln =jTextField4.getText();
                String mtn = matnotb.getText();

                ClearButton1.setEnabled(true);
                int row = Emptable1.getSelectedRow();
                String ct = ( Emptable1.getModel().getValueAt(row, 0).toString());
                conn = SqlConnect2.conDB();
                String p ="update tblstudents set FirstName =?, MiddleName =?, LastName =?,Course =?, Level=?,MatricNo=?  where ID = '"+ct+"' ";
                PreparedStatement pst = conn.prepareStatement(p);

                pst.setString(1, fn);
                pst.setString(2, mn);
                pst.setString(3, ln);
                pst.setString(4, coursecombo.getSelectedItem().toString());
                pst.setString(5, LevelComboBox.getSelectedItem().toString());
                pst.setString(6, mtn.toUpperCase());
                pst.execute();

               
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                coursecombo.setSelectedIndex(0);
                matnotb.setText("");
                ResetImage();

                LevelComboBox.setSelectedIndex(0);
                ClearButton1.setEnabled(false);
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                coursecombo.setEditable(false);
                jTextField4.setEditable(false);
                LevelComboBox.setEditable(false);
                matnotb.setEditable(false);
                Update_Button.setEnabled(false);

                 StdTable() ;
                JOptionPane.showMessageDialog(null, "Successfully Updated");

            } catch (SQLException | ClassNotFoundException | IOException | InstantiationException | IllegalAccessException ex) {
                JOptionPane.showMessageDialog(null, ex);

            }finally{
                if (conn!=null){
                    try {
                        conn.close();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error : \n" +ex.getMessage());
                    }}
                }

            }

    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void ClearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButton1ActionPerformed

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        matnotb.setText("");
        coursecombo.setSelectedIndex(0);
        ResetImage();
        LevelComboBox.setSelectedIndex(0);
        Update_Button.setEnabled(false);
        ClearButton1.setEnabled(false);
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        coursecombo.setEditable(false);
        jTextField4.setEditable(false);
        LevelComboBox.setEditable(false);
    }//GEN-LAST:event_ClearButton1ActionPerformed

    private void Emptable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Emptable1MouseClicked
        try {

            conn = SqlConnect2.conDB();
            int row = Emptable1.getSelectedRow();
            String ct = ( Emptable1.getModel().getValueAt(row, 0).toString());

            String p ="select ID,MatricNo,FirstName,MiddleName,LastName,Level,Course,image from tblstudents where ID = '"+ct+"' ";
            st = conn.createStatement();
            rs = st.executeQuery(p);

            while(rs.next()){
                id = rs.getString("ID");
                fn = rs.getString("FirstName");
                mn = rs.getString("MiddleName");
                ln = rs.getString("LastName");
                c = rs.getString("Course");
                lev= rs.getString("Level");
                byte b[];
                b= rs.getBytes("image");
                String mt =rs.getString("MatricNo");;

                jTextField1.setText(id);
                jTextField2.setText(fn);
                jTextField3.setText(mn);
                jTextField4.setText(ln);

                coursecombo.setSelectedItem(c);
                LevelComboBox.setSelectedItem(lev);
                ImageLabel.setIcon(ResizeImage(b));
                matnotb.setText(mt);

                //  Student_Update g = new Student_Update(this, true);
                // g.setLocationRelativeTo(null);
                // g.show();

            }
            Update_Button.setEnabled(true);
            ClearButton1.setEnabled(true);

            jTextField2.setEditable(true);
            jTextField3.setEditable(true);
            jTextField4.setEditable(true);
            coursecombo.setEditable(true);
            ClearButton1.setEnabled(true);
            LevelComboBox.setEditable(true);
            matnotb.setEditable(true);
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "SQLException : \n" +ex);

        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            if (conn!= null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "SQLException : \n" +ex);
                }
            }

        }
    }//GEN-LAST:event_Emptable1MouseClicked

    private void Emptable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Emptable1KeyPressed

    }//GEN-LAST:event_Emptable1KeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         //</editor-fold>
         //</editor-fold>
         
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Student_Update dialog = new Student_Update(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException | IOException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
                    Logger.getLogger(Student_Update.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton1;
    private javax.swing.JTable Emptable1;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JComboBox LevelComboBox;
    private javax.swing.JButton Update_Button;
    public static javax.swing.JLabel clo;
    private javax.swing.JComboBox coursecombo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField matnotb;
    // End of variables declaration//GEN-END:variables

      public final void  ResetImage(){
    ImageLabel.setIcon((ResizeImage("src/dflticon.jpg")));
    }


 public ImageIcon ResizeImage(byte ImagePath[])
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
      
    } public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
      
    }
     /*  for (int idx=0; idx<10; ++idx){  GENERATES UNIQUE IDENTIFIERS
      UID userId = new UID();
      System.out.println("User Id: " + userId);
      UUID idOne = UUID.randomUUID();
    UUID idTwo = UUID.randomUUID();
    
     System.out.println("UUID One: " + idOne);
        System.out.println("UUID One: " + idTwo);
    }*/
    
    
public final void StdTable() throws SQLException, ClassNotFoundException, IOException, InstantiationException, IllegalAccessException{
        //Class.forName("com.mysql.jdbc.Driver");
           Class.forName("org.sqlite.JDBC");
        conn = SqlConnect2.conDB();
                     st = conn.createStatement();
   
                    String p ="select ID,MatricNo,FirstName,MiddleName,LastName,Level,Course,image from tblstudents ";
                        rs = st.executeQuery(p);
                        Emptable1.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
                st.close();
                  rs.close();
                        }





}
