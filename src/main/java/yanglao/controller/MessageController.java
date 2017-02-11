package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.Message;
import yanglao.service.MessageService;

/**
 * Created by john(Zhewei) on 2017/1/19.
 */
@Controller
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService mMessageService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Message>> getMessage() {
        List<Message> messageList = mMessageService.queryAll();
        return ResponseEntity.ok(messageList);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Message> saveMessage(@RequestBody Message message) {
        mMessageService.save(message);
        return ResponseEntity.status(201).body(message);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(@RequestBody Message message) {
        mMessageService.updateSelective(message);
        return ResponseEntity.status(204).build();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(@RequestBody Message message) {
        mMessageService.deleteByString(message.getId());
        return ResponseEntity.status(204).build();
    }

}
