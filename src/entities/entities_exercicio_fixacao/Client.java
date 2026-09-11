package entities.entities_exercicio_fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Client {
    SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;
    
    // Builder

    public Client(){

    }

    public Client(String name, String email, Date birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    // Methods getters and setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getBirthDate(){
        String birthDateStr = birthDateFormat.format(birthDate);
        return birthDateStr;
    }

    public void setBirthDate(String birthDateStr){
        try{
            this.birthDate = birthDateFormat.parse(birthDateStr);
        } catch (ParseException e){

        }
    }
}
