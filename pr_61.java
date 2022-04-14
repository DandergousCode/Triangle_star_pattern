import java.util.ArrayList;
import java.util.Comparator;

class Student
{
    int roll_no;
    String name, address;

    public Student(int roll_no, String name, String address)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public String toString()
    {
        return this.roll_no+" "+this.name+" "+this.address;
    }
}


class sortByRoll implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.roll_no - b.roll_no;
    }
}



class sortByName implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}




public class pr_61
{
    public static void main(String[] args)
    {
        ArrayList<Student> ar = new ArrayList<>();

        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));

        System.out.println("Unsorted");
        for (Student student : ar)
        {
            System.out.println(student);
        }

        ar.sort(new sortByRoll());
        System.out.println("\nSorted by rollNo");


        for (Student student : ar)
        {
            System.out.println(student);
        }

        ar.sort(new sortByName());
        System.out.println("\nSorted by name");

        for (Student student : ar)
        {
            System.out.println(student);
        }
    }
}