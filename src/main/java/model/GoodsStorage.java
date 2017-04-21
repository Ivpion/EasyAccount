package model;

import javax.persistence.*;

/**
 * Created by ivan on 12.04.17.
 */
@Entity
@Table(name = "Goods_storage")
public class GoodsStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int storage_id;

    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id", nullable = false)
    private Goods goods;

    @Column(name = "counter", nullable = false)
    private int count;

    @Column(name = "price", nullable = false)
    private double price;

    public GoodsStorage(Goods goods, int count, double price) {
        this.goods = goods;
        this.count = count;
        this.price = price;
    }

    public GoodsStorage() {
    }

    public int getId() {
        return storage_id;
    }

    public Goods getGoods() {
        return goods;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
