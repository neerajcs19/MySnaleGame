package mypackage;

import javax.swing.*;
import java.util.ArrayList;

public class Window extends JFrame {
    private static final long serialVersionUID=-2542001418764869760L;
    public static ArrayList<ArrayList<DataOfSquare>> Grid;
    public static int width=20;
    public static int height=20;

    public Window() {
        Grid=new ArrayList<ArrayList<DataOfSquare>>>();
        ArrayList<DataOfSquare> data;
        for(int i=0;i<width;i++) {
            data=new ArrayList<DataOfSquare>();
        for(int j=0;j<height;j++) {
            DataOfSquare c=new DataOfSquare(2);

        }
        }

    }
}
