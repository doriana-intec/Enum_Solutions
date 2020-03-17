package jp.ekata.car_app;

public class Car {

    private int year;
    private Model model;
    private Color color;

    public Car() {
    }

    public Car(int year, Model model, Color color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String display() {
        return String.format("Car: year=%d, model=%s, color=%s", year, model, color);
    }


}
