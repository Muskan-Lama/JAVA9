class Aclass implements AutoCloseable
{

    void display()
    {
        System.out.println("A method");
    }

    @Override
    public void close() throws Exception {

        System.out.println("AutoCloseable of A ");
    }
}
class Bclass implements AutoCloseable
{

    void display2()
    {
        System.out.println("B method");
    }

    @Override
    public void close() throws Exception {

        System.out.println("AutoCloseable of B");
    }
}

public class Auto {
    public static void main(String[] args)throws Exception {

        Aclass a=new Aclass();
        Bclass b=new Bclass();
        try(a;b)
        {
            a.display();
            b.display2();
        }


    }



}
