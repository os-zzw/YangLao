package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ServicePrice;
import yanglao.service.ServicePriceService;

/**
 * Created by john(Zhewei) on 2017/1/21.
 */
@Controller
@RequestMapping("servicePrice")
public class ServicePriceController {

    @Autowired
    private ServicePriceService mServicePriceService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ServicePrice>> getMessage() {
        List<ServicePrice> servicePrices = mServicePriceService.queryAll();
        return ResponseEntity.ok(servicePrices);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ServicePrice> saveMessage(ServicePrice servicePrice) {
        mServicePriceService.save(servicePrice);
        return ResponseEntity.status(201).body(servicePrice);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ServicePrice servicePrice) {
        mServicePriceService.updateSelective(servicePrice);
        return ResponseEntity.status(204).build();
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ServicePrice servicePrice) {
        mServicePriceService.deleteByString(servicePrice.getId());
        return ResponseEntity.status(204).build();
    }

}
