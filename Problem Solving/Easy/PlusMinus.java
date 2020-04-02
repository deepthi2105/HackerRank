import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float size=arr.length;
        float p=0,n=0,z=0;
        float pd=0,nd=0,zd=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]<0)
                n++;
            if(arr[i]>0)
                p++;
            if(arr[i]==0)
                z++;
        }
        pd=p/size;
        nd=n/size;
        zd=z/size;
        System.out.println(pd);
        System.out.println(nd);
        System.out.println(zd);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
