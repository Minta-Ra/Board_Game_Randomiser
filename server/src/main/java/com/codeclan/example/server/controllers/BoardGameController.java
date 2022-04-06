package com.codeclan.example.server.controllers;
import com.codeclan.example.server.models.BoardGame;
import com.codeclan.example.server.repositories.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class BoardGameController {

    @Autowired
    BoardGameRepository boardGameRepository;

    @GetMapping(value = "/boardgames")
    public ResponseEntity<List<BoardGame>> getAllBoardGames() {
        return new ResponseEntity<>(boardGameRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/boardgames/{id}")
    public ResponseEntity getBoardGameById(@PathVariable Long id) {
        return new ResponseEntity(boardGameRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/boardgames")
    public ResponseEntity<BoardGame> postBoardGame(@RequestBody BoardGame game) {
        boardGameRepository.save(game);
        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @PutMapping(value = "/boardgames/{id}")
    public ResponseEntity<BoardGame> putBoardGame(@RequestBody BoardGame game, @PathVariable Long id) {
        BoardGame gameToUpdate = boardGameRepository.findById(id).get();
        gameToUpdate.setTitle(game.getTitle());
        gameToUpdate.setNumOfPlayers(game.getNumOfPlayers());
        gameToUpdate.setPlayingTime(game.getPlayingTime());
        boardGameRepository.save(gameToUpdate);
        return new ResponseEntity<>(gameToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value = "/boardgames/{id}")
    public ResponseEntity<Long> deleteBoardGame(@PathVariable Long id) {
        boardGameRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
