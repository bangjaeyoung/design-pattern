package factory;

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
