package com.gt.cricket.players;

import com.gt.cricket.player.Player;
import com.gt.cricket.player.Scoring;

import java.util.Arrays;

public class OneRunScorer extends Player {

    private String name;

    public OneRunScorer(String name, String team) {
        super(name, team, Arrays.asList(10,10,10,10,10,10,10,30));
        this.name = name;
    }

    @Override
    public String playsDelivery() {
        return Scoring.offDelivery().byPlayer(this, 20);
    }
}