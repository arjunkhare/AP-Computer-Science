
//Arjun Khare, Pd. 2 AP Computer Science

import java.util.ArrayList;

import java.util.Random;

public class Dealer extends Thread{
    
    String deckCards[] = {"3 Hearts", "2 Clubs", "9 Diamonds", "Jack Clubs", "King Spades",
                          "Ace Clubs", "7 Hearts", "4 Spades", "6 Diamonds", "10 Clubs"};
    ArrayList<String> Deck = new ArrayList<>();
    
    Heap heap;
    
    public Dealer(Heap heap){
        
        for(String element : deckCards){
            Deck.add(element);
        }
        
        this.heap = heap;
        
    }
    
    public void run(){
     
        try{
            
            for(int i = 0; i < Deck.size(); i++){
                
                heap.putOnHeap(deckCards[i]);
                System.out.println("Dealer placed " + deckCards[i]);
                Thread.sleep((int)(Math.random()*4000));
            
            }
         
            Thread.sleep(4000);
            System.out.println("Dealer's cards at the beginning were: " + Deck.toString());
            
        }
        
        catch(InterruptedException e){
        
            System.out.println(e.toString());
        
        }
        
    }
    
}