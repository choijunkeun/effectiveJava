package ch2.item3;

import java.lang.reflect.Constructor;

public class ClientElvis2 {
    public static void main(String[] args) throws Exception {

        /**
         * Elvis2 역시 Elvis클래스처럼 (물론 Elvis클래스는 readResolve()를 이용하여 해결하였다)
         * 리프렉션을 이용해서 런타임시점에 private생성자에 접근하여 새로운 인스턴스를 생성할 수 있다.
         * */

        Elvis2 e1 = Elvis2.getInstance();

        Constructor constructor = e1.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        Elvis2 e2 = (Elvis2) constructor.newInstance();

        e1.setValue(1);
        e2.setValue(2);

        if(e1 == e2) {
            System.out.println("e1과 e2는 같은 객체입니다. (싱글턴입니다)");
            System.out.println("e1 = " + e1);
            System.out.println("e2 = " + e2);
            System.out.println("e1.getValue() = " + e1.getValue());
            System.out.println("e2.getValue() = " + e2.getValue());
        } else {
            System.out.println("e1과 e2는 다른 객체입니다. (싱글턴이 아닙니다)");
            System.out.println("e1 = " + e1);
            System.out.println("e2 = " + e2);
            System.out.println("e1.getValue() = " + e1.getValue());
            System.out.println("e2.getValue() = " + e2.getValue());
        }



    }
}
