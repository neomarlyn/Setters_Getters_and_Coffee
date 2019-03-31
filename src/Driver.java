public class Driver {

    public static void main(String[] args){
        CoffeeMug mug = new CoffeeMug();

        System.out.println("The coffee mug is " + mug.getVolume() + " cubic inches.");
        System.out.println("The water in the mug is " + mug.getWeight() + " pounds.");
    }

}
