package D;

public class TelegramNotification implements NotificationI{
    @Override
    public void sendMessage(String text) {
        System.out.println("send text " + "\"" + text + "\"" + " to telegram");
    }
}
