package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ServiceCalendar;
import yanglao.service.ServiceCalendarService;

/**
 * Created by john(Zhewei) on 2017/1/21.
 */
@Controller
@RequestMapping("serviceCalendar")
public class ServiceCalendarController {
    @Autowired
    private ServiceCalendarService mServiceCalendarService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ServiceCalendar>> getMessage() {
        List<ServiceCalendar> messageList = mServiceCalendarService.queryAll();
        return ResponseEntity.ok(messageList);
    }



    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ServiceCalendar> saveMessage(ServiceCalendar serviceCalendar) {
        mServiceCalendarService.save(serviceCalendar);
        return ResponseEntity.status(201).body(serviceCalendar);
    }



    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ServiceCalendar serviceCalendar) {
        mServiceCalendarService.updateSelective(serviceCalendar);
        return ResponseEntity.status(204).build();
    }



    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ServiceCalendar serviceCalendar) {
        mServiceCalendarService.deleteByString(serviceCalendar.getId());
        return ResponseEntity.status(204).build();
    }
    
}
