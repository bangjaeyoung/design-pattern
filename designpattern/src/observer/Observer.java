package observer;

import javax.xml.crypto.Data;

public interface Observer {
    public void update(Subject subject);
}

class ObserverImplements implements Observer {
    private Data data1;
    private Data data2;

    @Override
    public void update(Subject subject) {

    }
}
