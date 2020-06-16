package com.solvd.warehouseProject.daos;

import com.solvd.warehouseProject.models.Order;
import com.solvd.warehouseProject.models.OrderDetail;
import org.apache.ibatis.annotations.Param;

public interface IOrderDAO extends IDAO<Order> {
    void updateVolume(@Param("totalVolume") Double totalVolume, Long id);
    void updatePrice(@Param("totalPrice") Double totalPrice, Long id);
}