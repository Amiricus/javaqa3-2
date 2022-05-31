public class Main {
    
    public static void main(String[] args) {

        int balance = 100;
        int plus = 1050;

        int percent;
        if (plus > 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = plus * percent / 100;
        int total = balance + plus + bonus;

        System.out.println("Итоговый счет: " + total);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}