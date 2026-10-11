import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.Serializable;
import java.io.FileInputStream;

import javax.swing.filechooser.*;
import java.util.*;

public class NFileIO implements Serializable
{
              
        FileInputStream iStream = null;
		
        static File file = null;
	static String filePath = "";
        static String fileName = "";
        static long fileSize = 0;
        static String extension = "";
        JFrame frame = null;
        static final int DIALOG_OPEN = 0;
        static final int DIALOG_SAVE = 1;
        
        public NFileIO(JFrame frame)
        {
            this.frame = frame;
        }

	public File getFile(FileNameExtensionFilter filter, boolean verbose, int DialogType, String currentDir)
	{
		JFileChooser choose = new JFileChooser();
		File current = new File(currentDir);
                
                if(current.exists() && current.isDirectory()){
                  
                     // choose.setCurrentDirectory(file);
                }
                

		choose.setFileFilter(filter);

                int dialogState = -1;
                
                if(DialogType==0){
                    dialogState = choose.showOpenDialog(this.frame);
                }else if(DialogType==1){
                    dialogState = choose.showSaveDialog(this.frame);
                }
		
		if(dialogState == 0)
		{
			file = choose.getSelectedFile();
                        
			fileName = file.getName();
			filePath = file.getAbsolutePath();
                        fileSize = file.length();
                        //extension = fileName.substring(fileName.lastIndexOf(".") , fileName.length());
        
                        if(verbose){
                            System.out.println("+++++++++++++++++++++++++++++\nFile Name: " + fileName + "\nPath: " + filePath + "\nSize: " + fileSize + "byte\nFile Extension: " + extension + "\n+++++++++++++++++++++++++++++");
                        }
                }else{ JOptionPane.showMessageDialog(null, "No file was selected"); }
                        
		return file;
	}
        //----------------------------------------------------------------------

                
        public byte[] getByte(File file)
        {
            byte fileByte[] = null;
            
            if(file!=null && file.exists() && file.isFile())
            {
                try
		{
                    int length = ((Number)file.length()).intValue();

                    byte[] tempByte = new byte[length];

                    iStream =  new FileInputStream(file);

                    iStream.read(tempByte);

                    fileByte = tempByte;

                    iStream.close();
                }
		catch(Exception e){ e.printStackTrace(); }

            }else{
                JOptionPane.showMessageDialog(null,"Cannot read file");
            }
                
            return fileByte;
        }
        //----------------------------------------------------------------------
                
	public void writeFile(File inputFile, File outputFileName)
	{
		try
		{
                    FileOutputStream stream = new FileOutputStream( outputFileName );
                    stream.write(getByte( inputFile ));
		}
		catch(Exception m){ m.printStackTrace(); }
	}
        //----------------------------------------------------------------------

        
        public void writeFile(byte[] inputFile, File outputFileName)
	{
		try
		{
                    FileOutputStream stream = new FileOutputStream( outputFileName );
                    stream.write( inputFile );
		}
		catch(Exception m){ m.printStackTrace(); }
	}
        
        
        public String getText(File file)
        {
            String text = "";
            
            try{
                Scanner scanner = new Scanner(file);
                
                while(scanner.hasNext()){
                    text = text + (scanner.nextLine()+"\n");
                }
            }catch(Exception e){ e.printStackTrace(); }
            
            return text;
        }
        //----------------------------------------------------------------------
        
        
        public File[] getFiles(File directory )
        {
            File files[] = null;
            
            if(directory.isDirectory()){
                files = directory.listFiles();
            }
            return files;
        }
        
        
        public File[] filter(File nfile[], String fType){
            
            ArrayList<File> f = new ArrayList<File>();
            
            for(int k=0;k<nfile.length;k++){
                
                String fileName = nfile[k].toString();
                String type = fileName.substring(fileName.lastIndexOf(".") , fileName.length());
        
                if(type.equals(fType))
                {
                        f.add(nfile[k]);
                }
            }
            
            File[] filtered = new File[f.size()];
            for(int i=0;i<filtered.length;i++){
                filtered[i] = f.get(i);
            }
            
            return filtered;
                    
        }
        
        
	public static void main(String g[])
	{
		new NFileIO( null).getFile(null, true, NFileIO.DIALOG_SAVE, "");
	}


}//end of class
