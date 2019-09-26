package GUI;

import java.util.Random;

public class Generator {

    Random random = new Random();

    int x = random.nextInt(40)*20;
    int y = random.nextInt(20)*20;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getX() {
        System.out.println(x);
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
