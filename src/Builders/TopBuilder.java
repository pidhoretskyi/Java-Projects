package Builders;
import Products.TopTube;

/**
 * Created by pidho on 02.04.2018.
 * Builder for upper tibe
 */
public class TopBuilder implements Builder {
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

    public TopTube getResult(){
        return new TopTube(x, y, width, height);
    }
}
