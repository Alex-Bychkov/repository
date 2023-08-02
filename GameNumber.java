import java.util.Random;

public class GameNumber {

    public static void main(String[] args) {
        int numPlayer = 50;
        Random random = new Random();
        int numPC = random.nextInt(100) + 1;
        for (int i = 0; i < 50; i++) {
            if (numPlayer > numPC) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                numPlayer--;
            } else if (numPlayer < numPC) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                numPlayer++;
            } else {
                System.out.println("Число Игрока " + numPlayer + " равно числу компьютера " + numPC + " Вы победили!");
                break;
            }
        }
    }
}
