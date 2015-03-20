
//Arjun Khare 1/23/15 AP Computer Science Pd. 2

public class Main {
    
    public static void main(String[] args){
    
        for(int roundNbr = 0; roundNbr < 8; roundNbr++){
            
            PointsTray tray = new PointsTray(roundNbr);

            Thread co1 = new Contestant(tray);
            Thread co2 = new Contestant(tray);
            Thread co3 = new Contestant(tray);
            Thread co4 = new Contestant(tray);
            Thread co5 = new Contestant(tray);
            Thread co6 = new Contestant(tray);
            Thread co7 = new Contestant(tray);
            Thread co8 = new Contestant(tray);
            Thread co9 = new Contestant(tray);
            Thread co10 = new Contestant(tray);
            
            co1.start();
            co2.start();
            co3.start();
            co4.start();
            co5.start();
            co6.start();
            co7.start();
            co8.start();
            co9.start();
            co10.start();
            
            switch(roundNbr){
                
                case 0:
                    Thread pointsMakerRnd1 = new PointsMaker(tray, 10);
                    pointsMakerRnd1.start();
                    break;
                case 1:
                    Thread pointsMakerRnd2 = new PointsMaker(tray, 15);
                    pointsMakerRnd2.start();
                    break;
                case 2:
                    Thread pointsMakerRnd3 = new PointsMaker(tray, 25);
                    pointsMakerRnd3.start();
                    break;
                case 3:
                    Thread pointsMakerRnd4 = new PointsMaker(tray, 40);
                    pointsMakerRnd4.start();
                    break;
                case 4:
                    Thread pointsMakerRnd5 = new PointsMaker(tray, 60);
                    pointsMakerRnd5.start();
                    break;  
                case 5:
                    Thread pointsMakerRnd6 = new PointsMaker(tray, 75);
                    pointsMakerRnd6.start();
                    break;
                case 6:
                    Thread pointsMakerRnd7 = new PointsMaker(tray, 85);
                    pointsMakerRnd7.start();
                    break;
                case 7:
                    Thread pointsMakerRnd8 = new PointsMaker(tray, 100);
                    pointsMakerRnd8.start();
                    break;    
                
            }

        }
    
    }

}
