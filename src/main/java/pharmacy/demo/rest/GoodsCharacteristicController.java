package pharmacy.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pharmacy.demo.model.GoodsCharacteristics;
import pharmacy.demo.service.GoodsCharacteristicServce;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/goodsChars/")
public class GoodsCharacteristicController {

    @Autowired
    private GoodsCharacteristicServce goodsCharacteristicServce;

    @RequestMapping(value = "{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GoodsCharacteristics> getCustomer(@PathVariable("Id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        GoodsCharacteristics goodsCharacteristics = this.goodsCharacteristicServce.getById(id);

        if (goodsCharacteristics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(goodsCharacteristics, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GoodsCharacteristics> saveCustomer(@RequestBody @Valid GoodsCharacteristics goodsCharacteristics) {
        HttpHeaders headers = new HttpHeaders();

        if (goodsCharacteristics == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.goodsCharacteristicServce.save(goodsCharacteristics);
        return new ResponseEntity<>(goodsCharacteristics, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GoodsCharacteristics> updateCustomer(@RequestBody @Valid GoodsCharacteristics goodsCharacteristics) {
        HttpHeaders headers = new HttpHeaders();

        if (goodsCharacteristics == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.goodsCharacteristicServce.save(goodsCharacteristics);

        return new ResponseEntity<>(goodsCharacteristics, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<GoodsCharacteristics> deleteCustomer(@PathVariable("Id") Long id) {
        GoodsCharacteristics goodsCharacteristics = this.goodsCharacteristicServce.getById(id);

        if (goodsCharacteristics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.goodsCharacteristicServce.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<GoodsCharacteristics>> getAllCustomers() {
        List<GoodsCharacteristics> goodsCharacteristics = goodsCharacteristicServce.getAll();

        if (goodsCharacteristics.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(goodsCharacteristics, HttpStatus.OK);
    }
}
