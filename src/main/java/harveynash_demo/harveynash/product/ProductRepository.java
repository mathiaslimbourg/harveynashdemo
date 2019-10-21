package harveynash_demo.harveynash.product;

import harveynash_demo.harveynash.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long>{

}
