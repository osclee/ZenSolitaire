package manager;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SolitaireManager(parseInput(args)));
    }

    private static int parseInput(String[] args) {
        int mode = 1;
        if (args.length == 0) {
            System.out.println("WARN: No mode input, defaulting to debug");
        } else if (args.length > 1) {
            System.out.println("WARN: More than one input, defaulting to debug");
        } else {
            try {
                mode = Integer.parseInt(args[0]);
            } catch (NumberFormatException ignored) {}
        }

        return mode;
    }
}
