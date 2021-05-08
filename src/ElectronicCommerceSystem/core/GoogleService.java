package ElectronicCommerceSystem.core;

import ElectronicCommerceSystem.entity.concretes.User;

public interface GoogleService {
	void jJoinControl(User user);
	void jMembershipSuccessful(User user);

}
