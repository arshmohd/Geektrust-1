package com.gt.cricket.players;

import com.gt.cricket.player.Player;
import com.gt.cricket.player.Scoring;

import java.util.Arrays;
import java.util.Random;

public class OddRunScorer extends Player {

    private String name;

    public OddRunScorer(String name, String team) {
        super(name, team, Arrays.asList(10,10,10,10,10,10,10,30));
        this.name = name;
    }

    @Override
    public String playsDelivery() {
        int shotIndex = new Random().nextInt(7);
        shotIndex = shotIndex == 0 ? 1 : shotIndex;
        shotIndex = shotIndex % 2 == 0 ? shotIndex : shotIndex + 1;
        return Scoring.offDelivery().byPlayer(this, shotIndex * 10);
    }
}
