
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Contestant extends Thread{
    
    ArrayList<Integer> bucket = new ArrayList<>();
    PointsTray tray;
    int roundNbr, finalPoints;
    
    public Contestant(PointsTray tray){
        
        this.tray = tray;
        
    }
    
    public void run(){
        
        Random rand = new Random();
        
        try{
            
            
            roundNbr = 15;
            
            Thread.sleep(1000);
               
            for(int i = 0; i < tray.pointsTray.length; i++){

                tray.takePoints(this);                  

            }
            
            Thread.sleep(1000);
            
            tray.totalPoints(this);
            
            System.out.println();
            System.out.println(Arrays.toString(this.tray.pointsTray));
            System.out.println("co: " + this.bucket);
            System.out.println();
            
            System.out.println(tray.finalPointVals);
            Thread.sleep(rand.nextInt(2500) + 2000);
            
        }
        
        catch(InterruptedException e){
            
            System.out.println(e.toString());
            
        }
        
    }
    
}
