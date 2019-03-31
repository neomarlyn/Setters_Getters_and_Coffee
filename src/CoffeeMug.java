import java.util.Scanner;

public class CoffeeMug {


    private double radius;
    private double volume;
    private double weight;
    private double height;

    public CoffeeMug() {

        height = -1;
        radius = -1;
        volume = -1;
        weight = -1;
        setVolume();
        getVolume();
        setWeight();
        getWeight();

    }




    public void setVolume() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the coffee mug in inches?");
        radius = input.nextDouble();
        System.out.println("What is the height of the coffee mug in inches?");
        height = input.nextDouble();
        this.volume = radius * radius * height * Math.PI;
    }

    public double getVolume() {
        return volume;
    }

    public double setWeight() {
        weight = volume * 0.036127;
    return weight; }

        public double getWeight() { return weight; }

    }

