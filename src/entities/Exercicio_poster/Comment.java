package entities.Exercicio_poster;

public class Comment {

    private String text;

    // Builder

    public Comment(){

    }

    public Comment(String text){
        this.text = text;
    }

    // Methods getters and setters

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
    
}
