

package projectwk4;

/**
 * Cone.java
 * Created on Jun 29, 2020
 * @author Keith Combs II
 * Purpose: This class creates a cone and shows the volume
 */
public class Cone extends ThreeDimensional{
    double height = 0; 
    double results = 0;
    
    Cone(double r, double h){
        super(r);
        this.height = h;
        fileLoc ="./shapes/cone.jpeg";
    }
    
    double volCyl(){
        return Math.PI*radius*radius*this.height/3;
    }
    
    void showStats(){
        results = this.volCyl();
        System.out.println(
        "The Cylinder has a volume of "+ results);
    }

}
