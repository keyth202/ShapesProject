

package projectwk4;

/**
 * Cylinder.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a cylinder and shows the volume
 */
public class Cylinder extends ThreeDimensional{
    double height = 0; 
    double results = 0;
    
    Cylinder(double r, double h){
        super(r);
        this.height = h;
        fileLoc ="./shapes/cylinder.jpg";
    }
    
    double volCyl(){
        return Math.PI*radius*radius*this.height;
    }
    
    void showStats(){
        results = this.volCyl();
        System.out.println(
        "The Cylinder has a volume of "+ results);
    }
}
