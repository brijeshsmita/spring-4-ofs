package com.mahendra.mumbaibank.dao;

import com.mahendra.mumbaibank.entities.Card;

public interface CardDAO {

	void save(Card card);
	Card findById(String cardNo);
}
