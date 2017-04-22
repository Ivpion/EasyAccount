import model.Goods;
import model.GoodsCategory;
import model.Supplier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ivan on 11.04.17.
 */
public class Tests {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("unit");

        EntityManager manager = entityManagerFactory.createEntityManager();


        Supplier supplier1 = new Supplier("Maxus", "Vinnitsya");
        Supplier supplier2 = new Supplier("220", "Uman");
        Supplier supplier3 = new Supplier("Horos", "Kharkiv");

        GoodsCategory goodsCategory1 = new GoodsCategory("rozetka");
        GoodsCategory goodsCategory2 = new GoodsCategory("lampa");

        Goods goods1 = new Goods("e.next2x2", goodsCategory1);
        Goods goods2 = new Goods("e.next3x2", goodsCategory1);
        Goods goods3 = new Goods("e.next4x2", goodsCategory2);



        manager.getTransaction().begin();
        manager.persist(goodsCategory2);
        manager.persist(goodsCategory1);
        manager.persist(goods1);
        manager.persist(goods2);
        manager.persist(goods3);
        manager.persist(supplier1);
        manager.persist(supplier2);
        manager.persist(supplier3);
        manager.getTransaction().commit();

        System.out.println(goodsCategory1);
        System.out.println(goodsCategory2);
    }
}
