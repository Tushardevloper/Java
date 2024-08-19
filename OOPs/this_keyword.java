package OOPs;

class info {
    int age;
    String name;

    public void printname() {
        System.out.println(this.name);
    }

    public void printage() {
        System.out.println(this.age);
    }

    public void printdetails() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class this_keyword {
    public static void main(String[] args) {
        info s1 = new info();
        s1.name = "Tushar";
        s1.age = 20;

        info s2 = new info();
        s2.name = "Archi";
        s2.age = 20;

        // s1.printname();
        // s1.printage();

        // s2.printname();
        // s2.printage();

        s1.printdetails();

    }
}
