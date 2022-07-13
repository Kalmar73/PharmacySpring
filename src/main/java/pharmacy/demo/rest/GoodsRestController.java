package pharmacy.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pharmacy.demo.model.Goods;
import pharmacy.demo.service.GoodsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/goods/")
public class GoodsRestController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Goods> getCustomer(@PathVariable("Id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Goods goods = this.goodsService.getById(id);

        if (goods == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(goods, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Goods> saveCustomer(@RequestBody @Valid Goods goods) {
        HttpHeaders headers = new HttpHeaders();

        if (goods == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.goodsService.save(goods);
        return new ResponseEntity<>(goods, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Goods> updateCustomer(@PathVariable("Id") Long goodsId, @RequestBody @Valid Goods goods) {
        HttpHeaders headers = new HttpHeaders();

        if ((goodsId == null)&&(goods == null)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Goods goodsModified = this.goodsService.getById(goodsId);

        if (goodsModified == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        goodsModified.setGoodsCharacteristicsList(goods.getGoodsCharacteristicsList());
        goodsModified.setAvailableGoodsList(goods.getAvailableGoodsList());
        goodsModified.setName(goods.getName());

        this.goodsService.save(goodsModified);

        return new ResponseEntity<>(goodsModified, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Goods> deleteCustomer(@PathVariable("Id") Long id) {
        Goods goods = this.goodsService.getById(id);

        if (goods == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.goodsService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Goods>> getAllCustomers() {
        List<Goods> goods = goodsService.getAll();

        if (goods.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(goods, HttpStatus.OK);
    }
}
