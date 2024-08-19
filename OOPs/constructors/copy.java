//package OOPs.constructors;

class Student {
    int age;
    String name;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class copy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tushar";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printinfo();
    }

}
