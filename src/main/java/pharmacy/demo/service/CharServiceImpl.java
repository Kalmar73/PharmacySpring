package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Characteristics;
import pharmacy.demo.repository.CharRepository;

import java.util.List;

@Service
public class CharServiceImpl implements CharService{
    @Autowired
    CharRepository charRepository;

    @Override
    public Characteristics getById(Long id) {
        return charRepository.findOne(id);
    }

    @Override
    public void save(Characteristics characteristics) {
        charRepository.save(characteristics);
    }

    @Override
    public void delete(Long id) {
        charRepository.delete(id);
    }

    @Override
    public List<Characteristics> getAll() {
        return charRepository.findAll();
    }
}
