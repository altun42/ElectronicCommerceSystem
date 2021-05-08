package ElectronicCommerceSystem.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ElectronicCommerceSystem.business.abstracts.UserService;
import ElectronicCommerceSystem.core.GoogleService;
import ElectronicCommerceSystem.dataAccess.abstracts.UserDao;
import ElectronicCommerceSystem.entity.concretes.User;


public class UserManager implements UserService {
	

	

	private GoogleService googleService;
	private UserDao userDao;
	public UserManager(GoogleService googleService, UserDao userDao) {
		super();
		this.googleService = googleService;
		this.userDao = userDao;
	}

	
	 private static final String regex = "^(.+)@(.+)$";

	
	
	@Override
	public void joinControl(User user,User user1) {
		
		if (user1.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r");
			return;
			
		}
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		System.out.println("Email adresi " + user.geteMail()  + (matcher.matches() ? " ge�erli" : " ge�ersiz"));
		
		
		 
		
	}


	@Override
	public void update(User user) {
		System.out.println("Kay�t bilgileri g�ncellendi " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kay�t silindi " + user.getFirstName());
		
	}


	@Override
	public void verificationEmail() {
		System.out.println("E postan�z� do�rulay�n�z");
		
	}


	@Override
	public void membershipSuccessful(User user) {
		System.out.println("�yelik tamamland�");
		this.userDao.add(user);
		this.googleService.jMembershipSuccessful(user);
		
	}


	@Override
	public void google(User user) {
		this.googleService.jJoinControl(user);
		
		
	}
	




	

	
}
