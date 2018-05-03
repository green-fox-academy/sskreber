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

        public PostIt(String backgroundColor, String text, String textColor) {
            this.backgroundColor = backgroundColor;
            this.text = text;
            this.textColor = textColor;
        }

        public void write() {
            System.out.println(text + " in " + textColor + " on " + backgroundColor);
        }

    }
