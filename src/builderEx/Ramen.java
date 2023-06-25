package builderEx;

// 라면 설계도
public class Ramen {
    // 라면에 필수로 들어가는 재료
    private int waterVolume;
    private String noodleType, soup;

    // 라면에 부가적으로 들어가는 재료
    private int eggs;
    private int greenOnion;


    private Ramen(Builder builder) {
        waterVolume = builder.waterVolume;
        noodleType = builder.noodleType;
        soup = builder.soup;
        eggs = builder.eggs;
        greenOnion = builder.greenOnion;
    }

    // Builder 클래스
    public static class Builder {
        private int waterVolume;
        private String noodleType, soup;
        private int eggs        = 0;
        private int greenOnion  = 0;

        public Builder(int waterVolume, String noodleType, String soup) {   // 필수 멤버 필드를 매개변수로 하는 생성자
            this.waterVolume = waterVolume;
            this.noodleType = noodleType;
            this.soup = soup;
        }

        public Builder eggs(int eggs) { // 선택 매개변수 값을 저장, Builder 객체를 반환하는 메서드
            this.eggs = eggs;
            return this;
        }

        public Builder greenOnion(int greenOnion) { // 선택 매개변수 값을 저장, Builder 객체를 반환하는 메서드
            this.greenOnion = greenOnion;
            return this;
        }

        public Ramen build() {
            return new Ramen(this);
        }
    }

    @Override
    public String toString() {
        return "Ramen{" +
                "waterVolume=" + waterVolume +
                ", noodleType='" + noodleType + '\'' +
                ", soup='" + soup + '\'' +
                ", eggs=" + eggs +
                ", greenOnion=" + greenOnion +
                '}';
    }

    public static void main(String[] args) {
        Ramen ramen = new Builder(500, "slim", "spicy")
                .build();

        Ramen ramen2 = new Builder(300, "bold", "mild")
                .greenOnion(5)
                .build();

        Ramen ramen3 = new Builder(200, "mid", "hot")
                .eggs(3).greenOnion(2)
                .build();


        System.out.println("ramen = " + ramen);
        System.out.println("ramen2 = " + ramen2);
        System.out.println("ramen3 = " + ramen3);
    }
}




