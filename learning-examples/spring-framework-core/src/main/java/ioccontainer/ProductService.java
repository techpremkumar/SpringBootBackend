package ioccontainer;

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void processProduct() {
        productRepository.getProduct();
        System.out.println("Product processed successfully");
    }
}