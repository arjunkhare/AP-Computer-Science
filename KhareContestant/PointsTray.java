
//Arjun Khare 1/23/15 AP Computer Science Pd. 2

import java.util.Arrays;

import java.util.Random;

public class PointsTray {
    
    int elementNbr, index, roundVal;
    int[] trayCprts = new int[25];
    Random rand = new Random();
    
    public PointsTray(int roundVal){
        
        this.roundVal = roundVal;
        
    }
    
    public void getCprts(Contestant co){
        
        index = rand.nextInt(25);
        co.contestantVals[1] = trayCprts[index];
        trayCprts[index] = roundVal*-10;
        
    }
    
}
