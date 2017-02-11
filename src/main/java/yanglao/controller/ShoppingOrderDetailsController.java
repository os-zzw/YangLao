package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ShoppingOrderDetails;
import yanglao.service.ShoppingOrderDetailsService;

/**
 * Created by john(Zhewei) on 2017/1/21.
 */
@Controller
@RequestMapping("ShoppingOrderDetailsDetails")
public class ShoppingOrderDetailsController {
    @Autowired
    private ShoppingOrderDetailsService mShoppingOrderDetailsService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ShoppingOrderDetails>> getMessage() {
        List<ShoppingOrderDetails> ShoppingOrderDetailses = mShoppingOrderDetailsService.queryAll();
        return ResponseEntity.ok(ShoppingOrderDetailses);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ShoppingOrderDetails> saveMessage(ShoppingOrderDetails shoppingOrderDetails) {
        mShoppingOrderDetailsService.save(shoppingOrderDetails);
        return ResponseEntity.status(201).body(shoppingOrderDetails);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ShoppingOrderDetails shoppingOrderDetails) {
        mShoppingOrderDetailsService.updateSelective(shoppingOrderDetails);
        return ResponseEntity.status(204).build();
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ShoppingOrderDetails shoppingOrderDetails) {
        mShoppingOrderDetailsService.deleteByString(shoppingOrderDetails.getId());
        return ResponseEntity.status(204).build();
    }

}
