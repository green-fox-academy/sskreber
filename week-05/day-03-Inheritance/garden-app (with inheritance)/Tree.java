public class Tree extends Plant {
    public Tree(String plantColour) {
        this.plantColour = plantColour;
        this.plantWaterAmount = 0;
        this.plantAbsorptionAbility = 0.40;
    }

    public Tree(String plantColour, Garden gardenName) {
        this.plantColour = plantColour;
        gardenName.trees.add(this);
        this.plantWaterAmount = 0;
        this.plantAbsorptionAbility = 0.40;
    }
}

