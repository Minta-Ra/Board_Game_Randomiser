package com.codeclan.example.server.models;
import java.util.ArrayList;
import java.util.List;


public class BoardGame {

    private Long id;
    private String image;
    private String title;
    private String playingTime;
    private String numOfPlayers;
//    private List<BoardgameUserRating> ratings;
    private List<User> userBoardgames;

    public BoardGame(String image, String title, String playingTime, String numOfPlayers) {
        this.image = image;
        this.title = title;
        this.playingTime = playingTime;
        this.numOfPlayers = numOfPlayers;
        this.userBoardgames = new ArrayList<User>();
    }

    // POJO
    public BoardGame() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(String playingTime) {
        this.playingTime = playingTime;
    }

    public String getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(String numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public List<User> getUserBoardgames() {
        return userBoardgames;
    }

    public void setUserBoardgames(List<User> userBoardgames) {
        this.userBoardgames = userBoardgames;
    }
}
