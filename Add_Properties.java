/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Add_Properties extends javax.swing.JFrame {
Connection con = null;
    /**
     * Creates new form Add_Properties
     */
    public Add_Properties() {
        initComponents();
        con = db_connect.db_connection();
         
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Last_name = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Phone_number = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Adress = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Location = new javax.swing.JTextField();
        No_rooms = new javax.swing.JTextField();
        square = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sh_description = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Owner Information");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 280, 60));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Last Name");
        jLabel2.setToolTipText("");
        jLabel2.setAutoscrolls(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 30));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Phone Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Adress");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, -1));

        Last_name.setBackground(new java.awt.Color(255, 255, 255));
        Last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Last_nameActionPerformed(evt);
            }
        });
        jPanel1.add(Last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 250, -1));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 250, -1));

        Phone_number.setBackground(new java.awt.Color(255, 255, 255));
        Phone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_numberActionPerformed(evt);
            }
        });
        jPanel1.add(Phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 250, -1));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Properties Information");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 320, 60));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 150, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Location");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 30));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Number of rooms");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 150, 30));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Square");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 150, 30));

        Adress.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, -1));

        Price.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 250, -1));

        Location.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 250, -1));

        No_rooms.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(No_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 250, -1));

        square.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 250, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 130, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Short description");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        sh_description.setBackground(new java.awt.Color(255, 255, 255));
        sh_description.setColumns(20);
        sh_description.setRows(5);
        jScrollPane1.setViewportView(sh_description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 250, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 100, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Login image.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, 1360, 1180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Name required");
        }
        else if(Last_name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Last Name required");
        }
          else if(Phone_number.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Phone number required");
        }
          else if(Email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Email required");
        }
          else if(Adress.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Adress required");
        }
          else if(Location.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Location required");
        }
          else if(No_rooms.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Number of rooms required");
        }
          else if(square.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Square required");
        }
          else if(Price.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Price required");
        }
          else if(sh_description.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Description required");
        }
          else{
        String query = "INSERT INTO add_properties(name, lname, phone, email, adress, location, nr_rooms, square, price, short_description) VALUES (?,?,?,?,?,?,?,?,?,?)";
    try {
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, Name.getText());
        ps.setString(2, Last_name.getText());
        ps.setString(3, Phone_number.getText());
        ps.setString(4, Email.getText());
        ps.setString(5, Adress.getText());
        ps.setString(6, Location.getText());
        ps.setString(7, No_rooms.getText());
        ps.setString(8, square.getText());
        ps.setString(9, Price.getText());
        ps.setString(10, sh_description.getText());
        ps.execute();
        JOptionPane.showMessageDialog(null, "New properties added");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Try again!!!");
        System.out.println(ex);
    }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Last_nameActionPerformed

    private void Phone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_numberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Properties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adress;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Last_name;
    private javax.swing.JTextField Location;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField No_rooms;
    private javax.swing.JTextField Phone_number;
    private javax.swing.JTextField Price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea sh_description;
    private javax.swing.JTextField square;
    // End of variables declaration//GEN-END:variables
}
