package com.hcl.trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.trading.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
