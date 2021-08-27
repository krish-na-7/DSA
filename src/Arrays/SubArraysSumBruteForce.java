package Arrays;
/*
      Brute Force Approach - Time Complexity : O(n^3)
 */
public class SubArraysSumBruteForce {
    public static int subArraysSumBruteForce(int[] arr,int size)
    {
        int largestSum = 0;
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                int subArraySum =0;
                for(int k=i;k<=j;k++)
                {
                    subArraySum+=arr[k];
                }
                largestSum = Math.max(largestSum,subArraySum);
            }
        }
        return largestSum;
    }
    public static void main(String[] args)
    {
        int[] arr = {-2,3,4,-1,5,-12,6,1,3};
        int size = arr.length;
        System.out.println(subArraysSumBruteForce(arr,size));
    }
}
/*
Output:
=======
11
 */