package Module1.Task2;
public class Task2 {
    public static void main(String[] args){
        for(int i=1;i<=1000;i++){
            int sum=0;//对每个i，sum都要重新计算一次
            for (int j=1;j<i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if(sum==i){
                System.out.print(i+"是完数");
            }
        }
    }
}