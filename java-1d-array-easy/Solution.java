import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        
        int result = 0;
        for(int i = 0; i < n; i++)
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k < j + 1; k++)
                    sum += arr[k];
                if (sum < 0) result++;
            }

        System.out.println(result);
    }
}
