package OOPs;

//import OOPs.constructors.Student;

class Student {
    String name;
    int age;

    public void printinfo(String name) {
        System.out.println(name);
    }

    public void printinfo(int age) {
        System.out.println(age);
    }

    public void printinfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

class functionoverload {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tushar";
        s1.age = 20;

        s1.printinfo(s1.name + " " + s1.age);

        Student s2 = new Student();
        s2.name = "Archi";
        s2.age = 20;

        s2.printinfo(s2.name + " " + s2.age);
    }
}