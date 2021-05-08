package ElectronicCommerceSystem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ElectronicCommerceSystem.entity.concretes.User;

public class GoogleJoin {
	private static final String regex = "^(.+)@(.+)$";
	public void joinGoogleControl(User user) {
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r");
			return;
			
		}
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		System.out.println("Google i�in Email adresi " + user.geteMail()  + (matcher.matches() ? " ge�erli" : " ge�ersiz"));
		
	}
	public void googleMembershipSuccessful(User user) {
		System.out.println("Google hesab� ile kay�t olu�turuldu " +user.getFirstName()) ;
	}

}
