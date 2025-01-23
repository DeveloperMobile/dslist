package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {}

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public void setGame(Game game) {
        id.setGame(game);
    }

    public Game getGame() {
        return id.getGame();
    }

    public void setList(GameList list) {
        id.setList(list);
    }

    private GameList getList() {
        return id.getList();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
