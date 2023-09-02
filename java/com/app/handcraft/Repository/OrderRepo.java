package com.app.handcraft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.handcraft.Model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}