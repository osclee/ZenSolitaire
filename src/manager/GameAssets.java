package manager;

import entity.Card;
import entity.CardType;
import entity.Drawable;
import entity.Entity;
import resources.ImageManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameAssets {
    private final List<Card> cards;

    public GameAssets() {
        cards = new ArrayList<>();
    }

    public void buildCards() {
        for (CardType cardType : CardType.values()) {
            cards.add(new Card(cardType));
        }
    }

    public void assignImages(ImageManager imageManager) {
        for (Card c : cards) {
            c.setImage(imageManager.getImage(c.getCardType()));
        }
    }

    public List<Entity> getEntities() {
        return cards.stream().map(e -> (Entity) e).collect(Collectors.toList());
    }

    public List<Drawable> getDrawableEntities() {
        return cards.stream().map(e -> (Drawable) e).collect(Collectors.toList());
    }

    public List<Card> getCards() {
        return cards;
    }
}
