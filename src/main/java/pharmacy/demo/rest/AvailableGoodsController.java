package pharmacy.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pharmacy.demo.model.AvailableGoods;
import pharmacy.demo.service.AvailableGoodsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/availGoods/")
public class AvailableGoodsController {

    @Autowired
    private AvailableGoodsService availableGoodsService;

    @RequestMapping(value = "{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AvailableGoods> getCustomer(@PathVariable("Id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        AvailableGoods availableGoods = this.availableGoodsService.getById(id);

        if (availableGoods == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(availableGoods, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AvailableGoods> saveCustomer(@RequestBody @Valid AvailableGoods availableGoods) {
        HttpHeaders headers = new HttpHeaders();

        if (availableGoods == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.availableGoodsService.save(availableGoods);
        return new ResponseEntity<>(availableGoods, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AvailableGoods> updateCustomer(@PathVariable("Id") Long id, @RequestBody @Valid AvailableGoods availableGoods) {
        HttpHeaders headers = new HttpHeaders();

        if ((id == null)&&(availableGoods == null)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        AvailableGoods availableGoodsModified = this.availableGoodsService.getById(id);

        if (availableGoodsModified == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        availableGoodsModified.setGoods(availableGoods.getGoods());
        availableGoodsModified.setAmount(availableGoods.getAmount());
        availableGoodsModified.setPharmacy(availableGoods.getPharmacy());
        availableGoodsModified.setPrice(availableGoods.getPrice());

        this.availableGoodsService.save(availableGoodsModified);

        return new ResponseEntity<>(availableGoodsModified, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AvailableGoods> deleteCustomer(@PathVariable("Id") Long id) {
        AvailableGoods availableGoods = this.availableGoodsService.getById(id);

        if (availableGoods == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.availableGoodsService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<AvailableGoods>> getAllCustomers() {
        List<AvailableGoods> availableGoods = availableGoodsService.getAll();

        if (availableGoods.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(availableGoods, HttpStatus.OK);
    }
}
