
/**
 * ThreeDimensional.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 *  Purpose: This class is the base of the three dimensional shapes it has a basic constructor 
 * that can be used by the shapes and volume formulas that the shapes can  utilize
 */
package projectwk4;

import java.awt.*;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;


public class ThreeDimensional extends Shape{
    double height;
    String fileLoc = "";
    JFrame frame;
    JPanel picPanel;
    ThreeDimensional(double l, double w, double d){
        super(l,w,d);
    }
    
    ThreeDimensional(double r){
        super(r);
    }
    
    ThreeDimensional(double r, double h){
        super(r);
        this.height = h;
    }
    
    double volPrism(){
        return length*width*depth;
    }
    double volShere(){
        return (4/3)*Math.PI*radius*radius*radius;
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
