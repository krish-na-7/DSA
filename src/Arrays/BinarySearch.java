package Arrays;

/*
     Binary Search:
     ==============
     Binary Search works on Sorted arrays either in ascending order or descending order.

     Time Complexity:
     O(log n)

     Fast and efficient algorithm but works on sorted search space which is monotonic.
     Monotonic means Non-decreasing or Non-increasing.
     ex:
     Non-decreasing => {2,6,8,34,45,77,90,101,117,129}
     Non-increasing => {123,89,67,55,43,39,21,15,4}
 */

public class BinarySearch {

    public static int binarySearch(int[] arr,int size,int key)
    {
        int start=0,end= size-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                end = mid -1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {2,6,8,34,45,77,90,101,117,129};
        int length = array.length;
        int key = 77;
        int index = binarySearch(array,length,key);
        if(index!=-1)
        {
            System.out.println(key+" is present at index "+index);
        }
        else
        {
            System.out.println(key+" Not Found !!!");
        }
    }
}
