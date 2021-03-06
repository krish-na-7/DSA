package Arrays;

/*
    With this we can print all sub arrays present in an array
    Time Complexity : O(n^3)
 */

public class SubArrays {
    public static void printSubArrays(int[] arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i;j<size;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2,3,1,7};
        int size = arr.length;
        printSubArrays(arr,size);
    }
}
/*
Output:
=======
2,
2,3,
2,3,1,
2,3,1,7,
3,
3,1,
3,1,7,
1,
1,7,
7,

 */