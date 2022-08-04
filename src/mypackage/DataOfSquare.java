package mypackage;

import java.awt.*;
import java.util.ArrayList;

public class DataOfSquare {
    ArrayList<Color> c =new ArrayList<Color>();
    int color;
    SquarePanel square;
    public DataOfSquare(int col) {
        c.add(Color.darkGray);
        c.add(Color.blue);
        c.add(Color.white);
        color=col;
        square=new SquarePanel(c.get(color));
    }
    public void lightMeUp(int c) {
        square.ChangeColor(c.get(c));
    }
}
