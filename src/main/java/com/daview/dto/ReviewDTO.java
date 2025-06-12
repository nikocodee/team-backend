package com.daview.dto;

import java.util.Date;

public class ReviewDTO {
	private Long revId;
	private Long memberId;
	private String facilityName;
	private String revTtl; // 후기 제목
	private String revCont; // 후기 내용
	private int revStars; // 별점
	private int revViews; // 조회수
	private Date revRegDate;

	public Long getRevId() {
		return revId;
	}

	public void setRevId(Long revId) {
		this.revId = revId;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getRevTtl() {
		return revTtl;
	}

	public void setRevTtl(String revTtl) {
		this.revTtl = revTtl;
	}

	public String getRevCont() {
		return revCont;
	}

	public void setRevCont(String revCont) {
		this.revCont = revCont;
	}

	public int getRevStars() {
		return revStars;
	}

	public void setRevStars(int revStars) {
		this.revStars = revStars;
	}

	public int getRevViews() {
		return revViews;
	}

	public void setRevViews(int revViews) {
		this.revViews = revViews;
	}

	public Date getRevRegDate() {
		return revRegDate;
	}

	public void setRevRegDate(Date revRegDate) {
		this.revRegDate = revRegDate;
	}
}
