@Service
public class OrderSagaManager {

  @Autowired
  private KafkaTemplate<String, Object> kafkaTemplate;

  public void createOrder(String orderId) {
    kafkaTemplate.send("order-events", "ORDER_CREATED", orderId);
  }

  public void cancelOrder(String orderId) {
    kafkaTemplate.send("order-events", "ORDER_CANCELLED", orderId);
  }
}
