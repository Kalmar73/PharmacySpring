package pharmacy.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pharmacy.demo.model.Pharmacy;
import pharmacy.demo.service.PharmacyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/pharmacy/")
public class PharmacyRestController {

    @Autowired
    private PharmacyService pharmacyService;

    @RequestMapping(value = "{Id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Pharmacy> getCustomer(@PathVariable("Id") Long pharmacyId) {
        if (pharmacyId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Pharmacy pharmacy = this.pharmacyService.getById(pharmacyId);

        if (pharmacy == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(pharmacy, HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Pharmacy> saveCustomer(@RequestBody @Valid Pharmacy pharmacy) {
        HttpHeaders headers = new HttpHeaders();

        if (pharmacy == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        this.pharmacyService.save(pharmacy);
        return new ResponseEntity<>(pharmacy, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Pharmacy> updateCustomer(@PathVariable("Id") Long pharmacyId,@RequestBody @Valid Pharmacy pharmacy) {
        HttpHeaders headers = new HttpHeaders();

        if ((pharmacyId == null)&&(pharmacy == null)){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Pharmacy pharmacyModified = this.pharmacyService.getById(pharmacyId);

        if (pharmacyModified == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        pharmacyModified.setAddress(pharmacy.getAddress());
        pharmacyModified.setFullname(pharmacy.getFullname());
        pharmacyModified.setAvailableGoodsList(pharmacy.getAvailableGoodsList());
        pharmacyModified.setName(pharmacy.getName());
        pharmacyModified.setPhoneNumber(pharmacy.getPhoneNumber());

        this.pharmacyService.save(pharmacyModified);

        return new ResponseEntity<>(pharmacyModified, headers, HttpStatus.OK);
    }

    @RequestMapping(value = "{Id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Pharmacy> deleteCustomer(@PathVariable("Id") Long id) {
        Pharmacy pharmacy = this.pharmacyService.getById(id);

        if (pharmacy == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        this.pharmacyService.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pharmacy>> getAllCustomers() {
        List<Pharmacy> pharmacies = pharmacyService.getAll();

        if (pharmacies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(pharmacies, HttpStatus.OK);
    }
}
