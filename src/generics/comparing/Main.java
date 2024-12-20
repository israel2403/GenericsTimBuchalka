package generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = { 0, 5, 10, -50, 50 };
        for (Integer other : others) {
            int val = five.compareTo(other);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : val > 0 ? ">" : "<"), other, val);
        }

        System.out.println("====================");
        String banana = "banana";
        String[] fruits = { "apple", "banana", "pear", "BANANA" };
        for (String other : fruits) {
            int val = banana.compareTo(other);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : val > 0 ? ">" : "<"), other, val);
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("====================");
        System.out.println("A:" + (int) 'A' + " a:" + (int) 'a');
        System.out.println("B:" + (int) 'B' + " b:" + (int) 'b');
        System.out.println("P:" + (int) 'P' + " p:" + (int) 'p');

        System.out.println("====================");
        Student tim = new Student("Tim");
        Student[] students = { new Student("Zach"), new Student("Tim"), new Student("Ann") };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

}

class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        Student other = o;
        return name.compareTo(other.name);
    }
}
