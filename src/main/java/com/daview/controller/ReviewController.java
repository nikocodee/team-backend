package com.daview.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daview.dto.ReviewDTO;
import com.daview.service.AuthService;
import com.daview.service.ReviewService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/review")
@RequiredArgsConstructor
public class ReviewController {

	private final ReviewService reviewService;
	
	@PostMapping
	public ResponseEntity<ReviewDTO> insertReview(@RequestBody ReviewDTO review) {
		reviewService.insertReview(review);
		return ResponseEntity.ok(review);
	}

	@GetMapping
	public ResponseEntity<List<ReviewDTO>> getAllReviews() {
		return ResponseEntity.ok(reviewService.getAllReviews());
	}

	@GetMapping("/page")
	public List<ReviewDTO> getReviewsByPage(@RequestParam int page, @RequestParam int size) {
		return reviewService.getReviewsByPage(page, size);
	}
	
	@GetMapping("/count")
	public int getTotalReviewCount() {
		return reviewService.getTotalReviewCount();
	}
	
	@GetMapping("/{revId}")
	public ResponseEntity<ReviewDTO> getReviewById(@PathVariable Long revId) {
		ReviewDTO review = reviewService.getReviewById(revId);
		return ResponseEntity.ok(review);
	}
	
	@PutMapping("/{revId}")
	public ResponseEntity<String> updateReview(@PathVariable Long revId, @RequestBody ReviewDTO review){
		review.setRevId(revId); //URL에서 받은 revId를 DTO에 설정, db에서 어떤 후기를 수정하는지 알아야함
		reviewService.updateReview(review);
		return ResponseEntity.ok("후기 수정 완료");
	}
}
