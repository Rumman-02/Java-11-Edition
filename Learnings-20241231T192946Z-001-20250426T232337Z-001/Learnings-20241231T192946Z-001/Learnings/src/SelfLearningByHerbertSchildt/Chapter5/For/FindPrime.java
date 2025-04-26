package SelfLearningByHerbertSchildt.Chapter5.For;

// Test for primes
public class FindPrime {
    public static void main(String[] args){
        int num =14;
        boolean isPrime;

        if( num < 2 ) isPrime=false;
        else isPrime=true;
        for(int i=2; i<= num/i; i++){

        //for(int i=2; i<= num; i++)

            if( (num % i) ==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("not Prime");
    }
}