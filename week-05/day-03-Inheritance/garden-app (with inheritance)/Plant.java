public class Plant {
    protected String plantColour;
    protected double plantWaterAmount;
    protected double plantAbsorptionAbility;

    public void waterPlant(double amountOfWatering) {
        plantWaterAmount += (amountOfWatering * plantAbsorptionAbility);
    }
}

