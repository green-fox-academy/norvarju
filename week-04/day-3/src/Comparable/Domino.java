package Comparable;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable1 {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino o) {
        if(values[0] == o.values[0]){
            return 0;}
            else if(values[0] >= o.values[0]){
            return 1;}
        else {
            return -1;}
    }

    @Override
    public void printAllFields() {
        System.out.println(Arrays.toString(values));
    }
}