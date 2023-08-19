package de.trauma.backend.campaigns.monsters.monster.controller;

import de.trauma.backend.campaigns.encounters.encounter.controller.EncounterDTO;
import de.trauma.backend.campaigns.monsters.action.controller.ActionDTO;
import de.trauma.backend.campaigns.monsters.difficulty.controller.DifficultyDTO;
import de.trauma.backend.campaigns.monsters.monster.domain.Monster;
import de.trauma.backend.campaigns.monsters.sense.controller.SenseDTO;
import de.trauma.backend.characters.ability.controller.AbilityDTO;
import de.trauma.backend.characters.alignment.controller.AlignmentDTO;
import de.trauma.backend.characters.feature.controller.FeatureDTO;
import de.trauma.backend.characters.item.controller.ItemDTO;
import de.trauma.backend.characters.languages.controller.LanguageDTO;
import lombok.Getter;

import java.util.List;

@Getter
public class MonsterDTO {
    private final Long id;
    private final String name;
    private final String type;
    private final String subtype;
    private final int size;
    private final String environment;
    private final String description;
    private final int armorClass;
    private final int hitPoints;
    private final int currentHitPoints;
    private final int movementRatePrimary;
    private final int movementRateSecondary;
    private final String lair;
    private final String resistance;
    private final String damageImmunity;
    private final String conditionImmunity;
    private final String vulnerability;
    private final List<AlignmentDTO> alignments;
    private final List<AbilityDTO> abilities;
    private final List<SenseDTO> senses;
    private final List<LanguageDTO> languages;
    private final List<FeatureDTO> features;
    private final List<ItemDTO> loot;
    private final List<DifficultyDTO> difficulties;
    private final List<ActionDTO> actions;
    private final List<EncounterDTO> encounters;

    public MonsterDTO(Monster monster) {
        this.id = monster.getId();
        this.name = monster.getName();
        this.type = monster.getType();
        this.subtype = monster.getSubtype();
        this.size = monster.getSize();
        this.environment = monster.getEnvironment();
        this.description = monster.getDescription();
        this.armorClass = monster.getArmorClass();
        this.hitPoints = monster.getHitPoints();
        this.currentHitPoints = monster.getCurrentHitPoints();
        this.movementRatePrimary = monster.getMovementRatePrimary();
        this.movementRateSecondary = monster.getMovementRateSecondary();
        this.lair = monster.getLair();
        this.resistance = monster.getResistance();
        this.damageImmunity = monster.getDamageImmunity();
        this.conditionImmunity = monster.getConditionImmunity();
        this.vulnerability = monster.getVulnerability();
        this.alignments = monster.getAlignments().stream().map(AlignmentDTO::new).toList();
        this.abilities = monster.getAbilities().stream().map(AbilityDTO::new).toList();
        this.senses = monster.getSenses().stream().map(SenseDTO::new).toList();
        this.languages = monster.getLanguages().stream().map(LanguageDTO::new).toList();
        this.features = monster.getFeatures().stream().map(FeatureDTO::new).toList();
        this.loot = monster.getLoot().stream().map(ItemDTO::new).toList();
        this.difficulties = monster.getDifficulties().stream().map(DifficultyDTO::new).toList();
        this.actions = monster.getActions().stream().map(ActionDTO::new).toList();
        this.encounters = monster.getEncounters().stream().map(EncounterDTO::new).toList();
    }
}
