package GUI;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

public class Player {

    private int lives;
    private int xAxis;
    private int yAxis;
    private String imagePath;
    private boolean isAlive;

    public Player(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive) {
        this.setLives(lives);
        this.setxAxis(xAxis);
        this.setyAxis(yAxis);
        this.setImagePath(imagePath);
        this.setAlive(isAlive);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        if (isAlive) {
            if (xAxis >= 900) {
                this.xAxis = 900;
            } else if (xAxis <= 0) {
                this.xAxis = 0;
            } else {
                this.xAxis = xAxis;
            }

        }

    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        if (isAlive) {
            if (yAxis >= 600) {
                this.yAxis = 600;
            } else if (yAxis <= 0) {
                this.yAxis = 0;
            } else {
                this.yAxis = yAxis;
            }

        }
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        if (imagePath == null) {
            JOptionPane.showMessageDialog(null, "Invlid string!");
        } else if (imagePath.length() == 0) {
            JOptionPane.showMessageDialog(null, "String empty");
        }
        this.imagePath = imagePath;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void drawPlayer(Graphics g) {

        ImageIcon imageIcon = new ImageIcon(imagePath);
        g.drawImage(imageIcon.getImage(), xAxis, yAxis, null);
    }
}
