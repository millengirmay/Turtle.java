import java.awt.*;
    public class Triangle extends Shape{
        private int width;
        Triangle(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth, int width){
            super( turtle, xPosition, yPosition, colorName, borderWidth);
            this.width = width;
        }
        @Override
        public void draw() {
            super.draw();

            turtle.forward(width);
            turtle.turnRight(120);

            turtle.forward(width);
            turtle.turnRight(120);

            turtle.forward(width);
            turtle.turnRight(120);

        }
    }

