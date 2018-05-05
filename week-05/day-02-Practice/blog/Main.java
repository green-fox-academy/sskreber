public class Main {
    public static void main(String[] args) {

        BlogPost loremIpsumText = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
        loremIpsumText.text = "Lorem ipsum dolor sit amet.";

        BlogPost waitButText = new BlogPost("Tim Urban", "Wait but why", "2010.10.10.");
        waitButText.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost engineerIbmVersusTrump = new BlogPost("William Turton",
                "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28.");
        engineerIbmVersusTrump.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        loremIpsumText.writeFullText();
        waitButText.writeFullText();
        engineerIbmVersusTrump.writeFullText();

        Blog blogPostList = new Blog();
        blogPostList.addBlogPostToList(loremIpsumText);
        blogPostList.addBlogPostToList(waitButText);
        blogPostList.addBlogPostToList(engineerIbmVersusTrump);
        System.out.println("Number of posts on this blog: " + blogPostList.blogPosts.size());

        blogPostList.removeBlogPostFromList(0);
        System.out.println("Number of posts on this blog: " + blogPostList.blogPosts.size());

        blogPostList.updateBlogPost(1, loremIpsumText);
        blogPostList.listAllPostTitles();
    }
}

