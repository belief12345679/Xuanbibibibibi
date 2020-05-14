package Module1.Task2;
import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args){
    int[] reds=new int[7];
    Random random = new Random();
    for(int i=0;i<reds.length-1;i++){
        reds[i]=(random.nextInt(33))+1;
    }
    reds[reds.length-1] = (random.nextInt(16))+1;
    System.out.print(Arrays.toString(reds));
    }
}
