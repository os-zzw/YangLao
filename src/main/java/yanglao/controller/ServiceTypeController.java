package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ServiceType;
import yanglao.service.ServiceTypeService;

/**
 * Created by john(Zhewei) on 2017/1/19.
 */
@Controller
@RequestMapping("serviceType")
public class ServiceTypeController {

    @Autowired
    private ServiceTypeService mServiceTypeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ServiceType>> getMessage() {
        List<ServiceType> messageList = mServiceTypeService.queryAll();
        return ResponseEntity.ok(messageList);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ServiceType> saveMessage(ServiceType serviceType) {
        mServiceTypeService.save(serviceType);
        return ResponseEntity.status(201).body(serviceType);
    }


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ServiceType serviceType) {
        mServiceTypeService.updateSelective(serviceType);
        return ResponseEntity.status(204).build();
    }



    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ServiceType serviceType) {
        mServiceTypeService.deleteByString(serviceType.getId());
        return ResponseEntity.status(204).build();
    }



}
