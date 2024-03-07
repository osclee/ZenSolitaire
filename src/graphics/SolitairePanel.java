package graphics;

import entity.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class SolitairePanel extends JPanel {

    private static int WIDTH = 1200, HEIGHT = 1200;
    private List<Drawable> drawableEntities;

    public SolitairePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);

        drawableEntities = Collections.emptyList();
    }

    public void setDrawableEntities(List<Drawable> drawableEntities) {
        this.drawableEntities = drawableEntities;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (Drawable d : drawableEntities) {
            d.draw(g2);
        }
    }

}
