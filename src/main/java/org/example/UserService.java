package org.example;

public class UserService {
    private EmailSender sender;
    public UserService(EmailSender sender){
        this.sender=sender;
    }

    public boolean registerUser(String email){
        sender.send(email,"Welcome!");
        return true;
    }
}
