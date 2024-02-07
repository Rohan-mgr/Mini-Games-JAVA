package utils;

import javax.swing.*;
import Main.SnakeMain;

public class imageSetter {

    public static void SetImage(int x, int pl, JLabel[] labels) { // naam deikkhai bujha jay image set korar jonne eta

        String p = String.valueOf(pl);

        String location = "/Image/player " + p + ".png";

        if (x >= 1 && x <= 100) {
            int index = x - 1; // Adjust x to 0-based index
            labels[index].setVisible(true);
            labels[index].setIcon(new ImageIcon(SnakeMain.class.getResource(location)));
        }

    }
}
