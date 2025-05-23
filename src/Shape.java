import java.awt.*;

public class Shape implements IDrawable{
    protected Turtle turtle;
    protected int xPosition;
    protected int yPosition;
    protected String colorName;
    protected int borderWidth;

    public void draw(){
        setColor();
        turtle.penUp();
        turtle.goTo(xPosition, yPosition);
        turtle.setPenWidth(borderWidth);
        turtle.penDown();
    }

    public Shape(Turtle turtle, int xPosition, int yPosition, String colorName, int borderWidth){
        this.turtle = turtle;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.colorName = colorName;
        this.borderWidth = borderWidth;
    }
    protected void setColor(){
        if(colorName.equalsIgnoreCase("GREEN")){
            turtle.setColor(Color.GREEN);
        }else if(colorName.equalsIgnoreCase("BLUE")){
            turtle.setColor(Color.BLUE);
        }else if(colorName.equalsIgnoreCase("MAGENTA")){
            turtle.setColor(Color.MAGENTA);
        }else if(colorName.equalsIgnoreCase("RED")){
            turtle.setColor(Color.RED);
        }else{
            turtle.setColor(Color.BLACK);
        }
    }
}
