package pharmacy.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pharmacy.demo.model.Characteristic;
import pharmacy.demo.service.CharacteristicsService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/chars/")
public class CharacteristicRestController {

    @Autowired
    private CharacteristicsService characteristicsService;

    @RequestMapping(value = "{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Characteristic> getCustomer(@PathVariable("Id") Long id) {
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Characteristic characteristic = this.characteristicsService.getById(id);

        if (characteristic == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(characteristic, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Characteristic> saveCustomer(@RequestBody @Valid Characteristic characteristic) {
        HttpHeaders headers = new HttpHeaders();

        if (characteristic == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.characteristicsService.save(characteristic);
        return new ResponseEntity<>(characteristic, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Characteristic> updateCustomer(@RequestBody @Valid Characteristic characteristic) {
        HttpHeaders headers = new HttpHeaders();

        if (characteristic == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.characteristicsService.save(characteristic);

        return new ResponseEntity<>(characteristic, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Characteristic> deleteCustomer(@PathVariable("Id") Long id) {
        Characteristic characteristic = this.characteristicsService.getById(id);

        if (characteristic == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.characteristicsService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Characteristic>> getAllCustomers() {
        List<Characteristic> characteristic = characteristicsService.getAll();

        if (characteristic.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(characteristic, HttpStatus.OK);
    }
}
