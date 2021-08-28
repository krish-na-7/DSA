package Arrays;

/*
     Kadane's Algorithm:
     ===================
     Time Complexity : O(n)
     Space Complexity : O(1)

 */
public class SubArraysSumKadane {

    public static int subArraysSumKadane(int[] arr,int size)
    {
        int largestSum=0,currentSum=0;
        for(int i =0;i<size;i++)
        {
            currentSum+=arr[i];
            if(currentSum<0)
            {
                currentSum=0;
            }
            largestSum=Math.max(largestSum,currentSum);
        }
        return largestSum;
    }

    public static void main(String[] args)
    {
        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int size = arr.length;
        System.out.println(subArraysSumKadane(arr,size));
    }
}
/*
Output:
=======
11
 */