package com.codeclan.example.server.models;
import java.util.ArrayList;
import java.util.List;


public class User {

    private Long id;
    private String username;
    private String firstName;
    private String lastNameInitials;
    private String password;
    private List<BoardGame> userBoardgames;

    public User(String username, String firstName, String lastNameInitials, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastNameInitials = lastNameInitials;
        this.password = password;
        this.userBoardgames = new ArrayList<BoardGame>();
    }

    // POJO
    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNameInitials() {
        return lastNameInitials;
    }

    public void setLastNameInitials(String lastNameInitials) {
        this.lastNameInitials = lastNameInitials;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<BoardGame> getUserBoardgames() {
        return userBoardgames;
    }

    public void setUserBoardgames(List<BoardGame> userBoardgames) {
        this.userBoardgames = userBoardgames;
    }
}
