package resources;

import entity.CardType;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ImageManager {

    private final Map<CardType, BufferedImage> imageMap;

    public ImageManager(String path) {
        imageMap = new HashMap<>();
        buildImageMap(path, "png");
    }

    public void buildImageMap(String path, String extension) {
        for (CardType cardType : CardType.values()) {
            imageMap.put(cardType, getImageFromPath(path, cardType.getName(), extension));
            //imageMap.put(cardType, getImageFromHere(cardType));
        }
    }

    public BufferedImage getImage(CardType cardType) {
        return imageMap.get(cardType);
    }

    private BufferedImage getImageFromHere(CardType cardType) {
        BufferedImage image = new BufferedImage(600, 800, BufferedImage.TYPE_INT_ARGB);
        Graphics2D imageGraphics = (Graphics2D) image.getGraphics();
        imageGraphics.setColor(new Color(217, 165, 24));
        imageGraphics.fillRect(0, 0, image.getWidth(), image.getHeight());
        imageGraphics.setColor(Color.BLACK);
        imageGraphics.setFont(new Font("serif", Font.BOLD, 78));
        imageGraphics.drawString(cardType.getName(), 10, image.getHeight() / 2);
        return image;
    }

    private BufferedImage getImageFromPath(String path, String fileName, String extension) throws InvalidImagePathException {
        String fullPath = path + "/" + fileName + "." + extension;
        try {
            return ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream(fullPath)));
        } catch (IOException | NullPointerException e) {
            System.out.println("WARNING: No image found for path: " + fullPath + ". Using default image instead");
            return getDefaultImage();
        }

    }

    public static BufferedImage getDefaultImage() throws InvalidImagePathException {
        String path = "/no_resource.png";
        try {
            return ImageIO.read(Objects.requireNonNull(ImageManager.class.getResourceAsStream(path)));
        } catch (IOException | NullPointerException e) {
            throw new InvalidImagePathException(path);
        }
    }

}
