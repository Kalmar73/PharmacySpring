package pharmacy.demo.service;

import pharmacy.demo.model.Characteristics;

import java.util.List;

public interface CharService {
    Characteristics getById(Long id);

    void save(Characteristics characteristics);

    void delete(Long id);

    List<Characteristics> getAll();
}
