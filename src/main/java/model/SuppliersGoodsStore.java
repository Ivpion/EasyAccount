package model;

import javax.persistence.*;

/**
 * Created by ivan on 12.04.17.
 */
@Entity
@Table(name = "Supplier_goods_store")
public class SuppliersGoodsStore{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int store_id;

    @Column(name = "prise", nullable = false)
    private double price;

  /*  @ManyToMany(mappedBy = "suppliersGoodsStores", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Goods> goods;*/


  /*  @ManyToMany(mappedBy = "suppliersGoodsStores", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Supplier> supplier;*/

    public SuppliersGoodsStore(double price) {
        this.price = price;

    }

    public SuppliersGoodsStore() {
    }

    public int getId() {
        return store_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
