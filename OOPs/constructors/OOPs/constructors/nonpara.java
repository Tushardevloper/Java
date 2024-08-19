package OOPs.constructors;

class Student {
    int age;
    String name;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("Writing something");
    }
}

public class nonpara {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Tushar";
        s1.age = 20;

        s1.printinfo();
    }
}