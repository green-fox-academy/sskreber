public class Main {

    public static void main(String[] args) {


        PostIt myIdea = new PostIt("#FF9800", "Idea 1", "#2196F3");
        PostIt me = new PostIt("#E91E63", "Awesome", "#000000");

        PostIt greenFoxLabel = new PostIt(); // just to try using the less specific constructor
        greenFoxLabel.backgroundColor = "#FFEB3B";
        greenFoxLabel.text = "Superb!";
        greenFoxLabel.textColor = "#4CAF50";

        myIdea.write();
        me.write();
        greenFoxLabel.write();
    }
}
