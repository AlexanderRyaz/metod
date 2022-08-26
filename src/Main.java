public class Main {
    public static void deliveryDays() {
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }

        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);

    }
    public static void main(String[] args) {
        deliveryDays();
    }
}


