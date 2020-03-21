import java.awt.*;

public abstract class Shape {

    private Color borderColor;
    private Point center;

    public Shape() {

    }

    public abstract void draw();

    public Color getBorderColor() {
        return this.borderColor;
    }

    public Point getCenter() {
        return this.center;
    }

    public Point location() {
        return null;
    }

    /**
     * @param newCenterPoint
     */
    public abstract void move(Point newCenterPoint);

    /**
     * @param color
     */
    public void setBorderColor(Color color) {

    }

    /**
     * @param centerPoint
     */
    public void setCenter(Point centerPoint) {

    }

}