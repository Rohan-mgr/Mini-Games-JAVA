package game.main;

import game.component.GamePanel;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class TankMain extends JFrame {

    public TankMain() {
        init();
    }

    private void init() {
        setTitle("Java Tank Shooter Game");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        GamePanel panelGame = new GamePanel();
        add(panelGame);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                panelGame.start();
            }
        });
    }

    public static void main(String[] args) {
        TankMain tankMain = new TankMain();
        tankMain.setVisible(true);
    }
}
