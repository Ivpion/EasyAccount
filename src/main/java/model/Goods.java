package model;

import javax.persistence.*;

/**
 * Created by ivan on 12.04.17.
 */
@Entity
@Table(name = "Goods")
public class Goods{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name  = "goods_name", nullable = false)
        private String name;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
        private GoodsCategory categories;

        /*@ManyToMany(mappedBy = "goods", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Set<SuppliersGoodsStore> suppliersGoodsStores;*/



        public Goods(String name, GoodsCategory categories) {
                this.name = name;
                this.categories = categories;
        }

        public Goods() {
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public GoodsCategory getCategories() {
                return categories;
        }

        public void setCategories(GoodsCategory categories) {
                this.categories = categories;
        }

        public int getId() {
                return id;
        }

        @Override
        public String toString() {
                return "Goods{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", categories=" + categories +
                        '}';
        }
}
