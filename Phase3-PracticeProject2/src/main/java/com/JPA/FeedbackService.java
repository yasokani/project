package com.JPA;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FeedbackService {
	
	@Autowired
	FeedbackRepository feedbackrepository;//reference object of interface
	
	
	//get list of all records
	public List<FeedbackEntity> getAllFeedbacks(){
		return feedbackrepository.findAll();
	}
	
	public boolean addFeedback(FeedbackEntity pe){
        feedbackrepository.save(pe);
        return true;
    }
}
