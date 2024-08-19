package OOPs.constructors;

class Student {
    int age;
    String name;

    public void printinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class para {
    public static void main(String[] args) {
        Student s1 = new Student("Tushar", 24);

        s1.printinfo();
    }
}
