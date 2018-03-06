package Garden;

import java.util.ArrayList;

public class Garden extends Flowers{

    private ArrayList<Flowers> flowers;
    private ArrayList<Trees> trees;
    private double addWater;

    public Garden() {
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }

    public void addFlower(Flowers flowers1){
        flowers.add(flowers1);
    }

    public void addTrees(Trees trees1){
        trees.add(trees1);
    }

    public void watering(int addWater){
        int counterWateredFlowers = 0;
        int counterWateredTrees = 0;
        for (int i = 0; i < flowers.size(); i++) {
            if(flowers.get(i).getWaterAmount() < 5) {
                flowers.get(i).watering(addWater / (flowers.size() + trees
                        .size() - counterWateredFlowers - counterWateredTrees));
            } else {
                flowers.get(i).getStatus();
                counterWateredFlowers++;
            }
        }
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).getWaterAmount() < 10) {
                trees.get(i).watering(addWater / (flowers.size() + trees
                        .size() - counterWateredTrees - counterWateredFlowers));
            } else {
                flowers.get(i).getStatus();
                counterWateredTrees++;
            }
        }
        System.out.println("----------------------------------------------- ");

    }

    public void getStatus(){
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).getStatus();
        }
        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).getStatus();
        }
    }



}
