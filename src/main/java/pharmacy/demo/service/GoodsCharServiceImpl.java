package pharmacy.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pharmacy.demo.model.Goods_Characteristic;
import pharmacy.demo.repository.GoodsCharRepository;

import java.util.List;

@Service
public class GoodsCharServiceImpl implements GoodsCharService{
    @Autowired
    GoodsCharRepository goodsCharRepository;

    @Override
    public Goods_Characteristic getById(Long id) {
        return goodsCharRepository.findOne(id);
    }

    @Override
    public void save(Goods_Characteristic goodsCharacteristic) {
        goodsCharRepository.save(goodsCharacteristic);
    }

    @Override
    public void delete(Long id) {
        goodsCharRepository.delete(id);
    }

    @Override
    public List<Goods_Characteristic> getAll() {
        return goodsCharRepository.findAll();
    }
}
