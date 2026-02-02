package Basic_Math;

public class Largest_Digit {

    public static void largestDigit(int n){
        int largest=0;
        while(n>0){
            int last_digit = n%10;
            if(last_digit > largest) largest = last_digit;
            n=n/10;
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        largestDigit(13971);
    }
}
