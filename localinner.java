class Outer{
    int z = 20;
    void getValue (){
        int x = 20;
        class Inner {
            int y ;
            Inner(){
                x= 70;
                y=20;
                z=30;
            }
            void sum (){
                System.out.println("sum :"+(x+y+z));
            }
        }
        Inner obj2 =new Inner();
        obj2.sum();
    }
}

public class localinner {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.getValue();
    }
}
