//Create a Blog class which can
//        store a list of BlogPosts
//        add BlogPosts to the list
//        delete(int) one item at given index
//        update(int, BlogPost) one item at the given index and update it with another BlogPost

import java.util.ArrayList;
import java.util.List;

public class Blog {

    List<BlogPost> blogPosts;

    public Blog() {
        this.blogPosts = new ArrayList<BlogPost>();
    }

    public void addBlogPostToList(BlogPost blogPostName) {
        blogPosts.add(blogPostName);
    }

    public void removeBlogPostFromList(int blogPostIndex) {
        blogPosts.remove(blogPostIndex);
    }

    public void updateBlogPost(int blogPostIndex, BlogPost blogPostName) {
        blogPosts.add(blogPostIndex, blogPostName);
    }

    public void listAllPostTitles() {
        System.out.println("The posts contained by this blog are the following: ");
        for (BlogPost post : blogPosts) {
            System.out.println("\"" + post.title + "\"");
        }
    }
}

