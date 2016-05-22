package au.com.ankys.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by peter on 16-4-6.
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Order order;

    @OneToOne
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    @Column
    private String unit;

    @Column
    private BigDecimal purchasePrice;

    @Column
    private BigDecimal selloutPrice;

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getSelloutPrice() {
        return selloutPrice;
    }

    public void setSelloutPrice(BigDecimal selloutPrice) {
        this.selloutPrice = selloutPrice;
    }
}
