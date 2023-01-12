package O;

public class EmailNotification implements Notificationable{
    @Override
    public void sendMessage(String text) {
        System.out.println("Отправляю текст по e-mail");
    }
}
