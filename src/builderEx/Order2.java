package builderEx;


class Ramen2 {
    // 라면에 필수로 들어가는 재료
    private int waterVolume;
    private String noodleType, soup;

    // 라면에 부가적으로 들어가는 재료
    private int eggs;
    private int greenOnion;

    public int getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    public String getNoodleType() {
        return noodleType;
    }

    public void setNoodleType(String noodleType) {
        this.noodleType = noodleType;
    }

    public String getSoup() {
        return soup;
    }

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getGreenOnion() {
        return greenOnion;
    }

    public void setGreenOnion(int greenOnion) {
        this.greenOnion = greenOnion;
    }

    @Override
    public String toString() {
        return "Ramen2{" +
                "waterVolume=" + waterVolume +
                ", noodleType='" + noodleType + '\'' +
                ", soup='" + soup + '\'' +
                ", eggs=" + eggs +
                ", greenOnion=" + greenOnion +
                '}';
    }
}

public class Order2 {
    public static void main(String[] args) {
        Ramen2 rm = new Ramen2();
        rm.setWaterVolume(550);
        rm.setNoodleType("bold");
        rm.setSoup("mild");
        rm.setGreenOnion(2);

        System.out.println("rm = " + rm);
    }
}
