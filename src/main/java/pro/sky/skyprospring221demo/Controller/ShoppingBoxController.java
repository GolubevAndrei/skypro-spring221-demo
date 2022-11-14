package pro.sky.skyprospring221demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospring221demo.Service.ShoppingBoxService;

@RestController
@RequestMapping("/store/order/")
public class ShoppingBoxController {

    private final ShoppingBoxService shoppingBoxService;

    public ShoppingBoxController(ShoppingBoxService shoppingBoxService) {
        this.shoppingBoxService = shoppingBoxService;
    }

}
