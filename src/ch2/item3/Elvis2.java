package ch2.item3;

public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2() {} // 기본 생성자(private)
    public static Elvis2 getInstance() {    // 해당 메서드는 항상 같은 객체의 참조를 반환한다.
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
