
    record Student(String name,int age,int id)
    {
        static int counter =0;
        static void incrementCounter(){
            counter++;

    }


}
class RecordClass
{
    public static void main(String[] args) {

        Student a=new Student("muskan",12,101);


        System.out.println(a.name().equals(a.id()));
        System.out.println(Student.counter);




    }
}

