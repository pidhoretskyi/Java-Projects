package Products;

/**
 * Created by pidho on 02.04.2018.
 * Upper tube
 */
public class TopTube {
    private float x, y;
    private int width, height;

    /*
     *Creates upper tube
     */
    public TopTube(float x, float y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /*
     *Returns position of tube
     */
    public String getPossition(){
        return "TopTube";
    }
}
