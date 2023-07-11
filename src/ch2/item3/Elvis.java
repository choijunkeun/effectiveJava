package ch2.item3;

import java.io.Serializable;

public class Elvis implements Serializable {
    /**
     * 싱글턴 만드는 방법 1.
     * 생성자를 private으로 하여 클래스 안에서만 접근 가능하게 하고 public static final필드인 Elvis.INSTANCE로 생성자를 호출한다.
     * 이렇게 하면 public이나 protected 생성자가 없으므로 Elvis 클래스가 초기화 될 때 만들어진 인스턴스가 단 하나뿐임이 보장된다.
     *
     * 하지만 클래스를 역직렬화 할 때 새로운 인스턴스가 생성되어 싱글턴 속성을 위반한다. (implements Serializable)
     * 이럴 경우엔 싱글턴 클래스에 readResolve 메서드를 구현하여 해결이 가능하다.
     * */
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() {}

    protected Object readResolve() {
        return INSTANCE;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
