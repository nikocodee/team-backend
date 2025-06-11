package com.daview.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PaymentWithReservationsDTO {
    private String pymId;
    private String impUid;
    private String merchantUid;
    private String prodId;
    private long memberId;

    private String custNm;
    private String custTel;
    private String custEmTel;
    private Date custDate;
    private String custMemo;

    private int pymPrice;
    private int pymStatus;
    private String pymMethod;
    private String pymNum;
    private Date pymDate;

    private List<ReservationDTO> reservations = new ArrayList<>();
 // MyBatis에서 자동으로 리스트 변환

}