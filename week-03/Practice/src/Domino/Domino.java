package Domino;

import java.util.Arrays;

public class Domino {

        private final int[] values;
        private int valueA;
        private int valueB;

    public Domino( int valueA, int valueB) {
        this.values = new int[] {valueA, valueB};
        this.valueA = valueA;
        this.valueB = valueB;
    }

    /*public Domino(int valueA, int valueB) {
            this.values = new int[]{valueA, valueB};
        }*/

        public int[] getValues() {
            return values;
        }

        @Override
        public String toString() {
            return "[" + values[0] + ", " + values[1] + "]";
        }
    }


