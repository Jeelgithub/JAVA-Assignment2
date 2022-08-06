public class methodoverloading
{
    void record(String t )
    {
        System.out.println(t);
    }
    void record(String studentName,char grade)
    {
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    void record(int id,String studentName,char grade)
    {
        System.out.println("Student ID is "+id);
        System.out.println("Student name is "+studentName);
        System.out.println("Student grade is "+grade);
    }
    public static void main(String[]args)
    {
        methodoverloading O =new methodoverloading();
        O.record("Record of The students");


        O.record("Jeel",'A');
        O.record(8, "Jiyani", 'B');

        System.out.println("\n\n by ID : 21CE044");

    }
}