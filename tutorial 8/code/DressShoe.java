package tute8;

import java.util.Objects;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class DressShoe extends Shoe{
    HeelType heelType;

    public DressShoe(String color, String designer, float size) {
        super(color, designer, size);
    }

    public HeelType getHeelType() {
        return heelType;
    }

    public void setHeelType(HeelType heelType) {
        this.heelType = heelType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "DressShoe{" +
                "heelType=" + heelType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        DressShoe dressShoe = (DressShoe) o;
        return heelType == dressShoe.heelType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), heelType);
    }
}
