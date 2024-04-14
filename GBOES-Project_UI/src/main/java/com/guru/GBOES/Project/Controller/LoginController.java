package com.guru.GBOES.Project.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.OpenSessionInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guru.GBOES.Project.Modell.Bokkings;
import com.guru.GBOES.Project.Modell.Contact;
import com.guru.GBOES.Project.Modell.Login;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Controller
public class LoginController {
	
	@Autowired
	SessionFactory sf;
	

	
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/loginpermission")
	public String loginpermission(Login login, Model model) {
		Session openSession = sf.openSession();
		Login dlogin=openSession.get(Login.class, login.getPassword());
		
		String page = "login";

		String msg = null;
		
		if(dlogin!=null) {
			if(login.getUsername().equals(dlogin.getUsername())) {
				
				page="home";
				msg="welcome to GB online education system";
			}
			else {
				msg="Invalid username and password";
			}
		}
		else {
			msg="Invalid username and password";
		}
		model.addAttribute("msg", msg);
		return page;
		
		
		
	}
	
	
	@RequestMapping("/aboutpage")
	public String aboutpage()
	{
		return "about";
	}
	
	@RequestMapping("/servicepage")
	public String servicepage()
	{
		return "service";
	}
	
	@RequestMapping("/homepage")
	public String homepage()
	{
		return "home";
	}
	
	@RequestMapping("/createaccount")
	public String createaccount()
	{
		return "createAccount";
	}
	
	@RequestMapping("/createaccountcheak")
	public String createaccountcheak(Login login) {
		Session s = sf.openSession();
		Login dlogin=s.get(Login.class, login.getPassword());
		String msg=null;
		String page="login";
		
		if(dlogin!=null) {
			if(login.getUsername().equals(dlogin.getUsername())){
				msg="already registerd";	
			}	
		}
		else {
			Transaction t = s.beginTransaction();
			s.save(login); 
			t.commit();
		}
		return "createAccount";
				
	}
	
	@RequestMapping("/contactpage")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("contactpagepermission")
	public String contactpagepermission(Contact contact, Model model) throws Exception {
		
		validateMobileNumber(contact.getMobile());
		
		Session openSession = sf.openSession();
		Contact contact2 = openSession.get(Contact.class,contact.getMobile());
		String page= "login";
		String msg="";
		if(contact2!=null) {
			if(contact.getMobile().equals(contact2.getMobile())) {
				msg="invalid username ";
			}
		}
		else {
			Transaction beginTransaction = openSession.beginTransaction();
			openSession.save(contact);
			beginTransaction.commit();
			msg="contact created";
		}
		model.addAttribute("msg", msg);
		return "login";
	}
	
	
		
	private void validateMobileNumber(String mobile) throws Exception {
		if(mobile.length()!=10) {
			throw new Exception("Number is invalid...");
		
	}



	}

	@RequestMapping("/menupage")
	public String menupage()
	{
		return "menu";
	}
	
	@RequestMapping("/reservationpage")
	public String reservationpage()
	{
		return "reservation";
	}
	
	@RequestMapping("/testimonialpage")
	public String testimonialpage()
	{
		return "testimonial";
	}
	
	@RequestMapping("/bookkingpermission")
	@Transactional
	public String bookkingpermission(Bokkings book) throws Exception {
		

		Session s = sf.openSession();
		s.save(book);
		Transaction ts = s.beginTransaction();
		ts.commit();
		return "reservation";
	}





	
	
	
	
	
	

}
