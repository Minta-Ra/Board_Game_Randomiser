package com.codeclan.example.server.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boardGames")
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "image")
    private String image;
    @Column(name = "title")
    private String title;
    @Column(name = "playingTime")
    private String playingTime;
    @Column(name = "numOfPlayers")
    private String numOfPlayers;


    // private List<BoardgameUserRating> ratings;

    @ManyToMany
    @JsonIgnoreProperties({"userBoardgames"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable (
            name = "users_boardGames",
            joinColumns = { @JoinColumn (
                    name = "boardgame_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn (
                    name = "user_id",
                    nullable = false,
                    updatable = false)
            }
    )
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
