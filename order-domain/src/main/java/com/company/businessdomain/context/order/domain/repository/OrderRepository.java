package com.company.businessdomain.context.order.domain.repository;

import com.company.businessdomain.context.order.domain.model.Order;

/**
 * 订单资源库
 *
 * @author only
 * @since 2020-05-22
 */
public interface OrderRepository {
    void create(Order order);

    boolean enable(Order order);
}
