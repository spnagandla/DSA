package Basic_Math;

public class PrimeNumber {

    public static void primeNumber(int n){
        if(n <=1) {
            System.out.println(false);
            return;
        }
        // as we know prime number has only two divisors 1 & itself.
        // check if there are any other divisiors , if their then no other option its not prime
        // As its 1 and itself so start from 2 to n-1
        for(int i=2;i<=n-1;i++){
            if(n%i ==0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }
    public static void main(String[] args){
        primeNumber(5);
    }
}


/*



 */

/*
return immediately ends the method and sends control back to the caller.

Nothing after return in that method will execute.

1️⃣ Simple example
static void test() {
    System.out.println("A");
    return;
    System.out.println("B"); // ❌ unreachable
}

Output:
A

Once return runs → method stops completely.
 */