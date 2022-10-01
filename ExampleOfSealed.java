sealed  class ExampleOfSealed permits A,B {
    }
 final class A extends ExampleOfSealed
 {
     void displayA()
     {
         System.out.println("A method");
     }
 }
 final class B extends  ExampleOfSealed
 {
     void displayB()
     {
         System.out.println("B method");
 }


}
class AA
{
    public static void main(String[] args) {

        B x=new B();
        x.displayB();
        A x1=new A();
        x1.displayA();


    }
}
