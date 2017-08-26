package util;

/**
 * Created by admin on 2017/8/26.
 */
public interface Handle<T, K> {

    K handle(T o);
}
