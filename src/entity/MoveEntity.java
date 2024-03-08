package entity;

import graphics.SolitairePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Optional;

public class MoveEntity extends MouseAdapter {

    private final List<Entity> entities;
    private Optional<Entity> selectedEntity;
    private final SolitairePanel panel;

    private int clickedX = 0, clickedY = 0;

    public MoveEntity(List<Entity> entities, SolitairePanel panel) {
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);
        this.entities = entities;
        this.panel = panel;
        selectedEntity = Optional.empty();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (Entity entity : entities) {
            if (entity.checkIfInBounds(e.getX(), e.getY())) {
                clickedX = e.getX();
                clickedY = e.getY();
                entity.setBasePoints();

                selectedEntity = Optional.of(entity);
                break;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (selectedEntity.isPresent()) {
            selectedEntity = Optional.empty();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        selectedEntity.ifPresent(entity -> {
            entity.move(clickedX, clickedY, e.getX(), e.getY());
            panel.repaint();
        });

    }

}
