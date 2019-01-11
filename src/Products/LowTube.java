package Products;

/**
 * Created by pidho on 02.04.2018.
 * Lower Tube
 */
public class LowTube {
    private float x, y;
    private int width, height;

    /*
    *Creates lower tube
     */
    public LowTube(float x, float y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /*
    *Returns position of tube
     */
    public String getPosition(){
        return "LowTube";
    }
}
