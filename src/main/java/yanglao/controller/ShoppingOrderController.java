package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ShoppingOrder;
import yanglao.service.ShoppingOrderService;

/**
 * Created by john(Zhewei) on 2017/1/21.
 */
@Controller
@RequestMapping("shoppingOrder")
public class ShoppingOrderController {
    @Autowired
    private ShoppingOrderService mShoppingOrderService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ShoppingOrder>> getMessage() {
        List<ShoppingOrder> ShoppingOrderes = mShoppingOrderService.queryAll();
        return ResponseEntity.ok(ShoppingOrderes);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ShoppingOrder> saveMessage(ShoppingOrder shoppingOrder) {
        mShoppingOrderService.save(shoppingOrder);
        return ResponseEntity.status(201).body(shoppingOrder);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ShoppingOrder shoppingOrder) {
        mShoppingOrderService.updateSelective(shoppingOrder);
        return ResponseEntity.status(204).build();
    }


    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ShoppingOrder shoppingOrder) {
        mShoppingOrderService.deleteByString(shoppingOrder.getId());
        return ResponseEntity.status(204).build();
    }
}
