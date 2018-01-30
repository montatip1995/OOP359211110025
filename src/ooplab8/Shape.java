package ooplab8;
//Abstract class
public abstract class Shape {
    private int width;
    private int length;

    public abstract double getArea();

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}//class
