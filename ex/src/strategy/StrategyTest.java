package strategy;

interface JumpStrategy {
    void jump();
}

class Jump implements JumpStrategy {
    @Override
    public void jump() {
        System.out.println("조금 높게 점프합니다.");
    }
}

class DoubleJump implements JumpStrategy {
    @Override
    public void jump() {
        System.out.println("매우 높게 점프합니다.");
    }
}

interface ChangeStrategy {
    void change();
}

class BeSmaller implements ChangeStrategy {
    @Override
    public void change() {
        System.out.println("몸집이 지금보다 작아집니다.");
    }
}

class BeBigger implements ChangeStrategy {
    @Override
    public void change() {
        System.out.println("몸집이 지금보다 커집니다.");
    }
}

class SuperMario {
    private JumpStrategy jumpStrategy;
    private ChangeStrategy changeStrategy;

    public SuperMario(JumpStrategy jumpStrategy, ChangeStrategy changeStrategy) {
        this.jumpStrategy = jumpStrategy;
        this.changeStrategy = changeStrategy;
    }

    public void jump() {
        jumpStrategy.jump();
    }

    public void change() {
        changeStrategy.change();
    }

}
public class StrategyTest {

    public static void main(String[] args) {
        SuperMario superMario = new SuperMario(new DoubleJump(), new BeBigger());

        superMario.jump();
        superMario.change();
    }
}
