package ElectronicCommerceSystem;

import ElectronicCommerceSystem.business.abstracts.UserService;
import ElectronicCommerceSystem.business.concretes.UserManager;
import ElectronicCommerceSystem.core.JGoogleManagerAdapter;
import ElectronicCommerceSystem.dataAccess.concretes.HibernateUserDao;
import ElectronicCommerceSystem.entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Kerim","Altun","kerim.zigetvar44@gmail.com","123456789");
		UserService userService = new UserManager(new JGoogleManagerAdapter(),new  HibernateUserDao());
		userService.joinControl(user1, user1);
		userService.verificationEmail();
		userService.membershipSuccessful(user1);
		System.out.println("*************************");
		userService.google(user1);
		
		

	}

}
