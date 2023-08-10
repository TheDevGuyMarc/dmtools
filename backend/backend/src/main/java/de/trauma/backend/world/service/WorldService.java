package de.trauma.backend.world.service;

import de.trauma.backend.world.domain.World;
import de.trauma.backend.world.repository.WorldEntity;
import de.trauma.backend.world.repository.WorldRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorldService {
    private final WorldRepository worldRepository;

    public WorldService(WorldRepository worldRepository) {
        this.worldRepository = worldRepository;
    }

    public List<World> findAllWorlds() {
        return this.worldRepository.findAll()
                .stream()
                .map(World::new)
                .toList();
    }

    public Optional<World> findWorldById(Long id) {
        return this.worldRepository.findById(id)
                .map(World::new);
    }

    public World createWorld(World world) {
        return new World(this.worldRepository.save(new WorldEntity(world)));
    }

    public World updateWorld(Long id, World world) throws ClassNotFoundException {
        Optional<World> existingWorldCheck = this.worldRepository.findById(id)
                .map(World::new);

        if (existingWorldCheck.isPresent()) {
            World existingWorld = existingWorldCheck.get();
            existingWorld.setName(world.getName());
            existingWorld.setSystem(world.getSystem());

            return new World(this.worldRepository.save(new WorldEntity(existingWorld)));
        }
        else {
            throw new ClassNotFoundException("World not found with id: " + id);
        }
    }

    public void deleteWorld(Long id) {
        this.worldRepository.deleteById(id);
    }

}
