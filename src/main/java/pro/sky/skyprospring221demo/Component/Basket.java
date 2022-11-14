package pro.sky.skyprospring221demo.Component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprospring221demo.Product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Component
@SessionScope
public class Basket {

    private final Collection<Product> products;


    public Basket() {
        this.products = new ArrayList<>();
    }

    public void add(Collection<Product> products) {
        this.products.addAll(products);
    }

    public Collection<Product> get() {
        return Collections.unmodifiableCollection(products);
    }
}
