import java.util.List;

public interface IGeneric<T,E> {
    List<T> getAll();
    boolean save(T t);
    boolean delete(E e);
    T findById(E e);
}
