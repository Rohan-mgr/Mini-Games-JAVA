import javax.swing.*;
import java.awt.*;
import Main.Main;
import game.main.TankMain;
import Main.GameStart;
import com.flappybird.view.Window;
import com.flappybird.view.Game;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Mini Games");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating buttons with images for each game
        JButton game1Button = createGameButton("Dragon Tale", "dragon.png");
        JButton game2Button = createGameButton("Tank Shooter", "tank.jpg");
        JButton game3Button = createGameButton("Snake & Ladder", "snakeladder.png");
        JButton game4Button = createGameButton("Flappt Bee", "flappy.png");

        // Creating a panel with a grid layout for the game menu
        JPanel panel = new JPanel(new GridLayout(2, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Adding buttons to the panel
        panel.add(game1Button);
        panel.add(game2Button);
        panel.add(game3Button);
        panel.add(game4Button);

        // Handling button clicks
        game1Button.addActionListener(e -> goToGame("Dragon Tale"));
        game2Button.addActionListener(e -> goToGame("Tank Shooter"));
        game3Button.addActionListener(e -> goToGame("Snake & Ladder"));
        game4Button.addActionListener(e -> goToGame("Flappy Bee"));

        // Setting up the main content pane
        setContentPane(panel);
        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    private JButton createGameButton(String gameName, String imageName) {
        // Creating a button with an image
        JButton button = new JButton(gameName);
        ImageIcon icon = new ImageIcon(getClass().getResource(imageName));
        button.setIcon(icon);

        // Adjusting button properties
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setFocusPainted(false); // Remove the default focus border

        return button;
    }

    private void goToGame(String gameName) {
        // Implement the logic to navigate to the selected game
        System.out.println("Opening " + gameName);
//        if(gameName == "Snake & Ladder") {
//            GameStart snakeLadder = new GameStart();
//        }
        switch (gameName) {
            case "Dragon Tale":
                Main dragonGame = new Main();
                dragonGame.main(null);
                break;
            case "Tank Shooter":
                TankMain tankGame = new TankMain();
                tankGame.main(null);
                break;
            case "Snake & Ladder":
                GameStart snakeGame = new GameStart();
                snakeGame.main(null);
                break;
            case "Flappy Bee":
//                Game game = new Game(null);
                Window flappyBee = new Window();
                flappyBee.main(null);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu gameMenu = new MainMenu();
            gameMenu.setVisible(true);
        });
    }
}