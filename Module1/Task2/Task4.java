package Module1.Task2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr1=new int[len];
        int i=0;
        while(i<arr1.length){
            arr1[i]=random.nextInt(10);
            if(i>=len*0.8) len*=1.5;
            i++;
        }
        System.out.print(Arrays.toString(arr1)+"容量为："+len);
    }
}
