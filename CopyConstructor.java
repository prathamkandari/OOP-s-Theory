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
    Student(Student obj)
    {
        name = obj.name;
        roll_no = obj.roll_no;
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

class CopyConstructor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student ob1 = new Student("Pratham",8);
        ob1.display();
        Student ob2 = new Student(ob1);
        ob2.displaytwo();
    }
}