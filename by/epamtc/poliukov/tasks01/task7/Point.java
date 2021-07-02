package by.epamtc.poliukov.tasks01.task7;

import java.io.Serializable;

public class Point implements Serializable {
    private static final long serialVersionUID = 1L;
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(x);
        result = prime * result + Double.hashCode(y);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName() + " [x = ");
        builder.append(x);
        builder.append(",y = ");
        builder.append(y);
        builder.append("]");
        return builder.toString();
    }
}
