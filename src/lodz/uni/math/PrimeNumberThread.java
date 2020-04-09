package lodz.uni.math;

public class PrimeNumberThread extends Thread {

    private int l;

    public PrimeNumberThread(int l) {
        this.l = l;
    }

    @Override
    public void run(){
            PrimeNumber.checkNumber(l);
    }
}
