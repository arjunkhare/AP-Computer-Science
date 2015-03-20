
//Arjun Khare 1/23/15 AP Computer Science Pd. 2

import java.util.Arrays;

import java.util.Random;

public class PointsMaker extends Thread{
    
    PointsTray tray;
    int pntValue;
    
    public PointsMaker(PointsTray tray, int pntVal){
        
        this.tray = tray;
        Random rand = new Random();
        tray.elementNbr = (25);
        this.pntValue = pntVal;
        
    }
    
    public void run(){
        
        try{
            
            for(int i = 0; i < tray.elementNbr; i++){

                tray.trayCprts[i] = pntValue;

            }
            
            Thread.sleep((int)((Math.random()*1000)+1500));
            System.out.println(Arrays.toString(tray.trayCprts));
            
        }
        
        catch(InterruptedException e){
            
            System.out.println(e.toString());
            
        }
        
    }
    
    
    
}
