package entity;

import resources.ImageManager;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity implements Drawable {
    private Point p0, p1, p2, p3;
    private Point p0Old, p1Old, p2Old, p3Old; // Base points to keep track of image for drag
    private BufferedImage image;

    public Entity() {
        p0 = new Point(0, 0);
        p1 = new Point(0, 0);
        p2 = new Point(0, 0);
        p3 = new Point(0, 0);
        image = ImageManager.getDefaultImage();
    }

    public void setBasePoints() {
        p0Old = new Point(p0);
        p1Old = new Point(p1);
        p2Old = new Point(p2);
        p3Old = new Point(p3);
    }

    public void move(int oldX, int oldY, int newX, int newY) {
        int deltaX = newX - oldX;
        int deltaY = newY - oldY;

        p0.x = deltaX + p0Old.x;
        p0.y = deltaY + p0Old.y;

        p1.x = deltaX + p1Old.x;
        p1.y = deltaY + p1Old.y;

        p2.x = deltaX + p2Old.x;
        p2.y = deltaY + p2Old.y;

        p3.x = deltaX + p3Old.x;
        p3.y = deltaY + p3Old.y;
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

    public boolean checkIfInBounds(int x, int y) {
        return x > p0.x && x < p1.x && y > p0.y && y < p3.y;
    }

}
