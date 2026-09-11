package entities.Exercicio_poster;

import java.util.Date;
import java.util.ArrayList;

public class Poster {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private ArrayList<Comment> comments = new ArrayList<>();

    // Builder

    public Poster(){

    }

    public Poster (Date moment, String title, String content, Integer likes){
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    // Methods getters and setters

    public Date getMoment(){
        return moment;
    }

    public void setMoment(Date moment){
        this.moment = moment;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public Integer getLikes(){
        return likes;
    }    

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    // Methods

    public void addComment(String comment){
        comments.add(new Comment(comment));
    }
}
