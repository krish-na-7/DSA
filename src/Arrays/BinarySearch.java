package Arrays;

import java.util.Scanner;

/*
     Binary Search:
     ==============
     Binary Search works on Sorted arrays either in ascending order or descending order.

     Time Complexity:   O(log n)

     Fast and efficient algorithm but works on sorted search space which is monotonic.
     Monotonic means Non-decreasing or Non-increasing.
     ex:
     Non-decreasing => {2,6,8,34,45,77,90,101,117,129}
     Non-increasing => {123,89,67,55,43,39,21,15,4}
 */
public class BinarySearch {

    static int binary_search(int array[],int n,int key){
        //Implement binary search
        int s = 0;
        int e = n - 1;

        while(s<=e){
            int mid = (s+e)/2;

            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] > key){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int array[] = new int[10];
        int n = array.length;
        Scanner scn = new Scanner(System.in);
        int key = scn.nextInt();

        int index = binary_search(array,n,key);
        if(index!=-1){
            System.out.println(key  + " is present at index " +  index);
        }
        else{
            System.out.println(key  + " is NOT Found!");
        }
    }
}