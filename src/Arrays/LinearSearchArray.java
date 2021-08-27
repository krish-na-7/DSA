package Arrays;

/*
   LinearSearch:
   =============
   Searching algorithm to find the index of an element in a given array.
   Linear Search is a Brute Force Technique where we are trying out all possibilities where a particular
   element present.

   Worst Case Time Complexity - O(n)
 */

public class LinearSearchArray {

   public static int linearSearch(int[] arr,int size,int key)
   {
      //Check if current element matches with the key
      for(int i=0;i<size;i++)
      {
         if(arr[i]==key)
         {
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args)
   {
      int[] arr = {2,5,1,4,8,77,21,49,35,42,56 };
      int size = arr.length;
      int key=35;
      int index = linearSearch(arr,size,key);
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
