package com.codeclan.example.server.components;
import com.codeclan.example.server.models.BoardGame;
import com.codeclan.example.server.models.User;
import com.codeclan.example.server.repositories.BoardGameRepository;
import com.codeclan.example.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardGameRepository boardGameRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        // BoardGames
        BoardGame game1 = new BoardGame("image", "Mission: Red Planet", "2–6", "45–90");
        boardGameRepository.save(game1);

        BoardGame game2 = new BoardGame("image", "Imhotep", "2–4", "40");
        boardGameRepository.save(game2);

        BoardGame game3 = new BoardGame("image", "Tobago", "2–4", "60");
        boardGameRepository.save(game3);

        BoardGame game4 = new BoardGame("image", "Santorini", "2–4", "20");
        boardGameRepository.save(game4);

        BoardGame game5 = new BoardGame("image", "Ethnos", "2–6", "45–60");
        boardGameRepository.save(game5);

        BoardGame game6 = new BoardGame("image", "Cryptid", "3-5", "30–50");
        boardGameRepository.save(game6);

        // Users
        User user1 = new User("AlanK", "Alan", "K", "888");
        userRepository.save(user1);
    }
}
