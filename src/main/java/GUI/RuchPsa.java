package GUI;

import java.util.Random;

public class RuchPsa {

    Random random = new Random();

    int x;
    int y;
    int a;
    int b;

    public int pobierzDane() {
        if (x < -25) {
            a = 10;

        } else if (x < 0 && x > -25) {

            a = -10;
        }

        return a;
    }

    public int pobierzDane2() {
        if (y < -25) {
            b = 10;

        } else if (y < 0 && y > -25) {

            b = -10;
        }

        return b;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getX() {
        x = random.nextInt(50) - 50;
        if (x < -25) {
            a = 100;

        } else if (x < 0 && x > -25) {

            a = -100;
        }
        return a;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        y = random.nextInt(50) - 50;
        if (y < - 25) {
            b = 100;

        } else if (y < 0 && y > - 25) {

            b = -100;
        }
        return b;
    }

    public void setY(int y) {
        this.y = y;
    }
}
