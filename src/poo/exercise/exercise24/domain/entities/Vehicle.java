package poo.exercise.exercise24.domain.entities;

public class Vehicle {
    private String model;

    public Vehicle(String name) {
        this.model = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle: ").append(getModel());
        return sb.toString();
    }
}
