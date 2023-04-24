package ua.edu.khpi;

import ua.edu.khpi.api.RESTRequestApi;
import ua.edu.khpi.entity.Order;
import ua.edu.khpi.entity.Product;
import ua.edu.khpi.entity.User;
import ua.edu.khpi.template.AbstractRestTemplateMethod;
import ua.edu.khpi.template.impl.OrderRestTemplateMethodImpl;
import ua.edu.khpi.template.impl.ProductRestTemplateMethodImpl;
import ua.edu.khpi.template.impl.UserRestTemplateMethodImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Product validProduct = new Product(1, "Onion", "Vegetables", BigDecimal.TEN);
        Product invalidProduct = new Product(2, "Milk", "Milk", BigDecimal.valueOf(-12.34));
        User user = new User(1, "Oleksii", "Linnyk", "ol@gmail.com", "12345");
        Order order = new Order(1, LocalDateTime.now(), validProduct.getPrice().multiply(BigDecimal.valueOf(2)), user);

        RESTRequestApi restRequestApi = new RESTRequestApi(validProduct);
        AbstractRestTemplateMethod productRestTemplateMethod = new ProductRestTemplateMethodImpl();
        System.out.println(productRestTemplateMethod.processRestRequest(restRequestApi));
        System.out.println("\n");

//        Updating product in db Product{id=1, name='Onion', type='Vegetables', price=10}
//        Product was successfully updated


        RESTRequestApi restRequestApi2 = new RESTRequestApi(invalidProduct);
        AbstractRestTemplateMethod productRestTemplateMethod2 = new ProductRestTemplateMethodImpl();
        System.out.println(productRestTemplateMethod2.processRestRequest(restRequestApi2));
        System.out.println("\n");

//        Sending request to administrator messenger. Validation failed
//        Product Product{id=2, name='Milk', type='Milk', price=-12.34} did not pass validation

        RESTRequestApi restRequestApi3 = new RESTRequestApi(user);
        AbstractRestTemplateMethod userRestTemplateMethod = new UserRestTemplateMethodImpl();
        System.out.println(userRestTemplateMethod.processRestRequest(restRequestApi3));
        System.out.println("\n");

//        Remove user email from updating entity
//        Updating user User{id=1, firstName='Oleksii', lastName='Linnyk', email='null', password='12345'}
//        User was successfully updated

        RESTRequestApi restRequestApi4 = new RESTRequestApi(order);
        AbstractRestTemplateMethod orderRestTemplateMethod = new OrderRestTemplateMethodImpl();
        System.out.println(orderRestTemplateMethod.processRestRequest(restRequestApi4));
        System.out.println("\n");

//        Updating order in storage
//        Order Order{id=1, orderedTime=2023-04-24T19:27:43.127527900, totalPrice=20, orderedBy=User{id=1, firstName='Oleksii', lastName='Linnyk', email='null', password='12345'}} was successfully updated
    }
}
