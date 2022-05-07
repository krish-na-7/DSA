package Arrays;
/*
     Time Complexity : O(n)
     Space Complexity : O(1)
 */
public class ReverseArray {
    public static void reverseArray(int[] arr,int size)
    {
        int start = 0,end = size-1;

        while(start < end)
        {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {123,89,67,55,43,39,21,15,7,3};
        int size = arr.length;
        System.out.println("Original Array : ");
        for(int i : arr)
        {
            System.out.print(i+ " ");
        }
        reverseArray(arr,size);
        System.out.println();
        System.out.println("Reversed Array : ");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
