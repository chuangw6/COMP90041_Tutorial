package tute8;

import java.util.Objects;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class Shoe {
    private String color;
    private String designer;
    private float size;

    public Shoe() {
        color = "blue";
        designer = "david";
        size = 45.3f;
    }

    public Shoe(String color, String designer, float size) {
        this.color = color;
        this.designer = designer;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "color='" + color + '\'' +
                ", designer='" + designer + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Shoe shoe = (Shoe) o;
        return Float.compare(shoe.size, size) == 0 &&
                color.equals(shoe.color) &&
                designer.equals(shoe.designer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, designer, size);
    }
}
