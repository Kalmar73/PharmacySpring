package pharmacy.demo.service;

import pharmacy.demo.model.AvailableGoods;


import java.util.List;

public interface AvailableGoodsService {
    AvailableGoods getById(Long id);

    void save(AvailableGoods availableGoods);

    void delete(Long id);

    List<AvailableGoods> getAll();
}
