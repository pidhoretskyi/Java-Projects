package Builders;

/**
 * Created by pidho on 02.04.2018.
 * Interface of Builder
 */
public interface Builder {
    /*
    *Set size of the tube
    * @param width The <code>int</code> value of width
    * @param height The <code>int</code> value of height
     */
    void setSize(int width, int height);

    /*
    *Set position of tube
    * @param x First <code>float</code> coordinate for initial position
    * @param y Second <code>float</code> coordinate for initial position
     */
    void SetPosition(float x, float y);
}
