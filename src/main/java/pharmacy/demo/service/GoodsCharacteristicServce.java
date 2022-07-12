package pharmacy.demo.service;

import pharmacy.demo.model.GoodsCharacteristics;


import java.util.List;

public interface GoodsCharacteristicServce {
    GoodsCharacteristics getById(Long id);

    void save(GoodsCharacteristics goodsCharacteristics);

    void delete(Long id);

    List<GoodsCharacteristics> getAll();
}
