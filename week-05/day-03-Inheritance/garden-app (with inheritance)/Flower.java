public class Flower extends Plant{
    public Flower(String plantColour) {
        this.plantColour = plantColour;
        this.plantWaterAmount = 0;
        this.plantAbsorptionAbility = 0.75;
    }

    public Flower(String plantColour, Garden gardenName) {
        this.plantColour = plantColour;
        gardenName.flowers.add(this);
        this.plantWaterAmount = 0;
        this.plantAbsorptionAbility = 0.75;
    }


}

