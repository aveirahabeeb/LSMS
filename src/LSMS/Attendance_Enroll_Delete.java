/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMS;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mr Olayinka
 */
public class Attendance_Enroll_Delete extends javax.swing.JDialog {

     Statement st = null;
        PreparedStatement pst=null;
          String ct =null;
          String id,fn,ln,mt;
        ResultSet rs=null ;
       String path ;
        Connection conn = null;
        
    public Attendance_Enroll_Delete(java.awt.Frame parent, boolean modal) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        super(parent, modal);
        initComponents();
         setLocationRelativeTo(null);
        
     ResetImage();
     StdTable();
     FirstName_Field.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstName_Field = new javax.swing.JTextField();
        LastName_Field = new javax.swing.JTextField();
        Matricno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ID_Field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ImagePanel = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        Browse_ImageButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        Save_Button = new javax.swing.JButton();
        DeleteData = new javax.swing.JButton();
        Clear_Button1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ID_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Attendance Enroll OR Delete");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel2.setText("LastName");

        jLabel3.setText("FirstName");

        FirstName_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_FieldActionPerformed(evt);
            }
        });
        FirstName_Field.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                FirstName_FieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel4.setText("MatricNo");

        ID_Field.setEditable(false);
        ID_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_FieldActionPerformed(evt);
            }
        });
        ID_Field.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ID_FieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LastName_Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(FirstName_Field, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Matricno)
                    .addComponent(ID_Field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FirstName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matricno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        ImagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        ImageLabel.setBorder(null);

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        Browse_ImageButton.setText("Browse Image");
        Browse_ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_ImageButtonActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        Save_Button.setText("Save");
        Save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ButtonActionPerformed(evt);
            }
        });

        DeleteData.setText("Delete");
        DeleteData.setEnabled(false);
        DeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDataActionPerformed(evt);
            }
        });

        Clear_Button1.setText("Clear");
        Clear_Button1.setEnabled(false);
        Clear_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Save_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Clear_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save_Button)
                    .addComponent(DeleteData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Browse_ImageButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Browse_ImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        ID_Table.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ID_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ID_Table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ID_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ID_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ID_Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstName_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_FieldActionPerformed

    private void FirstName_FieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_FirstName_FieldInputMethodTextChanged

    }//GEN-LAST:event_FirstName_FieldInputMethodTextChanged

    private void ID_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FieldActionPerformed

    private void ID_FieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ID_FieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_FieldInputMethodTextChanged

    private void Browse_ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_ImageButtonActionPerformed

        JFileChooser fille = new JFileChooser();
        fille.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        fille.addChoosableFileFilter(filter);

        int result = fille.showSaveDialog(null);
        //if the user clicks on save in Jfilechooser
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = fille.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            ImageLabel.setIcon(ResizeImage(path));
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null, " No File Was Selected, Select One!!!");
        }
    }//GEN-LAST:event_Browse_ImageButtonActionPerformed

    private void Save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ButtonActionPerformed

        
//        if  (Matricno.getText().length() > 9) {
//
//            JOptionPane.showMessageDialog(this, " Enter Valid MatNum ");
//            return;
//        }

        if( (FirstName_Field.getText().equals("")) || (LastName_Field.getText().equals("")) || (Matricno.getText().equals(""))){
            JOptionPane.showMessageDialog(null, " Please Fill All Fields!!!");
            return;
        }
        if  ((path== null ) || (path.equals("") ) ){

            JOptionPane.showMessageDialog(null, " Please Select Image!  ");
            return;
        }

        try {

            conn = SqlConnect2.AttconDB();

            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);

            String add = "insert into nn (FirstName,LastName,Image,MatricNo) values( ?,? ,?,?)";
            pst = conn.prepareStatement(add);

            pst.setString(1, FirstName_Field.getText());
            pst.setString(2, LastName_Field.getText());

            byte[] image ;
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
            image = bos.toByteArray();
            pst.setBytes(3, image );
            pst.setString(4, Matricno.getText());
            pst.execute();

            StdTable();
            ResetImage();
            FirstName_Field.setText("");
            LastName_Field.setText("");
            Matricno.setText("");

            JOptionPane.showMessageDialog(null, "Successfully Saved");
            
            conn.close();
        } catch (SQLException | IOException | HeadlessException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_Save_ButtonActionPerformed

    private void DeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDataActionPerformed

        if( (ID_Field.getText().equals(""))||(FirstName_Field.getText().equals("")) || (LastName_Field.getText().equals(""))|| (Matricno.getText().equals("")) || (ImageLabel.getIcon().equals(null))){
            JOptionPane.showMessageDialog(null, "Please Select A row You Wish to Delete From The Table");
            return;
        }

        try {
            
            conn = SqlConnect2.AttconDB();
            st = conn.createStatement();

            String Delete = "Delete from nn where id = '"+ct+"'";
            st.executeUpdate(Delete);
            String Deletennsignin = "Delete from nnsignin where TempID = '"+ID_Field.getText()+"'";
            st.executeUpdate(Deletennsignin);
            StdTable();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            //
            //            String p ="select ID,FirstName, LastName,Matricno, Image from nn ";
            //            rs = st.executeQuery(p);
            //            ID_Table.setModel(DbUtils.resultSetToTableModel(rs));

            FirstName_Field.setText("");
            LastName_Field.setText("");
            Matricno.setText("");
            ID_Field.setText("");
            ResetImage();

            Clear_Button1.setEnabled(false);
            Save_Button.setEnabled(true);
            FirstName_Field.setEditable(true);
            LastName_Field.setEditable(true);
            Browse_ImageButton.setEnabled(true);
            DeleteData.setEnabled(false);
            Matricno.setEditable(true);
        } catch (SQLException | ClassNotFoundException | IOException | IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }finally{

            try {
               
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_DeleteDataActionPerformed

    private void Clear_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_Button1ActionPerformed
        FirstName_Field.setText("");
        LastName_Field.setText("");
        Matricno.setText("");
        ID_Field.setText("");
        ResetImage();
        Clear_Button1.setEnabled(false);
        DeleteData.setEnabled(false);
        Save_Button.setEnabled(true);
        FirstName_Field.setEditable(true);
        LastName_Field.setEditable(true);
        Matricno.setEditable(true);
        Browse_ImageButton.setEnabled(true);
    }//GEN-LAST:event_Clear_Button1ActionPerformed

    private void ID_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ID_TableMouseClicked
        try {
            Save_Button.setEnabled(false);
            Clear_Button1.setEnabled(true);
            DeleteData.setEnabled(true);
            FirstName_Field.setEditable(false);
            LastName_Field.setEditable(false);
            Browse_ImageButton.setEnabled(false);
            Matricno.setEditable(false);

            byte b[];

            int row = ID_Table.getSelectedRow();
            ct = ( ID_Table.getModel().getValueAt(row, 0).toString());

            conn = SqlConnect2.AttconDB();
            st = conn.createStatement();

            String p ="select * from nn where ID = '"+ct+"' ";
            rs = st.executeQuery(p);
            while(rs.next()){
                String ID = rs.getString("ID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                b=rs.getBytes("Image");
                String MatricNo = rs.getString("MatricNo");

                FirstName_Field.setText(FirstName);
                LastName_Field.setText(LastName);
                ImageLabel.setIcon( ResizeImage(b));
                Matricno.setText(MatricNo);
                ID_Field.setText(ID);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQLException:" +ex);
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally{

            try {
                
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, " Resource Closure:" +ex);
            }
        }
    }//GEN-LAST:event_ID_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Attendance_Enroll_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_Enroll_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_Enroll_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_Enroll_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Attendance_Enroll_Delete dialog = new Attendance_Enroll_Delete(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
                    Logger.getLogger(Attendance_Enroll_Delete.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Browse_ImageButton;
    private javax.swing.JButton Clear_Button1;
    private javax.swing.JButton DeleteData;
    private javax.swing.JTextField FirstName_Field;
    private javax.swing.JTextField ID_Field;
    private javax.swing.JTable ID_Table;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JTextField LastName_Field;
    private javax.swing.JTextField Matricno;
    private javax.swing.JButton Save_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

     public final void StdTable() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
             try {
                 conn = SqlConnect2.AttconDB();
                 String p ="select ID,FirstName, LastName,MatricNo, Image from nn ";
                 pst = conn.prepareStatement(p);
                 rs = pst.executeQuery(); 
                 ID_Table.setModel(DbUtils.resultSetToTableModel(rs));
             } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(this, ex);
             } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex);
          }
       }
    
    
    public final void  ResetImage(){
     ImageLabel.setIcon((ResizeImage("src/dflticon.jpg")));
    path="";
    }
    
     public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
      
    }
     public ImageIcon ResizeImage(byte ImagePath[])
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
      
    }




}
