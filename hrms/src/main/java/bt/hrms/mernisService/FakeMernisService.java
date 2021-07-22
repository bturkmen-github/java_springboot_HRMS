package bt.hrms.mernisService;

public class FakeMernisService {
	public boolean validateByMernis(String firstName,String lastName,int birthYear,String tcNumber) {
		if(tcNumber.length()==11) {
			System.out.println(firstName + " " + lastName + " is valid person with Mernis Service.");
			return true;
		}else {
			System.out.println(firstName + " " + lastName + " is not valid person with Mernis Service.");
			return false;
		}
		
	}
}
