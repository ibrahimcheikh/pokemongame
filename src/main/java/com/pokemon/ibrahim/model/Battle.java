package com.pokemon.ibrahim.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Battle {
    List<Player> players;
    private Player winner;
    private StringBuilder battleNarrative;

}
