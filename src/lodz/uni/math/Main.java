package lodz.uni.math;

public class Main {

    private static int [] tab = new int[100];

    public static void main(String[] args) {
        initializeTab(tab);
        for(int i=0; i < tab.length; i++){
            PrimeNumberThread th = new PrimeNumberThread(i);
            th.start();
            try{
                th.join();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void initializeTab(int[] tab){
        for(int i=0;i<tab.length;i++){
            tab[i]=i;
        }
    }
}


