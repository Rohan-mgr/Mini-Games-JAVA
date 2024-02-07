
package com.flappybird.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Window {
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    public static JFrame jframe;



    public static void main(String[] args) {
        Game game = new Game(jframe);


        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {


            JFrame frame = new JFrame();
            frame.add(game);
            frame.setTitle("Flappy Bee");
            frame.setMaximumSize(new Dimension(800, 600));
            frame.setPreferredSize(new Dimension(800, 600));
            frame.setMinimumSize(new Dimension(800, 600));
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
            jframe = frame;
            
        });
    }

}
