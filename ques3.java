import java.util.Scanner;
class ques3{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name =obj.nextLine();
        System.out.print("Enter the age: ");
        Integer age =obj.nextInt();
        System.out.print("Enter the Salary: ");
        Integer Salary =obj.nextInt();
        System.out.print("Enter the grade: ");
        Character grade  = obj.next().charAt(0);
        System.out.println("Name "+ name);
        System.out.println("age "+ age);
        System.out.println("salary "+ Salary);
        System.out.println("grade "+ grade);
        
        
    }
}
