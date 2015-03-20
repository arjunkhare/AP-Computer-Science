
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class PointsTray{
    
    ArrayList<Integer> finalPointVals = new ArrayList<>();
    int[] pointsTray;
    int randVal, roundNbr;
    Boolean isReady;
    
    public PointsTray(){
        
        Random rand = new Random();
        randVal = rand.nextInt(15) + 5;
        pointsTray = new int[randVal];
        
    }
    
    public void takePoints(Contestant co){
        
        int index;
        Random rand = new Random();
        index = rand.nextInt(pointsTray.length);
        co.bucket.add(pointsTray[index]);
        pointsTray[index] = (-2*(roundNbr + 1));
        
    }
    
    public void totalPoints(Contestant co){
        
        for(int index : co.bucket){
            
            co.finalPoints += index;
            
        }
        
        finalPointVals.add(co.finalPoints);
        
    }
    
}
