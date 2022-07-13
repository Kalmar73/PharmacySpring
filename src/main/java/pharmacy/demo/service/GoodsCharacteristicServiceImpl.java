package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.GoodsCharacteristics;
import pharmacy.demo.repository.GoodsCharacteristicsRepository;

import java.util.List;

@Service
public class GoodsCharacteristicServiceImpl implements GoodsCharacteristicServce {

    @Autowired
    GoodsCharacteristicsRepository goodsCharacteristicsRepository;

    @Override
    public GoodsCharacteristics getById(Long id) {
        return goodsCharacteristicsRepository.findOne(id);
    }

    @Override
    public void save(GoodsCharacteristics goodsCharacteristics) {
        goodsCharacteristicsRepository.save(goodsCharacteristics);
    }

    @Override
    public void delete(Long id) {
        goodsCharacteristicsRepository.delete(id);
    }

    @Override
    public List<GoodsCharacteristics> getAll() {
        return goodsCharacteristicsRepository.findAll();
    }
}
