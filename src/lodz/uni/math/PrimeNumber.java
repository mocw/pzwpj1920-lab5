package lodz.uni.math;

public class PrimeNumber {

    private PrimeNumber() {
    }

    public static boolean checkNumber(int number){
        int i,m=0;
        m=number/2;
        if(number==0 || number==1){
            System.out.println(number+ " nie jest liczbą pierwszą!");
            return false;
        } else {
            for(i=2; i<=m; i++){
                if(number % i == 0){
                    System.out.println(number+ " nie jest liczbą pierwszą!");
                    return false;
                }
            }
            System.out.println(number+ " jest liczbą pierwszą!");
            return true;
        }
    }
}
