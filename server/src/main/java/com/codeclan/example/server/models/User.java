package com.codeclan.example.server.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastNameInitials")
    private String lastNameInitials;
    @Column(name = "password")
    private String password;

    @ManyToMany
    @JsonIgnoreProperties({"userBoardgames"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "users_boardGames",
            joinColumns = { @JoinColumn (
                    name = "user_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn (
                    name = "boardgame_id",
                    nullable = false,
                    updatable = false)
            }
    )
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
