import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class StMenu extends javax.swing.JPanel {

    static JFrame frame = new JFrame("IShield");
    StEncode encode = new StEncode();
    StDecode decode = new StDecode();
    StReport report = new StReport();
    
    public StMenu() {
        
        initComponents();
        
        int x = Screen.width();
        int y = (int)(Screen.height() * 0.75);
        
        jPanel2.setBounds(0, Screen.y(28),235, 290);
        
        frame.add(this);
        frame.setAlwaysOnTop(true);
        frame.setUndecorated(true);
	frame.setSize(235,y);
        frame.setLocation(0, (Screen.height() - y )/2 );
	frame.setVisible(true);
        
    }
   
    
    public static void main(String g[])
    {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            	if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (Exception ex) { ex.printStackTrace(); }
        
        new StMenu();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(NColors.getWhite());
        setLayout(null);

        jPanel1.setBackground(NColors.getBrand());
        jPanel1.setLayout(null);

//        jLabel1.setBackground(new java.awt.Color(204, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("x");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(false);
        jLabel1.setForeground(NColors.getWhite());
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 20, 50);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel2.setForeground(NColors.getWhite());
        jLabel2.setText("IShield");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 140, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 240, 90);
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(0, 90, 240, 0);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);
        
        
        jLabel4.setBackground(NColors.getBrand());
//        jLabel4.setBorder(
//                javax.swing.BorderFactory.createLineBorder(Color.yellow, 10, true)
//                );
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.setForeground(NColors.getWhite());
        jLabel4.setText("Encode");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 210, 60);

        
        
        jLabel5.setBackground(NColors.getBrand());
        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.setForeground(NColors.getWhite());
        jLabel5.setText("Decode");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 110, 210, 60);
        
        

        jLabel6.setBackground(NColors.getBrand());
        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.setForeground(NColors.getWhite());
        jLabel6.setText("Report");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 210, 210, 60);

        add(jPanel2);
//        jPanel2.setBounds(0, 120, 220, 290);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       encode.frame.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        decode.frame.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       report.frame.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
