package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Jablko {
Generator generator = new Generator();

    private int xAxis = generator.getX();
    private int yAxis = generator.getY();
    private String imagePath;
    private boolean isAlive;

    Random random = new Random();

    public Jablko(int xAxis, int yAxis, String imagePath, boolean isAlive) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.imagePath = imagePath;
        this.isAlive = isAlive;
    }

    public Jablko() {
    }

    public int getxAxis() {


        return xAxis;
    }

    public void setxAxis(int xAxis) {

        this.xAxis = xAxis;
    }

    public int getyAxis() {

        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void drawObiekt(Graphics g) {

        ImageIcon imageIcon = new ImageIcon(imagePath);
        g.drawImage(imageIcon.getImage(), xAxis, yAxis, null);
    }
}




