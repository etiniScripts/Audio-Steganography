
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class PlayList extends javax.swing.JPanel {

    File audioFile = null;
    NFileIO nFileIO = null;
  
    NPlayer player = null;
    
    public PlayList(File file) {
        initComponents();
        
        jLabel1.setText(file.getName());
        audioFile = file;
        
          nFileIO = new NFileIO( new JFrame() );
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 249, 249));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("wave file name");
        add(jLabel1);
        jLabel1.setBounds(20, 10, 310, 30);

        jLabel2.setBackground(  new java.awt.Color(200, 200, 200) );
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(340, 10, 2, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/play.png"))); 
        jLabel3.setToolTipText("Play");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(370, 15, 24, 20);

        jLabel4.setBackground( new java.awt.Color(200, 200, 200) );
        jLabel4.setToolTipText("Stop");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(410, 15, 20, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(249,249,249));
    }//GEN-LAST:event_formMouseExited

private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
// TODO add your handling code here:
    //play
     if( player!=null ){
        player.stop();
    }
    
    player = new NPlayer(audioFile);
    player.play();
}//GEN-LAST:event_jLabel3MouseClicked

private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
// TODO add your handling code here:
    //stop
     if( player!=null ){
        player.stop();
    }
}//GEN-LAST:event_jLabel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
