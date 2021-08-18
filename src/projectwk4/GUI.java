

package projectwk4;

/**
 * GUI.java
 * Created on Jul 13, 2020
 * @author Keith Combs II
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI{

    private int count = 0; 
    private JLabel label;
    private JLabel dimensions;
    private JLabel title;
    private JTextField txtField1;
    private JTextField txtField2;
    private JTextField txtField3;
    private JFrame frame;
    private JPanel panel;
    private JPanel subPanel;
    private JButton button;
    private JButton button2;
    private JComboBox shapeChoice;
    private String choice = "";
    public JFrame drawFrame;

    
    private final String[] menuChoices = {"Circle","Square","Triangle","Rectangle","Sphere","Cube","Cone","Cylinder","Torus"};
    
    public GUI(){
        
        frame = new JFrame(); 
        panel = new JPanel();
      
        title = new JLabel("Please choose your shape"); 
        panel.add(title);
        
        dimensions = new JLabel("Enter Dimensions: ");
        
        shapeChoice = new JComboBox(menuChoices);
        panel.add(shapeChoice);
        shapeChoice.setSelectedIndex(0);
        shapeChoice.addActionListener(new dropSelection());
        //Menu Choice Ends 
        
        
        label = new JLabel("");
        panel.add(label);  
        
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
        panel.setLayout(new GridLayout(0,1));
       
     
        
        
        frame.add(panel);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Project 2 Week 4");
       
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
    // used for selection of shape
    private class dropSelection implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent evt){
             
            JComboBox cb = (JComboBox)evt.getSource();
            choice = (String)cb.getSelectedItem();
           
            
            
            frame.setTitle("Project 2 Week 4");
            label.setText("You chose: "+choice);

            frame.setSize(500, 400);
            frame.revalidate();
            frame.repaint();
            
            
            switch (choice){
                case "Circle":
                    panel.add(dimensions, BorderLayout.LINE_START);
                    panel.add(new JLabel("Radius = "), BorderLayout.AFTER_LAST_LINE);
                    txtField1 = new JTextField();
                    
                    
                    panel.add(txtField1, BorderLayout.SOUTH);
                   

                     button = new JButton("Submit Dimensions");
                     panel.add(button, BorderLayout.SOUTH);
                     button.addActionListener(new submitBtn());
                    break;
                case "Square":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    panel.add(new JLabel("Length = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Width = "));
                    panel.add(txtField2);

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Triangle":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    
                    panel.add(new JLabel("Base = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Height = "));
                    panel.add(txtField2);

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Rectangle":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    txtField3 = new JTextField();
                    panel.add(new JLabel("Length = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Width = "));
                    panel.add(txtField2);
                   

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Sphere":
                    panel.add(dimensions);
                    panel.add(new JLabel("Radius = "));
                    txtField1 = new JTextField();
                    
                    
                    panel.add(txtField1);
                 

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Cube":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    
                    panel.add(new JLabel("Length = "));
                    panel.add(txtField1);
                    

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Cone":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    panel.add(new JLabel("Radius = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Height = "));
                    panel.add(txtField2);

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Cylinder":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    panel.add(new JLabel("Radius = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Height = "));
                    panel.add(txtField2);

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                case "Torus":
                    panel.add(dimensions);
                    
                    txtField1 = new JTextField();
                    txtField2 = new JTextField();
                    panel.add(new JLabel("Inner Radius = "));
                    panel.add(txtField1);
                    panel.add(new JLabel("Outer Radius = "));
                    panel.add(txtField2);

                     button = new JButton("Submit Dimensions");
                     panel.add(button);
                     button.addActionListener(new submitBtn());
                    break;
                default:
                    label.setText("Something went wrong");
                    break;
       
                
            }
              
             
         }
     }
    // used for submitting dimensions
    private class submitBtn implements ActionListener{
         @Override
         public void actionPerformed(ActionEvent evt){
             
             double len, wid,height,rad;
             
             try{
                
                 String getDim1 = txtField1.getText();
                 
                 
                 
                 
                switch (choice){
                    case "Circle":
                        rad= Double.parseDouble(txtField1.getText());
                        Circle circ = new Circle(rad);
                        circ.draw();
                        circ.showStats();
                        break;
                    case "Square":
                        len= Double.parseDouble(txtField1.getText()); 
                        Square sq = new Square(len, len);
                        sq.draw();
                        sq.showStats();
                        break;
                    case "Triangle":
                        len= Double.parseDouble(txtField1.getText()); 
                        wid= Double.parseDouble(txtField2.getText()); 
                        Triangle tri = new Triangle(len, wid);
                        tri.draw();
                        tri.showStats();
                        break;
                    case "Rectangle":
                        len= Double.parseDouble(txtField1.getText()); 
                        wid= Double.parseDouble(txtField2.getText()); 
                        Rectangle rec = new Rectangle(len, wid);
                        rec.draw();
                        rec.showStats();
                        break;
                    case "Sphere":
                        rad= Double.parseDouble(txtField1.getText());
                        Sphere sphere = new Sphere(rad);
                        sphere.draw();
                        sphere.showStats();
                        break;
                    case "Cube":
                        len= Double.parseDouble(txtField1.getText()); 
                        Cube cb = new Cube(len, len, len);
                        cb.draw();
                        cb.showStats();
                        break;
                    case "Cone":
                        rad= Double.parseDouble(txtField1.getText());
                        height= Double.parseDouble(txtField2.getText());
                        Cone cn = new Cone(rad, height);
                        cn.draw();
                        cn.showStats();
                        break;
                    case "Cylinder":
                        rad= Double.parseDouble(txtField1.getText());
                        height= Double.parseDouble(txtField2.getText());
                        Cylinder cl = new Cylinder(rad, height);
                        cl.draw();
                        cl.showStats();
                        break;
                    case "Torus":
                        rad= Double.parseDouble(txtField1.getText());
                        wid= Double.parseDouble(txtField2.getText());
                        Torus tor = new Torus(rad, wid);
                        tor.draw();
                        tor.showStats();
                        break;
                    default:
                        label.setText("Something went wrong");
                        break;


                }
                 
                 
             } catch (Exception e){
                 JOptionPane.showMessageDialog(frame, "Invalid Input");
             }
             
            
             
             
         }
    }
}
