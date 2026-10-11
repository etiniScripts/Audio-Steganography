

import java.awt.Color;
import javax.swing.*;


public class StSplash extends javax.swing.JPanel {

    static JFrame frame = new JFrame("IShield");
    
    
    public StSplash() {
        initComponents();
        
        int x = Screen.width();
        int y = Screen.height();
        
        frame.setLocation((x/2) - (537/2), y/2-273/2);
        frame.add(this);
        //frame.setResizable(false);
        frame.setUndecorated(true);
	    frame.setSize(600,310);
	    frame.setVisible(true);
        
        new SplashSimulator(jProgressBar1, 500, 10, frame);
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
        
        new StSplash();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
//        jProgressBar1.setBackground(Color.white);
        

        setBackground(NColors.getBrand()); //new color
        //setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(103, 58, 183)));
        setLayout(null);


        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel5.setForeground(NColors.getWhite());
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("IShield");
        add(jLabel5);
        jLabel5.setBounds(30, 30, 540, 30);
        
        
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(NColors.getWhite());
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("An Encoder/Decoder Steganographic Modeling for the Protection");
        add(jLabel6);
        jLabel6.setBounds(30, 65, 540, 30);
        
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(NColors.getWhite());
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("of Sensitive Information in Banks");
        add(jLabel7);
        jLabel7.setBounds(30, 88, 540, 30);
        

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(NColors.getWhite());
        jLabel4.setText("Please wait while the program loads . . .");
        add(jLabel4);
        jLabel4.setBounds(30, 190, 540, 20);

        jProgressBar1.setStringPainted(false);
        add(jProgressBar1);
        jProgressBar1.setBounds(30, 230, 540, 20);
    }

    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
}
