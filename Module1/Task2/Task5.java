package Module1.Task2;
public class Task5 {
    public static void main(String[] args){
        String[][] wzq= new String[15][15];
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                wzq[i][j]="+";
            }
        }
        for(int i=0;i<15;i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(wzq[i][j]+" ");
            }
            System.out.println();
        }
    }
}
