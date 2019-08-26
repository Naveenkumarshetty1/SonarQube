package com.hcl.trading.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.trading.dto.ActionSummaryResponseDto;
import com.hcl.trading.service.ActionSummaryService;

@RestController
@CrossOrigin(allowedHeaders= {"*","*/"},origins={"*","*/"})
@RequestMapping("/api")
public class ActionSummaryController {
	private static Logger LOGGER = LoggerFactory.getLogger(ActionSummaryController.class);
	
	@Autowired
	ActionSummaryService actionSummaryService;
	
	@GetMapping("/orders/{userId}")
	public ResponseEntity<List<ActionSummaryResponseDto>> getAllActionSummary(@PathVariable Integer userId){
		LOGGER.info("action summary");
		List<ActionSummaryResponseDto> response = actionSummaryService.getAllActionSummary(userId);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}