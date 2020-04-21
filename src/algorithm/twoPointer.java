// ZERO SUM TRIPLET USING TWO POINTER ALGORITHM

package algorithm;

import java.util.Arrays;
import java.util.Scanner;

 class twoPointer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        twoPointer execute = new twoPointer();
        if(execute.findTriplet(arr, n))
            System.out.println("Zero Sum Triplet Available");
        else
            System.out.println("Zero Sum Triplet Not Available");
    }

    private boolean findTriplet(int[] arr, int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
            if(twoSum(arr, -arr[i], i+1))
            {
                return true;
            }
        }
        return false;
    }

    // Two Pointer Algorithm
    private boolean twoSum(int[] a, int x, int i) {
        int j = a.length - 1;
        while(i<j)
        {
            if(a[i] + a[j] > x)
                j--;
            else if(a[i] + a[j] < x)
                i++;
            else
                return true;
        }
        return false;
    }

}