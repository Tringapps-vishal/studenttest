// "1. Create a class called Student with the following instance variables:
//     - name (String)
//     - age (int)
//     - gpa (double)
// 2. Implement the Student class with appropriate constructors and getter and setter methods.
// 3. Create a class called StudentTest with a main method.
// 4. In the main method, create a List of Student objects and add a few Student objects to the list.
// 5. Iterate over the list and print out the name, age, and GPA of each student.
// 6. Use the Collections.sort method to sort the list by GPA (highest to lowest).
// 7. Iterate over the sorted list and print out the name and GPA of each student."

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student {
    String name;
    int age;
    double gpa;

    // public student() {
    // System.out.println("1 Student added successfully!!");
    // }

    void setname(String name) {
        this.name = name;
    }

    void setage(int age) {
        this.age = age;
    }

    void setgpa(double gpa) {
        this.gpa = gpa;
    }

    String getname() {
        return name;
    }

    int getage() {
        return age;
    }

    double getgpa() {
        return gpa;
    }

}

class studentTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double gpa;
        ArrayList<student> slist = new ArrayList<>();

        System.out.print("Enter the number of Students:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name-" + (i + 1) + ":");
            name = sc.next();
            System.out.print("Enter Age:");
            age = sc.nextInt();
            System.out.print("Enter GPA:");
            gpa = sc.nextDouble();
            student st = new student();
            st.setname(name);
            st.setage(age);
            st.setgpa(gpa);
            slist.add(st);
        }

        for (student s : slist) {
            System.out.println("Name: " + s.getname() + "   " + "Age: " + s.getage() + "    " + "GPA: " + s.getgpa());
        }

        Collections.sort(slist, (s1, s2) -> Double.compare(s2.getgpa(), s1.getgpa()));
        System.out.println("After sorting by GPA:");

        for (student s : slist) {
            System.out.println("Name: " + s.getname() + "   " + "Age: " + s.getage() + "    " + "GPA: " + s.getgpa());
        }

    }
}