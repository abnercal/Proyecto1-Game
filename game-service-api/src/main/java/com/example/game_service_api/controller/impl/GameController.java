package com.example.game_service_api.controller.impl;

import com.example.game_service_api.commons.entities.Game;
import com.example.game_service_api.controller.GameApi;
import com.example.game_service_api.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GameController implements GameApi {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }


    @Override
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game gameCreated = this.gameService.saveGame(game);
        return ResponseEntity.ok(gameCreated);
    }

    @Override
    public ResponseEntity<Game> getGameById(String id) {
        return ResponseEntity.ok(this.gameService.getGameById(id));
    }

    @Override
    public ResponseEntity<Game> updateGame(String id, @RequestBody Game game) {
        game.setId(Long.valueOf(id));
        Game gameUpdate = this.gameService.updateGame(game);
        return ResponseEntity.ok(gameUpdate);
    }

    @Override
    public ResponseEntity<Void> deleteGame(String id) {
        this.gameService.deleteGame(id);
        return ResponseEntity.noContent().build();
    }

}
