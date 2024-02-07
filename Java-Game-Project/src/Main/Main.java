package Main;

import javax.swing.JFrame;
public class  Main {
    public static void main(String[] args) {
       JFrame window = new JFrame("Dragon");
       window.setContentPane(new GamePanel(window));
       window.setResizable(false);
       window.pack();
       window.setLocationRelativeTo(null);
       window.setVisible(true);
    }
}