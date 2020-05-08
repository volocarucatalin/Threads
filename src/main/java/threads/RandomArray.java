package threads;

import java.util.Random;

public class RandomArray {

    public static int[] randomAdd() {
        int[] arr = new int[80];
        Random rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);

        }
        return arr;
    }
}
