public class Flower {
    public enum FlowerColour {
        YELLOW, BLUE
    }

    FlowerColour flowerColour;
    double flowerWaterAmount;
    static final double FLOWER_ABSORPTION_ABILITY = 0.75;
    Garden gardenFlowerBelongsTo;

    public Flower(FlowerColour flowerColour) {
        this.flowerColour = flowerColour;
        this.flowerWaterAmount = 0;
    }

    public Flower(FlowerColour flowerColour, Garden gardenName) {
        this.flowerColour = flowerColour;
        this.flowerWaterAmount = 0;
        gardenName.flowers.add(this);
    }

    public void waterFlower(double amountOfWatering) {
        flowerWaterAmount += (amountOfWatering * FLOWER_ABSORPTION_ABILITY);
    }
}

