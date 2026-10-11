/**
 *
 * @author Ny
 */

import javax.swing.*;
import java.awt.*;

public class StLogin extends javax.swing.JPanel {

    JFrame frame = new JFrame("Signin");
    
    public StLogin() {
        initComponents();
        
        int x = Screen.width();
//        int y = Screen.height();
        int y = (int)(Screen.height() * 0.75);
                
        jPanel3.setBounds(20, Screen.y(25),360, 210);
        jPanel2.setBounds(0, y-100,400, 100);
//        jLabel3.setBounds(0, y-132,400, 2);
          
        frame.add(this);
        frame.setUndecorated(true);
        frame.setLocation(x-400, (Screen.height() - y )/2 );
	frame.setSize(400,y);
	frame.setVisible(true);   
    }

       
    public static void main(String g[])
    {
//         try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            	if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (Exception ex) { ex.printStackTrace(); }
        
        new StLogin();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        
        setBackground(NColors.getWhite());
//        setBorder(javax.swing.BorderFactory.createLineBorder(NColors.getBrand()));
        setLayout(null);

        jPanel1.setBackground(NColors.getBrand());
        jPanel1.setLayout(null);

        jLabel1.setBackground(NColors.getBrand());
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(NColors.getWhite());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("IShield");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 180, 50);

        jLabel4.setBackground(NColors.getBrand());
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("x");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(350, 30, 34, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 100);


        jPanel2.setBackground(NColors.getBrand());
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(NColors.getWhite());
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ETINI AKANINYENE UNAAM"); // student name
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 20, 360, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("202200175"); //student reg number
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 60, 360, 20);

        add(jPanel2);
        jPanel2.setBounds(0, 402, 400, 100);

//        jLabel3.setBackground(NColors.getBrand());
//        jLabel3.setOpaque(true);
//        add(jLabel3);
//        jLabel3.setBounds(0, 400, 400, 2);

        jPanel3.setBackground(NColors.getWhite());
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("USERNAME:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 20, 100, 45);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("PASSWORD:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 90, 100, 45);

        jLabel7.setBackground(NColors.getBrand());
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LOGIN");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7);
        jLabel7.setBounds(230, 160, 100, 45);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(130, 20, 200, 45);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(130, 90, 200, 45);

        add(jPanel3);
//        jPanel3.setBounds(20, 150, 360, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // login        
        
        String username = jTextField1.getText();
        String pass = jPasswordField1.getText();
        
        if(username.equalsIgnoreCase("Etini") && pass.equalsIgnoreCase("175") )
        {
            frame.setVisible(false);
            new StMenu();
        }else{
            JOptionPane.showMessageDialog(frame, "Incorrect username/password");
        }
        
    }//GEN-LAST:event_jLabel7MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}