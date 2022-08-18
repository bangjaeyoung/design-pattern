package factory;

public class FactoryTest {
    public static void main(String[] args) {

        IceCream strawberry = IceCreamFactory.getIceCream("Strawberry", 2000);
        IceCream chocolate = IceCreamFactory.getIceCream("Chocolate", 3000);

        System.out.println("Factory strawberry : " + strawberry);
        System.out.println("Factory chocolate : " + chocolate);
    }
}
