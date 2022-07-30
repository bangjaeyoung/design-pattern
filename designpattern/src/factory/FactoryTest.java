package factory; // 아이스크림 -> 기본, 딸기, 초코
                 // 기본 1000, 딸기 2000, 초코 3000

abstract class IceCream {
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi, this ice cream is " + getPrice();
    }

}

class DefaultIceCream extends IceCream {
    private int price;

    public DefaultIceCream(int price) {
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}

class StrawberryIceCream extends IceCream {
    private int price;

    public StrawberryIceCream(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class ChocolateIceCream extends IceCream {
    private int price;

    public ChocolateIceCream(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class IceCreamFactory {
    public static IceCream getIceCream(String type, int price) {
        if("Strawberry".equalsIgnoreCase(type)) {
            return new StrawberryIceCream(price);
        }
        else if("Chocolate".equalsIgnoreCase(type)) {
            return new ChocolateIceCream(price);
        }
        return new DefaultIceCream(price);
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        IceCream strawberry = IceCreamFactory.getIceCream("Strawberry", 2000);
        IceCream chocolate = IceCreamFactory.getIceCream("Chocolate", 3000);

        System.out.println("Factory strawberry : " + strawberry);
        System.out.println("Factory chocolate : " + chocolate);
    }
}