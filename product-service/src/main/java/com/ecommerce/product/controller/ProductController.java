@RestController
@RequestMapping("/products")
public class ProductController {

  @GetMapping
  public List<Product> getProducts() {
    return List.of(new Product(1L, "Laptop", 75000));
  }
}
