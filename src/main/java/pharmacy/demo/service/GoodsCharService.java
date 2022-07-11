package pharmacy.demo.service;

import pharmacy.demo.model.Goods_Characteristic;

import java.util.List;

public interface GoodsCharService {
    Goods_Characteristic getById(Long id);

    void save(Goods_Characteristic goodsCharacteristic);

    void delete(Long id);

    List<Goods_Characteristic> getAll();
}
