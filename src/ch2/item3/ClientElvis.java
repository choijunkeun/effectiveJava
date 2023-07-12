package ch2.item3;

import java.io.*;

public class ClientElvis {
    public static void main(String[] args) {
//        Elvis e1 = new Elvis();   // 에러,  생성자를 private으로 다른 클래스에서 접근 불가능하다.
        Elvis e = Elvis.INSTANCE;
        e.setValue(1);


        // Serialize (직렬화)
        try {
//            FileOutputStream fileOut = new FileOutputStream("out.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("out.txt"));   // 위의 두줄을 다음 한줄로 표현 가능

            out.writeObject(e);
            out.close();
//            fileOut.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
        e.setValue(2);

        // Deserialize (역직렬화)
        Elvis e2 = null;

        try {
//            FileInputStream fileIn = new FileInputStream("out.txt");
//            ObjectInputStream in = new ObjectInputStream(fileIn);

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.txt"));

            e2 = (Elvis) in.readObject();
            in.close();
//            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        if(e == e2) {
            System.out.println("e와 e2는 같은 인스턴스이다.(싱글턴)");
            System.out.println("e = " + e);
            System.out.println("e2 = " + e2);
        } else {
            System.out.println("e와 e2는 다른 인스턴스이다.(싱글턴이 아님)");
            System.out.println("e = " + e);
            System.out.println("e2 = " + e2);
        }

        System.out.println("e.getValue() = " + e.getValue());
        System.out.println("e2.getValue() = " + e2.getValue());



    }
}
