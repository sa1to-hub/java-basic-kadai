package kadai_015;

public class Car_Chapter15 {
	private int gear = 1;     // ギア
    private int speed = 10;   // 速度

    public void changeGear(int afterGear) {
        int before = gear;
        gear = afterGear;

        switch (gear) {
            case 1 -> speed = 10;
            case 2 -> speed = 20;
            case 3 -> speed = 30;
            case 4 -> speed = 40;
            case 5 -> speed = 50;
            default -> speed = 10;
        }

        System.out.println("ギア" + before + "から" + gear + "に切り替えました");
    }

    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }

}
