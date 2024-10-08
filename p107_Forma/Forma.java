package p107_Forma;

public abstract class Forma {
    private  String Color;
    public Forma() {}
    public Forma(String color) {
        Color = color;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    @Override
    public String toString() {
        return "Forma [Color=" + Color + "]";
    }
    public abstract double getArea();
}