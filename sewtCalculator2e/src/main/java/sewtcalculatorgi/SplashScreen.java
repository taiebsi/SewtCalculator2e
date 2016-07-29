/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewtcalculatorgi;

/**
 *
 * @author taieb
 */
     import java.awt.BorderLayout; 
import java.awt.Color; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.BorderFactory; 
import javax.swing.ImageIcon; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JProgressBar; 
import javax.swing.JWindow; 
import javax.swing.Timer; 
public class SplashScreen extends JWindow 
{
private static JProgressBar progressBar; 
private static int count = 1;
private static int TIMER_PAUSE = 100; 
private static int PROGBAR_MAX = 30; 
private static Timer progressBarTimer;

    /**
     * @return the progressBarTimer
     */
    public static Timer getProgressBarTimer() {
        return progressBarTimer;
    }
     
public SplashScreen() { createSplash(); } 
private void createSplash() { 
    super.setBackground(new Color(0, 0, 0, 0));
    JPanel panel = new JPanel(); 
    panel.setLayout(new BorderLayout()); 
    panel.setOpaque(false);
 // panel.setOpaque(false);
    JLabel splashImage = new JLabel(new ImageIcon(getClass().getResource("sun.gif")));
  //  splashImage.setOpaque(false);
    panel.add(splashImage); 
    progressBar = new JProgressBar(); 
    progressBar.setMaximum(PROGBAR_MAX); 
    progressBar.setForeground(new Color(2, 8, 54)); 
  //  progressBar.setBorder(BorderFactory.createLineBorder(Color.black)); 
    panel.add(progressBar, BorderLayout.SOUTH); 
    
    this.setContentPane(panel); this.pack();
    this.setLocationRelativeTo(null); 
    this.setVisible(true); 
    startProgressBar();
}
private void startProgressBar() { 
    progressBarTimer = new Timer(TIMER_PAUSE, new ActionListener() 
    { public void actionPerformed(ActionEvent arg0) 
    { progressBar.setValue(count); if (PROGBAR_MAX == count) 
    { SplashScreen.this.dispose(); getProgressBarTimer().stop(); } count++; } }
    ); 
        getProgressBarTimer().start(); 
}
}
