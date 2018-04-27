/* Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange one with blue text: "Idea 1"
a pink one with black text: "Awesome"
a yellow one with green text: "Superb!"
*/

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt() {

    }

    public void write() {
        System.out.println(text + " in " + textColor + " on " + backgroundColor);
    }

    public static void main(String[] args) {
        PostIt myIdea = new PostIt();
        myIdea.backgroundColor = "#FF9800";
        myIdea.text = "Idea 1";
        myIdea.textColor = "#2196F3";
        myIdea.write();

        PostIt me = new PostIt();
        me.backgroundColor = "#E91E63";
        me.text = "Awesome";
        me.textColor = "#000000";
        me.write();

        PostIt greenFoxLabel = new PostIt();
        greenFoxLabel.backgroundColor = "#FFEB3B";
        greenFoxLabel.text = "Superb!";
        greenFoxLabel.textColor = "#4CAF50";
        greenFoxLabel.write();
    }
}

