/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LSMS;

import static LSMS.SqlConnect2.conn;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mr Olayinka
 */
public final class Lecturer_Addnew extends javax.swing.JDialog {

    /**
     * Creates new form Lecturer_Addnew
     */
    String path="";
    PreparedStatement pst=null;
 
    public Lecturer_Addnew(java.awt.Frame parent, boolean modal)  {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
         jTextArea1.setVisible(false);
        ImageLabel.setIcon((ResizeImage("src/dflticon.jpg")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PositionComboBox = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SexComboBox = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQualifications = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        coursecombo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PhoneNo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ViewRecordsButton = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        ImageLabel = new javax.swing.JLabel();
        Browse_ImageButton = new javax.swing.JButton();
        Address = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        PhoneNo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register Lecturer");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lecturers"));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 598));

        jLabel3.setText("FirstName");
        jLabel3.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel3.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel3.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel4.setText("Address");
        jLabel4.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel2.setText("LastName");
        jLabel2.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(76, 14));

        PositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose  Level...", "Lecturer 1", "Assistant Lecturer", "HOD", " ", " " }));
        PositionComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PositionComboBox.setMinimumSize(new java.awt.Dimension(153, 26));
        PositionComboBox.setPreferredSize(new java.awt.Dimension(153, 26));
        PositionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionComboBoxActionPerformed(evt);
            }
        });

        jLabel64.setText("Position");
        jLabel64.setPreferredSize(new java.awt.Dimension(76, 14));

        IDTextField.setEditable(false);

        jLabel14.setText("ID");

        jLabel6.setText("Phone No 1");
        jLabel6.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel6.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel6.setPreferredSize(new java.awt.Dimension(76, 14));

        SexComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        SexComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SexComboBox.setMinimumSize(new java.awt.Dimension(153, 26));
        SexComboBox.setPreferredSize(new java.awt.Dimension(153, 26));
        SexComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexComboBoxActionPerformed(evt);
            }
        });

        jLabel66.setText("Sex");
        jLabel66.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel7.setText("Qualifications");

        jLabel8.setText("Email");
        jLabel8.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel8.setPreferredSize(new java.awt.Dimension(76, 14));

        jLabel9.setText("Courses Taken");

        coursecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Course(s)...", "Accounting", "Bio Chemistry", "Computer Science", "Economics", "Industrial Chemistry", "Micro Biology", "Mass Comm", "Banking and Finanace" }));
        coursecombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        coursecombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                coursecomboItemStateChanged(evt);
            }
        });
        coursecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursecomboActionPerformed(evt);
            }
        });
        coursecombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                coursecomboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                coursecomboFocusLost(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(8);
        jTextArea1.setToolTipText("Courses Taken");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        jLabel10.setText("Phone No 2");
        jLabel10.setMaximumSize(new java.awt.Dimension(76, 14));
        jLabel10.setMinimumSize(new java.awt.Dimension(76, 14));
        jLabel10.setPreferredSize(new java.awt.Dimension(76, 14));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ViewRecordsButton.setFont(new java.awt.Font("sansserif", 1, 8)); // NOI18N
        ViewRecordsButton.setText("View Records");
        ViewRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordsButtonActionPerformed(evt);
            }
        });

        btnSave1.setText("Clear");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ViewRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewRecordsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave1)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image"));

        ImageLabel.setBorder(null);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        Browse_ImageButton.setText("Browse Image");
        Browse_ImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse_ImageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(Email)
                            .addComponent(txtQualifications)
                            .addComponent(PositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNo2)
                            .addComponent(SexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address)
                            .addComponent(LastNameTextField)
                            .addComponent(PhoneNo1))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Browse_ImageButton)
                                .addGap(63, 63, 63))))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SexComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse_ImageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coursecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void reset(){
    
    FirstNameTextField.setText("");
LastNameTextField.setText("");
SexComboBox.setSelectedIndex(0);
PositionComboBox.setSelectedIndex(0);
PhoneNo1.setText("");
PhoneNo2.setText("");
Email.setText("");
txtQualifications.setText("");
Address.setText("");
coursecombo.setSelectedIndex(0);
jTextArea1.setText("");
 ImageLabel.setIcon((ResizeImage("src/dflticon.jpg")));
    }
    private void ViewRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecordsButtonActionPerformed
        try {
            this.dispose();
            Lecturer_Record g = new Lecturer_Record(null, true);
            g.setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
           JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_ViewRecordsButtonActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if( (FirstNameTextField.getText().trim().equals(""))||
            (LastNameTextField.getText().trim().equals("")) ||
            (SexComboBox.getSelectedItem().equals("")) ||
            (PositionComboBox.getSelectedItem().equals("Choose  Level...")) ||
            (PhoneNo1.getText().trim().equals(""))||
            (PhoneNo2.getText().trim().equals(""))||
            (Email.getText().trim().equals(""))||
            (txtQualifications.getText().equals(""))||
            (Address.getText().equals(""))||
            (jTextArea1.getText().trim().equals("")) 
          ){  JOptionPane.showMessageDialog(null, " All fields Are Required !  ");
            return; }
        
        if( (path.equals(""))  ){
            JOptionPane.showMessageDialog(null, " Select Image !  ");
            return;
        }

        try{
            conn = SqlConnect2.conDB();

            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);

            String add = "insert into Lecturers (FirstName,LastName,Sex,Position,PhoneNo1,PhoneNo2,Email,Qualifications,Address,CourseTaken,Image) values( ?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(add);

            pst.setString(1, FirstNameTextField.getText().trim());
            pst.setString(2, LastNameTextField.getText().trim());
            pst.setString(3, SexComboBox.getSelectedItem().toString());
            pst.setString(4, PositionComboBox.getSelectedItem().toString());
            pst.setString(5, PhoneNo1.getText().trim());
            pst.setString(6, PhoneNo2.getText().trim());
            pst.setString(7, Email.getText().trim());
            pst.setString(8, txtQualifications.getText().trim());
            pst.setString(9, Address.getText().trim());
            pst.setString(10, jTextArea1.getText().trim());
           

            byte[] image ;
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
            image = bos.toByteArray();
            pst.setBytes(11, image ); 
            pst.execute();

            JOptionPane.showMessageDialog(null, "Successfully Saved");
        reset();
        pst.close();
        conn.close();
        }catch(HeadlessException | SQLException | IOException ex){
            JOptionPane.showMessageDialog(this,ex);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void Browse_ImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse_ImageButtonActionPerformed

        JFileChooser fille = new JFileChooser();
        fille.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", ".jpg",".gif",".png");
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

    private void coursecomboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coursecomboFocusLost
//        jTextArea1.setVisible(false);
    }//GEN-LAST:event_coursecomboFocusLost

    private void coursecomboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coursecomboFocusGained
        jTextArea1.setVisible(true);
    }//GEN-LAST:event_coursecomboFocusGained

    private void coursecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursecomboActionPerformed

        String g = coursecombo.getSelectedItem().toString();
        if(g.equals("Select Course(s)...")){
            jTextArea1.setText("");
            return;
        }
        jTextArea1.append(g+",\n");
    }//GEN-LAST:event_coursecomboActionPerformed

    private void coursecomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_coursecomboItemStateChanged

    }//GEN-LAST:event_coursecomboItemStateChanged

    private void SexComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexComboBoxActionPerformed

    private void PositionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionComboBoxActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
       reset();
    }//GEN-LAST:event_btnSave1ActionPerformed

     public ImageIcon ResizeImage(String ImagePath)
    {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(ImageLabel.getWidth(), ImageLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
      
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer_Addnew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lecturer_Addnew dialog = new Lecturer_Addnew(new javax.swing.JFrame(), true);
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
    public javax.swing.JTextField Address;
    private javax.swing.JButton Browse_ImageButton;
    public static javax.swing.JTextField Email;
    public static javax.swing.JTextField FirstNameTextField;
    public javax.swing.JTextField IDTextField;
    private javax.swing.JLabel ImageLabel;
    public javax.swing.JTextField LastNameTextField;
    private javax.swing.JTextField PhoneNo1;
    private javax.swing.JTextField PhoneNo2;
    public static javax.swing.JComboBox PositionComboBox;
    public static javax.swing.JComboBox SexComboBox;
    public javax.swing.JButton ViewRecordsButton;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnSave1;
    private javax.swing.JComboBox coursecombo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField txtQualifications;
    // End of variables declaration//GEN-END:variables
}