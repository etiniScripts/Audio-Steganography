import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class SplashSimulator {
    
    int value = 0;
    Timer timer = null;
    Random rand = new Random();
    JProgressBar progressBar = null;
    int step = 1;
    JFrame frame = null;
    
    public SplashSimulator(JProgressBar progressBar, int speed, int step, JFrame splashFrame)
    {
        this.progressBar = progressBar;
        this.step = step;
        
        this.frame = splashFrame;
        
        timer = new Timer(speed, new Tick() );
        timer.start();
    }
    
    
    public void loadSplash(int progress, Timer t)
    {
        if(progress < 100)
        {
            progressBar.setValue(progress);
        }else{
            progressBar.setValue(100);
            t.stop();
            frame.setVisible(false);
            takeAction();
        }
    }
    
    
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public void takeAction()
    {
        new StLogin();           
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    
        
    class Tick implements ActionListener
    {
        public void actionPerformed(ActionEvent t)
        {
            int inc = rand.nextInt( step )+1;
            value = value + inc;
            
            loadSplash(value, timer);
        }
    }
    
}
