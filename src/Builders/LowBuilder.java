package Builders;
import Products.LowTube;

/**
 * Created by pidho on 02.04.2018.
 * Builder for Lower tube
 */
public class LowBuilder implements Builder {
    private float x, y;
    private int width, height;


    @Override
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void SetPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public LowTube getResult(){
        return new LowTube(x, y, width, height);
    }
}
