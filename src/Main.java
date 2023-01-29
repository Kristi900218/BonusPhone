public class Main {
    public static void main(String[] args) {
        int initialBalance = 300;
        int adend = 1200;


        int bonuse = adend > 1000 ? adend / 100 : 0;

        int finalBalance = initialBalance + adend + bonuse;

        System.out.println("Итоговый счет:" + finalBalance);
        System.out.println("Бонус:" + bonuse);
    }
}