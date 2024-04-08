package lang.object.test;

import java.util.Objects;

public class Rectangle {

    private int wtdth;
    private int height;

    public Rectangle(int wtdth, int height) {
        this.wtdth = wtdth;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "wtdth=" + wtdth +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return wtdth == rectangle.wtdth && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wtdth, height);
    }
}
