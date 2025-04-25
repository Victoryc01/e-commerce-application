package com.blaze.ecommerce.payment;

import com.blaze.ecommerce.customer.CustomerResponse;
import com.blaze.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
