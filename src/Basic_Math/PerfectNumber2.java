package Basic_Math;
//Optimized version of the perfect number

public class PerfectNumber2 {

    public static void perfectNumber_optimal(int n){
        int sum=1;
        for(int i=2;i<=(int)(Math.sqrt(n));i++){
            if(n%i ==0){
                sum +=i;
                //here is the intresting part if i is one divisor what is the other n/i
                // means if 6 is already divisor and if n/6 is also 6 then dont add it two times
                if(i != (n/i)) sum += (n/i);
            }

        }
        System.out.println(n == sum);
    }


    public static void main(String[] args){
        perfectNumber_optimal(6);
    }
}


//for(int i=2;i<=(int)(Math.sqrt(n));i++) instead of this we can also write for(int i=1;i*i <=n;i++)

//Time Complexity = O( Sqt(n))
//space complexity = O(1)