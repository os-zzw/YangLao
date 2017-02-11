package yanglao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import yanglao.po.ShoppingAddress;
import yanglao.service.ShoppingAddressService;

/**
 * Created by john(Zhewei) on 2017/1/21.
 *
 */
@Controller
@RequestMapping("shoppingAddress")
public class ShoppingAddressController {

    @Autowired
    private ShoppingAddressService mShoppingAddressService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ShoppingAddress>> getMessage() {
        List<ShoppingAddress> shoppingAddresses = mShoppingAddressService.queryAll();
        return ResponseEntity.ok(shoppingAddresses);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ShoppingAddress> saveMessage(ShoppingAddress shoppingAddress) {
        mShoppingAddressService.save(shoppingAddress);
        return ResponseEntity.status(201).body(shoppingAddress);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> updateMessage(ShoppingAddress shoppingAddress) {
        mShoppingAddressService.updateSelective(shoppingAddress);
        return ResponseEntity.status(204).build();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteMessage(ShoppingAddress shoppingAddress) {
        mShoppingAddressService.deleteByString(shoppingAddress.getId());
        return ResponseEntity.status(204).build();
    }


}
