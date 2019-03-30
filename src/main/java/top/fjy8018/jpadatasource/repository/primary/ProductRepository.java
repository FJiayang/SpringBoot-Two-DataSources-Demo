package top.fjy8018.jpadatasource.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fjy8018.jpadatasource.entity.primary.Product;

/**
 * @author F嘉阳
 * @date 2019-03-30 9:12
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
