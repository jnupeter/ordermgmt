package au.com.ankys.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by peter on 16-4-6.
 */
@Entity
@Table(name = "tborder")
public class Order {

    protected Order() {

    }

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Customer customer;

    @OneToMany
    private Collection<Shipment> shipments;

    @OneToMany(mappedBy = "order")
    private Collection<OrderItem> orderItems;

    @Column
    private String comment;

    /**
     * Use bit wise to represent the status of an Order.
     * From right to left,
     * 1 bit: shipped.
     * 2 bit: ID image uploaded
     * 3 bit: Goods received
     * 4 bit: Money received / Paid
     *
     */
    @Column
    private int status;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar shipmentDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar uploadDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar receiveDate;

    @Column
    @Temporal(TemporalType.DATE)
    private Calendar paidDate;

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(Collection<Shipment> shipments) {
        this.shipments = shipments;
    }

    public Collection<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Collection<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public Calendar getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Calendar shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Calendar getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Calendar uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Calendar getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Calendar receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Calendar getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Calendar paidDate) {
        this.paidDate = paidDate;
    }
}
