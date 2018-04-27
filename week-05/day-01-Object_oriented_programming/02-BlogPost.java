//BlogPost
//        Create a BlogPost class that has
//        an authorName
//        a title
//        a text
//        a publicationDate
//        Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//        When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t
//        really into the whole organizer profile thing.

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {

    }

    public void writeFullText() {
        System.out.println(text);
    }

    public static void main(String[] args) {

        BlogPost loremIpsumText = new BlogPost();
        loremIpsumText.authorName = "John Doe";
        loremIpsumText.title = "Lorem Ipsum";
        loremIpsumText.text = "Lorem ipsum dolor sit amet.";
        loremIpsumText.publicationDate = "2000.05.04.";
        loremIpsumText.writeFullText();

        BlogPost waitButText = new BlogPost();
        waitButText.authorName = "Tim Urban";
        waitButText.title = "Wait but why";
        waitButText.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        waitButText.publicationDate = "2010.10.10.";
        waitButText.writeFullText();

        BlogPost engineerIbmVersusTrump = new BlogPost();
        engineerIbmVersusTrump.authorName = "William Turton";
        engineerIbmVersusTrump.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        engineerIbmVersusTrump.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        engineerIbmVersusTrump.publicationDate = "2017.03.28.";
        engineerIbmVersusTrump.writeFullText();
    }
}
