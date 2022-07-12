package pharmacy.demo.service;

import pharmacy.demo.model.Goods;


import java.util.List;

public interface GoodsService {
    Goods getById(Long id);

    void save(Goods goods);

    void delete(Long id);

    List<Goods> getAll();
}
