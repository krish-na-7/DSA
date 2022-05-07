package Arrays;

/*
     Prefix Sum Approach O(n^2)
 */
public class SubArraysSumPrefixSum {
    public static int subArraysSumPrefixSum(int[] arr,int size)
    {
        //Prefix sums
        int[] prefix = new int[size];
        prefix[0] = arr[0];
        for(int i=1;i<size;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        int largestSum = 0;
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                int subArraySum = i>0 ? prefix[j] - prefix[i-1] : prefix[j];
                largestSum = Math.max(largestSum,subArraySum);
            }
        }
        return largestSum;
    }
    public static void main(String[] args)
    {
        int[] arr = {-2,6,4,-1,5,-10,6,2,3};
        int size = arr.length;
        System.out.println(subArraysSumPrefixSum(arr,size));
    }
}
/*
Output:
=======
11
 */