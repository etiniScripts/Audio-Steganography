import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;

public class StReport extends javax.swing.JPanel {

    static JFrame frame = new JFrame("IShield");
    static File[] audioFiles = null;   
    
    public StReport() {
        initComponents();
                       
        int x = Screen.width();
        int y = (int)(Screen.height() * 0.75);
        
        jScrollPane4.setBounds(30,120, 450, y-190);

        loadFile();

	JLabel refresh = new JLabel("Refresh");
        refresh.setOpaque(true);
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setForeground(NColors.getWhite());
	refresh.setBackground(NColors.getBrand());
                
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               loadFile();
            }
        });

	refresh.setBounds(405,70,80,22);
	jPanel1.add(refresh);

        frame.add(this);
        frame.setLocation(235, (Screen.height() - y )/2 );
        frame.setUndecorated(true);
	frame.setSize(510, y);
    }

    
    public void loadFile(){
        
	jPanel2.removeAll();

        NFileIO nfile = new NFileIO(frame);
        String folder = "audio";
        File[] files = nfile.getFiles( new File( folder ) );
        
        File filtered[] = nfile.filter(files, ".wav");
        
        
        
        audioFiles = filtered;
        
        for(int n=0;n<filtered.length;n++){
            
            PlayList playList = new PlayList(filtered[n]);
            playList.setPreferredSize(new Dimension(440, 50) );
        
            jPanel2.add(playList);
        }
        
        jPanel2.setPreferredSize(new Dimension(440, 50*filtered.length+(filtered.length*5)) );
	jPanel2.updateUI();
         jLabel1.setText(filtered.length + " files");

	 jLabel1.setText(filtered.length + " files");
        
    }
    

    public static void main(String g[])
    {
        new StReport();
    }
     
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setBackground(NColors.getWhite());
        setLayout(null);


        jPanel1.setBackground(NColors.getWhite());
        jPanel1.setLayout(null);

        jLabel15.setBackground(NColors.getWhite());
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
        jLabel15.setBounds(420, 30, 50, 30);

        jLabel18.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); 
        jLabel18.setForeground(NColors.getBrand());
        jLabel18.setText("REPORT");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(50, 30, 100, 30);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14));
        jLabel1.setForeground(NColors.getBrand());
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 120, 30);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 100);

        jPanel2.setBackground(NColors.getWhite());
        jScrollPane4.setViewportView(jPanel2);

        add(jScrollPane4);
        jScrollPane4.setBounds(30, 130, 450, 340);
    }

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {
        frame.setVisible(false);
    }


    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;

}
