package com.kodilla.good.patterns.chalenges;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {

        OrderRequestRetreiver orderRequestRetreiver = new OrderRequestRetreiver();
        OrderRequest orderRequest = orderRequestRetreiver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new ItemsOrderService(), new MailService(), new MastercardPayment());
        productOrderService.process(orderRequest);

    }

}
