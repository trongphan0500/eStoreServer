package com.example.estore.repository;

import com.example.estore.entity.Order;
import com.example.estore.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OrdeDetailsrRepository extends JpaRepository<OrderDetails,Integer> {
}
