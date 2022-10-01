import java.util.*;
class Student
{
    String name;
    int roll_no;
    int sapid;
    Student(String n, int r)
    {
        name=n;
        roll_no=r;
    }
    Student(int s)
    {
        sapid=s;
    }
    void display()
    {
        System.out.println("The name is "+name);
        System.out.println("The roll no is "+roll_no);
    }
    void displaytwo()
    {
        System.out.println("The sapid is "+sapid);
    }
}

class ConstructorOverloading 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student ob1 = new Student("Pratham", 8);
        Student ob2 = new Student(500097663);
        ob1.display();
        ob2.displaytwo();
    }
}