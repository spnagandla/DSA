package Basic_Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class No_Of_Divisiors {

    private static int[] divisorsCount(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i ==0){list.add(i);
            if(i != n/i) list.add(n/i);}
        }
        Collections.sort(list);

        int[] ans = new int[list.size()];
        for(int i =0;i< list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    public static void main(String [] args){
        System.out.println(Arrays.toString(divisorsCount(10)));

    }
}
