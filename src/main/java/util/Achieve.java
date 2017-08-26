package util;

/**
 * Created by admin on 2017/8/26.
 */
public interface Achieve {

    Object achieve();

    default void init(){
    }
}
