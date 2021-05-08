package ElectronicCommerceSystem.dataAccess.concretes;

import java.util.List;

import ElectronicCommerceSystem.dataAccess.abstracts.UserDao;
import ElectronicCommerceSystem.entity.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
