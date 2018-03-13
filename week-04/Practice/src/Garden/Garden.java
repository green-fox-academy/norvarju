package Garden;

import java.util.ArrayList;

public class Garden extends Plant{
   private ArrayList<Flower> flowers;
   private ArrayList<Tree> trees;

    public Garden() {
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }

    public void addFlower(Flower flower1){
        flowers.add(flower1);
    }

    public void addTree(Tree tree1){
        trees.add(tree1);
    }

    @Override
    public void watering(int addedWater){
        int contentedFlowers = 0;
        int contentedTrees = 0;
        int numberOfPlants = flowers.size() + trees.size();
        for (Flower flower : flowers) {
            if (!flower.needsWaterOrNot()) {
                contentedFlowers++;
            } else {
                int numberOfFlowersToBeWatered = numberOfPlants -
                        contentedFlowers - contentedTrees;
                flower.watering(addedWater / numberOfFlowersToBeWatered);
            }
        }
        for (int i = 0; i < trees.size(); i++) {
            if (!trees.get(i).needsWaterOrNot()){
                contentedTrees++;
            } else {
                int numberOfTreesToBeWatered = numberOfPlants -
                        contentedFlowers - contentedTrees;
                trees.get(i).watering(addedWater / numberOfTreesToBeWatered);
            }
        }
    }

    @Override
    public void waterStatus(){
        for (int i = 0; i < flowers.size(); i++) {
            flowers.get(i).waterStatus();
        }
        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).waterStatus();
        }
        System.out.println
                ("---------------------------------------------------------------");
    }
}
