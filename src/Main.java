import Herencias.SmartPhone;
import Herencias.SmartWatch;


public class Main {
    public static void main(String[] args) {
        SmartPhone iPhone15 = new SmartPhone("Apple", "Iphone14MB", "IOS", 2023, true, true, true, "OLED");
        SmartWatch XiaomiWatch = new SmartWatch("Xiaomi", "Xiaowatch123", "Android", 2023, true, true, false, "cuero");
        System.out.println(iPhone15);
        System.out.println(XiaomiWatch);
    }
    }
