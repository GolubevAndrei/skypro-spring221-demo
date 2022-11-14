package pro.sky.skyprospring221demo.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospring221demo.Component.Basket;
import pro.sky.skyprospring221demo.Product.Product;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ShoppingBoxServiceImpl implements ShoppingBoxService {

    private final Basket basket;
    private Map<Integer, Product> products;


    public ShoppingBoxServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        products = Map.of(
                1, new Product(1, "HeadPhones", 15000),
                2, new Product(2, "Smartphones", 25000),
                3, new Product(3, "HeadPhoneAMP", 35000));
    }

    @Override
    public void add(List<Integer> ids) {
basket.add(
        ids.stream()
                .map(products::get)
                .collect(Collectors.toList())
);
    }

    @Override
    public Collection<Product> get() {
        return basket.get();
    }
}
