package com.kodilla.good.patterns.chalenges;

import java.util.stream.Collectors;

public class ProductOrderService {
    private OrderService orderService;
    private InformationService informationService;
    private PaymantSerwice paymantSerwice;

    public ProductOrderService(OrderService orderService, InformationService informationService, PaymantSerwice paymantSerwice) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.paymantSerwice = paymantSerwice;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean transactionConfirmed = paymantSerwice.payment(orderRequest.getCustomer(), orderRequest.getBasket().stream().collect(Collectors.toList()));

        if (transactionConfirmed) {
            informationService.inform(orderRequest.getCustomer());
            orderService.createOrder(orderRequest.getCustomer(), orderRequest.getBasket());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}