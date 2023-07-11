package ch2.item3;

public class ClientElvisEnum {
    public static void main(String[] args) {
        ElvisEnum e = ElvisEnum.INSTANCE;

        System.out.println("e.getValue() = " + e.getValue());
        e.setValue(2);
        System.out.println("e.getValue() = " + e.getValue());


    }
}
