package com.daview.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.daview.dto.PaymentDTO;

@Mapper
public interface PaymentMapper {
	
	int insertPayment(PaymentDTO payment);
    
    List<PaymentDTO> selectPaymentByMemberId(String memberId);
    
    PaymentDTO selectPaymentById(String pymId);
}
