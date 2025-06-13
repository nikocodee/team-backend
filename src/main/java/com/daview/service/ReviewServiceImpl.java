package com.daview.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.daview.dto.ReviewDTO;
import com.daview.mapper.ReviewMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

	private final ReviewMapper reviewMapper;
	
	@Override
	public void insertReview(ReviewDTO review) {
		reviewMapper.insertReview(review);
	}
	
	@Override
	public List<ReviewDTO> getAllReviews(){
		return reviewMapper.getAllReviews();
	}
	
	@Override
	public List<ReviewDTO> getReviewsByPage(int page, int size){
		Map<String, Integer> params = new HashMap<>();
		params.put("size", size); //최대 갯수
		//페이징에서 시작 위치를 결정하는 값 
		//현재 페이지의 첫 번째 데이터가 어디서 시작되는지 결정
		params.put("offset", (page - 1) * size); 
		return reviewMapper.getReviewsByPage(params);
	}
	
	@Override
	public int getTotalReviewCount() {
		return reviewMapper.getTotalReviewCount();
	}
	
	@Override
	public ReviewDTO getReviewById(Long revId) {
		reviewMapper.increaseReviewViews(revId); //조회수 증가 실행
		return reviewMapper.getReviewById(revId);
	}
	
	@Override
	public void increaseReviewViews(Long revId) {
		reviewMapper.increaseReviewViews(revId);
	}
	
	@Override
	public void updateReview(ReviewDTO review) {
		reviewMapper.updateReview(review);
	}
}
