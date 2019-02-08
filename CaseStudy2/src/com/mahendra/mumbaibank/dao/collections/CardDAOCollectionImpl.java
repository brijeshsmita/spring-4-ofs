package com.mahendra.mumbaibank.dao.collections;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mahendra.mumbaibank.dao.CardDAO;
import com.mahendra.mumbaibank.entities.Card;

@Component
public class CardDAOCollectionImpl implements CardDAO {
private List<Card> cards = new LinkedList<>();

	@Override
	public void save(Card card) {
		cards.add(card);

	}

	@Override
	public Card findById(String cardNo) {
		for (Card c : cards) {
			if (c.getCardNo().equalsIgnoreCase(cardNo))
				return c;
		}
		return null;
	}

}
