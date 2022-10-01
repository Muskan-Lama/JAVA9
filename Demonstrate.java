interface privateStaticMethod
{
    private static void add(int a)
    {
        System.out.println("The private static method "+ (a+a));

    }
    public static void implement() {

        add(32);
    }

    void sum(int a);

}
interface secondPrivateStaticMethod
{
    private static void display()
    {
        System.out.println("The static private method of class secondPrivateMethod");
    }
    String abstractMethod(String a);
    public static void implement2() {

      display();
    }
}
public class Demonstrate implements  privateStaticMethod,secondPrivateStaticMethod
{
    @Override
    public void sum(int a) {
        System.out.println("The absract method of class privateStaticMethod "  + (a+a));

    }

    @Override
    public String abstractMethod (String a) {

        return  "The abstract method of class abstractMethod "+ a;
    }

    public static void main(String[] args) {


        Demonstrate a=new Demonstrate();

        a.sum(12);
        System.out.println(a.abstractMethod("muskan"));



     privateStaticMethod.implement();
     secondPrivateStaticMethod.implement2();




    }
}
