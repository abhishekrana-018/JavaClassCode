//write a progerame to print n even numbers using for loop while loop do while loop
import java.util.Scanner;
class ques4{
 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter n : ");
        Integer n =obj.nextInt(); 
        
        int i=1;
        while (i<=n) {
     
            if (i%2==0) {
                System.out.print(i);
            }
            i++;
        }
         
        for (int j=1; j<=n; j++) {
            if (j%2==0) {
                System.out.println(i);
            }
        }
	 
    }
	
}