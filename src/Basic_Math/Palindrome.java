package Basic_Math;

public class Palindrome {

    private static void palindrome(int n){
        int original =n;
        int reverse =0;
        int last_digit=0;

        while(n>0){
            last_digit = n%10;
            reverse = (reverse*10)+last_digit;
            n=n/10;
        }
        System.out.println(reverse == original ? "true" : "false");
    }
    public static void main(String []args){
        palindrome(121);
    }
}
