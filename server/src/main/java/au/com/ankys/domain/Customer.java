package au.com.ankys.domain;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

/**
 * Created by peter on 16-4-6.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    @NotNull
    @Size(min=3)
    private String name;

    @Column
    private String address;

    @Column
    private String contactNumber;

    @OneToMany(mappedBy = "customer")
    private Collection<Order> orders;

    @Column
    private String idNumber;
    @Column
    private String idImageFrontFileName;
    @Column
    private String idImagegRearFileName;

    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public Customer() {

    }

    public Long getId() {
        return this.id;
    }

    public void setName(final String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }

    public void setContactNumber(final String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }
    public Collection<Order> getOrders() {
        return orders;
    }
    public void setOrders(final Collection<Order> orders) {
        this.orders = orders;
    }

    public String getIdNumber() {
        return this.idNumber;
    }
    public void setIdNumber(final String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdImageFrontFileName() {
        return this.idImageFrontFileName;
    }

    public void setIdImageFrontFileName(final String idImageFrontFileName) {
        this.idImageFrontFileName = idImageFrontFileName;
    }

    public String getIdImagegRearFileName() {
        return this.idImagegRearFileName;
    }
    public void setIdImagegRearFileName(final String idImagegRearFileName) {
        this.idImagegRearFileName = idImagegRearFileName;
    }
}
