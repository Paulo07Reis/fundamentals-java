package poo.exercise.exercise26;

public class Circle implements Shape {
    private Double radius;
    private static final Double PI = Math.PI;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return PI * (radius * radius);
    }

}
