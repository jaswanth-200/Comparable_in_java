import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

// Student class representing each student with age and name attributes
class Student implements Comparable<Student> {
    int age;
    String name;

    // Constructor for initializing age and name
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Method to represent the student object as a string
    public String toString() {
        return "[Student : age=" + age + " name=" + name + "]";
    }

    // compareTo method to compare student objects based on age
    public int compareTo(Student that) {
        // If this student's age is greater, return 1
        if (this.age > that.age) {
            return 1;
        }
        // Otherwise, return -1
        else {
            return -1;
        }
    }
}

// Main class to execute the code
public class Comparable {
    // Main method
    public static void main(String args[]) {
        // Creating a list of student objects
        List<Student> stu = new ArrayList<Student>();

        // Adding student objects to the list
        stu.add(new Student(19, "jaswanth"));
        stu.add(new Student(25, "sai"));
        stu.add(new Student(15, "rajesh"));

        // Sorting the student list based on the compareTo method
        Collections.sort(stu);

        // Printing the sorted list of students
        System.out.println(stu);
    }
}
