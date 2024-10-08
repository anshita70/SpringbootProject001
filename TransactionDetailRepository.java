package com.dailycodebuffer.Payment.repository;

import com.dailycodebuffer.Payment.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailRepository extends JpaRepository<TransactionDetails, Long> {
}
