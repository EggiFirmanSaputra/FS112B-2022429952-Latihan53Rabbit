package pbofs112b.pkg2022429952.latihan53.rabbit;

/**
 *
 * @author Eggi Firman S
 */
public class PBOFS112B2022429952Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
       
        System.out.println("Hello, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs ");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
} 

