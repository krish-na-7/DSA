package BasicSortingAlgorithms;

public class InsertionSort {

    static void insertion_sort(int a[],int n){

        for(int i=1; i<=n-1; i++){
            int current = a[i];
            int prev = i - 1;
            //loop to find the right index where the element current should be inserted
            while(prev>=0 && a[prev] > current){
                a[prev + 1] = a[prev];
                prev = prev - 1;
            }
            a[prev+1] = current;
        }
    }

    public static void main(String[] args){

        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        insertion_sort(arr, n);
        for(int k: arr){
            System.out.print(k +",");
        }
    }
}
/*
Output:
=======
-12,-2,-1,1,3,3,4,5,6,
 */