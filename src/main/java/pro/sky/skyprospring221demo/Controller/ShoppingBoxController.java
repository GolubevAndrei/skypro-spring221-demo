package pro.sky.skyprospring221demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospring221demo.Service.ShoppingBoxService;
import pro.sky.skyprospring221demo.Product.Product;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order/")
public class ShoppingBoxController {

    private final ShoppingBoxService shoppingBoxService;

    public ShoppingBoxController(ShoppingBoxService shoppingBoxService) {
        this.shoppingBoxService = shoppingBoxService;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
        shoppingBoxService.add(ids);
    }
    @GetMapping("/get")
    public Collection<Product> get() {
       return shoppingBoxService.get();
    }

}
