package com.daview.service;

import java.util.List;

import com.daview.dto.PaymentDTO;
import com.daview.dto.PaymentWithReservationsDTO;

public interface PaymentService {
	int insertPayment(PaymentDTO payment);
    
//    List<PaymentDTO> selectPaymentByMemberId(String memberId);
    
    PaymentDTO selectPaymentById(String pymId);

    List<PaymentWithReservationsDTO> selectPaymentWithReservationsByMemberId(String memberId);
}
