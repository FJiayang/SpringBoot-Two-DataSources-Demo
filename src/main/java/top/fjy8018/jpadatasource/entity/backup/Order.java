package top.fjy8018.jpadatasource.entity.backup;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author F嘉阳
 * @date 2019-03-30 9:36
 */
@Data
@Entity(name = "tb_order")
public class Order {

    @Id
    private Integer id;

    private String orderName;

    private Integer price;
}
