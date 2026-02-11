package app;

import com.formdev.flatlaf.FlatLightLaf;
import gui.Screen;
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {

        FlatLightLaf.setup();
        EventQueue.invokeLater(() -> {
            Screen screen = new Screen();
            screen.setLocationRelativeTo(null);
            screen.setVisible(true);
        });

    }
}
