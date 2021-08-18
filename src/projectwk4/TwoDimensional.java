
package projectwk4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * TwoDimensional.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class is the base of the two dimensional shapes it has a basic constructor 
 * that can be used by the shapes and area formulas that the shapes can  utilize
 */
public class TwoDimensional extends Shape {
    
    String fileLoc = "";
    JFrame frame;
    TwoDimensional(double l, double w){
        super(l,w);
    }
    TwoDimensional(double radius){
        super(radius);
    }
    
    double areaRec(){
        return length*width;
    }
    double areaCir(){
        return Math.PI*radius*radius;
    }
    
      @Override 
    public void draw(){
        try{
            BufferedImage img = ImageIO.read(getClass().getResource(fileLoc));
            ImageIcon icon = new ImageIcon(img);
            Dimension dim = new Dimension( 400,400);
            frame = new JFrame();
            frame.setLayout(new FlowLayout());
            frame.setSize(500, 500);
            JLabel lbl = new JLabel();
            lbl.setIcon(icon);
            lbl.setPreferredSize(dim);

            frame.add(lbl);

            frame.setVisible(true);
            
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Sphere cannot be created");
        }
         
    }
}
