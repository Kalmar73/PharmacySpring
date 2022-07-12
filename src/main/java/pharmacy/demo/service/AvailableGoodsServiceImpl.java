package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.AvailableGoods;
import pharmacy.demo.repository.AvailableGoodsRepository;

import java.util.List;

@Service
public class AvailableGoodsServiceImpl implements AvailableGoodsService{
    @Autowired
    AvailableGoodsRepository availableGoodsRepository;

    @Override
    public AvailableGoods getById(Long id) {
        return availableGoodsRepository.findOne(id);
    }

    @Override
    public void save(AvailableGoods availableGoods) {
        availableGoodsRepository.save(availableGoods);
    }

    @Override
    public void delete(Long id) {
        availableGoodsRepository.delete(id);
    }

    @Override
    public List<AvailableGoods> getAll() {
        return availableGoodsRepository.findAll();
    }
}
