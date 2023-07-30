package arraylist;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    ArrayList<Integer> a = new ArrayList();

    int sum =0;
    for (int i =0 ;i<arr.size();i++)
    {
        
        sum+= arr.get(i);
      
    }
    for(int i =0 ;i<arr.size();i++)
    {
        int x =sum;
        int y =x-arr.get(i);
        a.add(y);
    }
    Collections.sort(a);
    
    System.out.print(a.get(0)+
    " "+a.get(a.size()-1));
    

    }

}

public class min_max {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner (System.in);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = s.nextInt();
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

    }
}
