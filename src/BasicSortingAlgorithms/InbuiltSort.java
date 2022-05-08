package BasicSortingAlgorithms;
import java.util.Arrays;

public class InbuiltSort {

    public static void main(String[] args){

        int arr[] = {-2,3,4,-1,5,-12,6,1,3};
        int n = arr.length;

        Arrays.sort(arr);

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
