import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.util.TreeMap;

public class Turtle {
    //@SuppressWarnings("unused")
    private static final long serialVersionUID = 2014120l;
    private static final Map<String, BufferedImage> cachedpictures = new TreeMap<String, BufferedImage>();
    private World world;
    private double theta;
    private Point2D.Double location;
    private boolean isDown;
    private Color color;
    private double shellSize;
    private int pause = 200;

    private static final color[] base = {
            
    }
}
