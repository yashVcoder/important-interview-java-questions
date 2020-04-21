// LARGEST SUM CONTIGUOUS SUB ARRAY USING KADANE'S ALGORITHM

package algorithm;

import java.util.Scanner;

 class largestSumSubArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        largestSumSubArray execute = new largestSumSubArray();
        execute.kadanesAlgorithm(arr, n);
    }

    private void kadanesAlgorithm(int[] arr, int n)
    {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0; i<n; i++)
        {
            curSum += arr[i];
            if(curSum > maxSum)
            {
                maxSum = curSum;
            }
            if(curSum < 0)
            {
                curSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
