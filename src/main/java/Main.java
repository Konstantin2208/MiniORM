import ORM.EntityManager;
import ORM.MyConnector;
import entities.Order;
import entities.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {
       MyConnector.createConnection("root","22082003", "mini_orm");
        Connection connection = MyConnector.getConnection();

        EntityManager<User>userEntityManager=new EntityManager<>(connection);
//        userEntityManager.doCreate(User.class);
//        User pesho= new User("pesho",43, LocalDate.now());
//        userEntityManager.persist(pesho);
//
//
//
//        Iterable<User>users=userEntityManager.find(User.class,"age > 40");
//        System.out.println(users);
//
        EntityManager<Order> orderEntityManager=new EntityManager<>(connection);
//        orderEntityManager.doCreate(Order.class);
        Order order=new Order("mn123b4",LocalDate.now());
        orderEntityManager.persist(order);


    }
}
