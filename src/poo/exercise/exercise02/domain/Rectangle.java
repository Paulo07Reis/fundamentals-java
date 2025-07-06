package poo.exercise.exercise02.domain;

public class Rectangle {
    private double width;
    private double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (width * 2) + (height * 2);
    }

    public double diagonal(){
        return Math.sqrt((width * width) + (height * height));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
