package com.mahendra.mumbaibank.dao.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mahendra.mumbaibank.dao.AccountDAO;
import com.mahendra.mumbaibank.entities.Account;


/**
 * @Component is a Generic Annotation, it can be used for all beans
 * @Repository is inherited from @Component annotation and made for DAO's
 * @author mahen
 *
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

	private HibernateTemplate template;
	
	@Autowired
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Override
	public void save(Account account) {
		template.persist(account);
	}

	@Override
	public Account findById(String accountNo) {
		// TODO Auto-generated method stub
		return template.get(Account.class, accountNo);
	}

}
