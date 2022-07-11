package pharmacy.demo.service;

import pharmacy.demo.model.Pharmacy;

import java.util.List;

public interface PharmacyService {
    Pharmacy getById(Long id);

    void save(Pharmacy pharmacy);

    void delete(Long id);

    List<Pharmacy> getAll();
}
