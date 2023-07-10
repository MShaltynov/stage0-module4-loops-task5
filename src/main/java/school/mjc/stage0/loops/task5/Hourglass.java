package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        printHourglassOfGivenSize(6);
    }

    public static void printHourglassOfGivenSize(int height) {
        int middle = height / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if ((j >= i && j < height - i && i <= middle)
                        || (i >= middle && j <= height-(height - i)&&j>=(height-i-1))) {
                    System.out.print(8);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
