package Module1.Task2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int num = sc.nextInt();
            int date = day(year, month, num);
            System.out.print(date);
        }
    }
    public static int day(int year, int month, int num){
        switch(month){
            case 12:
                num+=30;
            case 11:
                num+=31;
            case 10:
                num+=30;
            case 9:
                num+=31;
            case 8:
                num+=31;
            case 7:
                num+=30;
            case 6:
                num+=31;
            case 5:
                num+=30;
            case 4:
                num+=31;
            case 3:
                if(0==year%4){
                    num+=29;
                }else{
                    num+=28;
                }
            case 2:
                num+=31;
            case 1:
                num+=0;
        }
        return num;
    }
}
