
import java.util.Arrays;
import java.util.Random;

public class PointsMaker extends Thread{
    
    int pntVal, roundNbr;
    PointsTray tray;
    
    public PointsMaker(PointsTray tray){
        
        this.tray = tray;
        
    }
    
    public void run(){      
            
            Random rand = new Random();
                    
            try{
               
                roundNbr = 15;
                tray.isReady = true;
                for(tray.roundNbr = 0; tray.roundNbr < roundNbr; tray.roundNbr++){

                    fillPointsTray(tray.roundNbr, tray);    
                    Thread.sleep(rand.nextInt(2500) + 2000);
                
                }
                
                Thread.sleep(rand.nextInt(2500) + 2000);
            
            }

            catch(InterruptedException e){

                System.out.println(e.toString());

            }
        
    }
    
    public void fillPointsTray(int roundNbr, PointsTray tray){
            
        switch(roundNbr){

            case 0:
                pntVal = 10;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 1:
                pntVal = 15;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 2:
                pntVal = 25;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 3:
                pntVal = 40;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 4:
                pntVal = 60;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
            case 5:
                pntVal = 75;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 6:
                pntVal = 85;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 7:
                pntVal = 100;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 8:
                pntVal = 100;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            case 9:
                pntVal = 100;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;
            default:
                pntVal = 100;
                for(int i = 0; i < tray.pointsTray.length; i++){
                    
                    tray.pointsTray[i] = pntVal;
                    
                }
                System.out.println(Arrays.toString(tray.pointsTray));
                break;

            }
      
        }
    
    public static void main(String[] args){
        
        PointsTray tray = new PointsTray();
        
        Thread co1 = new Contestant(tray);
        Thread co2 = new Contestant(tray);
        Thread co3 = new Contestant(tray);
        co1.start();
        co2.start();
        co3.start();
        
        Thread pointsMaker = new PointsMaker(tray);
        pointsMaker.start();
//        Thread co4 = new Thread();
//        Thread co5 = new Thread();
//        Thread co6 = new Thread();
//        Thread co7 = new Thread();
//        Thread co8 = new Thread();
//        Thread co9 = new Thread();
//        Thread co10 = new Thread();
        
        
        
    }
    
}
