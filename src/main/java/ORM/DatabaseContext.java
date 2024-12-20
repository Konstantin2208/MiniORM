package ORM;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public interface DatabaseContext<E> {

    void doCreate(Class<E> entityClass) throws SQLException;
    void doAlter(E entity) throws SQLException;

    boolean delete(E entity) throws SQLException, IllegalAccessException;

    boolean persist (E entity) throws SQLException, IllegalAccessException;

    Iterable<E> find(Class<E>table) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
    Iterable<E> find(Class<E>table, String where) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
    E findFirst(Class<E>table) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
    E findFirst(Class<E>table,String where) throws SQLException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;



}
