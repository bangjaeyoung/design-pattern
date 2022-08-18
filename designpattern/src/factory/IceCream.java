package factory;
// 아이스크림 -> 기본, 딸기, 초코
// 기본 1000, 딸기 2000, 초코 3000

abstract class IceCream {
    public abstract int getPrice();

    @Override
    public String toString() {

        return "Hi, this ice cream is " + getPrice();
    }
}
