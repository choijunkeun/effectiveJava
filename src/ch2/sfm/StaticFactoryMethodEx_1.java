package ch2.sfm;

import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.EnumSet;


class Car {
    private Long door;
    private Color color;

    Car(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                '}';
    }
}

public class StaticFactoryMethodEx_1 {
    public static void main(String[] args) {
        // 1. from은 매개변수를 하나 받아서 해당 타입(여기선 Date타입)의 인스턴스를 반환하는 형변환 메서드. 즉 정적 펙터리 메서드이다.
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);

        // 2. of는 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 집계 메서드이다.(지정한 요소를 반환)
        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.BLUE); // RED, BLUE

        // 3. valueOf는 from과 of의 더 자세한 버전. (1,2,3번 모두 지정한 타입의 객체로 형변환하여 반환함)
        Color color = Color.valueOf("BLUE");
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger prime2 = BigInteger.valueOf(Long.MAX_VALUE);


        // 4. instance 혹은 getInstance : (매개변수를 받는다면) 매개변수를 명시한 인스턴스를 반환하지만, 같은 인스턴스임을 보장하진 않음

        // StackWalker 클래스(Java 9부터 추가됨)는 스택의 스낵샵을 제공하고,
        // 프로그래머가 스택 추적을 사용하는 방법을 세부적으로 제어할 수 있는 메서드 제공
        StackWalker stackWalker = StackWalker.getInstance();
        stackWalker.forEach(frame ->
                System.out.println("stackFrame = " + frame));

        // 5. create 혹은 newInstance : instance 혹은 getInstance와 같지만, 매번 새로운 인스턴스를 생성해 반환함을 보장
        // Array.newInstance : 지정된 컴퍼넌트형과 크기로 새로운 배열을 생성







    }
}
