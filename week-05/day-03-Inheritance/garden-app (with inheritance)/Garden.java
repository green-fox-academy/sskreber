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
            if (flower.plantWaterAmount < 5) {
                flowersNeedingWatering++;
                gardenStatusReport += "The " + flower.plantColour + " Flower needs water \n";
            } else {
                gardenStatusReport += "The " + flower.plantColour + " Flower doesn't need water\n";
            }
        }
        for (Tree tree : trees) {
            if (tree.plantWaterAmount < 10) {
                treesNeedingWatering++;
                gardenStatusReport += "The " + tree.plantColour + " Tree needs water\n";
            } else {
                gardenStatusReport += "The " + tree.plantColour + " Tree doesn't need water \n";
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
            if (flower.plantWaterAmount < 5) {
                flower.waterPlant(amountOfWatering / itemsneededWatering);
            }
        }

        for (Tree tree : trees) {
            if (tree.plantWaterAmount < 5) {
                tree.waterPlant(amountOfWatering / itemsneededWatering);
            }
        }
        checkGarden(true);
    }
}

