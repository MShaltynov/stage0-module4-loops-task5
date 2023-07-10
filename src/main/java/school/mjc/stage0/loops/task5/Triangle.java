package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength - (cathetusLength-i)+1; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
