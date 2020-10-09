package com.geekbrains.geek.market.repositories;

import com.geekbrains.geek.market.entities.Order;
import com.geekbrains.geek.market.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findAllByUser(User user);
}
