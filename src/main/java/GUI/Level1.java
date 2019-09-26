package GUI;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Level1 extends JPanel implements KeyListener {

    Generator generator = new Generator();
    RuchPsa ruchPsa = new RuchPsa();

    private JFrame windows = new JFrame("Fado");
    private ImageIcon background = new ImageIcon("pic//trawa.jpg");
    private Player player = new Player(3, 200, 100, "pic//FadoRight.png", true);

    private Obiekt poop = new Obiekt(player.getxAxis(), player.getyAxis(), "pic//poop.png", false);
    private Obiekt puppy = new Obiekt(generator.getX(), generator.getY(), "pic//puppy.png", false);
    private Obiekt puppy2 = new Obiekt(generator.getX(), generator.getY(), "pic//puppy.png", false);
    private Jablko jablko2 = new Jablko();
    private Jablko jablko3 = new Jablko();
    private Jablko jablko = new Jablko(jablko2.getxAxis(), jablko2.getyAxis(), "pic//jablko.png", true);
    private Jablko jablko1 = new Jablko(jablko3.getxAxis(), jablko3.getyAxis(), "pic//jablko.png", true);
    Pies cavalierka2 = new Pies(3, 300, 300, "pic//CavalierkaRight.png", true);
    private Pies cavalierka = new Cavalierka(3, cavalierka2.getxAxis(), cavalierka2.getyAxis(), "pic//CavalierkaRight.png", true);
    private int speed = 100;

    public Level1() {

        this.setFocusable(true);
        this.addKeyListener(this);

        windows.add(this);

        windows.setSize(950, 750);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setVisible(true);

    }

    public void paint(Graphics g) {
        if (player.getLives() > 0) {

            g.drawImage(background.getImage(), 0, 0, null);
            if (poop.isAlive()) {
                poop.drawObiekt(g);
                if (poop.getxAxis() == player.getxAxis() + 100 && poop.getyAxis() == player.getyAxis() + 100) {
                    player.setLives(player.getLives() - 1);
                    JOptionPane.
                            showConfirmDialog(null,
                                    "Wszedłeś w kupe! Zostało Ci " + player.getLives() + " żyć");
                    g.drawImage(background.getImage(), 0, 0, null);

                }

            }
            if (jablko.isAlive()) {
                jablko.drawObiekt(g);
            }
            if (jablko1.isAlive()) {
                jablko1.drawObiekt(g);

            }

            if (puppy.isAlive()) {
                puppy.drawObiekt(g);
            }
            if (puppy2.isAlive()){
                puppy2.drawObiekt(g);
            }

            if (cavalierka.isAlive()) {
                cavalierka.drawPlayer(g);
                cavalierka.setxAxis(cavalierka.getyAxis() + ruchPsa.getX());
                cavalierka.setyAxis(cavalierka.getyAxis() + ruchPsa.getY());


            }

            player.drawPlayer(g);

            if (player.getxAxis() == jablko.getxAxis() - 100 && player.getyAxis() == jablko.getyAxis() - 100) {
                jablko.setAlive(false);
                player.setLives(player.getLives() + 1);
                JOptionPane.showMessageDialog(null, "Mmmm... smaczne! Masz : " + player.getLives() + " żyć");
            }

            if (player.getxAxis() == cavalierka.getxAxis() && player.getyAxis() == cavalierka.getyAxis()-100) {
                puppy.setAlive(true);
            }


        } else {
            JOptionPane.showMessageDialog(null, "PRZEGRAŁES!!!");
            g.drawImage(background.getImage(), 0, 0, null);
        }


    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            //JOptionPane.showMessageDialog(null,"Right key pressed");
            player.setxAxis(player.getxAxis() + speed);
            player.setImagePath("pic//FadoRight.png");
            this.repaint();
        } else if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            player.setxAxis(player.getxAxis() - speed);
            player.setImagePath("pic//FadoLeft.png");
            this.repaint();

        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            player.setyAxis(player.getyAxis() + speed);
            player.setImagePath(player.getImagePath());
            this.repaint();
        } else if (ke.getKeyCode() == KeyEvent.VK_UP) {
            player.setyAxis(player.getyAxis() - speed);
            player.setImagePath(player.getImagePath());
            this.repaint();
        } else if (ke.getKeyCode() == KeyEvent.VK_SPACE) {

            poop.setAlive(true);
            poop.setxAxis(player.getxAxis() + 20);
            poop.setyAxis(player.getyAxis() + 120);
            poop.setImagePath(poop.getImagePath());
            this.repaint();
        }
    }

    public void keyReleased(KeyEvent e) {

    }

//    public void CzyWdepnalWkupe(){
//        if(poop.getxAxis() == player.getxAxis() || poop.getyAxis() == player.getyAxis()){
//            player.setLives(player.getLives()-1);
//            JOptionPane.showMessageDialog(null,"Zostało Ci" + player.getLives() + "żyć");
//        }


}
