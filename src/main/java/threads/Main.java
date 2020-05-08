package threads;

public class Main {

    public static void main(String[] args) {
        int[]  array = RandomArray.randomAdd();

        new Worker(array,0,19,11).start();


        new Thread(new Worker(array , 20 , 39,11)).start();

        Thread randomArray3 = new Thread(new Worker(array , 40 , 59,11));
        randomArray3.start();
        
        Thread randomArray4 = new Thread(new Worker(array , 60 , 80,11));
        randomArray4.start();

    }
}