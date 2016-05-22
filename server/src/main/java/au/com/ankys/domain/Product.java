package au.com.ankys.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by peter on 16-4-6.
 */
@Entity
public class Product {

    protected Product() {

    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String specification;

    @Column
    private BigDecimal normalPurchasePrice;

    @Column
    private BigDecimal suggestSalePrice;

    @Column
    private String notes;

    public Long getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecification() {
        return this.specification;
    }

    public BigDecimal getNormalPurchasePrice() {
        return this.normalPurchasePrice;
    }

    public BigDecimal getSuggestSalePrice() {
        return this.suggestSalePrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setSpecification(final String specification) {
        this.specification = specification;
    }

    public void setNormalPurchasePrice(final BigDecimal normalPurchasePrice) {
        this.normalPurchasePrice = normalPurchasePrice;
    }

    public void setSuggestSalePrice(final BigDecimal suggestSalePrice) {
        this.suggestSalePrice = suggestSalePrice;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }
}
