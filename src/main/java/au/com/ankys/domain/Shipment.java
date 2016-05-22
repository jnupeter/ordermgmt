package au.com.ankys.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by peter on 16-4-6.
 */
@Entity
public class Shipment {

    protected Shipment() {

    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String shipmentNumber;

    @Column
    private String receiptName;

    @Column
    private String receiptAddress;

    @Column
    private String receiptContactNumber;

    @ManyToOne
    private ShipmentProvider shipmentProvider;

    @Column
    private BigDecimal cost;

    public Long getId() {
        return id;
    }

    public String getShipmentNumber() {
        return shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getReceiptAddress() {
        return receiptAddress;
    }

    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress;
    }

    public String getReceiptContactNumber() {
        return receiptContactNumber;
    }

    public void setReceiptContactNumber(String receiptContactNumber) {
        this.receiptContactNumber = receiptContactNumber;
    }

    public ShipmentProvider getShipmentProvider() {
        return shipmentProvider;
    }

    public void setShipmentProvider(ShipmentProvider shipmentProvider) {
        this.shipmentProvider = shipmentProvider;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
