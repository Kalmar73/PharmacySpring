package pharmacy.demo.service;

import pharmacy.demo.model.Characteristic;


import java.util.List;

public interface CharacteristicsService {
    Characteristic getById(Long id);

    void save(Characteristic characteristic);

    void delete(Long id);

    List<Characteristic> getAll();
}
