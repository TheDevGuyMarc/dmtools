package de.trauma.backend.campaigns.encounters.encounter.exceptions;

public class EncounterNotFoundException extends RuntimeException {
    public EncounterNotFoundException(String message) {
        super(message);
    }
}
