/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

import java.io.Serializable;

/**
 *
 * @author DELL
 */
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String hear;
    private Boolean receive;
    private String contact;
    public User(){
        firstName="";
        lastName="";
        email="";
        hear="";
        receive= false;
        contact = "";
    }
    
    public User (String firstName, String lastName, String email, String hear, Boolean receive, String contact ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.receive = receive;
        this.hear = hear;
        this.contact = contact;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getHear(){
        return hear;
    }
    
    public void setHear(String Hear){
        this.hear = Hear;
    }
    
    public Boolean getReceive(){
        return receive;
    }
    
    public void setReceive(Boolean rece){
        this.receive = rece;
    }
    
    public String getContact(){
        return contact;
    }
    
    public void setContact(String contact){
        this.contact = contact;
    }
}
