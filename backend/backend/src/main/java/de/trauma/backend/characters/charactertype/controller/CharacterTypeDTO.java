package de.trauma.backend.characters.charactertype.controller;

import de.trauma.backend.campaigns.plots.plot.controller.PlotDTO;
import de.trauma.backend.characters.charactertype.domain.CharacterType;

import java.util.List;

public class CharacterTypeDTO {
    private final Long id;
    private final String name;
    private final String description;
    private final List<PlotDTO> plots;

    public CharacterTypeDTO(CharacterType characterType) {
        this.id = characterType.getId();
        this.name = characterType.getName();
        this.description = characterType.getDescription();
        this.plots = characterType.getPlots().stream().map(PlotDTO::new).toList();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<PlotDTO> getPlots() {
        return plots;
    }
}
