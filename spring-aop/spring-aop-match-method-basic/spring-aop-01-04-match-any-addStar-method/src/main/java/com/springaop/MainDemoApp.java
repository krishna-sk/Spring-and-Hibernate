package com.springaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.dao.AccountDAO;
import com.springaop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership bean from spring container
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
				
		// call the business method
		theAccountDAO.addAccount();

		// call the membership business method
		theMembershipDAO.addSillyMember();
						
		// close the context
		context.close();
	}

}










