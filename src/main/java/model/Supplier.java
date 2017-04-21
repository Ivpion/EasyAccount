package model;

import javax.persistence.*;

/**
 * Created by ivan on 12.04.17.
 */

@Entity
@Table(name = "Supplier")
public class Supplier{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int supplier_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "discount")
    private int discount;

    /*@ManyToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SuppliersGoodsStore> suppliersGoodsStores;*/

    public Supplier() {
    }

    public Supplier(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getId() {
        return supplier_id;
    }
}
