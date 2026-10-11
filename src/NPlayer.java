import javax.sound.sampled.*;
import java.io.*;

public class NPlayer
{
	static byte[] audioBytes;
	AudioInputStream audioInputStream;
	static Clip clip;
	static File fileIn;
	static AudioFormat format;

        public NPlayer(byte audio[])
        {
             try
            {
		clip = AudioSystem.getClip();
                //format = 
                
                //clip.open(format, audio, 0, audio.length);
            }
             catch(Exception e){}	
        }
        
        
        
        
	public NPlayer(File file)
	{
            try
            {
		clip = AudioSystem.getClip();

		fileIn = file;

  		audioInputStream = 
   		AudioSystem.getAudioInputStream(fileIn);

		format = audioInputStream.getFormat();
		 
  		audioBytes = new byte[((Number)fileIn.length()).intValue()];
  		try
		{
    			int numBytesRead = 0;
    			int numFramesRead = 0;
    
    			while ((numBytesRead = 
      			audioInputStream.read(audioBytes)) != -1){
           				//do something usefull with the byte
                        }
  		} 
		catch (Exception ex)
		{ 
   			ex.printStackTrace();
  		}
            }
            catch (Exception e) 
            {
 		e.printStackTrace();
            }
	}//end of constructor


	static void play()
	{
		try{
		clip.open(format,audioBytes,0,((Number)fileIn.length()).intValue());
                
     		clip.loop(0);
		}catch(Exception e7){
			//catch exception
		}
	}

	static void stop()
	{
		try{ clip.stop(); }catch(Exception e8){  }
	}
	
	public static void main(String sd[]){ 	}

}//end of class