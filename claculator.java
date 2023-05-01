import java.util.Scanner;
class claculator {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        Integer num1 =obj.nextInt();
        System.out.print("Enter the number 2: ");
        Integer num2 =obj.nextInt();
        System.out.print("Enter the operator");
        Character ope  = obj.next().charAt(0);

        int sum =0;
        switch (ope)
        {
            case '+':
                sum = num1+num2;
                System.out.print(sum);
                break;
            case '-':
                sum = num1-num2;
                System.out.print(sum);
                break;
            case '*':
                sum = num1*num2;
                System.out.print(sum);
                break;
            case '/':
                sum = num1/num2;
                System.out.print(sum);
                break;    
            default:
                System.out.print("no ooperator present");
        }

    }
}
