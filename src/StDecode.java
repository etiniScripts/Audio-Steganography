
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class StDecode extends javax.swing.JPanel {

    static JFrame frame = new JFrame("Encode");
   
    static final int pad = 8;
    File audioFile = null;
    NPlayer player = null;
    
    ArrayList<String> audioBinary = new ArrayList<String>();
    ArrayList<String> cypherBinary = new ArrayList<String>();
    ArrayList<Byte> cypherByte = new ArrayList<Byte>();
    
    //ArrayList<String> decodedBinary = new ArrayList<String>();
    //ArrayList<Byte> decodedByte = new ArrayList<Byte>();
    
    NFileIO nFileIO = null;
    
    
    public StDecode() {
        initComponents();
                       
        nFileIO = new NFileIO( frame );
         
        int x = Screen.width();
        // int y = Screen.height();
        int y = (int)(Screen.height() * 0.75);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,255, 255) );
        panel.setPreferredSize( new Dimension(753, y) );
        panel.setLayout( null );
        
        setBounds(0,0,753, 615);
        panel.add(this);

	jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveOutputText(jTextArea3);
            }
        });
        
        frame.add(panel);
//        frame.setLocation(235, 0);
        frame.setLocation(235, (Screen.height() - y )/2 );
        frame.setUndecorated(true);
	frame.setSize(753, y);
    }

    public void saveOutputText(JTextArea txt)
    {
        NFileIO io = new NFileIO(frame);
        File outputFile = io.getFile( new FileNameExtensionFilter("Text Files", "txt") , false, NFileIO.DIALOG_SAVE , "");
    
        byte[] text = txt.getText().getBytes();
        if(text.length>=1){
            io.writeFile(text, outputFile);
		JOptionPane.showMessageDialog(frame, "File saved!");
        }else{
		JOptionPane.showMessageDialog(frame, "Could not save file!");
	}
    }


    public static void main(String g[])
    {
        new StDecode();
    }
    
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(NColors.getWhite());
//        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        setLayout(null);

        jPanel4.setBackground(NColors.getWhite());
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Load Input Audio:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 40, 130, 30);

        jTextField2.setEditable(false);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(170, 40, 420, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(NColors.getBrand());
	
        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(610, 40, 130, 30);

        add(jPanel4);
        jPanel4.setBounds(-10, 90, 770, 100);

        jLabel3.setBackground(NColors.getBrand());
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(NColors.getWhite());
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SAMPLE AUDIO DATA");
        jLabel3.setOpaque(true);
        add(jLabel3);
        jLabel3.setBounds(0, 210, 300, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 290, 160);

        jLabel4.setBackground(NColors.getBrand());
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(NColors.getWhite());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OUTPUT TEXT");
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(0, 410, 300, 14);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 430, 290, 170);

        jLabel5.setBackground(NColors.getBrand());
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(NColors.getWhite());
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DECRYPT");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(430, 560, 310, 40);

//        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
//        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forward.png"))); // NOI18N
//        add(jLabel6);
//        jLabel6.setBounds(380, 550, 30, 50);

        jLabel8.setBackground(NColors.getBrand());
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(NColors.getWhite());
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PLAY");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8);
        jLabel8.setBounds(430, 280, 70, 40);

//        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forward.png"))); // NOI18N
//        add(jLabel7);
//        jLabel7.setBounds(370, 230, 30, 140);

        jLabel9.setBackground(NColors.getBrand());
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(NColors.getWhite());
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("STOP");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(520, 280, 70, 40);

        jLabel10.setBackground(NColors.getBrand());
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(NColors.getWhite());
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SAVE");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        add(jLabel10);
        jLabel10.setBounds(670, 400, 70, 30);

        jLabel11.setBackground(NColors.getBrand());
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(NColors.getWhite());
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("U N H I D E");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11);
        jLabel11.setBounds(610, 280, 130, 40);

        jLabel12.setBackground(NColors.getBrand());
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(NColors.getWhite());
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("DECRYPTED TEXT");
        jLabel12.setOpaque(true);
        add(jLabel12);
        jLabel12.setBounds(360, 410, 150, 14);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        add(jScrollPane3);
        jScrollPane3.setBounds(360, 430, 380, 100);

//        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
//        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forward.png"))); // NOI18N
//        add(jLabel16);
//        jLabel16.setBounds(340, 220, 40, 160);

        jLabel14.setBackground(NColors.getBrand());
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(NColors.getWhite());
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CLEAR");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        add(jLabel14);
        jLabel14.setBounds(520, 400, 130, 30);

        jPanel1.setBackground(NColors.getWhite());
        jPanel1.setLayout(null);
        
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(NColors.getBrand());
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Close");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(690, 30, 50, 30);

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        jLabel18.setForeground(NColors.getBrand());
        jLabel18.setText("DECODE");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 30, 300, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 90);

//        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
//        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forward.png"))); // NOI18N
//        add(jLabel17);
//        jLabel17.setBounds(350, 550, 30, 50);
        add(jLabel19);
        jLabel19.setBounds(340, 230, 210, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        frame.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    audioFile = nFileIO.getFile( new FileNameExtensionFilter("Wav Audio Files", "wav") , false, NFileIO.DIALOG_OPEN, "AudioDepo/");
    audioBinary.clear();
    
    jTextField2.setText(NFileIO.filePath);
    
    final byte[] data = nFileIO.getByte(audioFile);
    
    final String dataString[] = new String[data.length];
    
    Thread t = new Thread()
    {
        String byteString = "";
        
        public void run(){
    
            jButton2.setEnabled(false);
            jLabel19.setText("Loading... please wait");
            
            for(int i=0; i<data.length; i++){
                String bin = toBinary(data[i]);
                
                //----------------
                //int padSize = 7-bin.length();
               // String padString = "";
        
               // if(bin.length()<7){
                //    for(int p=0; p<padSize; p++){
                //        padString = padString + "0";
                //    }
               // } 
               // bin = padString + bin;
        
                //--------------
                jTextArea1.append( bin +"  " );
                audioBinary.add(bin);
            }
            
            jButton2.setEnabled(true);
            jLabel19.setText("");
        }
    };
    
    t.start();

}//GEN-LAST:event_jButton2ActionPerformed

private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    // TODO add your handling code here:
    //play
      if( player!=null ){
        player.stop();
    }
    
    player = new NPlayer(audioFile);
    player.play();
}//GEN-LAST:event_jLabel8MouseClicked

private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
    // TODO add your handling code here:
    //stop
      if( player!=null ){
        player.stop();
    }
   
}//GEN-LAST:event_jLabel9MouseClicked

private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    // TODO add your handling code here:
    //unhide
    int byteSize = audioBinary.size();
    int msgSize = Integer.parseInt( JOptionPane.showInputDialog(null, "Enter Message Size") );
    int start = byteSize-(msgSize*pad);
    
    //JOptionPane.showMessageDialog(null, "start extraction from index " + start + " FINAL " + byteSize + " EXTRACT SIZE: " + msgSize );
    
        
    if(start<byteSize){
        
         for(int x=start; x<byteSize; x++){
            
            
            String bin = audioBinary.get(x);
    
            int sByteSize = bin.length();
    
            int padSize = pad-sByteSize;
        
            String padString = "";
        
            if(sByteSize<pad){

            for(int p=0; p<padSize; p++){
                padString = padString + "0";
            }
            
            bin = padString + bin;
    
    }else{
        bin = bin.substring(0, pad); //review later
    }
    
        
            //String cypher = decode(audioBinary.get(x) , StEncode.layer);
            String cypher = decode(bin , StEncode.layer);
           
            cypherBinary.add(cypher);
            
            
        }//end of loop
    
         
         String binary[] = get7Bit(cypherBinary);
         
         for(int m=0;m<binary.length;m++){
             
             byte b = toByte(binary[m]);
             cypherByte.add(b);
            
             jTextArea3.append( (char)b+""  );
         }
         
    }
    
}//GEN-LAST:event_jLabel11MouseClicked

private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
    jTextArea3.setText("");
}//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // decrypt
    String message = jTextArea3.getText();
            
    CryptoSystem crypto = new CryptoSystem();	
    String key = JOptionPane.showInputDialog(frame, "Enter an alphabetic Key", "");
    crypto.createKey( key.toUpperCase() );
    
    String decr = crypto.decode( message );
    
    jTextArea3.setText(decr);
    
    }//GEN-LAST:event_jLabel5MouseClicked



public String toBinary(byte value){
    
    String binary = Integer.toBinaryString(( value +256 )%256);
    
    return binary;
}

public byte toByte(String binaryValue){
    
    //Integer.parseInt(binarValue);
    int integer = Integer.parseInt(binaryValue, 2);
    
    byte  b = (integer+"").getBytes()[0];
    byte  b2 = (byte)integer;
    
    //JOptionPane.showMessageDialog(null, "VALUE IS: "+ binaryValue + " INT IS : "+ integer + " BYTE" + b + " BYTE 2: " + b2);

    return b2;
}



public String decode(String audio, int layer)
{
    //String subAudio = audio.substring(0, audio.length()-1);
    
    char audioB[] = audio.toCharArray();
    
    String audioBin[] = new String[audioB.length];
    
    int index = audioBin.length-layer;
    
    String txtBin = audioB[index]+"";
        
    jTextArea2.append(audio + " - " + " - " + txtBin + "\n");
    
    return txtBin;
}



public String[] get7Bit(ArrayList cypherByte){

    String n7Bit[] = new String[cypherByte.size()/pad];
    
    String tBit = "";
    for(int k=0;k<cypherByte.size();k++){
        tBit+=( cypherByte.get(k) );
    }
    
    int loop = 0;
    for(int x=0; x<cypherByte.size(); x+=pad)
    {
        int end = (x+pad);
        n7Bit[loop] = tBit.substring(x, end);
        loop++;
    }
    
    return n7Bit;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
