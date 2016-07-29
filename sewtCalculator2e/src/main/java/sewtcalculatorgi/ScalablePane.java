/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewtcalculatorgi;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author taieb
 */


    public class ScalablePane extends JPanel implements Serializable {

        private ImageIcon master;
 
public ScalablePane(){
	super();
    
}

    /**
     * @return the master
     */
    public ImageIcon getMaster() {
        return master;
    }

    /**
     * @param master the master to set
     */
    public void setMaster(ImageIcon master) {
        this.master = master;
    }

   
                

                @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
if(master!=null)
                g.drawImage(master.getImage(),0,0, this);
            }
    }
        
    