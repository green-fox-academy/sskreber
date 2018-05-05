public class Main {

    public static void main(String[] args) {

        Garden ourGarden = new Garden();

        Flower flower1 = new Flower(Flower.FlowerColour.YELLOW, ourGarden);
        Flower flower2 = new Flower(Flower.FlowerColour.BLUE, ourGarden);
        Tree tree1 = new Tree(Tree.TreeColour.ORANGE, ourGarden);
        Tree tree2 = new Tree(Tree.TreeColour.PURPLE, ourGarden);

        System.out.println("Number of flowers in this garden: " + ourGarden.flowers.size());
        System.out.println("Number of trees in this garden: " + ourGarden.trees.size());

        ourGarden.checkGarden(true);
        ourGarden.waterGarden(40);
        ourGarden.waterGarden(70);
    }
}

