package threads;

import java.util.Random;

public class Worker extends Thread {


    int[] arr = new int[79];
    int start ;
    int finish;
    int foundTheNumber;

    public Worker(int[] arr, int start, int finish, int foundTheNumber){
        this.arr = arr;
        this.start = start;
        this.finish = finish;
        this.foundTheNumber = foundTheNumber;

    }



    public static void runSearch(int[] arr , int start , int finish ,int  foundTheNumber){
        for (int i = start ; i < finish; i++ ) {
            if (arr[i] == foundTheNumber) {
                System.out.println("Number you was locking for was : " +foundTheNumber + " it's was found on index " + i);
            }
        }
    }

    @Override
    public void run() {
        try{
            System.out.println("Start");
            runSearch(arr,start,finish,foundTheNumber);
            System.out.println("Finish");

        }catch (Exception e){}
    }


}