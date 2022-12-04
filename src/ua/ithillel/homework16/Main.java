package ua.ithillel.homework16;

public class Main {
    public static void main(String[] args) {

        Android xiaomi = new Android(6, "black", 234);
        xiaomi.call();
        xiaomi.sms();
        xiaomi.internet();
        xiaomi.addContentView();


        Iphone iPhone12 = new Iphone();
        iPhone12.call();
        iPhone12.sms();
        iPhone12.internet();
        iPhone12.update();
    }

}
