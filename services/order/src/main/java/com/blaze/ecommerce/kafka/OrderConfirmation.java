package com.blaze.ecommerce.kafka;

import com.blaze.ecommerce.customer.CustomerResponse;
import com.blaze.ecommerce.order.PaymentMethod;
import com.blaze.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;


// data needed to be sent to kafka broker(notification service)
public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
