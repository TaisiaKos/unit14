import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void testExistProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "хлеб", 40);
        Product product2 = new Product(222, "булка", 30);
        Product product3 = new Product(3, "картошка", 20);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(3);
        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2};

        Assertions.assertArrayEquals(expected, actual);
    }

   // @Test
   // public void testNotExistProduct1() {
     //   ShopRepository repo = new ShopRepository();
      //  Product product1 = new Product(11, "хлеб", 40);
      //  Product product2 = new Product(222, "булка", 30);
       // Product product3 = new Product(3, "картошка", 20);
       // repo.add(product1);
       // repo.add(product2);
      //  repo.add(product3);
       // repo.remove(1);
      //  Product[] actual = repo.findAll();
       // Product[] expected = {product1, product2, product3};

      //  Assertions.assertArrayEquals(expected, actual);
   // }

    @Test
    public void testNotExistProduct2() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(11, "хлеб", 40);
        Product product2 = new Product(222, "булка", 30);
        Product product3 = new Product(3, "картошка", 20);
        repo.add(product1);
        repo.add(product2);
        repo.add(product3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(1)
        );
    }
}