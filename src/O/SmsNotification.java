package O;

public class SmsNotification implements Notificationable{

    @Override
    public void sendMessage(String text) {
        System.out.println("Отправляю текст по смс");
    }
}
