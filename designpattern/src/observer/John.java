package observer;

public class John implements Student{
    @Override
    public void update(String message) {
        System.out.println("John 수신 : " + message);
    }
}
