import Builders.Builder;

/**
 * Created by pidho on 02.04.2018.
 * Director of building
 */
public class Director {

    public void BuildTube(Builder builder){
        builder.SetPosition(5, 5);
        builder.setSize(40, 10);
    }

    public void BuildLowTube(Builder builder){
        builder.setSize(40, 10);
        builder.SetPosition(5, 0);
    }

    public void BuildTopTube(Builder builder){
        builder.setSize(40, 10);
        builder.SetPosition(5, 10);
    }
}
