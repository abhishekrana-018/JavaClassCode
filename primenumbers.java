import java.util.Scanner;
public class primenumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the n : ");
        Integer n =obj.nextInt();

        for(int i=1;i<= n;i++){
            count = 0;
            for (int j=0;j<=i;j++){
                if (i%j==0){
                    count++;
                }
                if (count ==2)
                    System.out.print(i);
            }
        }
    }
}