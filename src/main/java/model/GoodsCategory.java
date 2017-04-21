package model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ivan on 12.04.17.
 */


@Entity
@Table(name = "Goods_category")
public class GoodsCategory{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int category_id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "categories", fetch = FetchType.LAZY)
    private Set<Goods> goods;



    public GoodsCategory() {
    }

    public GoodsCategory(String name) {
        this.name = name;
    }

    public int getId() {
        return category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
