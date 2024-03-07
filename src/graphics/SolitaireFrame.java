package graphics;

import javax.swing.*;

public class SolitaireFrame extends JFrame {

    public SolitaireFrame(SolitairePanel panel) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);

        this.pack();

        this.setVisible(true);
    }
}
