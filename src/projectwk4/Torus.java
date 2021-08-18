
package projectwk4;

/**
 * Torus.java
 * Created on Jun 25, 2020
 * @author Keith Combs II
 * Purpose: This class creates a torus and shows the volume
 */
public class Torus extends ThreeDimensional{
    double innerRadius =0; 
    double results =0;
    
    Torus(double iRad, double oRad){
        super(oRad);
        this.innerRadius = iRad;
        fileLoc ="./shapes/torus.png";
    
    }
    
    double volTorus(){
        return 2*Math.PI*Math.PI*radius*innerRadius*innerRadius;
    }
    
        void showStats(){
        results = this.volTorus();
        System.out.println(
        "The Torus has a volume of "+ results);
    }

}
