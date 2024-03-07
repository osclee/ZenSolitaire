package entity;

import resources.ImageManager;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity implements Drawable{
    private Point p0, p1, p2, p3;
    private BufferedImage image;

    public Entity() {
        p0 = new Point(0, 0);
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
        p3 = new Point(0, 0);
        image = ImageManager.getDefaultImage();
    }

    @Override
    public void draw (Graphics2D g2) {
        g2.drawImage(image, p0.x, p0.y, p3.x - p0.x, p3.y - p0.y, null);
    }


    public void setP0(Point p0) {
        this.p0 = p0;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
