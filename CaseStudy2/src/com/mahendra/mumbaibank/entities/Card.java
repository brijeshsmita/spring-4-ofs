package com.mahendra.mumbaibank.entities;
import javax.persistence.*;

@Entity
@Table(name="cards")
public class Card {
	@Id @Column(name="card_no",length=10)
	private String cardNo;
	
	@Column(name="card_type",length=10)
	private String type;
	
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
