package com.mahendra.mumbaibank.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.CardDAO;
import com.mahendra.mumbaibank.entities.Card;
import com.mahendra.mumbaibank.services.CardService;

@Component
public class CardServiceImpl implements CardService {

	@Autowired
	private CardDAO dao;
	
	@Override
	public void save(Card card) {
		dao.save(card);
	}

	@Override
	public Card findById(String cardNo) {
		// TODO Auto-generated method stub
		return dao.findById(cardNo);
	}

}
