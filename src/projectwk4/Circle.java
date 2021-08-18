

package projectwk4;

/**
 * Circle.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a circle and shows the area
 */

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Circle extends TwoDimensional {
    private double results = 0; 
    private JFrame shapeframe;
    private double rad = 0; 
    Circle(double radius){
        super(radius);
        this.rad = radius;
        fileLoc ="./shapes/circle.jpg";
    }
   
    void showStats(){
        results = this.areaCir();
        System.out.println(
        "The circle has an area of "+ results);
    }
    
/* For a future experiment    
    @Override 
    public  void draw(){
        shapeframe = new JFrame(); 
        shapeframe.setSize(new Dimension(320,320));
        shapeframe.setVisible(true);
        
        JPanel p = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
			
				Shape circle = new Ellipse2D.Double(100, 100, rad*2, rad*2);
                                g2.setPaint(Color.BLACK);    
				g2.draw(circle);
	
			}
		};
        p.add(new JLabel(" Area of the circle is "+this.areaCir()));
       shapeframe.add(p);
        
    } 
 */   


}
