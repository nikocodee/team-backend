package com.daview.dto;

import java.util.Date;

public class PaymentDTO {
	private String pymId; // 결제 고유 ID
	private String impUid; // 아임포트 결제 고유 ID
	private String merchantUid; // 아임포트 요청 시 사용된 주문 번호
	private String rsvId; // 예약 ID
	private String prodId; // 상품 ID
	private long memberId; // 회원 ID

	private String custNm; // 이름
	private String custTel; // 연락처
	private String custEmTel; // 비상연락처 (nullable)

	private Date custDate; // 상담 희망일
	private String custMemo; // 기타 문의사항 (nullable)

	private int pymPrice; // 결제 금액
	private int pymStatus; // 결제 상태 (예: 0=미결제, 1=결제완료 등)
	private String pymMethod; // 결제 수단 (카드, 가상계좌 등)
	private String pymNum; // 결제 거래번호
	private Date pymDate; // 결제 일시

	public String getPymId() {
		return pymId;
	}

	public void setPymId(String pymId) {
		this.pymId = pymId;
	}

	public String getImpUid() {
		return impUid;
	}

	public void setImpUid(String impUid) {
		this.impUid = impUid;
	}

	public String getMerchantUid() {
		return merchantUid;
	}

	public void setMerchantUid(String merchantUid) {
		this.merchantUid = merchantUid;
	}

	public String getRsvId() {
		return rsvId;
	}

	public void setRsvId(String rsvId) {
		this.rsvId = rsvId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getCustNm() {
		return custNm;
	}

	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}

	public String getCustTel() {
		return custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}

	public String getCustEmTel() {
		return custEmTel;
	}

	public void setCustEmTel(String custEmTel) {
		this.custEmTel = custEmTel;
	}

	public Date getCustDate() {
		return custDate;
	}

	public void setCustDate(Date custDate) {
		this.custDate = custDate;
	}

	public String getCustMemo() {
		return custMemo;
	}

	public void setCustMemo(String custMemo) {
		this.custMemo = custMemo;
	}

	public int getPymPrice() {
		return pymPrice;
	}

	public void setPymPrice(int pymPrice) {
		this.pymPrice = pymPrice;
	}

	public int getPymStatus() {
		return pymStatus;
	}

	public void setPymStatus(int pymStatus) {
		this.pymStatus = pymStatus;
	}

	public String getPymMethod() {
		return pymMethod;
	}

	public void setPymMethod(String pymMethod) {
		this.pymMethod = pymMethod;
	}

	public String getPymNum() {
		return pymNum;
	}

	public void setPymNum(String pymNum) {
		this.pymNum = pymNum;
	}

	public Date getPymDate() {
		return pymDate;
	}

	public void setPymDate(Date pymDate) {
		this.pymDate = pymDate;
	}

}
