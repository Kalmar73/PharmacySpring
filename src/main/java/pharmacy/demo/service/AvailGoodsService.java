package pharmacy.demo.service;

import pharmacy.demo.model.Available_Goods;

import java.util.List;

public interface AvailGoodsService {
    Available_Goods getById(Long id);

    void save(Available_Goods availableGoods);

    void delete(Long id);

    List<Available_Goods> getAll();
}
