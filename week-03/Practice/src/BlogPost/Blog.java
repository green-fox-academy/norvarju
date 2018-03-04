package BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private List<BlogPost> blog;

    public Blog() {
        blog = new ArrayList<>();
    }

    public void addBlog(BlogPost blogPost){
        blog.add(blogPost);
    }

    public void deleteBlog(int number){
        blog.remove(number);
    }

    public void update(int index, BlogPost blogPost){
        blog.add(index ,blogPost);
        blog.remove(index + 1);
    }

    @Override

    public String toString(){
        String result = "";
        for (int i = 0; i < blog.size(); i++) {
            result += "[" + blog.get(i).getAuthorName() + " " + blog.get(i).getTitle() + " " + blog
                    .get
                    (i).getText() + " " + blog.get(i).getPublicationDate() + "] ";
        }
        return result;
    }
}
