import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Flower> flowers;
    List<Tree> trees;

    int flowersNeedingWatering = 0;
    int treesNeedingWatering = 0;
    String gardenStatusReport = "";

    public Garden() {
        flowers = new ArrayList<Flower>();
        trees = trees = new ArrayList<Tree>();
    }

    public void checkGarden(boolean printStatusReport) {
        gardenStatusReport = "";
        flowersNeedingWatering = 0;
        treesNeedingWatering = 0;
        for (Flower flower : flowers) {
            if (flower.flowerWaterAmount < 5) {
                flowersNeedingWatering++;
                gardenStatusReport += "The " + flower.flowerColour + " Flower needs water \n";
            } else {
                gardenStatusReport += "The " + flower.flowerColour + " Flower doesn't need water\n";
            }
        }
        for (Tree tree : trees) {
            if (tree.treeWaterAmount < 10) {
                treesNeedingWatering++;
                gardenStatusReport += "The " + tree.treeColour + " Tree needs water\n";
            } else {
                gardenStatusReport += "The " + tree.treeColour + " Tree doesn't need water \n";
            }
        }
        if (printStatusReport) {
            System.out.println(gardenStatusReport);
        }
    }

    public void waterGarden(double amountOfWatering) {
        checkGarden(false);
        System.out.println("Watering with " + amountOfWatering);
        int itemsneededWatering = flowersNeedingWatering + treesNeedingWatering;

        for (Flower flower : flowers) {
            if (flower.flowerWaterAmount < 5) {
                flower.waterFlower(amountOfWatering / itemsneededWatering);
            }
        }

        for (Tree tree : trees) {
            if (tree.treeWaterAmount < 5) {
                tree.waterTree(amountOfWatering / itemsneededWatering);
            }
        }
        checkGarden(true);
    }
}

