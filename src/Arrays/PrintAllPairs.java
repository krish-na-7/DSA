package Arrays;
/*
    With this we can print all paris present inside an array
    Time Complexity : O(n2)
    Space Complexity : O(1)
 */
public class PrintAllPairs {
    public static void printAllPairs(int[] arr,int size)
    {
        for(int i=0;i<size;i++)
        {
            int x = arr[i];
            for(int j=i+1;j<size;j++)
            {
                int y = arr[j];
                System.out.println(x+","+y);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,7,9};
        int size = arr.length;
        printAllPairs(arr,size);
    }
}
