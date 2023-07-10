package school.mjc.stage0.loops.task5;

public class Cross {
    public static void main(String[] args) {
        printCross(3);
    }
    public static void printCross(int sideLength) {
        int moddle=sideLength/2;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j==moddle||i==moddle){
                    System.out.print(8);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
