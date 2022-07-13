package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Pharmacy;
import pharmacy.demo.repository.PharmacyRepository;

import java.util.List;

@Service
public class PharmacyServiceImpl implements PharmacyService {

    @Autowired
    PharmacyRepository pharmacyRepository;

    @Override
    public Pharmacy getById(Long id) {
        return pharmacyRepository.findOne(id);
    }

    @Override
    public void save(Pharmacy pharmacy) {
        pharmacyRepository.save(pharmacy);
    }

    @Override
    public void delete(Long id) {
        pharmacyRepository.delete(id);
    }

    @Override
    public List<Pharmacy> getAll() {
        return pharmacyRepository.findAll();
    }
}
