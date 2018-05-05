public class Tree {

    public enum TreeColour {
        PURPLE, ORANGE
    }

    TreeColour treeColour;
    double treeWaterAmount;
    final double TREE_ABSORPTION_ABILITY = 0.40;
    Garden gardenTreeBelongsTo;

    public Tree(TreeColour treeColour) {
        this.treeColour = treeColour;
        this.treeWaterAmount = 0;
    }

    public Tree(TreeColour treeColour, Garden gardenName) {
        this.treeColour = treeColour;
        this.treeWaterAmount = 0;
        gardenName.trees.add(this);
    }

    public void waterTree(double amountOfWatering) {
        treeWaterAmount += (amountOfWatering * TREE_ABSORPTION_ABILITY);
    }
}

