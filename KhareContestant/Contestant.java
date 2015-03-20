
//Arjun Khare 1/23/15 AP Computer Science Pd. 2

public class Contestant extends Thread{
    
    int[] contestantVals = new int[10];
    PointsTray tray;
    
    public Contestant(PointsTray tray){
        
        this.tray = tray;
        
    }
    
    public void run(){
        
        try{
            
            Thread.sleep(100);
            
        }
        
        catch(InterruptedException e){
            
            System.out.println(e.toString());
            
        }
        
    }
    
}
