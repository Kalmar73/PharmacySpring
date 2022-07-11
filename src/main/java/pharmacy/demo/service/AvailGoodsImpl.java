package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Available_Goods;
import pharmacy.demo.repository.AvailGoodsRepository;

import java.util.List;

@Service
public class AvailGoodsImpl implements AvailGoodsService{

    @Autowired
    AvailGoodsRepository availGoodsRepository;

    @Override
    public Available_Goods getById(Long id) {
        return availGoodsRepository.findOne(id);
    }

    @Override
    public void save(Available_Goods availableGoods) {
        availGoodsRepository.save(availableGoods);
    }

    @Override
    public void delete(Long id) {
        availGoodsRepository.delete(id);
    }

    @Override
    public List<Available_Goods> getAll() {
        return availGoodsRepository.findAll();
    }
}
