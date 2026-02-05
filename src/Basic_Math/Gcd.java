package Basic_Math;

public class Gcd {
    //why min of n1,n2 is if more than n1 cant divides both so
    //Time Complexity :O(min(n1,n2))
    public static void gcd1(int n1, int n2) {
        int largest = 1;
        for (int i = 2; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                largest = i;
            }
        }
        System.out.println(largest);
    }

    //Instead of checking from starting what if we start from the largest it will be a little optimized lets say if the largest is close to n1 and divides both.
    //Time Complexity: O(min(n1,n2))
    public static int gcd2(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i; // 🔥 STOP immediately
            }
        }
        return 1; // fallback (always valid)
    }


    //Optimized Euclidean algorithm



    public static void main(String[] args) {
        gcd1(20, 40);
        System.out.println(gcd2(20,40));
    }
}
