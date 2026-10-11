
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.util.*;


public class StEncode extends javax.swing.JPanel {

    static JFrame frame = new JFrame("Encode");
    static int layer = 2;
    static int codedSize = 0;
    static int start = 0;
    
    File newAudioFile = null;
    
    NFileIO nFileIO = null;
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
    
    File audioFile = null;
    NPlayer player = null;
    
    ArrayList<String> audioBinary = new ArrayList<String>();
    ArrayList<String> cypherBinary = new ArrayList<String>();
    
    ArrayList<String> encodedBinary = new ArrayList<String>();
    ArrayList<Byte> encodedByte = new ArrayList<Byte>();
    
    static final int pad = 8;
    
    public StEncode() {
        initComponents();
                       
        int x = Screen.width();
//        int y = Screen.height();
        int y = (int)(Screen.height() * 0.75);
        
        nFileIO = new NFileIO( frame );
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,255,255) );
        panel.setPreferredSize( new Dimension(753, y) );
        panel.setLayout( null );
        
        setBounds(0,0,753, 615);
        panel.add(this);
        
        frame.add(panel);
        frame.setLocation(235, (Screen.height() - y )/2 );
        frame.setUndecorated(true);
	frame.setSize(753, y);
    }

    
    public static void main(String g[])
    {
        new StEncode();
    }
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(NColors.getWhite());
        setLayout(null);

        jPanel4.setBackground(NColors.getWhite());
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Load Input Text:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(30, 20, 130, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Load Input Audio:");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(30, 60, 130, 30);

        jTextField1.setEditable(false);
        jPanel4.add(jTextField1);
        jTextField1.setBounds(170, 20, 420, 30);

        jTextField2.setEditable(false);
        jPanel4.add(jTextField2);
        jTextField2.setBounds(170, 60, 420, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton1.setForeground(new java.awt.Color(0,0,0));
        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(610, 20, 130, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jButton2.setForeground(new java.awt.Color(0,0,0));
        jButton2.setText("Load");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(610, 60, 130, 30);

        add(jPanel4);
        jPanel4.setBounds(-10, 90, 770, 100);

        jLabel3.setBackground(NColors.getBrand());
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INPUT AUDIO DATA");
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
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INPUT TEXT");
        jLabel4.setOpaque(true);
        add(jLabel4);
        jLabel4.setBounds(0, 410, 220, 14);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 430, 290, 140);

        jLabel5.setBackground(NColors.getBrand());
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENCRYPT");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(230, 400, 70, 30);


        jLabel8.setBackground(NColors.getBrand());
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel8.setBounds(430, 280, 90, 40);

        jLabel9.setBackground(NColors.getBrand());
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel9.setBounds(540, 280, 90, 40);

        jLabel10.setBackground(NColors.getBrand());
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("STOP");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10);
        jLabel10.setBounds(670, 400, 70, 30);

        jLabel11.setBackground(NColors.getBrand());
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setForeground(NColors.getWhite());
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("H I D E");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11);
        jLabel11.setBounds(650, 280, 90, 40);

        jLabel12.setBackground(NColors.getBrand());
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("OUTPUT AUDIO DATA");
        jLabel12.setOpaque(true);
        add(jLabel12);
        jLabel12.setBounds(360, 410, 150, 14);

        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        add(jScrollPane3);
        jScrollPane3.setBounds(360, 430, 380, 170);

        jLabel13.setBackground(NColors.getBrand());
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PLAY");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        add(jLabel13);
        jLabel13.setBounds(590, 400, 70, 30);

        jLabel14.setBackground(NColors.getBrand());
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("SAVE");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        add(jLabel14);
        jLabel14.setBounds(520, 400, 60, 30);

        jPanel1.setBackground(NColors.getWhite());
        jPanel1.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); 
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

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); 
        jLabel18.setForeground(NColors.getBrand());
        jLabel18.setText("ENCODE");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 30, 300, 30);

        jLabel20.setText("");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(80, 60, 130, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 90);
        add(jLabel16);
        jLabel16.setBounds(340, 230, 250, 20);

        jLabel17.setBackground(NColors.getBrand());
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add(jLabel17);
        jLabel17.setBounds(360, 370, 290, 20);

        jLabel19.setBackground(NColors.getBrand());
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText(" Message Size:");
        jLabel19.setOpaque(true);
        add(jLabel19);
        jLabel19.setBounds(10, 570, 290, 30);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // load text
        File file = nFileIO.getFile(filter, false, NFileIO.DIALOG_OPEN, "audio/");
        
        String text = nFileIO.getText(file);
        
        jTextField1.setText(file.toString());
        jTextArea2.setText(text);
    }//-LAST:event_jButton1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {
        frame.setVisible(false);
    }//-LAST:event_jLabel15MouseClicked

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

    audioFile = nFileIO.getFile( new FileNameExtensionFilter("Wav Audio Files", "wav") , false, NFileIO.DIALOG_OPEN, "audio/");
    audioBinary.clear();
    
    jTextField2.setText(NFileIO.filePath);
    
    final byte[] data = nFileIO.getByte(audioFile);
	
    jLabel3.setText("INPUT AUDIO DATA [" + data.length + "byte]");

    final String dataString[] = new String[data.length];
    
    Thread t = new Thread()
    {
        String byteString = "";
        
        public void run(){
    
            jButton2.setEnabled(false);
            jLabel16.setText("Loading... please wait");
            
            for(int i=0; i<data.length; i++){
                String bin = toBinary(data[i]);
                
                //----------------
                int padSize = pad-bin.length();
                String padString = "";
        
                if(bin.length()<pad){
                    for(int p=0; p<padSize; p++){
                        padString = padString + "0";
                    }
                } 
                bin = padString + bin;
        
                //--------------
                jTextArea1.append( bin +"  " );
                audioBinary.add(bin);
            }
            
            jButton2.setEnabled(true);
            jLabel16.setText("");
        }
    };
    
    t.start();
    
}

private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {

    if( player!=null ){
        player.stop();
    }
    
    player = new NPlayer(audioFile);
    player.play();
}

private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel9MouseClicked

    if( player!=null ){
        player.stop();
    }
}//-LAST:event_jLabel9MouseClicked

private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel11MouseClicked

    //HIDE BUTTON
            
    int len = audioBinary.size();
    int tLen = cypherBinary.size();
    encodedBinary.clear();
    encodedByte.clear();
            
    if(tLen<len){
        
        jLabel17.setText("Hiding... please wait");
        
        start = audioBinary.size()-cypherBinary.size();
        //JOptionPane.showMessageDialog(null, "start hiding from index " + start );
        for(int r=0; r<start; r++)//add remainning audio data
        {
            byte eByte2 = toByte(audioBinary.get(r));
            encodedBinary.add( audioBinary.get(r) );
            encodedByte.add( eByte2 );
            
            //jTextArea3.append( encodedByte.get(r)+"" );
            jTextArea3.append( encodedBinary.get(r) + " "  );
        }
        
        //codedSize = encodedBinary.size();
        jTextArea3.append( "\n---------------------------------\n" );
    
        int index = 0;
        for(int x=start; x<len; x++){
            
            String eBinary = encode(audioBinary.get(x), cypherBinary.get(index) , layer);
            byte eByte = toByte(eBinary);
            
            encodedBinary.add( eBinary );
            encodedByte.add( eByte );
            
            jTextArea3.append( encodedBinary.get(x) + " "  );
            
            index++;
        }
        
        
    }else{
        JOptionPane.showMessageDialog(null, "Cannot hide");
    }
    //JOptionPane.showMessageDialog(null, "YOUR CODED SIZE IS: " + codedSize + " - TOTAL SIZE: " + encodedBinary.size());
    
    jLabel17.setText("");
   
}//-LAST:event_jLabel11MouseClicked


private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel5MouseClicked

    //ENCRYPT BUTTON
    
    cypherBinary.clear();
    //jTextArea1.setText("");
    
    String txt = jTextArea2.getText();
    String message = txt;
    //encrypt
    CryptoSystem crypto = new CryptoSystem();	
    String key = JOptionPane.showInputDialog(frame, "Enter an alphabetic Key", "");
    crypto.createKey( key.toUpperCase() );
    String encr = crypto.encode( message );
    
    txt = encr;
    
    //System.out.println("Key: " + key + " | Message: " + message + " | Cypher: " + txt );
    jTextArea2.setText(txt);
    jLabel19.setText( " Message Size: " + txt.length() + "byte" );
    jLabel20.setText(" ");
    
    JTextArea a = new JTextArea();
    //String txt = txtF.substring(0, txtF.length()-1);
    
    byte cypherByte[] = txt.getBytes();//get ascci representation of data
   
    //JOptionPane.showMessageDialog(null, cypherByte.length + " - " + cypherByte[0] );
   
    for( byte x:cypherByte){
        
        String bin = toBinary(x) + "";
    
        int cypherByteSize = bin.length();
    
        int padSize = pad-cypherByteSize;
        String padString = "";
        
        if(cypherByteSize<pad){

        for(int p=0; p<padSize; p++){
            padString = padString + "0";
        }
        bin = padString + bin;
    
    }else{
        bin = bin.substring(0, pad); //review later
    }
    
        a.append( bin );
    }
    
    int cypherTotal = a.getText().length();
    
    //JOptionPane.showMessageDialog(null,  "PAD: " + padSize + " String: " + padString );
    String cypher = a.getText();
    
    for( int k=0; k<cypherTotal; k++ ){
        cypherBinary.add( cypher.charAt(k)+"" );
        //jTextArea2.append( cypher.charAt(k)+"\n" );
    }
   
}//-LAST:event_jLabel5MouseClicked

private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel14MouseClicked
   
    String name = JOptionPane.showInputDialog(frame , "Enter File Name" , "xx" );
    
    newAudioFile = new File("audio/" + name + ".wav" ); 

    byte[] data = new byte[encodedByte.size()];
    for(int n=0;n<data.length;n++){
        data[n] = encodedByte.get(n);
    }
    nFileIO.writeFile( data, newAudioFile);
    
    JOptionPane.showMessageDialog(null, "File saved!");
}

private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel13MouseClicked
// TODO add your handling code here:
    
    if( player!=null ){
        player.stop();
    }
    
    if( newAudioFile!=null ){
        player = new NPlayer(newAudioFile);
        player.play();
    }else{
        JOptionPane.showMessageDialog(null, "Please save file first");
    }
}//-LAST:event_jLabel13MouseClicked

private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//-FIRST:event_jLabel10MouseClicked
// TODO add your handling code here:
    if( player!=null ){
        player.stop();
    }
}//-LAST:event_jLabel10MouseClicked



public String toBinary(byte value){
    
    String binary = Integer.toBinaryString(( value +256 )%256);
    
    return binary;
}

public byte toByte(String binaryValue){
    
    //Integer.parseInt(binarValue);
    int integer = Integer.parseInt(binaryValue, 2);
    
    byte  b = (integer+"").getBytes()[0];
    byte  b2 = (byte)integer;
    
    //JOptionPane.showMessageDialog(null, "VALUE IS: "+ binaryValue + " INT IS : "+ integer + " BYTE" + b );

    return b2;
}


public String encode(String audio, String txt, int layer)
{
    char audioB[] = audio.toCharArray();
    
    String audioBin[] = new String[audioB.length];
    for(int i=0;i<audioB.length;i++){
        audioBin[i] = (audioBin.length-layer==i)? txt : audioB[i]+"";
    }
    //audioBin[audioBin.length-layer] = (byte)Integer.parseInt(txt);
    
    String codedAudio = "";
    for(String x:audioBin){
        codedAudio+=(x);
    }
    
    //jTextArea3.append(audio + " - " + txt + " - " + codedAudio + "\n");
    
    return codedAudio;
}


    // Variables declaration - do not modify//-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//-END:variables
}
