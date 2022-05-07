package Arrays;

/*
   LinearSearch:
   =============
   Searching algorithm to find the index of an element in a given array.
   Linear Search is a Brute Force Technique where we are trying out all possibilities where a particular
   element present.
   Worst Case Time Complexity - O(n)
 */

import java.util.Scanner;
public class LinearSearch {
    static int linear_search(int[] array, int n, int key){

        for(int i=0; i<n; i++){
            //Check if current element matches with the key
            if(array[i] == key){
                return i;
            }
        }
        //out of the loop
        return -1;
    }
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int[] array = {10,15,12,9,6,4,3,10,8};
        int n = array.length;

        int key = scn.nextInt();

        int index = linear_search(array,n,key);
        if(index!=-1){
            System.out.println(key  + " is present at index " +  index);
        }
        else{
            System.out.println(key  + " is NOT Found!");
        }
    }
}