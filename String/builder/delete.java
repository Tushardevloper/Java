package String.builder;

public class delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tushar");
        sb.insert(2, 'd');
        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);
    }
}
