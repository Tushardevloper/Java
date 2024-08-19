class Pen {
    String colour;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class opps {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "ball";

        pen1.printColour();
        pen1.printType();

        pen2.printColour();
        pen2.printType();
    }
}
