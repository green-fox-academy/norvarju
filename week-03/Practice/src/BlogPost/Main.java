package BlogPost;

/*Create a BlogPost

class that has
        an authorName
        a title
        a text
        a publicationDate
        Create a few blog post objects:
        "Lorem Ipsum"titled by John Doe posted at"2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why"titled by Tim Urban posted at"2010.10.10."
        A popular long-form,stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump"titled by William Turton
        at"2017.03.28."
        Daniel Hanley,a cybersecurity engineer at IBM,doesn’t want to be the center of attention
        .When I asked to take his picture outside one of IBM’s New York City offices,he told me
        that he wasn’t really into the whole organizer profile thing.*/

import Pirate.Parrot;
import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {
    public static void main(String[] args) {
        BlogPost blogPost1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit " +
                "amet.", "2000.05.04.");
        BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why", "A popular long-form," +
                "stick-figure-illustrated blog about almost everything.", "2010.10.10." );
        BlogPost blogPost3 = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM " +
                "to Reckon With Trump", "Daniel Hanley,a cybersecurity engineer at IBM,doesn’t " +
                "want to be the center of attention. When I asked to take his picture outside one" +
                " of IBM’s New York City " + "offices,he told me" + "that he wasn’t really into " +
                "the whole organizer profile thing", "2017.03.28." );
        BlogPost blogPost4 = new BlogPost("Jo Nesbo", "The Leopard", "An investigation of a " +
                "murder", "2009.02.16.");
        BlogPost blogPost5 = new BlogPost("Frank Herbert", "Dune", "The rise of the House " +
                "Atreides", "1965.07.14.");
        Blog myBlog = new Blog();

        System.out.println(blogPost1.getAuthorName() + " " + blogPost1.getTitle() + " " +
                blogPost1.getText() + " " + blogPost1.getPublicationDate());

        myBlog.addBlog(blogPost1);
        myBlog.addBlog(blogPost2);
        myBlog.addBlog(blogPost3);

        System.out.println(myBlog.toString());

        myBlog.update(2, blogPost4);

        System.out.println(myBlog.toString());

        myBlog.deleteBlog(1);

        System.out.println(myBlog.toString());

        myBlog.addBlog(blogPost5);

        myBlog.update(0, blogPost2);

        System.out.println(myBlog.toString());
    }
}
