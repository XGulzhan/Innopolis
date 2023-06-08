package ru.inno.course.homework;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class PlayServiceJason implements PlayerService {
    private Map<Integer, Player> players;
    private Set<String> nicknames;
    private int counter;
    private ObjectMapper mapper = new ObjectMapper();

    public PlayServiceJason() {
        players = new HashMap<>();
        nicknames = new HashSet<>();
        counter = 0;
    }

    @Override
    public void save(Collection<Player> players) throws IOException {
        mapper.writeValue(Path.of("./data.json").toFile(), players);
    }

    @Override
    public Player getPlayerById(int id) {
        if (!this.players.containsKey(id)){
            throw new NoSuchElementException("Нет такого игрока: " + id);
        }
        return this.players.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return new ArrayList<>();
    }

    @Override
    public int createPlayer(String nickname) {
        if (nicknames.contains(nickname)){
            throw new IllegalArgumentException("Никнейм кем-то используется: " + nickname);
        }
        counter++;
        Player player = new Player(counter, nickname, 0, true);
        this.players.put(player.getId(), player);
        this.nicknames.add(nickname);
        return player.getId();
    }

    @Override
    public Player deletePlayer(int id) {
        if (!this.players.containsKey(id)){
            throw new NoSuchElementException("Нет такого игрока: "  + id);

    }
        return players.remove(id);
    }

    @Override
    public int addPoints(int playerId, int points) {
        if (!this.players.containsKey(playerId)) {
            throw new NoSuchElementException("Нет такого игрока: " + playerId);
        } Player player = this.players.get(playerId);
        int currentPoints = player.getPoints();
        int newPoints = currentPoints + points;
        player.setPoints(currentPoints);
        return player.getPoints();
    }
}
