@Component
public class NotificationListener {

  @KafkaListener(topics = "order-events")
  public void handle(String message) {
    System.out.println("Notification received: " + message);
  }
}
