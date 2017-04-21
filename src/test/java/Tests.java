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

        GoodsCategory goodsCategory = new GoodsCategory("rozetka");

        Goods goods1 = new Goods("e.next2x2", goodsCategory);



        manager.getTransaction().begin();
        manager.persist(goodsCategory);
        manager.persist(goods1);

        manager.persist(supplier1);
        manager.persist(supplier2);
        manager.persist(supplier3);
        manager.getTransaction().commit();
    }
}
