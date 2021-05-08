package ElectronicCommerceSystem.business.abstracts;

import ElectronicCommerceSystem.entity.concretes.User;

public interface UserService {
	void joinControl(User user,User user1 );
	void verificationEmail();
	void update(User user);
	void delete(User user);
	void membershipSuccessful(User user);
	void google(User user);
	

}
