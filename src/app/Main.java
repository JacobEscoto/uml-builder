package app;

import com.formdev.flatlaf.FlatLightLaf;
import gui.Screen;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        
        if (setLookAndFeel()) {
            java.awt.EventQueue.invokeLater(() -> {
                Screen screen = new Screen();
                screen.setLocationRelativeTo(null);
                screen.setVisible(true);
            });
        }
        
    }
    
    private static boolean setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            return true;
        } catch (UnsupportedLookAndFeelException ex) {
            return false;
        }
    }
}
