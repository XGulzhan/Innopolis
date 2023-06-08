package ru.inno.course.homework;
import java.io.IOException;
import java.util.Collection;

public interface PlayerService {
    void save(Collection<Player> players) throws IOException;

    // получить игрока по id
    Player getPlayerById(int id);

    // получить список игроков
    Collection<Player> getPlayers();

    // создать игрока (возвращает id нового игрока)
    int createPlayer(String nickname);

    // удалить игрока по id'шнику, вернет удаленного игрока
    Player deletePlayer(int id);

    // добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points);

}