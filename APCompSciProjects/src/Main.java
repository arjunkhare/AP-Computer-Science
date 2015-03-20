
//Arjun Khare, Pd. 2 AP Computer Science

public class Main {
    
    public static void main(String[] args){

        Heap heap = new Heap();
        Thread Dealer = new Dealer(heap);
        Thread Player = new Player(heap);

        Player.start();
        Dealer.start();
        
    }
    
}
