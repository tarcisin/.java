public class Increment {
    public static void main(String[] args) throws Exception {
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf("c afeter postincrement: %d%n", c);

        c--;

        System.out.printf("c before preincrement: %d%n", c);
        System.out.printf("    preincrementing c: %d%n", ++c);
        System.out.printf("c afeter preincrement: %d%n", c);
        
    }
}
