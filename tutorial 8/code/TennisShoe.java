package tute8;

import java.util.Objects;

/**
 * @author Chuang Wang
 * @institution University of Melbourne
 */
public class TennisShoe extends Shoe{
    private String soleType;
    private String canvasType;

    public TennisShoe(String color, String designer, float size) {
        super(color, designer, size);
    }

    public String getSoleType() {
        return soleType;
    }

    public void setSoleType(String soleType) {
        this.soleType = soleType;
    }

    public String getCanvasType() {
        return canvasType;
    }

    public void setCanvasType(String canvasType) {
        this.canvasType = canvasType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "TennisShoe{" +
                "soleType='" + soleType + '\'' +
                ", canvasType='" + canvasType + '\'' +
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
        TennisShoe that = (TennisShoe) o;
        return soleType.equals(that.soleType) &&
                canvasType.equals(that.canvasType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), soleType, canvasType);
    }
}
