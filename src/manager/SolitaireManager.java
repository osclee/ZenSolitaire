package manager;

import entity.Card;
import entity.Drawable;
import entity.LoadMessage;
import entity.MoveEntity;
import graphics.SolitaireFrame;
import graphics.SolitairePanel;
import resources.ImageManager;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class SolitaireManager {
    private final int mode;

    private SolitaireFrame frame;
    private SolitairePanel panel;

    private GameAssets assets;
    private ImageManager imageManager;

    private MoveEntity moveEntity;

    private String defaultPath = "/default";

    public SolitaireManager(int mode) {
        this.mode = mode;
        buildFrame();
        displayLoad();
        buildAssets();
        addCardDragAndDrop();

        if (mode == 0) {
           drawInitialBoard();
        } else {
           displayAllCards();
        }
    }

    private void buildFrame() {
        panel = new SolitairePanel();
        panel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resized();
            }

        });
        frame = new SolitaireFrame(panel);
    }

    private void displayLoad() {
        Drawable lm = new LoadMessage();
        panel.setDrawableEntities(List.of(lm));
        panel.repaint();
    }

    private void buildAssets() {
        imageManager = new ImageManager(defaultPath);
        assets = new GameAssets();
        assets.buildCards();
        assets.assignImages(imageManager);
    }
    private void resized() {
        if (mode == 0) {
            drawInitialBoard();
        } else {
            displayAllCards();
        }
    }

    private void addCardDragAndDrop() {
        moveEntity = new MoveEntity(assets.getEntities(), panel);
    }

    private void displayAllCards() {
        int x = 0;
        int y = 0;

        int numPerRow = 9;
        int numPerCol = 6;

        int currCountRow = 0;
        int currCountCol = 0;

        int spacing = 10;

        int width = (panel.getWidth() / 9) - spacing;
        int height = (panel.getHeight() / 6) - spacing;

        for (Card card : assets.getCards()) {
            card.setP0(new Point(x, y));
            card.setP1(new Point(x + width, y));
            card.setP2(new Point(x, y + width));
            card.setP3(new Point(x + width, y + height));

            x += spacing + width;

            currCountRow++;

            if (currCountRow == numPerRow) {
                currCountRow = 0;
                x = 0;

                currCountCol++;

                y += spacing + height;
            }
        }

        panel.setDrawableEntities(assets.getDrawableEntities());
        panel.repaint();
    }

    private void drawInitialBoard() {
        panel.setDrawableEntities(assets.getDrawableEntities());
        panel.repaint();
    }

}
