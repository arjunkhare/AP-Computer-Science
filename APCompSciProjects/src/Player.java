
//Arjun Khare, Pd. 2 AP Computer Science

 import java.util.ArrayList;

 import java.util.Random;
 
 public class Player extends Thread{
 
    ArrayList<String> myHand = new ArrayList<>();
    Heap heap;
    
    public Player(Heap heap){
        
        this.heap = heap;
        
    }
    
    
    public void run(){
     
        try{
            
            for(int i = 0; i < 10; i++){
                
                Thread.sleep((int)(Math.random()*4000));
                myHand.add(heap.takeFromHeap());
                System.out.println("Player took " + heap.top);
                
            
            }
            
            Thread.sleep(4000);
            System.out.println("Player's cards in the end were: " + myHand.toString());
            
        }
        
        catch(InterruptedException e){
        
            System.out.println(e.toString());
        
        }
        
    }
   
}
