package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Characteristic;
import pharmacy.demo.repository.CharacteristicRepository;

import java.util.List;

@Service
public class CharacteristicServiceImpl implements CharacteristicsService {

    @Autowired
    CharacteristicRepository characteristicRepository;

    @Override
    public Characteristic getById(Long id) {
        return characteristicRepository.findOne(id);
    }

    @Override
    public void save(Characteristic characteristic) {
        characteristicRepository.save(characteristic);
    }

    @Override
    public void delete(Long id) {
        characteristicRepository.delete(id);
    }

    @Override
    public List<Characteristic> getAll() {
        return characteristicRepository.findAll();
    }
}
