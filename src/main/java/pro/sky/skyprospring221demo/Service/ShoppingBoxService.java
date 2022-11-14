package pro.sky.skyprospring221demo.Service;

import pro.sky.skyprospring221demo.Product.Product;

import java.util.Collection;
import java.util.List;

public interface ShoppingBoxService {
    void add(List<Integer> ids);

    Collection<Product> get();
}
