package entity;

import java.awt.*;

public class LoadMessage implements Drawable{

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(new Color(232, 16, 124));
        g2.fillRect(100, 100, 400, 400);
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("serif", Font.BOLD, 128));
        g2.drawString("Loading Resources...", 200, 100);
    }
}
