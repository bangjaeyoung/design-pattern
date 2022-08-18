package factory;

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
