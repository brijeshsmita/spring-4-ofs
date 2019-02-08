package com.mahendra.mumbaibank.services;

import com.mahendra.mumbaibank.entities.Card;

public interface CardService {
	void save(Card card);
	Card findById(String cardNo);
}
