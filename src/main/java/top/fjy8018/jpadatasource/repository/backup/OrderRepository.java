package top.fjy8018.jpadatasource.repository.backup;

import org.springframework.data.jpa.repository.JpaRepository;
import top.fjy8018.jpadatasource.entity.backup.Order;

/**
 * @author F嘉阳
 * @date 2019-03-30 9:12
 */
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
