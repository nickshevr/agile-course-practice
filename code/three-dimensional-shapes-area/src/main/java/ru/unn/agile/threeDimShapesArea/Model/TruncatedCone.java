package ru.unn.agile.threeDimShapesArea.Model;

/**
 * Created by Maria Pronina.
 */
public class TruncatedCone implements Shape {
    private Circle upperBase;
    private Circle bottomBase;
    private double l;

    public TruncatedCone(final double r1, final double r2, final double l) {
        upperBase = new Circle(r1);
        bottomBase = new Circle(r2);
        if (l <= 0) {
            throw new IllegalArgumentException(ShapesAreaConstants.ILLEGAL_ARGUMENTS_EXCEPTION_STR);
        }
        this.l = l;

    }

    @Override
    public double getArea() {
        return Math.PI * (upperBase.getRadius() + bottomBase.getRadius()) * l
                + upperBase.getArea()
                + bottomBase.getArea();
    }
}
