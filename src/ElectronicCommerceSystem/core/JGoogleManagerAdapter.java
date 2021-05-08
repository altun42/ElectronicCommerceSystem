package ElectronicCommerceSystem.core;

import ElectronicCommerceSystem.GoogleJoin;
import ElectronicCommerceSystem.entity.concretes.User;

public class JGoogleManagerAdapter implements GoogleService{
	GoogleJoin googlejoin = new GoogleJoin();

	
	

	@Override
	public void jJoinControl(User user) {
		
		googlejoin.joinGoogleControl(user);
		
		
	}

	@Override
	public void jMembershipSuccessful(User user) {
		
		googlejoin.googleMembershipSuccessful(user);
		
	}

}
