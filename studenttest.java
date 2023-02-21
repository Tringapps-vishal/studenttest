import java.util.*;
import java.util.Collections;
class info {
    int Age;
    String Name;
    double GPA;

    info(String name, int age, double gpa) {
        Age = age;
        Name = name;
        GPA = gpa;
        System.out.println(" created .");
    }

    double getgpa() {
        return GPA;
    }

    public String toString() {
        return  " Name : " + Name + " Age : " + Age + " GPA : " + GPA + "\n";
    }
}

class Student {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Total Number of  Student : ");
        int n = sc.nextInt();
        ArrayList<info> arr = new ArrayList<>();
        for (var i = 0; i < n; i++)
        {
            System.out.printf("Student - %d\n",i+1);
            System.out.printf("Enter Name  : ");
            String name = sc.next();
            System.out.printf("Enter Age  : ");
            int age = sc.nextInt();
            System.out.printf("Enter GPA :");
            double gpa = sc.nextDouble();
            info ob = new info(name, age, gpa);
            arr.add(ob);
        }
        System.out.println(arr);
        Collections.sort(arr ,(s1,s2)-> Double.compare(s2.getgpa(),s1.getgpa()));
        System.out.println(arr);
    }
}