package resources;

public class InvalidImagePathException extends RuntimeException {
    public InvalidImagePathException(String path) {
        super("Unable to read image with path: " + path);
    }
}