import Builders.LowBuilder;
import Builders.TopBuilder;
import Products.LowTube;
import Products.TopTube;

import java.util.Scanner;

/**
 * Created by pidho on 02.04.2018.
 */
public class Main {

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Director director = new Director();

        do{
            System.out.print("What tube you want create (top, low, both)?");
            String choise = in.nextLine();
            if(choise.compareTo("top")==0)
            {
                TopBuilder builder = new TopBuilder();
                director.BuildTube(builder);
                TopTube tube= builder.getResult();
                System.out.print("Object created!!\nObject class: ");
                System.out.print(tube.getPossition());
            }
            else if(choise.compareTo("low")==0)
            {
                LowBuilder builder = new LowBuilder();
                director.BuildTube(builder);
                LowTube tube= builder.getResult();
                System.out.print("Object created!!\nObject class: ");
                System.out.print(tube.getPosition());
            }
            else if(choise.compareTo("both")==0)
            {
                TopBuilder top = new TopBuilder();
                LowBuilder low = new LowBuilder();
                director.BuildLowTube(low);
                director.BuildTopTube(top);
                TopTube tube1;
                LowTube tube2;
                tube1 = top.getResult();
                tube2 = low.getResult();
                System.out.print("Objects " + tube1.getPossition() + " and " + tube2.getPosition() + " are created");
            }
            else
            {
                System.out.print("Wrong parameter!\n");
            }
            System.out.print("\nDo you want to try again? (y-yes, n-no): ");
            choise = in.nextLine();
            if(choise.compareTo("y")!=0) break;
        }while(true);
    }
}
