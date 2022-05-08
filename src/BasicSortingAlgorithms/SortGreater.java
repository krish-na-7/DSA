package BasicSortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class SortGreater {

    public static void main(String[] args) {

        Integer[] arr = {-2,3,4,-1,5,-12,6,1,3};

        Arrays.sort(arr, Collections.reverseOrder());

        for (int k : arr) {
            System.out.print(k +",");
        }
    }
}
/*
Output:
=======
6,5,4,3,3,1,-1,-2,-12,
 */
